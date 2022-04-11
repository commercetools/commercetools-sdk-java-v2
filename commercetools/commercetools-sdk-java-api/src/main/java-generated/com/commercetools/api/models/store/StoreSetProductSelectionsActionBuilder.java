
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreSetProductSelectionsActionBuilder implements Builder<StoreSetProductSelectionsAction> {

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    public StoreSetProductSelectionsActionBuilder productSelections(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    public StoreSetProductSelectionsActionBuilder productSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    public StoreSetProductSelectionsActionBuilder plusProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    public StoreSetProductSelectionsActionBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    public StoreSetProductSelectionsActionBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    public StoreSetProductSelectionsAction build() {
        Objects.requireNonNull(productSelections,
            StoreSetProductSelectionsAction.class + ": productSelections is missing");
        return new StoreSetProductSelectionsActionImpl(productSelections);
    }

    /**
     * builds StoreSetProductSelectionsAction without checking for non null required values
     */
    public StoreSetProductSelectionsAction buildUnchecked() {
        return new StoreSetProductSelectionsActionImpl(productSelections);
    }

    public static StoreSetProductSelectionsActionBuilder of() {
        return new StoreSetProductSelectionsActionBuilder();
    }

    public static StoreSetProductSelectionsActionBuilder of(final StoreSetProductSelectionsAction template) {
        StoreSetProductSelectionsActionBuilder builder = new StoreSetProductSelectionsActionBuilder();
        builder.productSelections = template.getProductSelections();
        return builder;
    }

}
