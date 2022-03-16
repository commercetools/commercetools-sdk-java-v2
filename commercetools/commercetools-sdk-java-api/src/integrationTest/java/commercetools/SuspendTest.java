
package commercetools;

import static commercetools.utils.CommercetoolsTestUtils.*;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;

import dev.failsafe.CircuitBreakerOpenException;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.AuthException;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuspendTest {
    private static Logger LOGGER = LoggerFactory.getLogger(SuspendTest.class);
    @Test
    public void testSuspension() throws InterruptedException {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));

        final TestClient testApiClient = new TestClient("api", 401, HttpClientSupplier.of().get());
        final TestClient testAuthClient = new TestClient("auth", 400, HttpClientSupplier.of().get());

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

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        testApiClient.sendRequest = false;

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        testAuthClient.suspended = true;
        testAuthClient.sendRequest = false;

        LOGGER.debug("Auth client suspended");
        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        });

        LOGGER.debug("Unsuspended api client");
        testApiClient.suspended = false;

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withNoCause();

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withNoCause();

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withNoCause();

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withCauseInstanceOf(CircuitBreakerOpenException.class);

        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withCauseInstanceOf(CircuitBreakerOpenException.class);

        testAuthClient.suspended = false;

        LOGGER.debug("Unsuspended auth client");
        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            projectApiRoot.get().executeBlocking();
        }).withCauseInstanceOf(CircuitBreakerOpenException.class);
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

    @Test
    @Disabled("only to be executed locally")
    public void testSuspendedProject() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));

        ApiRootBuilder builder = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                    region)
                .withAuthCircuitBreaker();

        final ProjectApiRoot root = builder.build(getProjectKey());

        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withNoCause();
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withNoCause();
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withNoCause();
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withNoCause();
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withNoCause();
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
        Assertions.assertThatExceptionOfType(AuthException.class)
                .isThrownBy(() -> root.get().executeBlocking())
                .withCauseInstanceOf(CircuitBreakerOpenException.class);
    }

    private static class TestClient implements VrapHttpClient {
        private final VrapHttpClient httpClient;
        private Boolean suspended;
        private Boolean sendRequest;
        private final String name;
        private final int status;

        public TestClient(final String name, final int status, final VrapHttpClient httpClient) {
            this.httpClient = httpClient;
            this.name = name;
            this.suspended = false;
            this.sendRequest = true;
            this.status = status;
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
                        .completedFuture(new ApiHttpResponse<>(status, null, "".getBytes(StandardCharsets.UTF_8)));
            }
            return httpClient.execute(request);
        }
    }
}
