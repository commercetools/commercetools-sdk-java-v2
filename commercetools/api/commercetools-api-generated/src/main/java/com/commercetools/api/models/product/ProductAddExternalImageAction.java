package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddExternalImageActionImpl;

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
@JsonDeserialize(as = ProductAddExternalImageActionImpl.class)
public interface ProductAddExternalImageAction extends ProductUpdateAction {



   @JsonProperty("variantId")
   public Long getVariantId();


   @JsonProperty("sku")
   public String getSku();

   @NotNull
   @Valid
   @JsonProperty("image")
   public Image getImage();


   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);

   public void setSku(final String sku);

   public void setImage(final Image image);

   public void setStaged(final Boolean staged);

   public static ProductAddExternalImageActionImpl of(){
      return new ProductAddExternalImageActionImpl();
   }


   public static ProductAddExternalImageActionImpl of(final ProductAddExternalImageAction template) {
      ProductAddExternalImageActionImpl instance = new ProductAddExternalImageActionImpl();
      instance.setImage(template.getImage());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      return instance;
   }

}
