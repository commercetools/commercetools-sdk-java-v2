package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Money;
import java.lang.Integer;
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
public final class OrderExcerptImpl implements OrderExcerpt {

   private com.commercetools.models.Common.Money totalPrice;
   
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   private java.lang.Integer version;

   @JsonCreator
   OrderExcerptImpl(@JsonProperty("totalPrice") final com.commercetools.models.Common.Money totalPrice, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedPrice taxedPrice, @JsonProperty("version") final java.lang.Integer version) {
      this.totalPrice = totalPrice;
      this.taxedPrice = taxedPrice;
      this.version = version;
   }
   public OrderExcerptImpl() {
      
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.lang.Integer getVersion(){
      return this.version;
   }

   public void setTotalPrice(final com.commercetools.models.Common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setVersion(final java.lang.Integer version){
      this.version = version;
   }

}