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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeTypeImpl implements AttributeType {

   private String name;

   @JsonCreator
   AttributeTypeImpl() {
      this.name = "null";
   }
   
   
   
   public String getName(){
      return this.name;
   }


}