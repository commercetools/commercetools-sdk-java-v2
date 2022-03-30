
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeBooleanTypeImpl.class, name = AttributeBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTimeTypeImpl.class, name = AttributeDateTimeType.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTypeImpl.class, name = AttributeDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeEnumTypeImpl.class, name = AttributeEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizableTextTypeImpl.class, name = AttributeLocalizableTextType.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeImpl.class, name = AttributeLocalizedEnumType.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeMoneyTypeImpl.class, name = AttributeMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNestedTypeImpl.class, name = AttributeNestedType.NESTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNumberTypeImpl.class, name = AttributeNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeReferenceTypeImpl.class, name = AttributeReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeSetTypeImpl.class, name = AttributeSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTextTypeImpl.class, name = AttributeTextType.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTimeTypeImpl.class, name = AttributeTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = AttributeTypeImpl.class, visible = true)
@JsonDeserialize(as = AttributeTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AttributeType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }
}
