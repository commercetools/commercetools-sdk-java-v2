
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountUpdateBuilder implements Builder<ProductDiscountUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions;

    public ProductDiscountUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductDiscountUpdateBuilder actions(
            final com.commercetools.api.models.product_discount.ProductDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ProductDiscountUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> getActions() {
        return this.actions;
    }

    public ProductDiscountUpdate build() {
        Objects.requireNonNull(version, ProductDiscountUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductDiscountUpdate.class + ": actions is missing");
        return new ProductDiscountUpdateImpl(version, actions);
    }

    /**
     * builds ProductDiscountUpdate without checking for non null required values
     */
    public ProductDiscountUpdate buildUnchecked() {
        return new ProductDiscountUpdateImpl(version, actions);
    }

    public static ProductDiscountUpdateBuilder of() {
        return new ProductDiscountUpdateBuilder();
    }

    public static ProductDiscountUpdateBuilder of(final ProductDiscountUpdate template) {
        ProductDiscountUpdateBuilder builder = new ProductDiscountUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
