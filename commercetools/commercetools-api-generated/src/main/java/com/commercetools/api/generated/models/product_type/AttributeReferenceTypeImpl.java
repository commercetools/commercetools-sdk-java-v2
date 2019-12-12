package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.product_type.AttributeType;
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
public final class AttributeReferenceTypeImpl implements AttributeReferenceType {

   private String name;
   
   private com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId;

   @JsonCreator
   AttributeReferenceTypeImpl(@JsonProperty("referenceTypeId") final com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      this.name = "reference";
   }
   public AttributeReferenceTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public void setReferenceTypeId(final com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId){
      this.referenceTypeId = referenceTypeId;
   }

}