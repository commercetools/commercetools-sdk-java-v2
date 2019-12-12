package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidUntilActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetValidUntilActionImpl.class)
public interface ProductDiscountSetValidUntilAction extends ProductDiscountUpdateAction {

   /**
   *  <p>The time from which the discount should be ineffective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */
   
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