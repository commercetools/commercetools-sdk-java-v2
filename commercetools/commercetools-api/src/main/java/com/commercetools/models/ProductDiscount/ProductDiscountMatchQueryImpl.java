package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.Price;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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

   private java.lang.String productId;
   
   private com.commercetools.models.Common.Price price;
   
   private java.lang.Boolean staged;
   
   private java.lang.Integer variantId;

   @JsonCreator
   ProductDiscountMatchQueryImpl(@JsonProperty("productId") final java.lang.String productId, @JsonProperty("price") final com.commercetools.models.Common.Price price, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Integer variantId) {
      this.productId = productId;
      this.price = price;
      this.staged = staged;
      this.variantId = variantId;
   }
   public ProductDiscountMatchQueryImpl() {
      
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.Common.Price getPrice(){
      return this.price;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }

   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setPrice(final com.commercetools.models.Common.Price price){
      this.price = price;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Integer variantId){
      this.variantId = variantId;
   }

}