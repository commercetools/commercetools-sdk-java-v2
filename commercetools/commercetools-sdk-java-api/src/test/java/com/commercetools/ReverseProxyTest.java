
package com.commercetools;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseProxyTest {

    static class TestClient implements VrapHttpClient {
        private ApiHttpRequest request;
        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            this.request = request;
            return CompletableFuture
                    .completedFuture(new ApiHttpResponse<>(200, null, "{}".getBytes(StandardCharsets.UTF_8)));
        }

        public ApiHttpRequest getRequest() {
            return request;
        }
    }
    @Test
    public void reverseProxy() {
        TestClient client = new TestClient();
        ProjectApiRoot apiRoot = ApiRootBuilder.of(client)
                .defaultClient(ClientCredentials.of().withClientId("").withClientSecret("").build(),
                    "https://auth.europe-west1.gcp.commercetools.com/oauth/token", "https://myapi.example.com/api/v1/")
                .build("test");

        apiRoot.carts().get().executeBlocking();

        ApiHttpRequest request = client.getRequest();
        Assertions.assertThat(request.getUri().toString()).isEqualTo("https://myapi.example.com/api/v1/test/carts");
    }
}
