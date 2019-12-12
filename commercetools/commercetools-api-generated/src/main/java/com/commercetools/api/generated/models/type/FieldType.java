package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldBooleanType;
import com.commercetools.api.generated.models.type.CustomFieldDateTimeType;
import com.commercetools.api.generated.models.type.CustomFieldDateType;
import com.commercetools.api.generated.models.type.CustomFieldEnumType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedStringType;
import com.commercetools.api.generated.models.type.CustomFieldMoneyType;
import com.commercetools.api.generated.models.type.CustomFieldNumberType;
import com.commercetools.api.generated.models.type.CustomFieldReferenceType;
import com.commercetools.api.generated.models.type.CustomFieldSetType;
import com.commercetools.api.generated.models.type.CustomFieldStringType;
import com.commercetools.api.generated.models.type.CustomFieldTimeType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldBooleanTypeImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldDateTimeTypeImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldDateTypeImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldEnumTypeImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldLocalizedStringTypeImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldMoneyTypeImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldNumberTypeImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldReferenceTypeImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldSetTypeImpl.class, name = "Set"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldStringTypeImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.type.CustomFieldTimeTypeImpl.class, name = "Time")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "name",
   defaultImpl = FieldTypeImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface FieldType  {


   


}