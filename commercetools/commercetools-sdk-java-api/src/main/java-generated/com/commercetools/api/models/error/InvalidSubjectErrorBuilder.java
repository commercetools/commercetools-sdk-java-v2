package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidSubjectError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidSubjectErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidSubjectError invalidSubjectError = InvalidSubjectError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidSubjectErrorBuilder implements Builder<InvalidSubjectError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidSubjectErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public InvalidSubjectErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public InvalidSubjectErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds InvalidSubjectError with checking for non-null required values
     * @return InvalidSubjectError
     */
    public InvalidSubjectError build() {
        Objects.requireNonNull(message, InvalidSubjectError.class + ": message is missing");
        return new InvalidSubjectErrorImpl(message, values);
    }
    
    /**
     * builds InvalidSubjectError without checking for non-null required values
     * @return InvalidSubjectError
     */
    public InvalidSubjectError buildUnchecked() {
        return new InvalidSubjectErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InvalidSubjectErrorBuilder
     * @return builder 
     */
    public static InvalidSubjectErrorBuilder of() {
        return new InvalidSubjectErrorBuilder();
    }

    /**
     * create builder for InvalidSubjectError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
        InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
