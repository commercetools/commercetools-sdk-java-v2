
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Provides the value for a custom field of a specific type.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CustomField {

    /**
    *  <p>The type of this field.</p>
    */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.importapi.models.customfields.BooleanFieldBuilder booleanBuilder() {
        return com.commercetools.importapi.models.customfields.BooleanFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.BooleanSetFieldBuilder booleanSetBuilder() {
        return com.commercetools.importapi.models.customfields.BooleanSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.DateFieldBuilder dateBuilder() {
        return com.commercetools.importapi.models.customfields.DateFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.DateSetFieldBuilder dateSetBuilder() {
        return com.commercetools.importapi.models.customfields.DateSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.DateTimeFieldBuilder dateTimeBuilder() {
        return com.commercetools.importapi.models.customfields.DateTimeFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.DateTimeSetFieldBuilder dateTimeSetBuilder() {
        return com.commercetools.importapi.models.customfields.DateTimeSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.EnumFieldBuilder enumBuilder() {
        return com.commercetools.importapi.models.customfields.EnumFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.EnumSetFieldBuilder enumSetBuilder() {
        return com.commercetools.importapi.models.customfields.EnumSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.LocalizedEnumFieldBuilder localizedEnumBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedEnumFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldBuilder localizedEnumSetBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.LocalizedStringFieldBuilder localizedStringBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedStringFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.LocalizedStringSetFieldBuilder localizedStringSetBuilder() {
        return com.commercetools.importapi.models.customfields.LocalizedStringSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.MoneyFieldBuilder moneyBuilder() {
        return com.commercetools.importapi.models.customfields.MoneyFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.MoneySetFieldBuilder moneySetBuilder() {
        return com.commercetools.importapi.models.customfields.MoneySetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.NumberFieldBuilder numberBuilder() {
        return com.commercetools.importapi.models.customfields.NumberFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.NumberSetFieldBuilder numberSetBuilder() {
        return com.commercetools.importapi.models.customfields.NumberSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.ReferenceFieldBuilder referenceBuilder() {
        return com.commercetools.importapi.models.customfields.ReferenceFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.ReferenceSetFieldBuilder referenceSetBuilder() {
        return com.commercetools.importapi.models.customfields.ReferenceSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.StringFieldBuilder stringBuilder() {
        return com.commercetools.importapi.models.customfields.StringFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.StringSetFieldBuilder stringSetBuilder() {
        return com.commercetools.importapi.models.customfields.StringSetFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.TimeFieldBuilder timeBuilder() {
        return com.commercetools.importapi.models.customfields.TimeFieldBuilder.of();
    }

    public static com.commercetools.importapi.models.customfields.TimeSetFieldBuilder timeSetBuilder() {
        return com.commercetools.importapi.models.customfields.TimeSetFieldBuilder.of();
    }

    default <T> T withCustomField(Function<CustomField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomField>() {
            @Override
            public String toString() {
                return "TypeReference<CustomField>";
            }
        };
    }
}
