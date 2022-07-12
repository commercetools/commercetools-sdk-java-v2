
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetProductSelectionsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetProductSelectionsAction storeSetProductSelectionsAction = StoreSetProductSelectionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetProductSelectionsActionBuilder implements Builder<StoreSetProductSelectionsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */

    public StoreSetProductSelectionsActionBuilder productSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */

    public StoreSetProductSelectionsActionBuilder productSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */

    public StoreSetProductSelectionsActionBuilder plusProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */

    public StoreSetProductSelectionsActionBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */

    public StoreSetProductSelectionsActionBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    public StoreSetProductSelectionsAction build() {
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
