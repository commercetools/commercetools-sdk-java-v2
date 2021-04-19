
package com.commercetools.compat;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import com.commercetools.api.client.ApiCorrelationIdProvider;
import com.fasterxml.jackson.databind.JsonNode;

import io.sphere.sdk.client.SphereApiConfig;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.client.SphereRequest;
import io.sphere.sdk.http.HttpResponse;
import io.sphere.sdk.json.SphereJsonUtils;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.AutoCloseableService;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class SphereCompatClient extends AutoCloseableService implements SphereClient {
    private final ApiHttpClient client;
    private final SphereClientConfig clientConfig;

    private SphereCompatClient(SphereClientConfig clientConfig) {
        final URI resolve = URI.create(clientConfig.getApiUrl()).resolve("/" + clientConfig.getProjectKey() + "/");
        this.client = ClientBuilder.of()
                .defaultClient(resolve)
                .addCorrelationIdProvider(new ApiCorrelationIdProvider(clientConfig.getProjectKey()))
                .withClientCredentials(ClientCredentials.of()
                        .withClientId(clientConfig.getClientId())
                        .withClientSecret(clientConfig.getClientSecret())
                        .build(),
                    URI.create(clientConfig.getAuthUrl()).resolve("/oauth/token"))
                .withSerializer(ResponseSerializer.of(SphereJsonUtils.newObjectMapper()))
                .build();
        this.clientConfig = clientConfig;
    }

    public static SphereCompatClient of(SphereClientConfig clientConfig) {
        return new SphereCompatClient(clientConfig);
    }

    @Override
    public <T> CompletionStage<T> execute(SphereRequest<T> sphereRequest) {
        final CompatRequest<JsonNode> compatRequest = new CompatRequest<>(client, sphereRequest, JsonNode.class);

        return compatRequest.send()
                .thenApply(
                    apiHttpResponse -> HttpResponse.of(apiHttpResponse.getStatusCode(), apiHttpResponse.getBody(),
                        sphereRequest.httpRequestIntent().toHttpRequest(clientConfig.getApiUrl())))
                .thenApply(sphereRequest::deserialize);
    }

    @Override
    protected void internalClose() {
        closeQuietly(client);
    }

    @Override
    public SphereApiConfig getConfig() {
        return clientConfig;
    }
}
