
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreAddProductSelectionActionBuilder implements Builder<StoreAddProductSelectionAction> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    public StoreAddProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StoreAddProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public StoreAddProductSelectionActionBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    public StoreAddProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreAddProductSelectionAction.class + ": productSelection is missing");
        return new StoreAddProductSelectionActionImpl(productSelection, active);
    }

    /**
     * builds StoreAddProductSelectionAction without checking for non null required values
     */
    public StoreAddProductSelectionAction buildUnchecked() {
        return new StoreAddProductSelectionActionImpl(productSelection, active);
    }

    public static StoreAddProductSelectionActionBuilder of() {
        return new StoreAddProductSelectionActionBuilder();
    }

    public static StoreAddProductSelectionActionBuilder of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionBuilder builder = new StoreAddProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
