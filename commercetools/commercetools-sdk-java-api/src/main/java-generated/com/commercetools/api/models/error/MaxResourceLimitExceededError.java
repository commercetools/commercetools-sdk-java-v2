package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MaxResourceLimitExceededErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Returned when a resource type cannot be created as it has reached its limits.</p>
 *  <p>The limits must be adjusted for this resource before sending the request again.</p>
 *
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
@JsonDeserialize(as = MaxResourceLimitExceededErrorImpl.class)
public interface MaxResourceLimitExceededError extends ErrorObject {

    /**
     * discriminator value for MaxResourceLimitExceededError
     */
    String MAX_RESOURCE_LIMIT_EXCEEDED = "MaxResourceLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();
    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @return exceededResource
     */
    @NotNull
    @JsonProperty("exceededResource")
    public ReferenceTypeId getExceededResource();

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @param message value to be set
     */
    
    public void setMessage(final String message);
    
    
    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @param exceededResource value to be set
     */
    
    public void setExceededResource(final ReferenceTypeId exceededResource);
    

    /**
     * factory method
     * @return instance of MaxResourceLimitExceededError
     */
    public static MaxResourceLimitExceededError of(){
        return new MaxResourceLimitExceededErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy MaxResourceLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MaxResourceLimitExceededError of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorImpl instance = new MaxResourceLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExceededResource(template.getExceededResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of MaxResourceLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MaxResourceLimitExceededError deepCopy(@Nullable final MaxResourceLimitExceededError template) {
        if (template == null) {
            return null;
        }
        MaxResourceLimitExceededErrorImpl instance = new MaxResourceLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExceededResource(template.getExceededResource());
        return instance;
    }

    /**
     * builder factory method for MaxResourceLimitExceededError
     * @return builder
     */
    public static MaxResourceLimitExceededErrorBuilder builder() {
        return MaxResourceLimitExceededErrorBuilder.of();
    }
    
    /**
     * create builder for MaxResourceLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxResourceLimitExceededErrorBuilder builder(final MaxResourceLimitExceededError template) {
        return MaxResourceLimitExceededErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMaxResourceLimitExceededError(Function<MaxResourceLimitExceededError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MaxResourceLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MaxResourceLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<MaxResourceLimitExceededError>";
            }
        };
    }
}
