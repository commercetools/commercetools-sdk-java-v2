
package com.commercetools.migration;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.CategoryDraft;
import io.sphere.sdk.categories.commands.CategoryCreateCommand;
import io.sphere.sdk.json.SphereJsonUtils;

public class CreateFromJsonV1 implements MigrateV1Example {
    @Override
    public void v1() throws ExecutionException, InterruptedException {
        final CategoryDraft categoryDraft = SphereJsonUtils.readObjectFromResource("category.json",
            CategoryDraft.class);
        final Category category = blockingClient().executeBlocking(CategoryCreateCommand.of(categoryDraft));
    }
}
