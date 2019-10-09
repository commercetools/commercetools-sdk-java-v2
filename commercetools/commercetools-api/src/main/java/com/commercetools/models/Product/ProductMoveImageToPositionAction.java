package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductMoveImageToPositionActionImpl;

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
@JsonDeserialize(as = ProductMoveImageToPositionActionImpl.class)
public interface ProductMoveImageToPositionAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @JsonProperty("imageUrl")
   public String getImageUrl();
   
   @NotNull
   @JsonProperty("position")
   public Long getPosition();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setImageUrl(final String imageUrl);
   
   public void setPosition(final Long position);
   
   public void setStaged(final Boolean staged);
   
   public static ProductMoveImageToPositionActionImpl of(){
      return new ProductMoveImageToPositionActionImpl();
   }
   

   public static ProductMoveImageToPositionActionImpl of(final ProductMoveImageToPositionAction template) {
      ProductMoveImageToPositionActionImpl instance = new ProductMoveImageToPositionActionImpl();
      instance.setImageUrl(template.getImageUrl());
      instance.setStaged(template.getStaged());
      instance.setPosition(template.getPosition());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      return instance;
   }

}