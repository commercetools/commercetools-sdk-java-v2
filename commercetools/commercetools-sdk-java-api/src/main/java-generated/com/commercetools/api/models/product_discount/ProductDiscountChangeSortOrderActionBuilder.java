
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeSortOrderActionBuilder {

    private String sortOrder;

    public ProductDiscountChangeSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public ProductDiscountChangeSortOrderAction build() {
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
