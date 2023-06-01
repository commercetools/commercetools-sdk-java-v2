package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidCurrentPasswordError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidCurrentPasswordErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCurrentPasswordError invalidCurrentPasswordError = InvalidCurrentPasswordError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidCurrentPasswordErrorBuilder implements Builder<InvalidCurrentPasswordError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"The given current password does not match."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidCurrentPasswordErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public InvalidCurrentPasswordErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public InvalidCurrentPasswordErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"The given current password does not match."</code></p>
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
     * builds InvalidCurrentPasswordError with checking for non-null required values
     * @return InvalidCurrentPasswordError
     */
    public InvalidCurrentPasswordError build() {
        Objects.requireNonNull(message, InvalidCurrentPasswordError.class + ": message is missing");
        return new InvalidCurrentPasswordErrorImpl(message, values);
    }
    
    /**
     * builds InvalidCurrentPasswordError without checking for non-null required values
     * @return InvalidCurrentPasswordError
     */
    public InvalidCurrentPasswordError buildUnchecked() {
        return new InvalidCurrentPasswordErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InvalidCurrentPasswordErrorBuilder
     * @return builder 
     */
    public static InvalidCurrentPasswordErrorBuilder of() {
        return new InvalidCurrentPasswordErrorBuilder();
    }

    /**
     * create builder for InvalidCurrentPasswordError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidCurrentPasswordErrorBuilder of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorBuilder builder = new InvalidCurrentPasswordErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
