
package com.commercetools.migration;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.commercetools.api.models.category.CategoryPagedQueryResponse;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.queries.PagedQueryResult;

public class TimeoutSetting implements MigrateExample {
    @Override
    public void v1() {
        PagedQueryResult<Category> response = blockingClient().executeBlocking(CategoryQuery.of(), 45,
            TimeUnit.SECONDS);
    }

    @Override
    public void v2() {
        CategoryPagedQueryResponse response = projectClient().categories()
                .get()
                .executeBlocking(Duration.ofSeconds(45))
                .getBody();
    }
}
