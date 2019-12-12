package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelativeDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueRelativeDraftImpl.class)
public interface CartDiscountValueRelativeDraft extends CartDiscountValueDraft {

   
   @NotNull
   @JsonProperty("permyriad")
   public Long getPermyriad();

   public void setPermyriad(final Long permyriad);
   
   public static CartDiscountValueRelativeDraftImpl of(){
      return new CartDiscountValueRelativeDraftImpl();
   }
   

   public static CartDiscountValueRelativeDraftImpl of(final CartDiscountValueRelativeDraft template) {
      CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
      instance.setPermyriad(template.getPermyriad());
      return instance;
   }

}