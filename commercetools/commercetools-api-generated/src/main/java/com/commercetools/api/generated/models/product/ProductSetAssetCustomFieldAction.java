package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAssetCustomFieldActionImpl;

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
@JsonDeserialize(as = ProductSetAssetCustomFieldActionImpl.class)
public interface ProductSetAssetCustomFieldAction extends ProductUpdateAction {

   
   
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
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static ProductSetAssetCustomFieldActionImpl of(){
      return new ProductSetAssetCustomFieldActionImpl();
   }
   

   public static ProductSetAssetCustomFieldActionImpl of(final ProductSetAssetCustomFieldAction template) {
      ProductSetAssetCustomFieldActionImpl instance = new ProductSetAssetCustomFieldActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setName(template.getName());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setValue(template.getValue());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}