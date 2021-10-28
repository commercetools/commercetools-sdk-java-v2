
package commercetools;

import static commercetools.utils.CommercetoolsTestUtils.getClientId;
import static commercetools.utils.CommercetoolsTestUtils.getClientSecret;
import static commercetools.utils.CommercetoolsTestUtils.getProjectKey;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import net.jodah.failsafe.CircuitBreakerOpenException;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuspendTest {
    private static Logger LOGGER = LoggerFactory.getLogger(SuspendTest.class);
    @Test
    public void testSuspension() throws InterruptedException {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));

        final TestClient testApiClient = new TestClient("api", HttpClientSupplier.of().get());
        final TestClient testAuthClient = new TestClient("auth", HttpClientSupplier.of().get());

        ApiRootBuilder builder = ApiRootBuilder.of(testApiClient)
                .defaultClient(region.getApiUrl())
                .withClientCredentialsFlow(
                    ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                    region.getOAuthTokenUrl(), testAuthClient)
                .withAuthCircuitBreaker();

        final ProjectApiRoot projectApiRoot = builder.build(getProjectKey());

        final Project project = projectApiRoot.get().executeBlocking().getBody();

        Assertions.assertThat(project).isInstanceOf(Project.class);

        testApiClient.suspended = true;

        LOGGER.debug("Api client suspended");

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(Exception.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).isInstanceOfAny(UnauthorizedException.class, CircuitBreakerOpenException.class);

        testApiClient.sendRequest = false;

        Assertions.assertThatExceptionOfType(Exception.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).isInstanceOfAny(UnauthorizedException.class, CircuitBreakerOpenException.class);

        Assertions.assertThatExceptionOfType(Exception.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).isInstanceOfAny(UnauthorizedException.class, CircuitBreakerOpenException.class);

        Assertions.assertThatExceptionOfType(Exception.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).isInstanceOfAny(UnauthorizedException.class, CircuitBreakerOpenException.class);

        testAuthClient.suspended = true;
        testAuthClient.sendRequest = false;

        LOGGER.debug("Auth client suspended");
        Assertions.assertThatExceptionOfType(Exception.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).isInstanceOfAny(UnauthorizedException.class, CircuitBreakerOpenException.class);

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        LOGGER.debug("Unsuspended api client");
        testApiClient.suspended = false;

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        testAuthClient.suspended = false;

        LOGGER.debug("Unsuspended auth client");
        Assertions.assertThatExceptionOfType(CircuitBreakerOpenException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });
        Thread.sleep(200);
        projectApiRoot.get().executeBlocking();

        final Project unsuspendedProject = projectApiRoot.get().executeBlocking().getBody();
        Assertions.assertThat(unsuspendedProject).isInstanceOf(Project.class);
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();

        Thread.sleep(1000);

        final Project openedProject = projectApiRoot.get().executeBlocking().getBody();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        projectApiRoot.get().executeBlocking();
        Assertions.assertThat(openedProject).isInstanceOf(Project.class);
    }

    private static class TestClient implements VrapHttpClient {
        private final VrapHttpClient httpClient;
        private Boolean suspended;
        private Boolean sendRequest;
        private final String name;

        public TestClient(final String name, final VrapHttpClient httpClient) {
            this.httpClient = httpClient;
            this.name = name;
            this.suspended = false;
            this.sendRequest = true;
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            if (suspended) {
                if (sendRequest) {
                    httpClient.execute(request);
                }
                else {
                    LOGGER.debug("{}: Client suspended", name);
                }
                return CompletableFuture
                        .completedFuture(new ApiHttpResponse<>(401, null, "".getBytes(StandardCharsets.UTF_8)));
            }
            return httpClient.execute(request);
        }
    }
}
