package com.commercetools.api.models.store;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.store.ProductSelectionSettingDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionSettingDraftBuilder implements Builder<ProductSelectionSettingDraft> {

    
    
    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;
    
    
    @Nullable
    private Boolean active;

    
    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */
    
    public ProductSelectionSettingDraftBuilder productSelection(Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder> builder) {
        this.productSelection = builder.apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */
    
    public ProductSelectionSettingDraftBuilder withProductSelection(Function<com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder, com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier> builder) {
        this.productSelection = builder.apply(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
     * @param productSelection value to be set
     * @return Builder
     */
    
    public ProductSelectionSettingDraftBuilder productSelection( final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
        return this;
    }
    
    
    
    
    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     * @param active value to be set
     * @return Builder
     */
    
    public ProductSelectionSettingDraftBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }
    
    

    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
     * @return productSelection
     */
    
    
    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection(){
        return this.productSelection;
    }
    
    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     * @return active
     */
    
    @Nullable
    public Boolean getActive(){
        return this.active;
    }

    /**
     * builds ProductSelectionSettingDraft with checking for non-null required values
     * @return ProductSelectionSettingDraft
     */
    public ProductSelectionSettingDraft build() {
        Objects.requireNonNull(productSelection, ProductSelectionSettingDraft.class + ": productSelection is missing");
        return new ProductSelectionSettingDraftImpl(productSelection, active);
    }
    
    /**
     * builds ProductSelectionSettingDraft without checking for non-null required values
     * @return ProductSelectionSettingDraft
     */
    public ProductSelectionSettingDraft buildUnchecked() {
        return new ProductSelectionSettingDraftImpl(productSelection, active);
    }

    /**
     * factory method for an instance of ProductSelectionSettingDraftBuilder
     * @return builder 
     */
    public static ProductSelectionSettingDraftBuilder of() {
        return new ProductSelectionSettingDraftBuilder();
    }

    /**
     * create builder for ProductSelectionSettingDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSettingDraftBuilder of(final ProductSelectionSettingDraft template) {
        ProductSelectionSettingDraftBuilder builder = new ProductSelectionSettingDraftBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
