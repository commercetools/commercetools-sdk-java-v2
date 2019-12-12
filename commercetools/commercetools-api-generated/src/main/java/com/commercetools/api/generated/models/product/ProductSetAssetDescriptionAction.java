package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAssetDescriptionActionImpl;

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
@JsonDeserialize(as = ProductSetAssetDescriptionActionImpl.class)
public interface ProductSetAssetDescriptionAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setDescription(final LocalizedString description);
   
   public static ProductSetAssetDescriptionActionImpl of(){
      return new ProductSetAssetDescriptionActionImpl();
   }
   

   public static ProductSetAssetDescriptionActionImpl of(final ProductSetAssetDescriptionAction template) {
      ProductSetAssetDescriptionActionImpl instance = new ProductSetAssetDescriptionActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setDescription(template.getDescription());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}