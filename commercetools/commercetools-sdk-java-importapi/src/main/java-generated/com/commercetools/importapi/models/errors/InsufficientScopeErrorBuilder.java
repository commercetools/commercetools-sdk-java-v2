package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InsufficientScopeError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InsufficientScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InsufficientScopeError insufficientScopeError = InsufficientScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InsufficientScopeErrorBuilder implements Builder<InsufficientScopeError> {

    
    
    private String message;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public InsufficientScopeErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    

    /**
     * value of message}
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }

    /**
     * builds InsufficientScopeError with checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError build() {
        Objects.requireNonNull(message, InsufficientScopeError.class + ": message is missing");
        return new InsufficientScopeErrorImpl(message);
    }
    
    /**
     * builds InsufficientScopeError without checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError buildUnchecked() {
        return new InsufficientScopeErrorImpl(message);
    }

    /**
     * factory method for an instance of InsufficientScopeErrorBuilder
     * @return builder 
     */
    public static InsufficientScopeErrorBuilder of() {
        return new InsufficientScopeErrorBuilder();
    }

    /**
     * create builder for InsufficientScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
        InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
