package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
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
public final class CartDiscountSetKeyActionImpl implements CartDiscountSetKeyAction {

   private String action;
   
   private String key;

   @JsonCreator
   CartDiscountSetKeyActionImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.action = "setKey";
   }
   public CartDiscountSetKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}