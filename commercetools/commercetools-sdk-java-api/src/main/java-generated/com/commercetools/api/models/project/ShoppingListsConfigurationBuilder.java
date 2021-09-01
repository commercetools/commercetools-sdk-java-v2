
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListsConfigurationBuilder implements Builder<ShoppingListsConfiguration> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    public ShoppingListsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public ShoppingListsConfiguration build() {
        return new ShoppingListsConfigurationImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds ShoppingListsConfiguration without checking for non null required values
     */
    public ShoppingListsConfiguration buildUnchecked() {
        return new ShoppingListsConfigurationImpl(deleteDaysAfterLastModification);
    }

    public static ShoppingListsConfigurationBuilder of() {
        return new ShoppingListsConfigurationBuilder();
    }

    public static ShoppingListsConfigurationBuilder of(final ShoppingListsConfiguration template) {
        ShoppingListsConfigurationBuilder builder = new ShoppingListsConfigurationBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
