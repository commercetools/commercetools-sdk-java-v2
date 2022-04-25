
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldBooleanTypeImpl.class, name = CustomFieldBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTimeTypeImpl.class, name = CustomFieldDateTimeType.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTypeImpl.class, name = CustomFieldDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldEnumTypeImpl.class, name = CustomFieldEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = CustomFieldLocalizedEnumType.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedStringTypeImpl.class, name = CustomFieldLocalizedStringType.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldMoneyTypeImpl.class, name = CustomFieldMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldNumberTypeImpl.class, name = CustomFieldNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldReferenceTypeImpl.class, name = CustomFieldReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldSetTypeImpl.class, name = CustomFieldSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldStringTypeImpl.class, name = CustomFieldStringType.STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldTimeTypeImpl.class, name = CustomFieldTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = FieldTypeImpl.class, visible = true)
@JsonDeserialize(as = FieldTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FieldType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    public static com.commercetools.api.models.type.CustomFieldBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.api.models.type.CustomFieldBooleanTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldDateTimeTypeBuilder dateTimeBuilder() {
        return com.commercetools.api.models.type.CustomFieldDateTimeTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldDateTypeBuilder dateBuilder() {
        return com.commercetools.api.models.type.CustomFieldDateTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldEnumTypeBuilder enumBuilder() {
        return com.commercetools.api.models.type.CustomFieldEnumTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeBuilder localizedEnumBuilder() {
        return com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldLocalizedStringTypeBuilder localizedStringBuilder() {
        return com.commercetools.api.models.type.CustomFieldLocalizedStringTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.api.models.type.CustomFieldMoneyTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldNumberTypeBuilder numberBuilder() {
        return com.commercetools.api.models.type.CustomFieldNumberTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.api.models.type.CustomFieldReferenceTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldSetTypeBuilder setBuilder() {
        return com.commercetools.api.models.type.CustomFieldSetTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldStringTypeBuilder stringBuilder() {
        return com.commercetools.api.models.type.CustomFieldStringTypeBuilder.of();
    }

    public static com.commercetools.api.models.type.CustomFieldTimeTypeBuilder timeBuilder() {
        return com.commercetools.api.models.type.CustomFieldTimeTypeBuilder.of();
    }

    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FieldType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldType>() {
            @Override
            public String toString() {
                return "TypeReference<FieldType>";
            }
        };
    }
}
