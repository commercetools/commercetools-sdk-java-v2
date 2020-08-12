package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemoveImageActionImpl;

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
@JsonDeserialize(as = ProductRemoveImageActionImpl.class)
public interface ProductRemoveImageAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   /**
   *  <p>The URL of the image.</p>
   */
   @NotNull
   @JsonProperty("imageUrl")
   public String getImageUrl();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setImageUrl(final String imageUrl);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemoveImageActionImpl of(){
      return new ProductRemoveImageActionImpl();
   }
   

   public static ProductRemoveImageActionImpl of(final ProductRemoveImageAction template) {
      ProductRemoveImageActionImpl instance = new ProductRemoveImageActionImpl();
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setImageUrl(template.getImageUrl());
      instance.setStaged(template.getStaged());
      return instance;
   }

}
