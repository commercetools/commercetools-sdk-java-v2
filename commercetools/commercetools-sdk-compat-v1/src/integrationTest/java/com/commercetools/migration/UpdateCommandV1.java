
package com.commercetools.migration;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.commands.CategoryUpdateCommand;
import io.sphere.sdk.categories.commands.updateactions.ChangeName;
import io.sphere.sdk.models.LocalizedString;

public class UpdateCommandV1 implements MigrateV1Example {
    private Category category;

    @Override
    public void v1() throws ExecutionException, InterruptedException {
        LocalizedString newName = LocalizedString.ofEnglish("new name");
        CategoryUpdateCommand command = CategoryUpdateCommand.of(category,
            Collections.singletonList(ChangeName.of(newName)));
        Category updatedCategory = blockingClient().executeBlocking(command);
    }
}
