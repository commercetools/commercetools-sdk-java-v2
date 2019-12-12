package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.Cart;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
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
public final class CartReferenceImpl implements CartReference {

   private com.commercetools.api.generated.models.common.ReferenceTypeId typeId;
   
   private String id;
   
   private com.commercetools.api.generated.models.cart.Cart obj;

   @JsonCreator
   CartReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.generated.models.cart.Cart obj) {
      this.id = id;
      this.obj = obj;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("cart").get();
   }
   public CartReferenceImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.cart.Cart getObj(){
      return this.obj;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setObj(final com.commercetools.api.generated.models.cart.Cart obj){
      this.obj = obj;
   }

}