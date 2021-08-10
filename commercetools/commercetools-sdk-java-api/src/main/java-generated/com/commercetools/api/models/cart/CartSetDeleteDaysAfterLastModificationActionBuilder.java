
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetDeleteDaysAfterLastModificationActionBuilder
        implements Builder<CartSetDeleteDaysAfterLastModificationAction> {

    @Nullable
    private Integer deleteDaysAfterLastModification;

    public CartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public CartSetDeleteDaysAfterLastModificationAction build() {
        return new CartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds CartSetDeleteDaysAfterLastModificationAction without checking for non null required values
     */
    public CartSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new CartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    public static CartSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new CartSetDeleteDaysAfterLastModificationActionBuilder();
    }

    public static CartSetDeleteDaysAfterLastModificationActionBuilder of(
            final CartSetDeleteDaysAfterLastModificationAction template) {
        CartSetDeleteDaysAfterLastModificationActionBuilder builder = new CartSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
