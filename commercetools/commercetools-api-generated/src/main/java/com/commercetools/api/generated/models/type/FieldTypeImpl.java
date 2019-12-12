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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldTypeImpl implements FieldType {

   private String name;

   @JsonCreator
   FieldTypeImpl() {
      this.name = "null";
   }
   
   
   
   public String getName(){
      return this.name;
   }


}