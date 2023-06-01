package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidTokenError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidTokenError invalidTokenError = InvalidTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidTokenErrorBuilder implements Builder<InvalidTokenError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidTokenErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public InvalidTokenErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public InvalidTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p>Plain text description of the cause of the error.</p>
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
     * builds InvalidTokenError with checking for non-null required values
     * @return InvalidTokenError
     */
    public InvalidTokenError build() {
        Objects.requireNonNull(message, InvalidTokenError.class + ": message is missing");
        return new InvalidTokenErrorImpl(message, values);
    }
    
    /**
     * builds InvalidTokenError without checking for non-null required values
     * @return InvalidTokenError
     */
    public InvalidTokenError buildUnchecked() {
        return new InvalidTokenErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InvalidTokenErrorBuilder
     * @return builder 
     */
    public static InvalidTokenErrorBuilder of() {
        return new InvalidTokenErrorBuilder();
    }

    /**
     * create builder for InvalidTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
        InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
