
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeOrderHintActionBuilder implements Builder<CategoryChangeOrderHintAction> {

    private String orderHint;

    public CategoryChangeOrderHintActionBuilder orderHint(final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public String getOrderHint() {
        return this.orderHint;
    }

    public CategoryChangeOrderHintAction build() {
        Objects.requireNonNull(orderHint, CategoryChangeOrderHintAction.class + ": orderHint is missing");
        return new CategoryChangeOrderHintActionImpl(orderHint);
    }

    /**
     * builds CategoryChangeOrderHintAction without checking for non null required values
     */
    public CategoryChangeOrderHintAction buildUnchecked() {
        return new CategoryChangeOrderHintActionImpl(orderHint);
    }

    public static CategoryChangeOrderHintActionBuilder of() {
        return new CategoryChangeOrderHintActionBuilder();
    }

    public static CategoryChangeOrderHintActionBuilder of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionBuilder builder = new CategoryChangeOrderHintActionBuilder();
        builder.orderHint = template.getOrderHint();
        return builder;
    }

}
