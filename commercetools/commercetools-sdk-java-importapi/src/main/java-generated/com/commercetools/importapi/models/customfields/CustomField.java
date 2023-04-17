
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Provides the value for a custom field of a specific type.</p>
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanFieldImpl.class, name = BooleanField.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanSetFieldImpl.class, name = BooleanSetField.BOOLEAN_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateFieldImpl.class, name = DateField.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateSetFieldImpl.class, name = DateSetField.DATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeFieldImpl.class, name = DateTimeField.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeSetFieldImpl.class, name = DateTimeSetField.DATE_TIME_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumFieldImpl.class, name = EnumField.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumSetFieldImpl.class, name = EnumSetField.ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumFieldImpl.class, name = LocalizedEnumField.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldImpl.class, name = LocalizedEnumSetField.LOCALIZED_ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringFieldImpl.class, name = LocalizedStringField.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringSetFieldImpl.class, name = LocalizedStringSetField.LOCALIZED_STRING_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneyFieldImpl.class, name = MoneyField.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneySetFieldImpl.class, name = MoneySetField.MONEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberFieldImpl.class, name = NumberField.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberSetFieldImpl.class, name = NumberSetField.NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceFieldImpl.class, name = ReferenceField.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceSetFieldImpl.class, name = ReferenceSetField.REFERENCE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringFieldImpl.class, name = StringField.STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringSetFieldImpl.class, name = StringSetField.STRING_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeFieldImpl.class, name = TimeField.TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeSetFieldImpl.class, name = TimeSetField.TIME_SET) })
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
        if (template instanceof com.commercetools.importapi.models.customfields.BooleanField) {
            return com.commercetools.importapi.models.customfields.BooleanField
                    .deepCopy((com.commercetools.importapi.models.customfields.BooleanField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.BooleanSetField) {
            return com.commercetools.importapi.models.customfields.BooleanSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.BooleanSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.DateField) {
            return com.commercetools.importapi.models.customfields.DateField
                    .deepCopy((com.commercetools.importapi.models.customfields.DateField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.DateSetField) {
            return com.commercetools.importapi.models.customfields.DateSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.DateSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.DateTimeField) {
            return com.commercetools.importapi.models.customfields.DateTimeField
                    .deepCopy((com.commercetools.importapi.models.customfields.DateTimeField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.DateTimeSetField) {
            return com.commercetools.importapi.models.customfields.DateTimeSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.DateTimeSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.EnumField) {
            return com.commercetools.importapi.models.customfields.EnumField
                    .deepCopy((com.commercetools.importapi.models.customfields.EnumField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.EnumSetField) {
            return com.commercetools.importapi.models.customfields.EnumSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.EnumSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.LocalizedEnumField) {
            return com.commercetools.importapi.models.customfields.LocalizedEnumField
                    .deepCopy((com.commercetools.importapi.models.customfields.LocalizedEnumField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.LocalizedEnumSetField) {
            return com.commercetools.importapi.models.customfields.LocalizedEnumSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.LocalizedEnumSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.LocalizedStringField) {
            return com.commercetools.importapi.models.customfields.LocalizedStringField
                    .deepCopy((com.commercetools.importapi.models.customfields.LocalizedStringField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.LocalizedStringSetField) {
            return com.commercetools.importapi.models.customfields.LocalizedStringSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.LocalizedStringSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.MoneyField) {
            return com.commercetools.importapi.models.customfields.MoneyField
                    .deepCopy((com.commercetools.importapi.models.customfields.MoneyField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.MoneySetField) {
            return com.commercetools.importapi.models.customfields.MoneySetField
                    .deepCopy((com.commercetools.importapi.models.customfields.MoneySetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.NumberField) {
            return com.commercetools.importapi.models.customfields.NumberField
                    .deepCopy((com.commercetools.importapi.models.customfields.NumberField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.NumberSetField) {
            return com.commercetools.importapi.models.customfields.NumberSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.NumberSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.ReferenceField) {
            return com.commercetools.importapi.models.customfields.ReferenceField
                    .deepCopy((com.commercetools.importapi.models.customfields.ReferenceField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.ReferenceSetField) {
            return com.commercetools.importapi.models.customfields.ReferenceSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.ReferenceSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.StringField) {
            return com.commercetools.importapi.models.customfields.StringField
                    .deepCopy((com.commercetools.importapi.models.customfields.StringField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.StringSetField) {
            return com.commercetools.importapi.models.customfields.StringSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.StringSetField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.TimeField) {
            return com.commercetools.importapi.models.customfields.TimeField
                    .deepCopy((com.commercetools.importapi.models.customfields.TimeField) template);
        }
        if (template instanceof com.commercetools.importapi.models.customfields.TimeSetField) {
            return com.commercetools.importapi.models.customfields.TimeSetField
                    .deepCopy((com.commercetools.importapi.models.customfields.TimeSetField) template);
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
