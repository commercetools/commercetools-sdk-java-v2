package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeAddLocalizedEnumValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = ProductTypeAddLocalizedEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeAddLocalizedEnumValueActionBuilder implements Builder<ProductTypeAddLocalizedEnumValueAction> {

    
    
    private String attributeName;
    
    
    
    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value;

    
    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ProductTypeAddLocalizedEnumValueActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public ProductTypeAddLocalizedEnumValueActionBuilder value(Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public ProductTypeAddLocalizedEnumValueActionBuilder withValue(Function<com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder, com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_type.AttributeLocalizedEnumValueBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public ProductTypeAddLocalizedEnumValueActionBuilder value( final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue value) {
        this.value = value;
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
     *  <p>Value to append to the array.</p>
     * @return value
     */
    
    
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getValue(){
        return this.value;
    }

    /**
     * builds ProductTypeAddLocalizedEnumValueAction with checking for non-null required values
     * @return ProductTypeAddLocalizedEnumValueAction
     */
    public ProductTypeAddLocalizedEnumValueAction build() {
        Objects.requireNonNull(attributeName, ProductTypeAddLocalizedEnumValueAction.class + ": attributeName is missing");
        Objects.requireNonNull(value, ProductTypeAddLocalizedEnumValueAction.class + ": value is missing");
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }
    
    /**
     * builds ProductTypeAddLocalizedEnumValueAction without checking for non-null required values
     * @return ProductTypeAddLocalizedEnumValueAction
     */
    public ProductTypeAddLocalizedEnumValueAction buildUnchecked() {
        return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
    }

    /**
     * factory method for an instance of ProductTypeAddLocalizedEnumValueActionBuilder
     * @return builder 
     */
    public static ProductTypeAddLocalizedEnumValueActionBuilder of() {
        return new ProductTypeAddLocalizedEnumValueActionBuilder();
    }

    /**
     * create builder for ProductTypeAddLocalizedEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddLocalizedEnumValueActionBuilder of(final ProductTypeAddLocalizedEnumValueAction template) {
        ProductTypeAddLocalizedEnumValueActionBuilder builder = new ProductTypeAddLocalizedEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}
