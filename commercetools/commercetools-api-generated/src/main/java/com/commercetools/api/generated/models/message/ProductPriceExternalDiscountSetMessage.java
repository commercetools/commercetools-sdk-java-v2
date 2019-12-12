package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessageImpl;

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
@JsonDeserialize(as = ProductPriceExternalDiscountSetMessageImpl.class)
public interface ProductPriceExternalDiscountSetMessage extends Message {

   
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
   
   public static ProductPriceExternalDiscountSetMessageImpl of(){
      return new ProductPriceExternalDiscountSetMessageImpl();
   }
   

   public static ProductPriceExternalDiscountSetMessageImpl of(final ProductPriceExternalDiscountSetMessage template) {
      ProductPriceExternalDiscountSetMessageImpl instance = new ProductPriceExternalDiscountSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setDiscounted(template.getDiscounted());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setPriceId(template.getPriceId());
      instance.setSku(template.getSku());
      instance.setVariantKey(template.getVariantKey());
      return instance;
   }

}