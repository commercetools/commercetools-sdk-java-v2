
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AttributeType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }
}
