
package commercetools;

import static java.util.Collections.singletonList;

import java.time.Duration;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.Category;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.HttpStatusCode;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.TimeoutExceededException;

public class TimeoutTest {
    @Test
    public void timeoutWithRetry() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();
        dev.failsafe.Timeout<ApiHttpResponse<byte[]>> timeout = dev.failsafe.Timeout
                .<ApiHttpResponse<byte[]>> builder(Duration.ofSeconds(10))
                .build();
        FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor = Failsafe.with(timeout);

        ProjectApiRoot b = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addMiddleware((request, next) -> next.apply(request).whenComplete((response, throwable) -> {
                    try {
                        Thread.sleep(15000); // ensure timeout
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }))
                .addMiddleware((request, next) -> failsafeExecutor.getStageAsync(() -> next.apply(request)))
                .withPolicies(policyBuilder -> policyBuilder.withRetry(3, singletonList(HttpStatusCode.NOT_FOUND_404)))
                .build(projectKey);

        Assertions.assertThatExceptionOfType(TimeoutExceededException.class).isThrownBy(() -> {
            Category category = b.categories()
                    .withId("fdbaf4ea-fbc9-4fea-bac4-1d7e6c1995b3")
                    .get()
                    .executeBlocking()
                    .getBody();
        });
    }
}
