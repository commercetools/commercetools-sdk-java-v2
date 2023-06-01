package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MaxResourceLimitExceededError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MaxResourceLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxResourceLimitExceededError maxResourceLimitExceededError = MaxResourceLimitExceededError.builder()
 *             .message("{message}")
 *             .exceededResource(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MaxResourceLimitExceededErrorBuilder implements Builder<MaxResourceLimitExceededError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    
    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public MaxResourceLimitExceededErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public MaxResourceLimitExceededErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public MaxResourceLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @param exceededResource value to be set
     * @return Builder
     */
    
    public MaxResourceLimitExceededErrorBuilder exceededResource( final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
        return this;
    }
    
    

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
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
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @return exceededResource
     */
    
    
    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource(){
        return this.exceededResource;
    }

    /**
     * builds MaxResourceLimitExceededError with checking for non-null required values
     * @return MaxResourceLimitExceededError
     */
    public MaxResourceLimitExceededError build() {
        Objects.requireNonNull(message, MaxResourceLimitExceededError.class + ": message is missing");
        Objects.requireNonNull(exceededResource, MaxResourceLimitExceededError.class + ": exceededResource is missing");
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }
    
    /**
     * builds MaxResourceLimitExceededError without checking for non-null required values
     * @return MaxResourceLimitExceededError
     */
    public MaxResourceLimitExceededError buildUnchecked() {
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }

    /**
     * factory method for an instance of MaxResourceLimitExceededErrorBuilder
     * @return builder 
     */
    public static MaxResourceLimitExceededErrorBuilder of() {
        return new MaxResourceLimitExceededErrorBuilder();
    }

    /**
     * create builder for MaxResourceLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxResourceLimitExceededErrorBuilder of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorBuilder builder = new MaxResourceLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.exceededResource = template.getExceededResource();
        return builder;
    }

}
