
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeUpdateBuilder implements Builder<ProductTypeUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> actions;

    public ProductTypeUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductTypeUpdateBuilder actions(
            final com.commercetools.api.models.product_type.ProductTypeUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ProductTypeUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> getActions() {
        return this.actions;
    }

    public ProductTypeUpdate build() {
        Objects.requireNonNull(version, ProductTypeUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductTypeUpdate.class + ": actions is missing");
        return new ProductTypeUpdateImpl(version, actions);
    }

    /**
     * builds ProductTypeUpdate without checking for non null required values
     */
    public ProductTypeUpdate buildUnchecked() {
        return new ProductTypeUpdateImpl(version, actions);
    }

    public static ProductTypeUpdateBuilder of() {
        return new ProductTypeUpdateBuilder();
    }

    public static ProductTypeUpdateBuilder of(final ProductTypeUpdate template) {
        ProductTypeUpdateBuilder builder = new ProductTypeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
