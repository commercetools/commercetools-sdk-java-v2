package com.commercetools.models.Review;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Review.Review;
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
public final class ReviewReferenceImpl implements ReviewReference {

   private com.commercetools.models.Common.ReferenceTypeId typeId;
   
   private java.lang.String id;
   
   private com.commercetools.models.Review.Review obj;

   @JsonCreator
   ReviewReferenceImpl(@JsonProperty("id") final java.lang.String id, @JsonProperty("obj") final com.commercetools.models.Review.Review obj) {
      this.id = id;
      this.obj = obj;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("review").get();
   }
   public ReviewReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Review.Review getObj(){
      return this.obj;
   }

   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setObj(final com.commercetools.models.Review.Review obj){
      this.obj = obj;
   }

}