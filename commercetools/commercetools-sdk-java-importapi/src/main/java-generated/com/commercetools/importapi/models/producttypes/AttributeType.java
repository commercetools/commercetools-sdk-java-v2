package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeBooleanType;
import com.commercetools.importapi.models.producttypes.AttributeDateTimeType;
import com.commercetools.importapi.models.producttypes.AttributeDateType;
import com.commercetools.importapi.models.producttypes.AttributeEnumType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizableTextType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumType;
import com.commercetools.importapi.models.producttypes.AttributeMoneyType;
import com.commercetools.importapi.models.producttypes.AttributeNestedType;
import com.commercetools.importapi.models.producttypes.AttributeNumberType;
import com.commercetools.importapi.models.producttypes.AttributeReferenceType;
import com.commercetools.importapi.models.producttypes.AttributeSetType;
import com.commercetools.importapi.models.producttypes.AttributeTextType;
import com.commercetools.importapi.models.producttypes.AttributeTimeType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeBooleanTypeImpl.class, name = "boolean"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeImpl.class, name = "datetime"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTypeImpl.class, name = "date"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeEnumTypeImpl.class, name = "enum"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeImpl.class, name = "ltext"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeImpl.class, name = "lenum"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeMoneyTypeImpl.class, name = "money"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNestedTypeImpl.class, name = "nested"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNumberTypeImpl.class, name = "number"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeReferenceTypeImpl.class, name = "reference"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeSetTypeImpl.class, name = "set"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTextTypeImpl.class, name = "text"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTimeTypeImpl.class, name = "time")
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





    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }
}
