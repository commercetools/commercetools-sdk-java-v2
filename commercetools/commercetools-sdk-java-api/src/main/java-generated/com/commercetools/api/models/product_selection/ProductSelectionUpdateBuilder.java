
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionUpdateBuilder implements Builder<ProductSelectionUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> actions;

    public ProductSelectionUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductSelectionUpdateBuilder actions(
            final com.commercetools.api.models.product_selection.ProductSelectionUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ProductSelectionUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public ProductSelectionUpdateBuilder plusActions(
            final com.commercetools.api.models.product_selection.ProductSelectionUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ProductSelectionUpdateBuilder plusActions(
            Function<com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public ProductSelectionUpdateBuilder withActions(
            Function<com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.product_selection.ProductSelectionUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.product_selection.ProductSelectionUpdateAction> getActions() {
        return this.actions;
    }

    public ProductSelectionUpdate build() {
        Objects.requireNonNull(version, ProductSelectionUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProductSelectionUpdate.class + ": actions is missing");
        return new ProductSelectionUpdateImpl(version, actions);
    }

    /**
     * builds ProductSelectionUpdate without checking for non null required values
     */
    public ProductSelectionUpdate buildUnchecked() {
        return new ProductSelectionUpdateImpl(version, actions);
    }

    public static ProductSelectionUpdateBuilder of() {
        return new ProductSelectionUpdateBuilder();
    }

    public static ProductSelectionUpdateBuilder of(final ProductSelectionUpdate template) {
        ProductSelectionUpdateBuilder builder = new ProductSelectionUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
