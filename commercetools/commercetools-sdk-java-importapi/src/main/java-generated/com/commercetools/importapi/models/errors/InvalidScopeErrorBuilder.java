package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidScopeError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidScopeError invalidScopeError = InvalidScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidScopeErrorBuilder implements Builder<InvalidScopeError> {

    
    
    private String message;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidScopeErrorBuilder message( final String message) {
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
     * builds InvalidScopeError with checking for non-null required values
     * @return InvalidScopeError
     */
    public InvalidScopeError build() {
        Objects.requireNonNull(message, InvalidScopeError.class + ": message is missing");
        return new InvalidScopeErrorImpl(message);
    }
    
    /**
     * builds InvalidScopeError without checking for non-null required values
     * @return InvalidScopeError
     */
    public InvalidScopeError buildUnchecked() {
        return new InvalidScopeErrorImpl(message);
    }

    /**
     * factory method for an instance of InvalidScopeErrorBuilder
     * @return builder 
     */
    public static InvalidScopeErrorBuilder of() {
        return new InvalidScopeErrorBuilder();
    }

    /**
     * create builder for InvalidScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidScopeErrorBuilder of(final InvalidScopeError template) {
        InvalidScopeErrorBuilder builder = new InvalidScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
