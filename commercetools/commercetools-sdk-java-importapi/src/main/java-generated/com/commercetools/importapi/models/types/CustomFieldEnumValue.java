
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines an allowed value of a <a href="https://docs.commercetools.com/apis/ctp:import:type:CustomFieldEnumType" rel="nofollow">CustomFieldEnumType</a> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldEnumValue customFieldEnumValue = CustomFieldEnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldEnumValueImpl.class)
public interface CustomFieldEnumValue {

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Descriptive label of the value.</p>
     * @return label
     */
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Descriptive label of the value.</p>
     * @param label value to be set
     */

    public void setLabel(final String label);

    /**
     * factory method
     * @return instance of CustomFieldEnumValue
     */
    public static CustomFieldEnumValue of() {
        return new CustomFieldEnumValueImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldEnumValue of(final CustomFieldEnumValue template) {
        CustomFieldEnumValueImpl instance = new CustomFieldEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public CustomFieldEnumValue copyDeep();

    /**
     * factory method to create a deep copy of CustomFieldEnumValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldEnumValue deepCopy(@Nullable final CustomFieldEnumValue template) {
        if (template == null) {
            return null;
        }
        CustomFieldEnumValueImpl instance = new CustomFieldEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for CustomFieldEnumValue
     * @return builder
     */
    public static CustomFieldEnumValueBuilder builder() {
        return CustomFieldEnumValueBuilder.of();
    }

    /**
     * create builder for CustomFieldEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldEnumValueBuilder builder(final CustomFieldEnumValue template) {
        return CustomFieldEnumValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldEnumValue(Function<CustomFieldEnumValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldEnumValue>";
            }
        };
    }
}
