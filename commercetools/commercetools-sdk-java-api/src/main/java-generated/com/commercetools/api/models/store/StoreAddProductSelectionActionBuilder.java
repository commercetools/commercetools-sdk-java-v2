
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreAddProductSelectionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddProductSelectionAction storeAddProductSelectionAction = StoreAddProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddProductSelectionActionBuilder implements Builder<StoreAddProductSelectionAction> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */

    public StoreAddProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */

    public StoreAddProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>If <code>true</code> all Products assigned to this Product Selection become part of the Store's assortment.</p>
     */

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
