
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
     */

    public StoreRemoveProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    public StoreRemoveProductSelectionAction build() {
        Objects.requireNonNull(productSelection,
            StoreRemoveProductSelectionAction.class + ": productSelection is missing");
        return new StoreRemoveProductSelectionActionImpl(productSelection);
    }

    /**
     * builds StoreRemoveProductSelectionAction without checking for non null required values
     */
    public StoreRemoveProductSelectionAction buildUnchecked() {
        return new StoreRemoveProductSelectionActionImpl(productSelection);
    }

    public static StoreRemoveProductSelectionActionBuilder of() {
        return new StoreRemoveProductSelectionActionBuilder();
    }

    public static StoreRemoveProductSelectionActionBuilder of(final StoreRemoveProductSelectionAction template) {
        StoreRemoveProductSelectionActionBuilder builder = new StoreRemoveProductSelectionActionBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
