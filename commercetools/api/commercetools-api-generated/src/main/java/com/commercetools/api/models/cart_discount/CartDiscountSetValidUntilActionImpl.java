package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
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
public final class CartDiscountSetValidUntilActionImpl implements CartDiscountSetValidUntilAction {

   private String action;
   
   private java.time.ZonedDateTime validUntil;

   @JsonCreator
   CartDiscountSetValidUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      this.action = "setValidUntil";
   }
   public CartDiscountSetValidUntilActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If absent, the field with the value is removed in case a value was set before.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }

}
