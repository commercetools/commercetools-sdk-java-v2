
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
 *  <p>Provides the value for a Custom Field of a specific type.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomField customField = CustomField.booleanBuilder()
 *             value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CustomFieldImpl.class, visible = true)
@JsonDeserialize(as = CustomFieldImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomField {

    /**
     *  <p>The type of this field.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public CustomField copyDeep();

    /**
     * factory method to create a deep copy of CustomField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomField deepCopy(@Nullable final CustomField template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof CustomFieldImpl)) {
            return template.copyDeep();
        }
        CustomFieldImpl instance = new CustomFieldImpl();
        return instance;
    }

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.BooleanFieldBuilder booleanBuilder() {
        return com.commercetools.importapi.models.customfields.BooleanFieldBuilder.of();
    }

    /**
     * builder for booleanSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.BooleanSetFieldBuilder booleanSetBuilder() {
        return com.commercetools.importapi.models.customfields.BooleanSetFieldBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.DateFieldBuilder dateBuilder() {
        return com.commercetools.importapi.models.customfields.DateFieldBuilder.of();
    }

    /**
     * builder for dateSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.DateSetFieldBuilder dateSetBuilder() {
        return com.commercetools.importapi.models.customfields.DateSetFieldBuilder.of();
    }

    /**
     * builder for dateTime subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.DateTimeFieldBuilder dateTimeBuilder() {
        return com.commercetools.importapi.models.customfields.DateTimeFieldBuilder.of();
    }

    /**
     * builder for dateTimeSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.DateTimeSetFieldBuilder dateTimeSetBuilder() {
        return com.commercetools.importapi.models.customfields.DateTimeSetFieldBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.EnumFieldBuilder enumBuilder() {
        return com.commercetools.importapi.models.customfields.EnumFieldBuilder.of();
    }

    /**
     * builder for enumSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.EnumSetFieldBuilder enumSetBuilder() {
        return com.commercetools.importapi.models.customfields.EnumSetFieldBuilder.of();
    }

    /**
     * builder for localizedEnum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.LocalizedEnumFieldBuilder localizedEnumBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedEnumFieldBuilder.of();
    }

    /**
     * builder for localizedEnumSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldBuilder localizedEnumSetBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldBuilder.of();
    }

    /**
     * builder for localizedString subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.LocalizedStringFieldBuilder localizedStringBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedStringFieldBuilder.of();
    }

    /**
     * builder for localizedStringSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.LocalizedStringSetFieldBuilder localizedStringSetBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedStringSetFieldBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.MoneyFieldBuilder moneyBuilder() {
        return com.commercetools.importapi.models.customfields.MoneyFieldBuilder.of();
    }

    /**
     * builder for moneySet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.MoneySetFieldBuilder moneySetBuilder() {
        return com.commercetools.importapi.models.customfields.MoneySetFieldBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.NumberFieldBuilder numberBuilder() {
        return com.commercetools.importapi.models.customfields.NumberFieldBuilder.of();
    }

    /**
     * builder for numberSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.NumberSetFieldBuilder numberSetBuilder() {
        return com.commercetools.importapi.models.customfields.NumberSetFieldBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.ReferenceFieldBuilder referenceBuilder() {
        return com.commercetools.importapi.models.customfields.ReferenceFieldBuilder.of();
    }

    /**
     * builder for referenceSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.ReferenceSetFieldBuilder referenceSetBuilder() {
        return com.commercetools.importapi.models.customfields.ReferenceSetFieldBuilder.of();
    }

    /**
     * builder for string subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.StringFieldBuilder stringBuilder() {
        return com.commercetools.importapi.models.customfields.StringFieldBuilder.of();
    }

    /**
     * builder for stringSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.StringSetFieldBuilder stringSetBuilder() {
        return com.commercetools.importapi.models.customfields.StringSetFieldBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.TimeFieldBuilder timeBuilder() {
        return com.commercetools.importapi.models.customfields.TimeFieldBuilder.of();
    }

    /**
     * builder for timeSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.customfields.TimeSetFieldBuilder timeSetBuilder() {
        return com.commercetools.importapi.models.customfields.TimeSetFieldBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomField(Function<CustomField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomField>() {
            @Override
            public String toString() {
                return "TypeReference<CustomField>";
            }
        };
    }
}
