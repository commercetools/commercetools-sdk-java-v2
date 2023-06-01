package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceUpdateError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceUpdateErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceUpdateError resourceUpdateError = ResourceUpdateError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceUpdateErrorBuilder implements Builder<ResourceUpdateError> {

    
    
    private String message;
    
    
    @Nullable
    private java.lang.Object resource;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public ResourceUpdateErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    
    /**
     * set the value to the resource
     * @param resource value to be set
     * @return Builder
     */
    
    public ResourceUpdateErrorBuilder resource(@Nullable final java.lang.Object resource) {
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
     * builds ResourceUpdateError with checking for non-null required values
     * @return ResourceUpdateError
     */
    public ResourceUpdateError build() {
        Objects.requireNonNull(message, ResourceUpdateError.class + ": message is missing");
        return new ResourceUpdateErrorImpl(message, resource);
    }
    
    /**
     * builds ResourceUpdateError without checking for non-null required values
     * @return ResourceUpdateError
     */
    public ResourceUpdateError buildUnchecked() {
        return new ResourceUpdateErrorImpl(message, resource);
    }

    /**
     * factory method for an instance of ResourceUpdateErrorBuilder
     * @return builder 
     */
    public static ResourceUpdateErrorBuilder of() {
        return new ResourceUpdateErrorBuilder();
    }

    /**
     * create builder for ResourceUpdateError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceUpdateErrorBuilder of(final ResourceUpdateError template) {
        ResourceUpdateErrorBuilder builder = new ResourceUpdateErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
