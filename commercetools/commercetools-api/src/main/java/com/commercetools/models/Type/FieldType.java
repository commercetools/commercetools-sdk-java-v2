package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldBooleanType;
import com.commercetools.models.Type.CustomFieldDateTimeType;
import com.commercetools.models.Type.CustomFieldDateType;
import com.commercetools.models.Type.CustomFieldEnumType;
import com.commercetools.models.Type.CustomFieldLocalizedEnumType;
import com.commercetools.models.Type.CustomFieldLocalizedStringType;
import com.commercetools.models.Type.CustomFieldMoneyType;
import com.commercetools.models.Type.CustomFieldNumberType;
import com.commercetools.models.Type.CustomFieldReferenceType;
import com.commercetools.models.Type.CustomFieldSetType;
import com.commercetools.models.Type.CustomFieldStringType;
import com.commercetools.models.Type.CustomFieldTimeType;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldBooleanTypeImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldDateTimeTypeImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldDateTypeImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldEnumTypeImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldLocalizedEnumTypeImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldLocalizedStringTypeImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldMoneyTypeImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldNumberTypeImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldReferenceTypeImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldSetTypeImpl.class, name = "Set"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldStringTypeImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.models.Type.CustomFieldTimeTypeImpl.class, name = "Time")
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