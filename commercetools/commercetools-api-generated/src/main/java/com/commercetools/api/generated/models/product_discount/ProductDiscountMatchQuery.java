package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.Price;
import com.commercetools.api.generated.models.product_discount.ProductDiscountMatchQueryImpl;

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
@JsonDeserialize(as = ProductDiscountMatchQueryImpl.class)
public interface ProductDiscountMatchQuery  {

   
   @NotNull
   @JsonProperty("productId")
   public String getProductId();
   
   @NotNull
   @JsonProperty("variantId")
   public Integer getVariantId();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public Price getPrice();

   public void setProductId(final String productId);
   
   public void setVariantId(final Integer variantId);
   
   public void setStaged(final Boolean staged);
   
   public void setPrice(final Price price);
   
   public static ProductDiscountMatchQueryImpl of(){
      return new ProductDiscountMatchQueryImpl();
   }
   

   public static ProductDiscountMatchQueryImpl of(final ProductDiscountMatchQuery template) {
      ProductDiscountMatchQueryImpl instance = new ProductDiscountMatchQueryImpl();
      instance.setProductId(template.getProductId());
      instance.setPrice(template.getPrice());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}