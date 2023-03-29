
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with a localized string set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedStringSetField localizedStringSetField = LocalizedStringSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedStringSetFieldImpl.class)
public interface LocalizedStringSetField extends CustomField {

    /**
     * discriminator value for LocalizedStringSetField
     */
    String LOCALIZED_STRING_SET = "LocalizedStringSet";

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalizedString... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<LocalizedString> value);

    /**
     * factory method
     * @return instance of LocalizedStringSetField
     */
    public static LocalizedStringSetField of() {
        return new LocalizedStringSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedStringSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedStringSetField of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldImpl instance = new LocalizedStringSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizedStringSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedStringSetField deepCopy(@Nullable final LocalizedStringSetField template) {
        if (template == null) {
            return null;
        }
        LocalizedStringSetFieldImpl instance = new LocalizedStringSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LocalizedStringSetField
     * @return builder
     */
    public static LocalizedStringSetFieldBuilder builder() {
        return LocalizedStringSetFieldBuilder.of();
    }

    /**
     * create builder for LocalizedStringSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedStringSetFieldBuilder builder(final LocalizedStringSetField template) {
        return LocalizedStringSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedStringSetField(Function<LocalizedStringSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedStringSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedStringSetField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedStringSetField>";
            }
        };
    }
}
