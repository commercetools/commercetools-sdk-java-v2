package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.producttypes.AttributeType;
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
   
   private com.commercetools.importer.models.common.ReferenceType referenceTypeId;

   @JsonCreator
   AttributeReferenceTypeImpl(@JsonProperty("referenceTypeId") final com.commercetools.importer.models.common.ReferenceType referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      this.name = "reference";
   }
   public AttributeReferenceTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   /**
   *  <p>The type of the referenced resource.</p>
   */
   public com.commercetools.importer.models.common.ReferenceType getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public void setReferenceTypeId(final com.commercetools.importer.models.common.ReferenceType referenceTypeId){
      this.referenceTypeId = referenceTypeId;
   }

}