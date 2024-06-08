
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
 *  <p>Returned when an enum value cannot be removed from an Attribute as it is being used by a Product.</p>
 *  <p>The error is returned as a failed response to the Remove EnumValues from AttributeDefinition update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValueIsUsedError enumValueIsUsedError = EnumValueIsUsedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumValueIsUsedErrorImpl.class)
public interface EnumValueIsUsedError extends ErrorObject {

    /**
     * discriminator value for EnumValueIsUsedError
     */
    String ENUM_VALUE_IS_USED = "EnumValueIsUsed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"$enumKeysTranscript is used by some products and cannot be deleted because the $attributeName attribute is required."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"$enumKeysTranscript is used by some products and cannot be deleted because the $attributeName attribute is required."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of EnumValueIsUsedError
     */
    public static EnumValueIsUsedError of() {
        return new EnumValueIsUsedErrorImpl();
    }

    /**
     * factory method to create a shallow copy EnumValueIsUsedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumValueIsUsedError of(final EnumValueIsUsedError template) {
        EnumValueIsUsedErrorImpl instance = new EnumValueIsUsedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumValueIsUsedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumValueIsUsedError deepCopy(@Nullable final EnumValueIsUsedError template) {
        if (template == null) {
            return null;
        }
        EnumValueIsUsedErrorImpl instance = new EnumValueIsUsedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for EnumValueIsUsedError
     * @return builder
     */
    public static EnumValueIsUsedErrorBuilder builder() {
        return EnumValueIsUsedErrorBuilder.of();
    }

    /**
     * create builder for EnumValueIsUsedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumValueIsUsedErrorBuilder builder(final EnumValueIsUsedError template) {
        return EnumValueIsUsedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumValueIsUsedError(Function<EnumValueIsUsedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumValueIsUsedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumValueIsUsedError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumValueIsUsedError>";
            }
        };
    }
}
