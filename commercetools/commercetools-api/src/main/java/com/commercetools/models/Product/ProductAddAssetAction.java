package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductAddAssetActionImpl;

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
@JsonDeserialize(as = ProductAddAssetActionImpl.class)
public interface ProductAddAssetAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @NotNull
   @Valid
   @JsonProperty("asset")
   public AssetDraft getAsset();
   
   
   @JsonProperty("position")
   public Integer getPosition();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAsset(final AssetDraft asset);
   
   public void setPosition(final Integer position);
   
   public static ProductAddAssetActionImpl of(){
      return new ProductAddAssetActionImpl();
   }
   

   public static ProductAddAssetActionImpl of(final ProductAddAssetAction template) {
      ProductAddAssetActionImpl instance = new ProductAddAssetActionImpl();
      instance.setPosition(template.getPosition());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setAsset(template.getAsset());
      instance.setSku(template.getSku());
      return instance;
   }

}