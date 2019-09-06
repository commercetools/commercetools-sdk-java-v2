package com.commercetools.models.ProductType;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeReferenceTypeImpl implements AttributeReferenceType {

   private java.lang.String name;
   
   private com.commercetools.models.Common.ReferenceTypeId referenceTypeId;

   @JsonCreator
   AttributeReferenceTypeImpl(@JsonProperty("referenceTypeId") final com.commercetools.models.Common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      this.name = "reference";
   }
   public AttributeReferenceTypeImpl() {
      
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public void setReferenceTypeId(final com.commercetools.models.Common.ReferenceTypeId referenceTypeId){
      this.referenceTypeId = referenceTypeId;
   }

}