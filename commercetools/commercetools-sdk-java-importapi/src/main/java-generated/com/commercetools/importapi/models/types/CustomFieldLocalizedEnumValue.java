
package com.commercetools.importapi.models.types;

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
 *  <p>Defines an allowed value of a CustomFieldLocalizedEnumType field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedEnumValue customFieldLocalizedEnumValue = CustomFieldLocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldLocalizedEnumValueImpl.class)
public interface CustomFieldLocalizedEnumValue {

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Descriptive localized label of the value.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Descriptive localized label of the value.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of CustomFieldLocalizedEnumValue
     */
    public static CustomFieldLocalizedEnumValue of() {
        return new CustomFieldLocalizedEnumValueImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldLocalizedEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldLocalizedEnumValue of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueImpl instance = new CustomFieldLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public CustomFieldLocalizedEnumValue copyDeep();

    /**
     * factory method to create a deep copy of CustomFieldLocalizedEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldLocalizedEnumValue deepCopy(@Nullable final CustomFieldLocalizedEnumValue template) {
        if (template == null) {
            return null;
        }
        CustomFieldLocalizedEnumValueImpl instance = new CustomFieldLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for CustomFieldLocalizedEnumValue
     * @return builder
     */
    public static CustomFieldLocalizedEnumValueBuilder builder() {
        return CustomFieldLocalizedEnumValueBuilder.of();
    }

    /**
     * create builder for CustomFieldLocalizedEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedEnumValueBuilder builder(final CustomFieldLocalizedEnumValue template) {
        return CustomFieldLocalizedEnumValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldLocalizedEnumValue(Function<CustomFieldLocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldLocalizedEnumValue>";
            }
        };
    }
}
