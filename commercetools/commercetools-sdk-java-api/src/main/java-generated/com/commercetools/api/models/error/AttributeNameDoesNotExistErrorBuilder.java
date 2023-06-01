package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AttributeNameDoesNotExistError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeNameDoesNotExistErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNameDoesNotExistError attributeNameDoesNotExistError = AttributeNameDoesNotExistError.builder()
 *             .message("{message}")
 *             .invalidAttributeName("{invalidAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeNameDoesNotExistErrorBuilder implements Builder<AttributeNameDoesNotExistError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String invalidAttributeName;

    
    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public AttributeNameDoesNotExistErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public AttributeNameDoesNotExistErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public AttributeNameDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Non-existent Attribute name.</p>
     * @param invalidAttributeName value to be set
     * @return Builder
     */
    
    public AttributeNameDoesNotExistErrorBuilder invalidAttributeName( final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
        return this;
    }
    
    

    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
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
     *  <p>Non-existent Attribute name.</p>
     * @return invalidAttributeName
     */
    
    
    public String getInvalidAttributeName(){
        return this.invalidAttributeName;
    }

    /**
     * builds AttributeNameDoesNotExistError with checking for non-null required values
     * @return AttributeNameDoesNotExistError
     */
    public AttributeNameDoesNotExistError build() {
        Objects.requireNonNull(message, AttributeNameDoesNotExistError.class + ": message is missing");
        Objects.requireNonNull(invalidAttributeName, AttributeNameDoesNotExistError.class + ": invalidAttributeName is missing");
        return new AttributeNameDoesNotExistErrorImpl(message, values, invalidAttributeName);
    }
    
    /**
     * builds AttributeNameDoesNotExistError without checking for non-null required values
     * @return AttributeNameDoesNotExistError
     */
    public AttributeNameDoesNotExistError buildUnchecked() {
        return new AttributeNameDoesNotExistErrorImpl(message, values, invalidAttributeName);
    }

    /**
     * factory method for an instance of AttributeNameDoesNotExistErrorBuilder
     * @return builder 
     */
    public static AttributeNameDoesNotExistErrorBuilder of() {
        return new AttributeNameDoesNotExistErrorBuilder();
    }

    /**
     * create builder for AttributeNameDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNameDoesNotExistErrorBuilder of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorBuilder builder = new AttributeNameDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.invalidAttributeName = template.getInvalidAttributeName();
        return builder;
    }

}
