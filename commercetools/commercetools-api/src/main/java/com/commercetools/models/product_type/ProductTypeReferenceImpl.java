package com.commercetools.models.product_type;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.product_type.ProductType;
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
public final class ProductTypeReferenceImpl implements ProductTypeReference {

   private com.commercetools.models.common.ReferenceTypeId typeId;
   
   private java.lang.String id;
   
   private com.commercetools.models.product_type.ProductType obj;

   @JsonCreator
   ProductTypeReferenceImpl(@JsonProperty("id") final java.lang.String id, @JsonProperty("obj") final com.commercetools.models.product_type.ProductType obj) {
      this.id = id;
      this.obj = obj;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("product-type").get();
   }
   public ProductTypeReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.product_type.ProductType getObj(){
      return this.obj;
   }

   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setObj(final com.commercetools.models.product_type.ProductType obj){
      this.obj = obj;
   }

}