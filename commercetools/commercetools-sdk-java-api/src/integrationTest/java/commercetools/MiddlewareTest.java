
package commercetools;

import static java.util.Collections.singletonList;

import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraftBuilder;
import com.commercetools.api.models.project.Project;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.BadRequestException;
import io.vrap.rmf.base.client.error.NotFoundException;
import io.vrap.rmf.base.client.http.HttpStatusCode;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MiddlewareTest {

    @Disabled
    @Test
    public void execute() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        AtomicInteger count = new AtomicInteger();
        ProjectApiRoot b = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addMiddleware((request, next) -> {
                    count.getAndIncrement();
                    return next.apply(request);
                })
                .withRetryMiddleware(3, singletonList(HttpStatusCode.NOT_FOUND_404))
                .build(projectKey);

        Assertions.assertThatExceptionOfType(NotFoundException.class).isThrownBy(() -> {
            Category category = b.categories()
                    .withId("fdbaf4ea-fbc9-4fea-bac4-1d7e6c1995b3")
                    .get()
                    .executeBlocking()
                    .getBody();
        });
        Assertions.assertThat(count.get()).isEqualTo(1);
    }

    @Test
    public void remapNotFoundExceptionToNullBody() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        ProjectApiRoot b = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addNotFoundExceptionMiddleware()
                .build(projectKey);
        Category category = b.categories()
                .withId("adbaf4ea-fbc9-4fea-bac4-1d7e6c1995b3")
                .get()
                .executeBlocking()
                .getBody();

        Assertions.assertThat(category).isNull();

        Assertions.assertThatExceptionOfType(BadRequestException.class)
                .isThrownBy(() -> b.categories().post(CategoryDraftBuilder.of().buildUnchecked()).executeBlocking());
    }

    @Test
    public void testUnauthorizedToken() throws ExecutionException, InterruptedException {
        ClientCredentials credentials = ClientCredentials.of()
                .withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();

        VrapHttpClient httpClient = HttpClientSupplier.of().get();
        ApiHttpClient client = ClientBuilder.of(new VrapHttpClient() {
            private boolean firstCall = true;

            @Override
            public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
                if (firstCall) {
                    firstCall = false;
                    return CompletableFuture
                            .completedFuture(new ApiHttpResponse<>(401, new ApiHttpHeaders(), "".getBytes()));
                }
                return httpClient.execute(request);
            }
        })
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withClientCredentialsFlow(credentials, ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), httpClient)
                .build();

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET,
            URI.create("/" + CommercetoolsTestUtils.getProjectKey() + "/"), new ApiHttpHeaders(), null);
        ApiHttpResponse<Project> response = client.execute(request, Project.class).get();
        Assertions.assertThat(response).isNotNull();
    }
}
