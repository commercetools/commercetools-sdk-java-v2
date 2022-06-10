
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreChangeProductSelectionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreChangeProductSelectionAction storeChangeProductSelectionAction = StoreChangeProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreChangeProductSelectionActionBuilder implements Builder<StoreChangeProductSelectionAction> {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    /**
     *  <p>Current Product Selection of the Store to be activated or deactivated.</p>
     */

    public StoreChangeProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current Product Selection of the Store to be activated or deactivated.</p>
     */

    public StoreChangeProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     */

    public StoreChangeProductSelectionActionBuilder active(@Nullable final Boolean active) {
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
