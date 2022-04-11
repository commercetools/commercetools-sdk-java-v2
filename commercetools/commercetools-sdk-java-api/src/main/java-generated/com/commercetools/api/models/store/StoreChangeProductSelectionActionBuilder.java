
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreChangeProductSelectionActionBuilder implements Builder<StoreChangeProductSelectionAction> {

    private com.commercetools.api.models.common.ResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    public StoreChangeProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.common.ResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public StoreChangeProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.common.ResourceIdentifierBuilder, Builder<? extends com.commercetools.api.models.common.ResourceIdentifier>> builder) {
        this.productSelection = builder.apply(com.commercetools.api.models.common.ResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StoreChangeProductSelectionActionBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }

    public com.commercetools.api.models.common.ResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    public StoreChangeProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreChangeProductSelectionAction.class + ": productSelection is missing");
        return new StoreChangeProductSelectionActionImpl(productSelection, active);
    }

    /**
     * builds StoreChangeProductSelectionAction without checking for non null required values
     */
    public StoreChangeProductSelectionAction buildUnchecked() {
        return new StoreChangeProductSelectionActionImpl(productSelection, active);
    }

    public static StoreChangeProductSelectionActionBuilder of() {
        return new StoreChangeProductSelectionActionBuilder();
    }

    public static StoreChangeProductSelectionActionBuilder of(final StoreChangeProductSelectionAction template) {
        StoreChangeProductSelectionActionBuilder builder = new StoreChangeProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
