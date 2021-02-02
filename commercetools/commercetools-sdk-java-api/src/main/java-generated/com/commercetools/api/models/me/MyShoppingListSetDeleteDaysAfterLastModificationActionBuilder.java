
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder {

    @Nullable
    private Long deleteDaysAfterLastModification;

    public MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public MyShoppingListSetDeleteDaysAfterLastModificationAction build() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
