package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetInputTipActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetInputTipAction productTypeSetInputTipAction = ProductTypeSetInputTipAction.builder()
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeSetInputTipActionBuilder implements Builder<ProductTypeSetInputTipAction> {

    
    
    private String attributeName;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    
    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ProductTypeSetInputTipActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */
    
    public ProductTypeSetInputTipActionBuilder inputTip(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the inputTip value
     * @return Builder
     */
    
    public ProductTypeSetInputTipActionBuilder withInputTip(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param inputTip value to be set
     * @return Builder
     */
    
    public ProductTypeSetInputTipActionBuilder inputTip(@Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }
    
    

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return inputTip
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getInputTip(){
        return this.inputTip;
    }

    /**
     * builds ProductTypeSetInputTipAction with checking for non-null required values
     * @return ProductTypeSetInputTipAction
     */
    public ProductTypeSetInputTipAction build() {
        Objects.requireNonNull(attributeName, ProductTypeSetInputTipAction.class + ": attributeName is missing");
        return new ProductTypeSetInputTipActionImpl(attributeName, inputTip);
    }
    
    /**
     * builds ProductTypeSetInputTipAction without checking for non-null required values
     * @return ProductTypeSetInputTipAction
     */
    public ProductTypeSetInputTipAction buildUnchecked() {
        return new ProductTypeSetInputTipActionImpl(attributeName, inputTip);
    }

    /**
     * factory method for an instance of ProductTypeSetInputTipActionBuilder
     * @return builder 
     */
    public static ProductTypeSetInputTipActionBuilder of() {
        return new ProductTypeSetInputTipActionBuilder();
    }

    /**
     * create builder for ProductTypeSetInputTipAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetInputTipActionBuilder of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionBuilder builder = new ProductTypeSetInputTipActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.inputTip = template.getInputTip();
        return builder;
    }

}
