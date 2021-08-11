
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductUpdateBuilder implements Builder<ProductUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions;

    public ProductUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductUpdateBuilder actions(final com.commercetools.api.models.product.ProductUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ProductUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.product.ProductUpdateAction> getActions() {
        return this.actions;
    }

    public ProductUpdate build() {
        Objects.requireNonNull(version, ProductUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductUpdate.class + ": actions is missing");
        return new ProductUpdateImpl(version, actions);
    }

    /**
     * builds ProductUpdate without checking for non null required values
     */
    public ProductUpdate buildUnchecked() {
        return new ProductUpdateImpl(version, actions);
    }

    public static ProductUpdateBuilder of() {
        return new ProductUpdateBuilder();
    }

    public static ProductUpdateBuilder of(final ProductUpdate template) {
        ProductUpdateBuilder builder = new ProductUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
