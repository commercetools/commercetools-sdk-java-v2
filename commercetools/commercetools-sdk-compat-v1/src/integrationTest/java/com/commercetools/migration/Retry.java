
package com.commercetools.migration;

import static io.sphere.sdk.http.HttpStatusCode.*;
import static java.util.Collections.singletonList;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.client.RetrySphereClientDecorator;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.queries.PagedQueryResult;
import io.sphere.sdk.retry.RetryAction;
import io.sphere.sdk.retry.RetryPredicate;
import io.sphere.sdk.retry.RetryRule;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class Retry implements MigrateExample {
    @Override
    public void v1() throws ExecutionException, InterruptedException {
        final int maxAttempts = 5;
        final List<RetryRule> retryRules = singletonList(RetryRule.of(
            RetryPredicate.ofMatchingStatusCodes(BAD_GATEWAY_502, SERVICE_UNAVAILABLE_503, GATEWAY_TIMEOUT_504),
            RetryAction.ofExponentialBackoff(maxAttempts, 100, 2000)));
        final SphereClient client = RetrySphereClientDecorator.of(sphereClient(), retryRules);

        final PagedQueryResult<Category> categoryPagedQueryResult = client.execute(CategoryQuery.of())
                .toCompletableFuture()
                .get();
    }

    @Override
    public void v2() {
        final ByProjectKeyRequestBuilder projectClient = ApiFactory.createForProject("projectKey",
            () -> ClientBuilder.of()
                    .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                        ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                        ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
                    .withInternalLoggerFactory(ApiInternalLoggerFactory::get)
                    .withRetryMiddleware(5)
                    .build());

        final CategoryPagedQueryResponse body = projectClient.categories().get().executeBlocking().getBody();
    }
}
