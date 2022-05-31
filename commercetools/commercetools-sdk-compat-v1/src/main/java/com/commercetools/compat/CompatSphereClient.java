
package com.commercetools.compat;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
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

    private CompatSphereClient(final ApiHttpClient apiHttpClient, final ObjectMapper mapper,
            final SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        this.clientConfig = clientConfig;
        this.mapper = mapper;
        this.client = new CompatApiHttpClient(apiHttpClient, mapper);
        this.exceptionMode = exceptionMode;
    }

    /**
     * creates an instance of the CompatSphereClient. Please be aware for backwards compatibility the v2 Exceptions are thrown
     * @param clientConfig client configuration
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(SphereClientConfig clientConfig) {
        return of(createDefaultClient(clientConfig), SphereJsonUtils.newObjectMapper(), clientConfig,
            ExceptionMode.SDK_V2);
    }

    /**
     * Wraps an ApiHttpClient in a SDK v1 compatible SphereClient. SDKv1 Exceptions are thrown
     * @param apiHttpClient the underlying ApiHttpClient to be used
     * @param clientConfig client configuration
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, SphereClientConfig clientConfig) {
        return of(apiHttpClient, SphereJsonUtils.newObjectMapper(), clientConfig, ExceptionMode.SDK_V1);
    }

    /**
     * Wraps an ApiHttpClient in a SDK v1 compatible SphereClient. SDKv1 Exceptions are thrown
     * @param apiHttpClient the underlying ApiHttpClient to be used
     * @param clientConfig client configuration
     * @param mapper Jackson ObjectMapper to be used for deserialization
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, final ObjectMapper mapper,
            SphereClientConfig clientConfig) {
        return new CompatSphereClient(apiHttpClient, mapper, clientConfig, ExceptionMode.SDK_V1);
    }

    /**
     * Wraps an ApiHttpClient in a SDK v1 compatible SphereClient. SDKv1 Exceptions are thrown
     * @param clientConfig client configuration
     * @param exceptionMode SDKv1 or SDKv2 exceptions to be used
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
        return of(createDefaultClient(clientConfig), SphereJsonUtils.newObjectMapper(), clientConfig, exceptionMode);
    }

    /**
     * Wraps an ApiHttpClient in a SDK v1 compatible SphereClient. SDKv1 Exceptions are thrown
     * @param apiHttpClient the underlying ApiHttpClient to be used
     * @param clientConfig client configuration
     * @param exceptionMode SDKv1 or SDKv2 exceptions to be used
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, SphereClientConfig clientConfig,
            final ExceptionMode exceptionMode) {
        return of(apiHttpClient, SphereJsonUtils.newObjectMapper(), clientConfig, exceptionMode);
    }

    /**
     * Wraps an ApiHttpClient in a SDK v1 compatible SphereClient. SDKv1 Exceptions are thrown
     * @param apiHttpClient the underlying ApiHttpClient to be used
     * @param clientConfig client configuration
     * @param mapper Jackson ObjectMapper to be used for deserialization
     * @param exceptionMode SDKv1 or SDKv2 exceptions to be used
     * @return SphereClient using a SDK v2 ApiHttpClient as HTTP client
     */
    public static CompatSphereClient of(final ApiHttpClient apiHttpClient, final ObjectMapper mapper,
            SphereClientConfig clientConfig, final ExceptionMode exceptionMode) {
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

        if (exceptionMode == ExceptionMode.SDK_V2) {
            return compatRequest.send()
                    .thenApply(response -> HttpResponse.of(response.getStatusCode(), response.getBody(), httpRequest))
                    .thenApplyAsync(sphereRequest::deserialize);
        }
        return compatRequest.send()
                .thenApply(response -> HttpResponse.of(response.getStatusCode(), response.getBody(), httpRequest))
                .thenApplyAsync(httpResponse -> {
                    try {
                        return sphereRequest.deserialize(httpResponse);
                    }
                    catch (final JsonException e) {
                        final byte[] bytes = httpResponse.getResponseBody();
                        e.addNote("Cannot parse " + bytesToString(bytes));
                        throw e;
                    }
                })
                .exceptionally((throwable) -> {
                    Throwable cause = throwable.getCause();
                    if (cause instanceof ApiHttpException) {
                        ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) cause).getResponse();
                        if (errorResponse != null) {
                            HttpResponse httpResponse = HttpResponse.of(errorResponse.getStatusCode(),
                                errorResponse.getBody(), httpRequest);
                            Throwable e = createExceptionFor(httpResponse, sphereRequest, mapper, clientConfig,
                                httpRequest);
                            throw new CompletionException(e);
                        }
                    }
                    if (throwable instanceof CompletionException) {
                        throw new CompletionException(cause);
                    }
                    throw new CompletionException(throwable);
                });
    }

    public enum ExceptionMode {
        SDK_V1, SDK_V2
    }

    private static <T> SphereException createExceptionFor(final HttpResponse httpResponse,
            final SphereRequest<T> sphereRequest, final ObjectMapper objectMapper, final SphereApiConfig config,
            final HttpRequest httpRequest) {
        final SphereException sphereException = CompatExceptionFactory.of()
                .createException(httpResponse, sphereRequest, objectMapper);
        fillExceptionWithData(sphereRequest, httpResponse, sphereException, config, httpRequest);
        return sphereException;
    }

    private static <T> void fillExceptionWithData(final SphereRequest<T> sphereRequest, final HttpResponse httpResponse,
            final SphereException exception, final SphereApiConfig config, final HttpRequest httpRequest) {
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

    public static class CompatApiHttpClient extends AutoCloseableService implements ApiHttpClient {
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
