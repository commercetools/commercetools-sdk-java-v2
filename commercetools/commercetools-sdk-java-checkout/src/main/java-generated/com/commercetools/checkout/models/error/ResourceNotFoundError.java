
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the resource addressed by the request URL does not exist.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("ResourceNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {

    /**
     * discriminator value for ResourceNotFoundError
     */
    String RESOURCE_NOT_FOUND = "ResourceNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The Resource with ID $resourceId was not found."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The Resource with ID $resourceId was not found."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ResourceNotFoundError
     */
    public static ResourceNotFoundError of() {
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
        return instance;
    }

    public ResourceNotFoundError copyDeep();

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
