
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
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public StoreAddProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public StoreAddProductSelectionActionBuilder withProductSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public StoreAddProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
     * @param active value to be set
     * @return Builder
     */

    public StoreAddProductSelectionActionBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @return productSelection
     */

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
     * @return active
     */

    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    /**
     * builds StoreAddProductSelectionAction with checking for non-null required values
     * @return StoreAddProductSelectionAction
     */
    public StoreAddProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreAddProductSelectionAction.class + ": productSelection is missing");
        return new StoreAddProductSelectionActionImpl(productSelection, active);
    }

    /**
     * builds StoreAddProductSelectionAction without checking for non-null required values
     * @return StoreAddProductSelectionAction
     */
    public StoreAddProductSelectionAction buildUnchecked() {
        return new StoreAddProductSelectionActionImpl(productSelection, active);
    }

    /**
     * factory method for an instance of StoreAddProductSelectionActionBuilder
     * @return builder
     */
    public static StoreAddProductSelectionActionBuilder of() {
        return new StoreAddProductSelectionActionBuilder();
    }

    /**
     * create builder for StoreAddProductSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddProductSelectionActionBuilder of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionBuilder builder = new StoreAddProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
