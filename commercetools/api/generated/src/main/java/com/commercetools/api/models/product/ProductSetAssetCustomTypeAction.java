package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetAssetCustomTypeActionImpl;

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
   /**
   *  <p>If set, the custom type is set to this new value.
   *  If absent, the custom type and any existing custom fields are removed.</p>
   */
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   /**
   *  <p>If set, the custom fields are set to this new value.</p>
   */
   @Valid
   @JsonProperty("fields")
   public JsonNode getFields();

   public void setVariantId(final Long variantId);

   public void setSku(final String sku);

   public void setStaged(final Boolean staged);

   public void setAssetId(final String assetId);

   public void setAssetKey(final String assetKey);

   public void setType(final TypeResourceIdentifier type);

   public void setFields(final JsonNode fields);

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
