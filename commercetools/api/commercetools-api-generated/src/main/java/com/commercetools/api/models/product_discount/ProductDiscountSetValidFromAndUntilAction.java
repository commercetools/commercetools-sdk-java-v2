package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = ProductDiscountSetValidFromAndUntilActionImpl.class)
public interface ProductDiscountSetValidFromAndUntilAction extends ProductDiscountUpdateAction {



   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   *  <p>The timeframe for which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */

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
