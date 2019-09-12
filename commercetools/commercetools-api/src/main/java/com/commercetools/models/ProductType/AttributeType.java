package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeBooleanType;
import com.commercetools.models.ProductType.AttributeDateTimeType;
import com.commercetools.models.ProductType.AttributeDateType;
import com.commercetools.models.ProductType.AttributeEnumType;
import com.commercetools.models.ProductType.AttributeLocalizableTextType;
import com.commercetools.models.ProductType.AttributeLocalizedEnumType;
import com.commercetools.models.ProductType.AttributeMoneyType;
import com.commercetools.models.ProductType.AttributeNestedType;
import com.commercetools.models.ProductType.AttributeNumberType;
import com.commercetools.models.ProductType.AttributeReferenceType;
import com.commercetools.models.ProductType.AttributeSetType;
import com.commercetools.models.ProductType.AttributeTextType;
import com.commercetools.models.ProductType.AttributeTimeType;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeBooleanTypeImpl.class, name = "boolean"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeDateTimeTypeImpl.class, name = "datetime"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeDateTypeImpl.class, name = "date"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeEnumTypeImpl.class, name = "enum"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeLocalizableTextTypeImpl.class, name = "ltext"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeLocalizedEnumTypeImpl.class, name = "lenum"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeMoneyTypeImpl.class, name = "money"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeNestedTypeImpl.class, name = "nested"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeNumberTypeImpl.class, name = "number"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeReferenceTypeImpl.class, name = "reference"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeSetTypeImpl.class, name = "set"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeTextTypeImpl.class, name = "text"),
   @JsonSubTypes.Type(value = com.commercetools.models.ProductType.AttributeTimeTypeImpl.class, name = "time")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "name"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface AttributeType  {


   


}