package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateAttributeValueErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValueError duplicateAttributeValueError = DuplicateAttributeValueError.builder()
 *             .message("{message}")
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateAttributeValueErrorBuilder implements Builder<DuplicateAttributeValueError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.product.Attribute attribute;

    
    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Conflicting Attributes.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder attribute(Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Conflicting Attributes.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder withAttribute(Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.product.AttributeBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Conflicting Attributes.</p>
     * @param attribute value to be set
     * @return Builder
     */
    
    public DuplicateAttributeValueErrorBuilder attribute( final com.commercetools.api.models.product.Attribute attribute) {
        this.attribute = attribute;
        return this;
    }
    
    

    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Conflicting Attributes.</p>
     * @return attribute
     */
    
    
    public com.commercetools.api.models.product.Attribute getAttribute(){
        return this.attribute;
    }

    /**
     * builds DuplicateAttributeValueError with checking for non-null required values
     * @return DuplicateAttributeValueError
     */
    public DuplicateAttributeValueError build() {
        Objects.requireNonNull(message, DuplicateAttributeValueError.class + ": message is missing");
        Objects.requireNonNull(attribute, DuplicateAttributeValueError.class + ": attribute is missing");
        return new DuplicateAttributeValueErrorImpl(message, values, attribute);
    }
    
    /**
     * builds DuplicateAttributeValueError without checking for non-null required values
     * @return DuplicateAttributeValueError
     */
    public DuplicateAttributeValueError buildUnchecked() {
        return new DuplicateAttributeValueErrorImpl(message, values, attribute);
    }

    /**
     * factory method for an instance of DuplicateAttributeValueErrorBuilder
     * @return builder 
     */
    public static DuplicateAttributeValueErrorBuilder of() {
        return new DuplicateAttributeValueErrorBuilder();
    }

    /**
     * create builder for DuplicateAttributeValueError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateAttributeValueErrorBuilder of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorBuilder builder = new DuplicateAttributeValueErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
