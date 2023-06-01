package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidOperation;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidOperationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperation invalidOperation = InvalidOperation.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidOperationBuilder implements Builder<InvalidOperation> {

    
    
    private String message;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public InvalidOperationBuilder message( final String message) {
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
     * builds InvalidOperation with checking for non-null required values
     * @return InvalidOperation
     */
    public InvalidOperation build() {
        Objects.requireNonNull(message, InvalidOperation.class + ": message is missing");
        return new InvalidOperationImpl(message);
    }
    
    /**
     * builds InvalidOperation without checking for non-null required values
     * @return InvalidOperation
     */
    public InvalidOperation buildUnchecked() {
        return new InvalidOperationImpl(message);
    }

    /**
     * factory method for an instance of InvalidOperationBuilder
     * @return builder 
     */
    public static InvalidOperationBuilder of() {
        return new InvalidOperationBuilder();
    }

    /**
     * create builder for InvalidOperation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidOperationBuilder of(final InvalidOperation template) {
        InvalidOperationBuilder builder = new InvalidOperationBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
