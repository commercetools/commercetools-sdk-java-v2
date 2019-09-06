package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import java.lang.Long;
import java.lang.String;
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
public final class CartDiscountValueRelativeImpl implements CartDiscountValueRelative {

   private java.lang.String type;
   
   private java.lang.Long permyriad;

   @JsonCreator
   CartDiscountValueRelativeImpl(@JsonProperty("permyriad") final java.lang.Long permyriad) {
      this.permyriad = permyriad;
      this.type = "relative";
   }
   public CartDiscountValueRelativeImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Long getPermyriad(){
      return this.permyriad;
   }

   public void setPermyriad(final java.lang.Long permyriad){
      this.permyriad = permyriad;
   }

}