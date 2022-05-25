
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

    private com.commercetools.api.models.common.ResourceIdentifier productSelection;

    @Nullable
    private Boolean active;

    /**
     *  <p>A current Product Selection of this Store that is to be activated or deactivated.</p>
     */

    public StoreChangeProductSelectionActionBuilder productSelection(
            final com.commercetools.api.models.common.ResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>A current Product Selection of this Store that is to be activated or deactivated.</p>
     */

    public StoreChangeProductSelectionActionBuilder productSelection(
            Function<com.commercetools.api.models.common.ResourceIdentifierBuilder, Builder<? extends com.commercetools.api.models.common.ResourceIdentifier>> builder) {
        this.productSelection = builder.apply(com.commercetools.api.models.common.ResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>If <code>true</code> all Products assigned to the Product Selection become part of the Store's assortment.</p>
     */

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
