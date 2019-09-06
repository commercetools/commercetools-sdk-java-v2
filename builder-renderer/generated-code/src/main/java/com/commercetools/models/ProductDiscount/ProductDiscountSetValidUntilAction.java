package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ProductDiscount.ProductDiscountSetValidUntilActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountSetValidUntilActionImpl.class)
public interface ProductDiscountSetValidUntilAction extends ProductDiscountUpdateAction {

   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static ProductDiscountSetValidUntilActionImpl of(){
      return new ProductDiscountSetValidUntilActionImpl();
   }
   

   public static ProductDiscountSetValidUntilActionImpl of(final ProductDiscountSetValidUntilAction template) {
      ProductDiscountSetValidUntilActionImpl instance = new ProductDiscountSetValidUntilActionImpl();
      instance.setValidUntil(template.getValidUntil());
      return instance;
   }

}