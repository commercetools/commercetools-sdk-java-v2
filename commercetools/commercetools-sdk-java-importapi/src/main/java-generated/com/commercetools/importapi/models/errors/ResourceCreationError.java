package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceCreationErrorImpl;

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
 * ResourceCreationError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceCreationError resourceCreationError = ResourceCreationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ResourceCreationErrorImpl.class)
public interface ResourceCreationError extends ErrorObject {

    /**
     * discriminator value for ResourceCreationError
     */
    String RESOURCE_CREATION = "ResourceCreation";

    /**
     *
     * @return resource
     */
    
    @JsonProperty("resource")
    public Object getResource();

    /**
     * set resource
     * @param resource value to be set
     */
    
    public void setResource(final Object resource);
    

    /**
     * factory method
     * @return instance of ResourceCreationError
     */
    public static ResourceCreationError of(){
        return new ResourceCreationErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy ResourceCreationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceCreationError of(final ResourceCreationError template) {
        ResourceCreationErrorImpl instance = new ResourceCreationErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of ResourceCreationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceCreationError deepCopy(@Nullable final ResourceCreationError template) {
        if (template == null) {
            return null;
        }
        ResourceCreationErrorImpl instance = new ResourceCreationErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * builder factory method for ResourceCreationError
     * @return builder
     */
    public static ResourceCreationErrorBuilder builder() {
        return ResourceCreationErrorBuilder.of();
    }
    
    /**
     * create builder for ResourceCreationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceCreationErrorBuilder builder(final ResourceCreationError template) {
        return ResourceCreationErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceCreationError(Function<ResourceCreationError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceCreationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceCreationError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceCreationError>";
            }
        };
    }
}
