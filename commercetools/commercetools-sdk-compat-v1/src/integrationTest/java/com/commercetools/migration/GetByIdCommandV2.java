
package com.commercetools.migration;

import java.io.IOException;

import com.commercetools.api.models.category.Category;

public class GetByIdCommandV2 implements MigrateV2Example {
    private Category category;
    @Override
    public void v2() throws IOException {
        Category queriedCategory = projectClient().with()
                .categories()
                .withId(category.getId())
                .get()
                .withExpand("parent")
                .executeBlocking()
                .getBody();
    }
}
