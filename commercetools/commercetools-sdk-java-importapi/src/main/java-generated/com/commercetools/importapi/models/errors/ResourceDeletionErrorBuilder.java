package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceDeletionError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceDeletionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceDeletionError resourceDeletionError = ResourceDeletionError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceDeletionErrorBuilder implements Builder<ResourceDeletionError> {

    
    
    private String message;
    
    
    @Nullable
    private java.lang.Object resource;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public ResourceDeletionErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    
    /**
     * set the value to the resource
     * @param resource value to be set
     * @return Builder
     */
    
    public ResourceDeletionErrorBuilder resource(@Nullable final java.lang.Object resource) {
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
     * builds ResourceDeletionError with checking for non-null required values
     * @return ResourceDeletionError
     */
    public ResourceDeletionError build() {
        Objects.requireNonNull(message, ResourceDeletionError.class + ": message is missing");
        return new ResourceDeletionErrorImpl(message, resource);
    }
    
    /**
     * builds ResourceDeletionError without checking for non-null required values
     * @return ResourceDeletionError
     */
    public ResourceDeletionError buildUnchecked() {
        return new ResourceDeletionErrorImpl(message, resource);
    }

    /**
     * factory method for an instance of ResourceDeletionErrorBuilder
     * @return builder 
     */
    public static ResourceDeletionErrorBuilder of() {
        return new ResourceDeletionErrorBuilder();
    }

    /**
     * create builder for ResourceDeletionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceDeletionErrorBuilder of(final ResourceDeletionError template) {
        ResourceDeletionErrorBuilder builder = new ResourceDeletionErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
