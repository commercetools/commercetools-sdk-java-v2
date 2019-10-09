package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.product.ProductSetAssetCustomTypeActionImpl;

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
@JsonDeserialize(as = ProductSetAssetCustomTypeActionImpl.class)
public interface ProductSetAssetCustomTypeAction extends ProductUpdateAction {

   
   
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
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public Object getFields();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final Object fields);
   
   public static ProductSetAssetCustomTypeActionImpl of(){
      return new ProductSetAssetCustomTypeActionImpl();
   }
   

   public static ProductSetAssetCustomTypeActionImpl of(final ProductSetAssetCustomTypeAction template) {
      ProductSetAssetCustomTypeActionImpl instance = new ProductSetAssetCustomTypeActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      instance.setSku(template.getSku());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}