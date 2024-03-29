
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveProductSelectionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveProductSelectionAction storeRemoveProductSelectionAction = StoreRemoveProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveProductSelectionActionBuilder implements Builder<StoreRemoveProductSelectionAction> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public StoreRemoveProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public StoreRemoveProductSelectionActionBuilder withProductSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public StoreRemoveProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @return productSelection
     */

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
     * builds StoreRemoveProductSelectionAction with checking for non-null required values
     * @return StoreRemoveProductSelectionAction
     */
    public StoreRemoveProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreRemoveProductSelectionAction.class + ": productSelection is missing");
        return new StoreRemoveProductSelectionActionImpl(productSelection);
    }

    /**
     * builds StoreRemoveProductSelectionAction without checking for non-null required values
     * @return StoreRemoveProductSelectionAction
     */
    public StoreRemoveProductSelectionAction buildUnchecked() {
        return new StoreRemoveProductSelectionActionImpl(productSelection);
    }

    /**
     * factory method for an instance of StoreRemoveProductSelectionActionBuilder
     * @return builder
     */
    public static StoreRemoveProductSelectionActionBuilder of() {
        return new StoreRemoveProductSelectionActionBuilder();
    }

    /**
     * create builder for StoreRemoveProductSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveProductSelectionActionBuilder of(final StoreRemoveProductSelectionAction template) {
        StoreRemoveProductSelectionActionBuilder builder = new StoreRemoveProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
