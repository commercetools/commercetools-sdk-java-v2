package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceNotFoundError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceNotFoundError resourceNotFoundError = ResourceNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceNotFoundErrorBuilder implements Builder<ResourceNotFoundError> {

    
    
    private String message;
    
    
    @Nullable
    private java.lang.Object resource;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public ResourceNotFoundErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    
    /**
     * set the value to the resource
     * @param resource value to be set
     * @return Builder
     */
    
    public ResourceNotFoundErrorBuilder resource(@Nullable final java.lang.Object resource) {
        this.resource = resource;
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
     * value of resource}
     * @return resource
     */
    
    @Nullable
    public java.lang.Object getResource(){
        return this.resource;
    }

    /**
     * builds ResourceNotFoundError with checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError build() {
        Objects.requireNonNull(message, ResourceNotFoundError.class + ": message is missing");
        return new ResourceNotFoundErrorImpl(message, resource);
    }
    
    /**
     * builds ResourceNotFoundError without checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError buildUnchecked() {
        return new ResourceNotFoundErrorImpl(message, resource);
    }

    /**
     * factory method for an instance of ResourceNotFoundErrorBuilder
     * @return builder 
     */
    public static ResourceNotFoundErrorBuilder of() {
        return new ResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for ResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
