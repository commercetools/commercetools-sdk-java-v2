
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionSettingDraftBuilder implements Builder<ProductSelectionSettingDraft> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    public ProductSelectionSettingDraftBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ProductSelectionSettingDraftBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public ProductSelectionSettingDraftBuilder active(@Nullable final Boolean active) {
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

    public ProductSelectionSettingDraft build() {
        Objects.requireNonNull(productSelection, ProductSelectionSettingDraft.class + ": productSelection is missing");
        return new ProductSelectionSettingDraftImpl(productSelection, active);
    }

    /**
     * builds ProductSelectionSettingDraft without checking for non null required values
     */
    public ProductSelectionSettingDraft buildUnchecked() {
        return new ProductSelectionSettingDraftImpl(productSelection, active);
    }

    public static ProductSelectionSettingDraftBuilder of() {
        return new ProductSelectionSettingDraftBuilder();
    }

    public static ProductSelectionSettingDraftBuilder of(final ProductSelectionSettingDraft template) {
        ProductSelectionSettingDraftBuilder builder = new ProductSelectionSettingDraftBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
