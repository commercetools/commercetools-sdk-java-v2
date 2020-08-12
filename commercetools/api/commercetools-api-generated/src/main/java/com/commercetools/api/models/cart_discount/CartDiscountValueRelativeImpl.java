package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
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
public final class CartDiscountValueRelativeImpl implements CartDiscountValueRelative {

   private String type;
   
   private Long permyriad;

   @JsonCreator
   CartDiscountValueRelativeImpl(@JsonProperty("permyriad") final Long permyriad) {
      this.permyriad = permyriad;
      this.type = "relative";
   }
   public CartDiscountValueRelativeImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Long getPermyriad(){
      return this.permyriad;
   }

   public void setPermyriad(final Long permyriad){
      this.permyriad = permyriad;
   }

}
