package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeBooleanType;
import com.commercetools.importer.models.producttypes.AttributeDateTimeType;
import com.commercetools.importer.models.producttypes.AttributeDateType;
import com.commercetools.importer.models.producttypes.AttributeEnumType;
import com.commercetools.importer.models.producttypes.AttributeLocalizableTextType;
import com.commercetools.importer.models.producttypes.AttributeLocalizedEnumType;
import com.commercetools.importer.models.producttypes.AttributeMoneyType;
import com.commercetools.importer.models.producttypes.AttributeNestedType;
import com.commercetools.importer.models.producttypes.AttributeNumberType;
import com.commercetools.importer.models.producttypes.AttributeReferenceType;
import com.commercetools.importer.models.producttypes.AttributeSetType;
import com.commercetools.importer.models.producttypes.AttributeTextType;
import com.commercetools.importer.models.producttypes.AttributeTimeType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeBooleanTypeImpl.class, name = "boolean"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeDateTimeTypeImpl.class, name = "datetime"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeDateTypeImpl.class, name = "date"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeEnumTypeImpl.class, name = "enum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeLocalizableTextTypeImpl.class, name = "ltext"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeLocalizedEnumTypeImpl.class, name = "lenum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeMoneyTypeImpl.class, name = "money"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeNestedTypeImpl.class, name = "nested"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeNumberTypeImpl.class, name = "number"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeReferenceTypeImpl.class, name = "reference"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeSetTypeImpl.class, name = "set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeTextTypeImpl.class, name = "text"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.producttypes.AttributeTimeTypeImpl.class, name = "time")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "name",
   defaultImpl = AttributeTypeImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface AttributeType  {


   


}