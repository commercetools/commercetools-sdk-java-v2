
package com.commercetools.migration;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryByIdGet;

public class GetByIdCommandV1 implements MigrateV1Example {
    private Category category;

    @Override
    public void v1() throws ExecutionException, InterruptedException {
        Category loadedCategory = blockingClient()
                .executeBlocking(CategoryByIdGet.of(category.getId()).withExpansionPaths(m -> m.parent()));
    }
}
