package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.PendingOperationError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PendingOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PendingOperationError pendingOperationError = PendingOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PendingOperationErrorBuilder implements Builder<PendingOperationError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */
    
    public PendingOperationErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public PendingOperationErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public PendingOperationErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p>Plain text description of the error.</p>
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
     * builds PendingOperationError with checking for non-null required values
     * @return PendingOperationError
     */
    public PendingOperationError build() {
        Objects.requireNonNull(message, PendingOperationError.class + ": message is missing");
        return new PendingOperationErrorImpl(message, values);
    }
    
    /**
     * builds PendingOperationError without checking for non-null required values
     * @return PendingOperationError
     */
    public PendingOperationError buildUnchecked() {
        return new PendingOperationErrorImpl(message, values);
    }

    /**
     * factory method for an instance of PendingOperationErrorBuilder
     * @return builder 
     */
    public static PendingOperationErrorBuilder of() {
        return new PendingOperationErrorBuilder();
    }

    /**
     * create builder for PendingOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PendingOperationErrorBuilder of(final PendingOperationError template) {
        PendingOperationErrorBuilder builder = new PendingOperationErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
