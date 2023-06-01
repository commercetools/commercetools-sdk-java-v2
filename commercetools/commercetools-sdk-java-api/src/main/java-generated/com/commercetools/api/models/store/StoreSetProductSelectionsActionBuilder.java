package com.commercetools.api.models.store;

import com.commercetools.api.models.store.ProductSelectionSettingDraft;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetProductSelectionsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreSetProductSelectionsActionBuilder implements Builder<StoreSetProductSelectionsAction> {

    
    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder productSelections(@Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft ...productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder productSelections(@Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder plusProductSelections(@Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft ...productSelections) {
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
     * @param builder function to build the productSelections value
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder plusProductSelections(Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder withProductSelections(Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections.add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder addProductSelections(Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraft> builder) {
        return plusProductSelections(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()));
    }
    
    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */
    
    public StoreSetProductSelectionsActionBuilder setProductSelections(Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraft> builder) {
        return productSelections(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()));
    }
                    

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @return productSelections
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections(){
        return this.productSelections;
    }

    /**
     * builds StoreSetProductSelectionsAction with checking for non-null required values
     * @return StoreSetProductSelectionsAction
     */
    public StoreSetProductSelectionsAction build() {
        return new StoreSetProductSelectionsActionImpl(productSelections);
    }
    
    /**
     * builds StoreSetProductSelectionsAction without checking for non-null required values
     * @return StoreSetProductSelectionsAction
     */
    public StoreSetProductSelectionsAction buildUnchecked() {
        return new StoreSetProductSelectionsActionImpl(productSelections);
    }

    /**
     * factory method for an instance of StoreSetProductSelectionsActionBuilder
     * @return builder 
     */
    public static StoreSetProductSelectionsActionBuilder of() {
        return new StoreSetProductSelectionsActionBuilder();
    }

    /**
     * create builder for StoreSetProductSelectionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetProductSelectionsActionBuilder of(final StoreSetProductSelectionsAction template) {
        StoreSetProductSelectionsActionBuilder builder = new StoreSetProductSelectionsActionBuilder();
        builder.productSelections = template.getProductSelections();
        return builder;
    }

}
