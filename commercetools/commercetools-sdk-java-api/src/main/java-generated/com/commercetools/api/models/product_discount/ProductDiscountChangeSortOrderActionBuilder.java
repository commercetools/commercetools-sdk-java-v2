
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeSortOrderActionBuilder
        implements Builder<ProductDiscountChangeSortOrderAction> {

    private String sortOrder;

    public ProductDiscountChangeSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public ProductDiscountChangeSortOrderAction build() {
        Objects.requireNonNull(sortOrder, ProductDiscountChangeSortOrderAction.class + ": sortOrder is missing");
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }

    /**
     * builds ProductDiscountChangeSortOrderAction without checking for non null required values
     */
    public ProductDiscountChangeSortOrderAction buildUnchecked() {
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }

    public static ProductDiscountChangeSortOrderActionBuilder of() {
        return new ProductDiscountChangeSortOrderActionBuilder();
    }

    public static ProductDiscountChangeSortOrderActionBuilder of(final ProductDiscountChangeSortOrderAction template) {
        ProductDiscountChangeSortOrderActionBuilder builder = new ProductDiscountChangeSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
