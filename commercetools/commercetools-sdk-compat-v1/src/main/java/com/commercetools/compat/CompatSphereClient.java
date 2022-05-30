
package com.commercetools.compat;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.sphere.sdk.client.*;
import io.sphere.sdk.http.HttpRequest;
import io.sphere.sdk.http.HttpResponse;
import io.sphere.sdk.json.JsonException;
import io.sphere.sdk.json.SphereJsonUtils;
import io.sphere.sdk.models.SphereException;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class CompatSphereClient extends AutoCloseableService implements SphereClient {
    private final ApiHttpClient client;
    private final SphereClientConfig clientConfig;

    private final ObjectMapper mapper;

    private final ExceptionMode exceptionMode;

    private CompatSphereClient(final ApiHttpClient apiHttpClient, final ObjectMapper mapper, final SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        this.clientConfig = clientConfig;
        this.mapper = mapper;
        this.client = new CompatApiHttpClient(apiHttpClient, mapper);
        this.exceptionMode = exceptionMode;
    }

    public static CompatSphereClient of(SphereClientConfig clientConfig) {
        return of(createDefaultClient(clientConfig), SphereJsonUtils.newObjectMapper(), clientConfig, ExceptionMode.SDK_V2);
    }

    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, SphereClientConfig clientConfig) {
        return of(apiHttpClient, SphereJsonUtils.newObjectMapper(), clientConfig, ExceptionMode.SDK_V2);
    }

    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, final ObjectMapper mapper, SphereClientConfig clientConfig) {
        return new CompatSphereClient(apiHttpClient, mapper, clientConfig, ExceptionMode.SDK_V2);
    }

    public static CompatSphereClient of(SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        return of(createDefaultClient(clientConfig), SphereJsonUtils.newObjectMapper(), clientConfig, exceptionMode);
    }

    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        return of(apiHttpClient, SphereJsonUtils.newObjectMapper(), clientConfig, exceptionMode);
    }

    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, final ObjectMapper mapper, SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        return new CompatSphereClient(apiHttpClient, mapper, clientConfig, exceptionMode);
    }

    private static ApiHttpClient createDefaultClient(SphereClientConfig clientConfig) {
        final URI resolve = URI.create(clientConfig.getApiUrl()).resolve("/" + clientConfig.getProjectKey() + "/");
        return ApiRootBuilder.of()
                .defaultClient(resolve)
                .addCorrelationIdProvider(() -> clientConfig.getCorrelationIdGenerator().get())
                .withClientCredentialsFlow(ClientCredentials.of()
                        .withClientId(clientConfig.getClientId())
                        .withClientSecret(clientConfig.getClientSecret())
                        .build(),
                    URI.create(clientConfig.getAuthUrl()).resolve("/oauth/token"))
                .buildClient();
    }

    @Override
    public <T> CompletionStage<T> execute(SphereRequest<T> sphereRequest) {
        final CompatRequest<JsonNode> compatRequest = CompatRequest.of(client, clientConfig.getProjectKey(),
            sphereRequest, JsonNode.class);
        final HttpRequest httpRequest = sphereRequest.httpRequestIntent().toHttpRequest(clientConfig.getApiUrl());
        return compatRequest.send()
                .thenApply(
                    apiHttpResponse -> HttpResponse.of(apiHttpResponse.getStatusCode(), apiHttpResponse.getBody(), httpRequest))
                .thenApplyAsync(httpResponse -> {
                    if (exceptionMode == ExceptionMode.SDK_V2) {
                        return sphereRequest.deserialize(httpResponse);
                    }

                    try {
                        return parse(sphereRequest, mapper, clientConfig, httpResponse, httpRequest);
                    } catch (final SphereException e) {
                        fillExceptionWithData(sphereRequest, httpResponse, e, clientConfig, httpRequest);
                        throw e;
                    }
                });
    }

    public enum ExceptionMode {
        SDK_V1, SDK_V2
    }

    static <T> T parse(final SphereRequest<T> sphereRequest, final ObjectMapper objectMapper, final SphereApiConfig config, final HttpResponse httpResponse, final HttpRequest httpRequest) {
        final T result;
        if (!sphereRequest.canDeserialize(httpResponse)) {
            final SphereException sphereException = createExceptionFor(httpResponse, sphereRequest, objectMapper, config, httpRequest);
            throw sphereException;
        } else {
            try {
                result = sphereRequest.deserialize(httpResponse);
            } catch (final JsonException e) {
                final byte[] bytes = httpResponse.getResponseBody();
                e.addNote("Cannot parse " + bytesToString(bytes));
                throw e;
            }
        }
        return result;
    }

    private static <T> SphereException createExceptionFor(final HttpResponse httpResponse, final SphereRequest<T> sphereRequest, final ObjectMapper objectMapper, final SphereApiConfig config, final HttpRequest httpRequest) {
        final SphereException sphereException = CompatExceptionFactory.of().createException(httpResponse, sphereRequest, objectMapper);
        fillExceptionWithData(sphereRequest, httpResponse, sphereException, config, httpRequest);
        return sphereException;
    }

    private static <T> void fillExceptionWithData(final SphereRequest<T> sphereRequest, final HttpResponse httpResponse, final SphereException exception, final SphereApiConfig config, final HttpRequest httpRequest) {
        exception.setSphereRequest(sphereRequest);
        exception.setUnderlyingHttpResponse(httpResponse);
        exception.setProjectKey(config.getProjectKey());
        exception.setHttpRequest(httpRequest);
    }

    private static String bytesToString(final byte[] b) {
        return new String(b, StandardCharsets.UTF_8);
    }

    @Override
    protected void internalClose() {
        closeQuietly(client);
    }

    @Override
    public SphereApiConfig getConfig() {
        return clientConfig;
    }

    static class CompatApiHttpClient extends AutoCloseableService implements ApiHttpClient {
        private final ApiHttpClient apiHttpClient;
        private final ResponseSerializer serializer;

        public CompatApiHttpClient(ApiHttpClient apiHttpClient, ObjectMapper mapper) {
            this.apiHttpClient = apiHttpClient;
            this.serializer = ResponseSerializer.of(mapper);
        }

        @Override
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<O> method) {
            return method.execute(this);
        }

        @Override
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
                final Class<O> outputType) {
            return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
        }

        @Override
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
                final TypeReference<O> outputType) {
            return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
        }

        @Override
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
                final JavaType outputType) {
            return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
        }

        @Override
        public ResponseSerializer getSerializerService() {
            return serializer;
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            return apiHttpClient.execute(request);
        }

        @Override
        protected void internalClose() {
            closeQuietly(apiHttpClient);
        }
    }
}
