
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a localized enum value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumField localizedEnumField = LocalizedEnumField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedEnumFieldImpl.class)
public interface LocalizedEnumField extends CustomField {

    /**
     * discriminator value for LocalizedEnumField
     */
    String LOCALIZED_ENUM = "LocalizedEnum";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of LocalizedEnumField
     */
    public static LocalizedEnumField of() {
        return new LocalizedEnumFieldImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedEnumField
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedEnumField of(final LocalizedEnumField template) {
        LocalizedEnumFieldImpl instance = new LocalizedEnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizedEnumField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedEnumField deepCopy(@Nullable final LocalizedEnumField template) {
        if (template == null) {
            return null;
        }
        LocalizedEnumFieldImpl instance = new LocalizedEnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for LocalizedEnumField
     * @return builder
     */
    public static LocalizedEnumFieldBuilder builder() {
        return LocalizedEnumFieldBuilder.of();
    }

    /**
     * create builder for LocalizedEnumField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumFieldBuilder builder(final LocalizedEnumField template) {
        return LocalizedEnumFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedEnumField(Function<LocalizedEnumField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedEnumField>";
            }
        };
    }
}
