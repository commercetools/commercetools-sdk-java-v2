package com.commercetools.models.message;

import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.message.MessagePayload;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceExternalDiscountSetMessagePayloadImpl implements ProductPriceExternalDiscountSetMessagePayload {

   private String type;
   
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   private Boolean staged;
   
   private Integer variantId;
   
   private String priceId;
   
   private String sku;
   
   private String variantKey;

   @JsonCreator
   ProductPriceExternalDiscountSetMessagePayloadImpl(@JsonProperty("discounted") final com.commercetools.models.common.DiscountedPrice discounted, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Integer variantId, @JsonProperty("priceId") final String priceId, @JsonProperty("sku") final String sku, @JsonProperty("variantKey") final String variantKey) {
      this.discounted = discounted;
      this.staged = staged;
      this.variantId = variantId;
      this.priceId = priceId;
      this.sku = sku;
      this.variantKey = variantKey;
      this.type = "ProductPriceExternalDiscountSet";
   }
   public ProductPriceExternalDiscountSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public String getVariantKey(){
      return this.variantKey;
   }

   public void setDiscounted(final com.commercetools.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setVariantKey(final String variantKey){
      this.variantKey = variantKey;
   }

}