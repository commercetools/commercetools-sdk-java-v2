package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceNotFoundErrorImpl;

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
 * ResourceNotFoundError
 *
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
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {

    /**
     * discriminator value for ResourceNotFoundError
     */
    String RESOURCE_NOT_FOUND = "ResourceNotFound";

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
     * @return instance of ResourceNotFoundError
     */
    public static ResourceNotFoundError of(){
        return new ResourceNotFoundErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy ResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceNotFoundError of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of ResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceNotFoundError deepCopy(@Nullable final ResourceNotFoundError template) {
        if (template == null) {
            return null;
        }
        ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * builder factory method for ResourceNotFoundError
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder builder() {
        return ResourceNotFoundErrorBuilder.of();
    }
    
    /**
     * create builder for ResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder builder(final ResourceNotFoundError template) {
        return ResourceNotFoundErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceNotFoundError(Function<ResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceNotFoundError>";
            }
        };
    }
}
