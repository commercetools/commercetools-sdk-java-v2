
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a localized string value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedStringField localizedStringField = LocalizedStringField.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LocalizedString")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedStringFieldImpl.class)
public interface LocalizedStringField extends CustomField {

    /**
     * discriminator value for LocalizedStringField
     */
    String LOCALIZED_STRING = "LocalizedString";

    /**
     *  <p>A localized string.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    /**
     *  <p>A localized string.</p>
     * @param value value to be set
     */

    public void setValue(final LocalizedString value);

    /**
     * factory method
     * @return instance of LocalizedStringField
     */
    public static LocalizedStringField of() {
        return new LocalizedStringFieldImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedStringField
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedStringField of(final LocalizedStringField template) {
        LocalizedStringFieldImpl instance = new LocalizedStringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public LocalizedStringField copyDeep();

    /**
     * factory method to create a deep copy of LocalizedStringField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedStringField deepCopy(@Nullable final LocalizedStringField template) {
        if (template == null) {
            return null;
        }
        LocalizedStringFieldImpl instance = new LocalizedStringFieldImpl();
        instance.setValue(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for LocalizedStringField
     * @return builder
     */
    public static LocalizedStringFieldBuilder builder() {
        return LocalizedStringFieldBuilder.of();
    }

    /**
     * create builder for LocalizedStringField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedStringFieldBuilder builder(final LocalizedStringField template) {
        return LocalizedStringFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedStringField(Function<LocalizedStringField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedStringField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedStringField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedStringField>";
            }
        };
    }
}
