package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ResourceSizeLimitExceededError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceSizeLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceSizeLimitExceededError resourceSizeLimitExceededError = ResourceSizeLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceSizeLimitExceededErrorBuilder implements Builder<ResourceSizeLimitExceededError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"The resource size exceeds the maximal allowed size of 16 MB."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public ResourceSizeLimitExceededErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public ResourceSizeLimitExceededErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public ResourceSizeLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"The resource size exceeds the maximal allowed size of 16 MB."</code></p>
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
     * builds ResourceSizeLimitExceededError with checking for non-null required values
     * @return ResourceSizeLimitExceededError
     */
    public ResourceSizeLimitExceededError build() {
        Objects.requireNonNull(message, ResourceSizeLimitExceededError.class + ": message is missing");
        return new ResourceSizeLimitExceededErrorImpl(message, values);
    }
    
    /**
     * builds ResourceSizeLimitExceededError without checking for non-null required values
     * @return ResourceSizeLimitExceededError
     */
    public ResourceSizeLimitExceededError buildUnchecked() {
        return new ResourceSizeLimitExceededErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ResourceSizeLimitExceededErrorBuilder
     * @return builder 
     */
    public static ResourceSizeLimitExceededErrorBuilder of() {
        return new ResourceSizeLimitExceededErrorBuilder();
    }

    /**
     * create builder for ResourceSizeLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceSizeLimitExceededErrorBuilder of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorBuilder builder = new ResourceSizeLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
