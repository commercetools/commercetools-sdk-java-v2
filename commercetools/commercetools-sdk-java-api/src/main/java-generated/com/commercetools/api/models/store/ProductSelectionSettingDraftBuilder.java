
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSettingDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSettingDraft productSelectionSettingDraft = ProductSelectionSettingDraft.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSettingDraftBuilder implements Builder<ProductSelectionSettingDraft> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */

    public ProductSelectionSettingDraftBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */

    public ProductSelectionSettingDraftBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>If <code>true</code> all Products assigned to this Product Selection become part of the Store's assortment.</p>
     */

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
