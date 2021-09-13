
package com.commercetools.migration;

import java.io.IOException;

import com.commercetools.api.models.category.CategoryPagedQueryResponse;

public class QueryV2 implements MigrateV2Example {
    @Override
    public void v2() throws IOException {
        CategoryPagedQueryResponse response = projectClient().with()
                .categories()
                .get()
                .withWhere("id = :id")
                .withPredicateVar("id", "id123")
                .executeBlocking()
                .getBody();
    }
}
