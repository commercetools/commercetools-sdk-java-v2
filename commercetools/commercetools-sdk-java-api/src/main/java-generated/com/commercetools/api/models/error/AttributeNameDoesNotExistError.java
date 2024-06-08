
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
 *  <p>Returned when an AttributeDefinition does not exist for an Attribute <code>name</code>.</p>
 *  <p>The error is returned as a failed response to the Change AttributeDefinition Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNameDoesNotExistError attributeNameDoesNotExistError = AttributeNameDoesNotExistError.builder()
 *             .message("{message}")
 *             .invalidAttributeName("{invalidAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNameDoesNotExistErrorImpl.class)
public interface AttributeNameDoesNotExistError extends ErrorObject {

    /**
     * discriminator value for AttributeNameDoesNotExistError
     */
    String ATTRIBUTE_NAME_DOES_NOT_EXIST = "AttributeNameDoesNotExist";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Non-existent Attribute name.</p>
     * @return invalidAttributeName
     */
    @NotNull
    @JsonProperty("invalidAttributeName")
    public String getInvalidAttributeName();

    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Non-existent Attribute name.</p>
     * @param invalidAttributeName value to be set
     */

    public void setInvalidAttributeName(final String invalidAttributeName);

    /**
     * factory method
     * @return instance of AttributeNameDoesNotExistError
     */
    public static AttributeNameDoesNotExistError of() {
        return new AttributeNameDoesNotExistErrorImpl();
    }

    /**
     * factory method to create a shallow copy AttributeNameDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeNameDoesNotExistError of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorImpl instance = new AttributeNameDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeNameDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeNameDoesNotExistError deepCopy(@Nullable final AttributeNameDoesNotExistError template) {
        if (template == null) {
            return null;
        }
        AttributeNameDoesNotExistErrorImpl instance = new AttributeNameDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    /**
     * builder factory method for AttributeNameDoesNotExistError
     * @return builder
     */
    public static AttributeNameDoesNotExistErrorBuilder builder() {
        return AttributeNameDoesNotExistErrorBuilder.of();
    }

    /**
     * create builder for AttributeNameDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNameDoesNotExistErrorBuilder builder(final AttributeNameDoesNotExistError template) {
        return AttributeNameDoesNotExistErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeNameDoesNotExistError(Function<AttributeNameDoesNotExistError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNameDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNameDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNameDoesNotExistError>";
            }
        };
    }
}
