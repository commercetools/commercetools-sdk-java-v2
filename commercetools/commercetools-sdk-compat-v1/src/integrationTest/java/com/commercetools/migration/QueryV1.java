
package com.commercetools.migration;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.queries.PagedQueryResult;

public class QueryV1 implements MigrateV1Example {
    @Override
    public void v1() throws ExecutionException, InterruptedException {
        PagedQueryResult<Category> pagedQueryResult = blockingClient()
                .executeBlocking(CategoryQuery.of().byId("id123"));
    }
}
