package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetImageLabelActionImpl;

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
@JsonDeserialize(as = ProductSetImageLabelActionImpl.class)
public interface ProductSetImageLabelAction extends ProductUpdateAction {

   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   /**
   *  <p>The URL of the image.</p>
   */
   @NotNull
   @JsonProperty("imageUrl")
   public String getImageUrl();
   /**
   *  <p>The new image label.
   *  If left blank or set to null, the label is removed.</p>
   */
   
   @JsonProperty("label")
   public String getLabel();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setSku(final String sku);
   
   public void setVariantId(final Long variantId);
   
   public void setImageUrl(final String imageUrl);
   
   public void setLabel(final String label);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetImageLabelActionImpl of(){
      return new ProductSetImageLabelActionImpl();
   }
   

   public static ProductSetImageLabelActionImpl of(final ProductSetImageLabelAction template) {
      ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
      instance.setSku(template.getSku());
      instance.setVariantId(template.getVariantId());
      instance.setImageUrl(template.getImageUrl());
      instance.setLabel(template.getLabel());
      instance.setStaged(template.getStaged());
      return instance;
   }

}
