package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.common.ProductSelectionSetting;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSettingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetting productSelectionSetting = ProductSelectionSetting.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionSettingBuilder implements Builder<ProductSelectionSetting> {

    
    
    private com.commercetools.history.models.common.Reference productSelection;
    
    
    
    private Boolean active;

    
    /**
     * set the value to the productSelection using the builder function
     * @param builder function to build the productSelection value
     * @return Builder
     */
    
    public ProductSelectionSettingBuilder productSelection(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.productSelection = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the productSelection using the builder function
     * @param builder function to build the productSelection value
     * @return Builder
     */
    
    public ProductSelectionSettingBuilder withProductSelection(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.productSelection = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the productSelection
     * @param productSelection value to be set
     * @return Builder
     */
    
    public ProductSelectionSettingBuilder productSelection( final com.commercetools.history.models.common.Reference productSelection) {
        this.productSelection = productSelection;
        return this;
    }
    
    
    
    
    /**
     * set the value to the active
     * @param active value to be set
     * @return Builder
     */
    
    public ProductSelectionSettingBuilder active( final Boolean active) {
        this.active = active;
        return this;
    }
    
    

    /**
     * value of productSelection}
     * @return productSelection
     */
    
    
    public com.commercetools.history.models.common.Reference getProductSelection(){
        return this.productSelection;
    }
    
    /**
     * value of active}
     * @return active
     */
    
    
    public Boolean getActive(){
        return this.active;
    }

    /**
     * builds ProductSelectionSetting with checking for non-null required values
     * @return ProductSelectionSetting
     */
    public ProductSelectionSetting build() {
        Objects.requireNonNull(productSelection, ProductSelectionSetting.class + ": productSelection is missing");
        Objects.requireNonNull(active, ProductSelectionSetting.class + ": active is missing");
        return new ProductSelectionSettingImpl(productSelection, active);
    }
    
    /**
     * builds ProductSelectionSetting without checking for non-null required values
     * @return ProductSelectionSetting
     */
    public ProductSelectionSetting buildUnchecked() {
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    /**
     * factory method for an instance of ProductSelectionSettingBuilder
     * @return builder 
     */
    public static ProductSelectionSettingBuilder of() {
        return new ProductSelectionSettingBuilder();
    }

    /**
     * create builder for ProductSelectionSetting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSettingBuilder of(final ProductSelectionSetting template) {
        ProductSelectionSettingBuilder builder = new ProductSelectionSettingBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
