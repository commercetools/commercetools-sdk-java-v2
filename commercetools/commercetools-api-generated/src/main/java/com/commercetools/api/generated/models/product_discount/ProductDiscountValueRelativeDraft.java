package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelativeDraftImpl;

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
@JsonDeserialize(as = ProductDiscountValueRelativeDraftImpl.class)
public interface ProductDiscountValueRelativeDraft extends ProductDiscountValueDraft {

   
   @NotNull
   @JsonProperty("permyriad")
   public Long getPermyriad();

   public void setPermyriad(final Long permyriad);
   
   public static ProductDiscountValueRelativeDraftImpl of(){
      return new ProductDiscountValueRelativeDraftImpl();
   }
   

   public static ProductDiscountValueRelativeDraftImpl of(final ProductDiscountValueRelativeDraft template) {
      ProductDiscountValueRelativeDraftImpl instance = new ProductDiscountValueRelativeDraftImpl();
      instance.setPermyriad(template.getPermyriad());
      return instance;
   }

}