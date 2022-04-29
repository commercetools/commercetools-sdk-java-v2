
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeBooleanTypeImpl.class, name = AttributeBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeImpl.class, name = AttributeDateTimeType.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTypeImpl.class, name = AttributeDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeEnumTypeImpl.class, name = AttributeEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeImpl.class, name = AttributeLocalizableTextType.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeImpl.class, name = AttributeLocalizedEnumType.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeMoneyTypeImpl.class, name = AttributeMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNestedTypeImpl.class, name = AttributeNestedType.NESTED),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNumberTypeImpl.class, name = AttributeNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeReferenceTypeImpl.class, name = AttributeReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeSetTypeImpl.class, name = AttributeSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTextTypeImpl.class, name = AttributeTextType.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTimeTypeImpl.class, name = AttributeTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = AttributeTypeImpl.class, visible = true)
@JsonDeserialize(as = AttributeTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AttributeType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    public static com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder datetimeBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder dateBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder enumBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder ltextBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder lenumBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder nestedBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder numberBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder setBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder textBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder.of();
    }

    public static com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder timeBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder.of();
    }

    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeType>";
            }
        };
    }
}
