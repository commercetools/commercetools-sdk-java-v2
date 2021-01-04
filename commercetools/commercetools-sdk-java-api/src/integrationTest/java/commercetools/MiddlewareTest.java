package commercetools;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.project.Project;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.NotFoundException;
import io.vrap.rmf.base.client.http.RetryMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Collections.singletonList;


public class MiddlewareTest {

    @Test
    public void execute() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        AtomicInteger count = new AtomicInteger();
        ByProjectKeyRequestBuilder b = ApiFactory.createForProject(
                projectKey,
                ClientCredentials.of().withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                Lists.newArrayList(
                        (request, next) -> {
                            count.getAndIncrement();
                            return next.apply(request);
                        },
                        new RetryMiddleware(3, singletonList(404))
                )
        );


        Assertions.assertThatExceptionOfType(NotFoundException.class).isThrownBy(
                () -> {
                    Category category = b
                            .categories()
                            .withId("fdbaf4ea-fbc9-4fea-bac4-1d7e6c1995b3")
                            .get()
                            .executeBlocking().getBody();
                }
        );
        Assertions.assertThat(count.get()).isEqualTo(4);
    }

    @Test
    public void testUnauthorizedToken() throws ExecutionException, InterruptedException {
        ClientCredentials credentials = ClientCredentials.of().withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();

        VrapHttpClient httpClient = HttpClientSupplier.of().get();
        ApiHttpClient client = ClientFactory.create(
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                new VrapHttpClient() {
                    private boolean firstCall = true;

                    @Override
                    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
                        if (firstCall) {
                            firstCall = false;
                            return CompletableFuture.completedFuture(new ApiHttpResponse<>(401, new ApiHttpHeaders(), "".getBytes()));
                        }
                        return httpClient.execute(request);
                    }
                },
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                        HttpClientSupplier.of().get()
                )
        );

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/" + CommercetoolsTestUtils.getProjectKey() + "/"), new ApiHttpHeaders(), null);
        ApiHttpResponse<Project> response = client.execute(request, Project.class).get();
        Assertions.assertThat(response).isNotNull();
    }
}
