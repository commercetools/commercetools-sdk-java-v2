
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreAddProductSelectionActionBuilder implements Builder<StoreAddProductSelectionAction> {

    private com.commercetools.api.models.store.ProductSelectionSettingDraft productSelection;

    public StoreAddProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of())
                .build();
        return this;
    }

    public StoreAddProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public com.commercetools.api.models.store.ProductSelectionSettingDraft getProductSelection() {
        return this.productSelection;
    }

    public StoreAddProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreAddProductSelectionAction.class + ": productSelection is missing");
        return new StoreAddProductSelectionActionImpl(productSelection);
    }

    /**
     * builds StoreAddProductSelectionAction without checking for non null required values
     */
    public StoreAddProductSelectionAction buildUnchecked() {
        return new StoreAddProductSelectionActionImpl(productSelection);
    }

    public static StoreAddProductSelectionActionBuilder of() {
        return new StoreAddProductSelectionActionBuilder();
    }

    public static StoreAddProductSelectionActionBuilder of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionBuilder builder = new StoreAddProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
