
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetDeleteDaysAfterLastModificationActionBuilder
        implements Builder<ShoppingListSetDeleteDaysAfterLastModificationAction> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    public ShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public ShoppingListSetDeleteDaysAfterLastModificationAction build() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds ShoppingListSetDeleteDaysAfterLastModificationAction without checking for non null required values
     */
    public ShoppingListSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
