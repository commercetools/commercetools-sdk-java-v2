package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductLegacySetSkuActionImpl implements ProductLegacySetSkuAction {

   private String action;
   
   private Integer variantId;
   
   private String sku;

   @JsonCreator
   ProductLegacySetSkuActionImpl(@JsonProperty("variantId") final Integer variantId, @JsonProperty("sku") final String sku) {
      this.variantId = variantId;
      this.sku = sku;
      this.action = "legacySetSku";
   }
   public ProductLegacySetSkuActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}