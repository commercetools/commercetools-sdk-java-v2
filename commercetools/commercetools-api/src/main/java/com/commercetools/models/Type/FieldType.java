package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldBooleanType;
import com.commercetools.models.type.CustomFieldDateTimeType;
import com.commercetools.models.type.CustomFieldDateType;
import com.commercetools.models.type.CustomFieldEnumType;
import com.commercetools.models.type.CustomFieldLocalizedEnumType;
import com.commercetools.models.type.CustomFieldLocalizedStringType;
import com.commercetools.models.type.CustomFieldMoneyType;
import com.commercetools.models.type.CustomFieldNumberType;
import com.commercetools.models.type.CustomFieldReferenceType;
import com.commercetools.models.type.CustomFieldSetType;
import com.commercetools.models.type.CustomFieldStringType;
import com.commercetools.models.type.CustomFieldTimeType;


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
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldBooleanTypeImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldDateTimeTypeImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldDateTypeImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldEnumTypeImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldLocalizedStringTypeImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldMoneyTypeImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldNumberTypeImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldReferenceTypeImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldSetTypeImpl.class, name = "Set"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldStringTypeImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.models.type.CustomFieldTimeTypeImpl.class, name = "Time")
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
public interface FieldType  {


   


}