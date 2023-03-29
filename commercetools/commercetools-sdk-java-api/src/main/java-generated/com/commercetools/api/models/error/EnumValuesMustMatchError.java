
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when during an order update of AttributeEnumType or AttributeLocalizedEnumType the new enum values do not match the existing ones.</p>
 *  <p>The error is returned as a failed response to the Change the order of EnumValues and Change the order of LocalizedEnumValues update actions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValuesMustMatchError enumValuesMustMatchError = EnumValuesMustMatchError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumValuesMustMatchErrorImpl.class)
public interface EnumValuesMustMatchError extends ErrorObject {

    /**
     * discriminator value for EnumValuesMustMatchError
     */
    String ENUM_VALUES_MUST_MATCH = "EnumValuesMustMatch";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The given values must be equal to the existing enum values."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The given values must be equal to the existing enum values."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of EnumValuesMustMatchError
     */
    public static EnumValuesMustMatchError of() {
        return new EnumValuesMustMatchErrorImpl();
    }

    /**
     * factory method to create a shallow copy EnumValuesMustMatchError
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumValuesMustMatchError of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorImpl instance = new EnumValuesMustMatchErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumValuesMustMatchError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumValuesMustMatchError deepCopy(@Nullable final EnumValuesMustMatchError template) {
        if (template == null) {
            return null;
        }
        EnumValuesMustMatchErrorImpl instance = new EnumValuesMustMatchErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for EnumValuesMustMatchError
     * @return builder
     */
    public static EnumValuesMustMatchErrorBuilder builder() {
        return EnumValuesMustMatchErrorBuilder.of();
    }

    /**
     * create builder for EnumValuesMustMatchError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumValuesMustMatchErrorBuilder builder(final EnumValuesMustMatchError template) {
        return EnumValuesMustMatchErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumValuesMustMatchError(Function<EnumValuesMustMatchError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumValuesMustMatchError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumValuesMustMatchError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumValuesMustMatchError>";
            }
        };
    }
}
