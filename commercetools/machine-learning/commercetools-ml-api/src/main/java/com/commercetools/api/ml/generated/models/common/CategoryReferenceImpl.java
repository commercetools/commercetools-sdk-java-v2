package com.commercetools.api.ml.generated.models.common;

import com.commercetools.api.ml.generated.models.common.Reference;
import com.commercetools.api.ml.generated.models.common.ReferenceTypeId;
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
public final class CategoryReferenceImpl implements CategoryReference {

   private ReferenceTypeId typeId;
   
   private String id;

   @JsonCreator
   CategoryReferenceImpl(@JsonProperty("id") final String id) {
      this.id = id;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("category").get();
   }
   public CategoryReferenceImpl() {
      
   }
   
   
   public ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }

   public void setId(final String id){
      this.id = id;
   }

}
