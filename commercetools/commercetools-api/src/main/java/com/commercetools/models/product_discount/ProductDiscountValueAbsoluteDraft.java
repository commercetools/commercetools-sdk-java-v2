package com.commercetools.models.product_discount;

import com.commercetools.models.common.Money;
import com.commercetools.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.models.product_discount.ProductDiscountValueAbsoluteDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ProductDiscountValueAbsoluteDraftImpl.class)
public interface ProductDiscountValueAbsoluteDraft extends ProductDiscountValueDraft {

   
   @NotNull
   @Valid
   @JsonProperty("money")
   public List<Money> getMoney();

   public void setMoney(final List<Money> money);
   
   public static ProductDiscountValueAbsoluteDraftImpl of(){
      return new ProductDiscountValueAbsoluteDraftImpl();
   }
   

   public static ProductDiscountValueAbsoluteDraftImpl of(final ProductDiscountValueAbsoluteDraft template) {
      ProductDiscountValueAbsoluteDraftImpl instance = new ProductDiscountValueAbsoluteDraftImpl();
      instance.setMoney(template.getMoney());
      return instance;
   }

}