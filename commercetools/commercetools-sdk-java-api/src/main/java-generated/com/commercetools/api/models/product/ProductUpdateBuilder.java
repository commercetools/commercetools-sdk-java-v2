
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductUpdateBuilder implements Builder<ProductUpdate> {

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

    public ProductUpdateBuilder plusActions(final com.commercetools.api.models.product.ProductUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ProductUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product.ProductUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product.ProductUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.product.ProductUpdateActionBuilder.of()).build());
        return this;
    }

    public ProductUpdateBuilder withActions(
            Function<com.commercetools.api.models.product.ProductUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product.ProductUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.product.ProductUpdateActionBuilder.of()).build());
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
