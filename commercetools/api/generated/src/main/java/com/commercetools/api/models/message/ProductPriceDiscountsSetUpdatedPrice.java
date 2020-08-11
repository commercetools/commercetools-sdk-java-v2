package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl;

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
@JsonDeserialize(as = ProductPriceDiscountsSetUpdatedPriceImpl.class)
public interface ProductPriceDiscountsSetUpdatedPrice  {

   
   @NotNull
   @JsonProperty("variantId")
   public Integer getVariantId();
   
   
   @JsonProperty("variantKey")
   public String getVariantKey();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   @Valid
   @JsonProperty("discounted")
   public DiscountedPrice getDiscounted();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Integer variantId);
   
   public void setVariantKey(final String variantKey);
   
   public void setSku(final String sku);
   
   public void setPriceId(final String priceId);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public void setStaged(final Boolean staged);
   
   public static ProductPriceDiscountsSetUpdatedPriceImpl of(){
      return new ProductPriceDiscountsSetUpdatedPriceImpl();
   }
   

   public static ProductPriceDiscountsSetUpdatedPriceImpl of(final ProductPriceDiscountsSetUpdatedPrice template) {
      ProductPriceDiscountsSetUpdatedPriceImpl instance = new ProductPriceDiscountsSetUpdatedPriceImpl();
      instance.setDiscounted(template.getDiscounted());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setPriceId(template.getPriceId());
      instance.setSku(template.getSku());
      instance.setVariantKey(template.getVariantKey());
      return instance;
   }

}
