package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NotEnabledError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NotEnabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NotEnabledError notEnabledError = NotEnabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class NotEnabledErrorBuilder implements Builder<NotEnabledError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"The category recommendations API is not yet enabled for your project."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public NotEnabledErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public NotEnabledErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public NotEnabledErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"The category recommendations API is not yet enabled for your project."</code></p>
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
     * builds NotEnabledError with checking for non-null required values
     * @return NotEnabledError
     */
    public NotEnabledError build() {
        Objects.requireNonNull(message, NotEnabledError.class + ": message is missing");
        return new NotEnabledErrorImpl(message, values);
    }
    
    /**
     * builds NotEnabledError without checking for non-null required values
     * @return NotEnabledError
     */
    public NotEnabledError buildUnchecked() {
        return new NotEnabledErrorImpl(message, values);
    }

    /**
     * factory method for an instance of NotEnabledErrorBuilder
     * @return builder 
     */
    public static NotEnabledErrorBuilder of() {
        return new NotEnabledErrorBuilder();
    }

    /**
     * create builder for NotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NotEnabledErrorBuilder of(final NotEnabledError template) {
        NotEnabledErrorBuilder builder = new NotEnabledErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
