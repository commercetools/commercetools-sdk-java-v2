
package commercetools;

import java.net.URI;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.ErrorMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiTenantTest {

    static class MultiTenantClient {
        private final Map<String, Pair<String, ApiHttpClient>> clients = new HashMap<>();

        public MultiTenantClient add(final String tenant, final String projectKey, final ApiHttpClient client) {
            clients.put(tenant, Pair.of(projectKey, client));

            return this;
        }

        public ProjectApiRoot get(final String tenant) {
            return ProjectApiRoot.fromClient(clients.get(tenant).getLeft(), clients.get(tenant).getRight());
        }
    }

    @Test
    public void multiClientClient() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ApiHttpClient client1 = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final ApiHttpClient client2 = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final MultiTenantClient client = new MultiTenantClient();
        client.add("tenant1", CommercetoolsTestUtils.getProjectKey(), client1);
        client.add("tenant2", CommercetoolsTestUtils.getProjectKey(), client2);

        Assertions.assertThat(client.get("tenant1").get().executeBlocking().getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());
        Assertions.assertThat(client.get("tenant2").get().executeBlocking().getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());
    }

    static class InvocationHandler extends AutoCloseableService implements ApiHttpClient {

        private String activeTenant = "";
        private final Map<String, ApiHttpClient> clients = new HashMap<>();

        public InvocationHandler add(final String tenant, final ApiHttpClient client) {
            clients.put(tenant, client);

            return this;
        }

        public ApiHttpClient invoke() {
            return clients.get(activeTenant);
        }

        public void setActiveTenant(final String activeTenant) {
            this.activeTenant = activeTenant;
        }

        @Override
        public ResponseSerializer getSerializerService() {
            return invoke().getSerializerService();
        }

        @Override
        public URI getBaseUri() {
            return invoke().getBaseUri();
        }

        @Override
        protected void internalClose() {
            clients.forEach((s, apiHttpClient) -> {
                closeQuietly(apiHttpClient);
            });
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            return invoke().execute(request);
        }
    }

    @Test
    public void multiTenantApiClient() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ApiHttpClient client1 = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId(CommercetoolsTestUtils.getClientId())
                            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                            .build(),
                    authURL, URI.create(apiUrl).resolve("/" + CommercetoolsTestUtils.getProjectKey()).toString())
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final ApiHttpClient client2 = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId(CommercetoolsTestUtils.getClientId())
                            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                            .build(),
                    authURL, URI.create(apiUrl).resolve("/" + CommercetoolsTestUtils.getProjectKey()).toString())
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final InvocationHandler client = new InvocationHandler();
        client.add("tenant1", client1);
        client.add("tenant2", client2);

        ProjectApiRoot projectApiRoot = ProjectApiRoot.fromClient("", client);

        client.setActiveTenant("tenant1");
        Assertions.assertThat(projectApiRoot.get().executeBlocking().getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());

        client.setActiveTenant("tenant2");
        Assertions.assertThat(projectApiRoot.get().executeBlocking().getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());
    }

    @Test
    public void multiTenantSimpleApiClient() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ApiHttpClient client1 = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId(CommercetoolsTestUtils.getClientId())
                            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                            .build(),
                    authURL, URI.create(apiUrl).resolve("/" + CommercetoolsTestUtils.getProjectKey()).toString())
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final ApiHttpClient client2 = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId(CommercetoolsTestUtils.getClientId())
                            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                            .build(),
                    authURL, URI.create(apiUrl).resolve("/" + CommercetoolsTestUtils.getProjectKey()).toString())
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .buildClient();

        final InvocationHandler client = new InvocationHandler();
        client.add("tenant1", client1);
        client.add("tenant2", client2);

        ProjectApiRoot projectApiRoot = ProjectApiRoot.of("");
        client.setActiveTenant("tenant1");
        Assertions.assertThat(
            ClientUtils.blockingWait(client.execute(projectApiRoot.get()), Duration.ofSeconds(10)).getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());

        client.setActiveTenant("tenant2");
        Assertions.assertThat(
            ClientUtils.blockingWait(client.execute(projectApiRoot.get()), Duration.ofSeconds(10)).getBody().getKey())
                .isEqualTo(CommercetoolsTestUtils.getProjectKey());
    }
}
