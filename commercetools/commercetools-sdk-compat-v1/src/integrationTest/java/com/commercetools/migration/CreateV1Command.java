
package com.commercetools.migration;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.CategoryDraft;
import io.sphere.sdk.categories.CategoryDraftBuilder;
import io.sphere.sdk.categories.commands.CategoryCreateCommand;
import io.sphere.sdk.models.LocalizedString;

public class CreateV1Command implements MigrateV1Example {
    @Override
    public void v1() throws ExecutionException, InterruptedException {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of(name, slug).build();
        Category category = blockingClient().executeBlocking(CategoryCreateCommand.of(categoryDraft));
    }
}
