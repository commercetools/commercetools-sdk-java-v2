package com.commercetools.models.product_discount;

import com.commercetools.models.common.Price;
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
public final class ProductDiscountMatchQueryImpl implements ProductDiscountMatchQuery {

   private String productId;
   
   private com.commercetools.models.common.Price price;
   
   private Boolean staged;
   
   private Integer variantId;

   @JsonCreator
   ProductDiscountMatchQueryImpl(@JsonProperty("productId") final String productId, @JsonProperty("price") final com.commercetools.models.common.Price price, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Integer variantId) {
      this.productId = productId;
      this.price = price;
      this.staged = staged;
      this.variantId = variantId;
   }
   public ProductDiscountMatchQueryImpl() {
      
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }

   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setPrice(final com.commercetools.models.common.Price price){
      this.price = price;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }

}