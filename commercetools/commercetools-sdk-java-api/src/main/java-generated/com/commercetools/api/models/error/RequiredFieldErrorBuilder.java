package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.RequiredFieldError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequiredFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RequiredFieldErrorBuilder implements Builder<RequiredFieldError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String field;

    
    /**
     *  <p><code>"A value is required for field $field."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public RequiredFieldErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public RequiredFieldErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public RequiredFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Name of the field missing the value.</p>
     * @param field value to be set
     * @return Builder
     */
    
    public RequiredFieldErrorBuilder field( final String field) {
        this.field = field;
        return this;
    }
    
    

    /**
     *  <p><code>"A value is required for field $field."</code></p>
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
     *  <p>Name of the field missing the value.</p>
     * @return field
     */
    
    
    public String getField(){
        return this.field;
    }

    /**
     * builds RequiredFieldError with checking for non-null required values
     * @return RequiredFieldError
     */
    public RequiredFieldError build() {
        Objects.requireNonNull(message, RequiredFieldError.class + ": message is missing");
        Objects.requireNonNull(field, RequiredFieldError.class + ": field is missing");
        return new RequiredFieldErrorImpl(message, values, field);
    }
    
    /**
     * builds RequiredFieldError without checking for non-null required values
     * @return RequiredFieldError
     */
    public RequiredFieldError buildUnchecked() {
        return new RequiredFieldErrorImpl(message, values, field);
    }

    /**
     * factory method for an instance of RequiredFieldErrorBuilder
     * @return builder 
     */
    public static RequiredFieldErrorBuilder of() {
        return new RequiredFieldErrorBuilder();
    }

    /**
     * create builder for RequiredFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
        RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        return builder;
    }

}
