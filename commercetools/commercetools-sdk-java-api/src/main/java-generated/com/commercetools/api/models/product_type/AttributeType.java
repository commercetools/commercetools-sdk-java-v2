package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeBooleanType;
import com.commercetools.api.models.product_type.AttributeDateTimeType;
import com.commercetools.api.models.product_type.AttributeDateType;
import com.commercetools.api.models.product_type.AttributeEnumType;
import com.commercetools.api.models.product_type.AttributeLocalizableTextType;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumType;
import com.commercetools.api.models.product_type.AttributeMoneyType;
import com.commercetools.api.models.product_type.AttributeNestedType;
import com.commercetools.api.models.product_type.AttributeNumberType;
import com.commercetools.api.models.product_type.AttributeReferenceType;
import com.commercetools.api.models.product_type.AttributeSetType;
import com.commercetools.api.models.product_type.AttributeTextType;
import com.commercetools.api.models.product_type.AttributeTimeType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeBooleanTypeImpl.class, name = "boolean"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTimeTypeImpl.class, name = "datetime"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTypeImpl.class, name = "date"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeEnumTypeImpl.class, name = "enum"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizableTextTypeImpl.class, name = "ltext"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeImpl.class, name = "lenum"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeMoneyTypeImpl.class, name = "money"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNestedTypeImpl.class, name = "nested"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNumberTypeImpl.class, name = "number"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeReferenceTypeImpl.class, name = "reference"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeSetTypeImpl.class, name = "set"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTextTypeImpl.class, name = "text"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTimeTypeImpl.class, name = "time")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "name",
    defaultImpl = AttributeTypeImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface AttributeType  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();





    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }
}
