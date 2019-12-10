package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAssetKeyActionImpl;

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
@JsonDeserialize(as = ProductSetAssetKeyActionImpl.class)
public interface ProductSetAssetKeyAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @NotNull
   @JsonProperty("assetId")
   public String getAssetId();
   /**
   *  <p>User-defined identifier for the asset.
   *  If left blank or set to <code>null</code>, the asset key is unset/removed.</p>
   */
   
   @JsonProperty("assetKey")
   public String getAssetKey();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public static ProductSetAssetKeyActionImpl of(){
      return new ProductSetAssetKeyActionImpl();
   }
   

   public static ProductSetAssetKeyActionImpl of(final ProductSetAssetKeyAction template) {
      ProductSetAssetKeyActionImpl instance = new ProductSetAssetKeyActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}