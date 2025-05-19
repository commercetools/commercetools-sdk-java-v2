
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned if the requested resource was not found or the Product Search index is inactive.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ObjectNotFoundError objectNotFoundError = ObjectNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ObjectNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ObjectNotFoundErrorImpl.class)
public interface ObjectNotFoundError extends ErrorObject {

    /**
     * discriminator value for ObjectNotFoundError
     */
    String OBJECT_NOT_FOUND = "ObjectNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A $resourceType with identifier $id was unexpectedly not found."</code> or</p>
     *  <p><code>"No index found for project"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"A $resourceType with identifier $id was unexpectedly not found."</code> or</p>
     *  <p><code>"No index found for project"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ObjectNotFoundError
     */
    public static ObjectNotFoundError of() {
        return new ObjectNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy ObjectNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ObjectNotFoundError of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorImpl instance = new ObjectNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ObjectNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of ObjectNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ObjectNotFoundError deepCopy(@Nullable final ObjectNotFoundError template) {
        if (template == null) {
            return null;
        }
        ObjectNotFoundErrorImpl instance = new ObjectNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ObjectNotFoundError
     * @return builder
     */
    public static ObjectNotFoundErrorBuilder builder() {
        return ObjectNotFoundErrorBuilder.of();
    }

    /**
     * create builder for ObjectNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ObjectNotFoundErrorBuilder builder(final ObjectNotFoundError template) {
        return ObjectNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withObjectNotFoundError(Function<ObjectNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ObjectNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ObjectNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ObjectNotFoundError>";
            }
        };
    }
}
