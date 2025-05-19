
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * LocalizedEnumValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumValue localizedEnumValue = LocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedEnumValueImpl.class)
public interface LocalizedEnumValue {

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
     * @return instance of LocalizedEnumValue
     */
    public static LocalizedEnumValue of() {
        return new LocalizedEnumValueImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedEnumValue of(final LocalizedEnumValue template) {
        LocalizedEnumValueImpl instance = new LocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public LocalizedEnumValue copyDeep();

    /**
     * factory method to create a deep copy of LocalizedEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedEnumValue deepCopy(@Nullable final LocalizedEnumValue template) {
        if (template == null) {
            return null;
        }
        LocalizedEnumValueImpl instance = new LocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for LocalizedEnumValue
     * @return builder
     */
    public static LocalizedEnumValueBuilder builder() {
        return LocalizedEnumValueBuilder.of();
    }

    /**
     * create builder for LocalizedEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumValueBuilder builder(final LocalizedEnumValue template) {
        return LocalizedEnumValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedEnumValue(Function<LocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedEnumValue>";
            }
        };
    }
}
