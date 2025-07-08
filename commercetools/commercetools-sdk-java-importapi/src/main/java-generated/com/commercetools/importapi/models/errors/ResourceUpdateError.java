
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceUpdateError
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ResourceUpdate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceUpdateErrorImpl.class)
public interface ResourceUpdateError extends ErrorObject {

    /**
     * discriminator value for ResourceUpdateError
     */
    String RESOURCE_UPDATE = "ResourceUpdate";

    /**
     *  <p>The resource that was updated.</p>
     * @return resource
     */

    @JsonProperty("resource")
    public Object getResource();

    /**
     *  <p>The resource that was updated.</p>
     * @param resource value to be set
     */

    public void setResource(final Object resource);

    /**
     * factory method
     * @return instance of ResourceUpdateError
     */
    public static ResourceUpdateError of() {
        return new ResourceUpdateErrorImpl();
    }

    /**
     * factory method to create a shallow copy ResourceUpdateError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceUpdateError of(final ResourceUpdateError template) {
        ResourceUpdateErrorImpl instance = new ResourceUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public ResourceUpdateError copyDeep();

    /**
     * factory method to create a deep copy of ResourceUpdateError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceUpdateError deepCopy(@Nullable final ResourceUpdateError template) {
        if (template == null) {
            return null;
        }
        ResourceUpdateErrorImpl instance = new ResourceUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    /**
     * builder factory method for ResourceUpdateError
     * @return builder
     */
    public static ResourceUpdateErrorBuilder builder() {
        return ResourceUpdateErrorBuilder.of();
    }

    /**
     * create builder for ResourceUpdateError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceUpdateErrorBuilder builder(final ResourceUpdateError template) {
        return ResourceUpdateErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceUpdateError(Function<ResourceUpdateError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceUpdateError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceUpdateError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceUpdateError>";
            }
        };
    }
}
