package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import com.commercetools.importapi.models.errors.ResourceDeletionErrorImpl;

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
 * ResourceDeletionError
 *
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
@JsonDeserialize(as = ResourceDeletionErrorImpl.class)
public interface ResourceDeletionError extends ErrorObject {

    /**
     * discriminator value for ResourceDeletionError
     */
    String RESOURCE_DELETION = "ResourceDeletion";

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
     * @return instance of ResourceDeletionError
     */
    public static ResourceDeletionError of(){
        return new ResourceDeletionErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy ResourceDeletionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceDeletionError of(final ResourceDeletionError template) {
        ResourceDeletionErrorImpl instance = new ResourceDeletionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of ResourceDeletionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceDeletionError deepCopy(@Nullable final ResourceDeletionError template) {
        if (template == null) {
            return null;
        }
        ResourceDeletionErrorImpl instance = new ResourceDeletionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * builder factory method for ResourceDeletionError
     * @return builder
     */
    public static ResourceDeletionErrorBuilder builder() {
        return ResourceDeletionErrorBuilder.of();
    }
    
    /**
     * create builder for ResourceDeletionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceDeletionErrorBuilder builder(final ResourceDeletionError template) {
        return ResourceDeletionErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceDeletionError(Function<ResourceDeletionError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceDeletionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceDeletionError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceDeletionError>";
            }
        };
    }
}
