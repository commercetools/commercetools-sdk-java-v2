package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetDescriptionActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetDescriptionActionImpl.class)
public interface ProductDiscountSetDescriptionAction extends ProductDiscountUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static ProductDiscountSetDescriptionActionImpl of(){
      return new ProductDiscountSetDescriptionActionImpl();
   }
   

   public static ProductDiscountSetDescriptionActionImpl of(final ProductDiscountSetDescriptionAction template) {
      ProductDiscountSetDescriptionActionImpl instance = new ProductDiscountSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}