package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ProductDiscount.ProductDiscountSetValidFromAndUntilActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetValidFromAndUntilActionImpl.class)
public interface ProductDiscountSetValidFromAndUntilAction extends ProductDiscountUpdateAction {

   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static ProductDiscountSetValidFromAndUntilActionImpl of(){
      return new ProductDiscountSetValidFromAndUntilActionImpl();
   }
   

   public static ProductDiscountSetValidFromAndUntilActionImpl of(final ProductDiscountSetValidFromAndUntilAction template) {
      ProductDiscountSetValidFromAndUntilActionImpl instance = new ProductDiscountSetValidFromAndUntilActionImpl();
      instance.setValidUntil(template.getValidUntil());
      instance.setValidFrom(template.getValidFrom());
      return instance;
   }

}