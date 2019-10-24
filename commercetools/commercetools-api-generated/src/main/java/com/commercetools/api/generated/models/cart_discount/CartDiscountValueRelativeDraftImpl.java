package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class CartDiscountValueRelativeDraftImpl implements CartDiscountValueRelativeDraft {

   private String type;
   
   private Long permyriad;

   @JsonCreator
   CartDiscountValueRelativeDraftImpl(@JsonProperty("permyriad") final Long permyriad) {
      this.permyriad = permyriad;
      this.type = "relative";
   }
   public CartDiscountValueRelativeDraftImpl() {
      
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