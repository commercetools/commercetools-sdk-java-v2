package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLocalizedEnumValueLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLocalizedEnumValueLabelAction productTypeChangeLocalizedEnumValueLabelAction = ProductTypeChangeLocalizedEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeLocalizedEnumValueLabelActionBuilder implements Builder<ProductTypeChangeLocalizedEnumValueLabelAction> {

    
    
    private String attributeName;
    
    
    
    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    
    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @param builder function to build the newValue value
     * @return Builder
     */
    
    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue(Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.newValue = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @param builder function to build the newValue value
     * @return Builder
     */
    
    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder withNewValue(Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        this.newValue = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of());
        return this;
    }
                    
    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @param newValue value to be set
     * @return Builder
     */
    
    public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue( final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.newValue = newValue;
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
     *  <p>New value to set. Must be different from the existing value.</p>
     * @return newValue
     */
    
    
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue(){
        return this.newValue;
    }

    /**
     * builds ProductTypeChangeLocalizedEnumValueLabelAction with checking for non-null required values
     * @return ProductTypeChangeLocalizedEnumValueLabelAction
     */
    public ProductTypeChangeLocalizedEnumValueLabelAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeLocalizedEnumValueLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(newValue, ProductTypeChangeLocalizedEnumValueLabelAction.class + ": newValue is missing");
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }
    
    /**
     * builds ProductTypeChangeLocalizedEnumValueLabelAction without checking for non-null required values
     * @return ProductTypeChangeLocalizedEnumValueLabelAction
     */
    public ProductTypeChangeLocalizedEnumValueLabelAction buildUnchecked() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(attributeName, newValue);
    }

    /**
     * factory method for an instance of ProductTypeChangeLocalizedEnumValueLabelActionBuilder
     * @return builder 
     */
    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeLocalizedEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of(final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder = new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
