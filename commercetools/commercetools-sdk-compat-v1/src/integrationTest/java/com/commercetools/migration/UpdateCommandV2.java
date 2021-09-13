
package com.commercetools.migration;

import java.io.IOException;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryChangeNameActionBuilder;
import com.commercetools.api.models.category.CategoryUpdate;
import com.commercetools.api.models.category.CategoryUpdateBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringBuilder;

public class UpdateCommandV2 implements MigrateV2Example {
    private Category category;

    @Override
    public void v2() throws IOException {
        LocalizedString newName = LocalizedStringBuilder.of().addValue("en", "new name").build();
        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(CategoryChangeNameActionBuilder.of().name(newName).build())
                .build();

        Category updatedCategory = projectClient().with()
                .categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();
    }
}
