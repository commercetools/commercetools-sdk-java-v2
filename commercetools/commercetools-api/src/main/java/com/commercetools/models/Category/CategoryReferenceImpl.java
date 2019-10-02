package com.commercetools.models.category;

import com.commercetools.models.category.Category;
import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryReferenceImpl implements CategoryReference {

   private com.commercetools.models.common.ReferenceTypeId typeId;
   
   private String id;
   
   private com.commercetools.models.category.Category obj;

   @JsonCreator
   CategoryReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.models.category.Category obj) {
      this.id = id;
      this.obj = obj;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("category").get();
   }
   public CategoryReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.category.Category getObj(){
      return this.obj;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setObj(final com.commercetools.models.category.Category obj){
      this.obj = obj;
   }

}