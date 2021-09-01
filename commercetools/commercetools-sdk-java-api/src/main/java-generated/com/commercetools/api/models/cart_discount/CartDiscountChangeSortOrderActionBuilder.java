
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeSortOrderActionBuilder implements Builder<CartDiscountChangeSortOrderAction> {

    private String sortOrder;

    public CartDiscountChangeSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public CartDiscountChangeSortOrderAction build() {
        Objects.requireNonNull(sortOrder, CartDiscountChangeSortOrderAction.class + ": sortOrder is missing");
        return new CartDiscountChangeSortOrderActionImpl(sortOrder);
    }

    /**
     * builds CartDiscountChangeSortOrderAction without checking for non null required values
     */
    public CartDiscountChangeSortOrderAction buildUnchecked() {
        return new CartDiscountChangeSortOrderActionImpl(sortOrder);
    }

    public static CartDiscountChangeSortOrderActionBuilder of() {
        return new CartDiscountChangeSortOrderActionBuilder();
    }

    public static CartDiscountChangeSortOrderActionBuilder of(final CartDiscountChangeSortOrderAction template) {
        CartDiscountChangeSortOrderActionBuilder builder = new CartDiscountChangeSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
