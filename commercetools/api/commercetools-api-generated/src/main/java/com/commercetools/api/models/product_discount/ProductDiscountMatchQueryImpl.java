package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.QueryPrice;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountMatchQueryImpl implements ProductDiscountMatchQuery {

   private String productId;
   
   private Integer variantId;
   
   private Boolean staged;
   
   private com.commercetools.api.models.common.QueryPrice price;

   @JsonCreator
   ProductDiscountMatchQueryImpl(@JsonProperty("productId") final String productId, @JsonProperty("variantId") final Integer variantId, @JsonProperty("staged") final Boolean staged, @JsonProperty("price") final com.commercetools.api.models.common.QueryPrice price) {
      this.productId = productId;
      this.variantId = variantId;
      this.staged = staged;
      this.price = price;
   }
   public ProductDiscountMatchQueryImpl() {
      
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.models.common.QueryPrice getPrice(){
      return this.price;
   }

   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setPrice(final com.commercetools.api.models.common.QueryPrice price){
      this.price = price;
   }

}
