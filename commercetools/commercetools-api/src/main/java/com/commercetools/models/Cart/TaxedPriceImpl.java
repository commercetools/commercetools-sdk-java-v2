package com.commercetools.models.Cart;

import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
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
public final class TaxedPriceImpl implements TaxedPrice {

   private java.util.List<com.commercetools.models.Cart.TaxPortion> taxPortions;
   
   private com.commercetools.models.Common.Money totalGross;
   
   private com.commercetools.models.Common.Money totalNet;

   @JsonCreator
   TaxedPriceImpl(@JsonProperty("taxPortions") final java.util.List<com.commercetools.models.Cart.TaxPortion> taxPortions, @JsonProperty("totalGross") final com.commercetools.models.Common.Money totalGross, @JsonProperty("totalNet") final com.commercetools.models.Common.Money totalNet) {
      this.taxPortions = taxPortions;
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedPriceImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Cart.TaxPortion> getTaxPortions(){
      return this.taxPortions;
   }
   
   
   public com.commercetools.models.Common.Money getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.Common.Money getTotalNet(){
      return this.totalNet;
   }

   public void setTaxPortions(final java.util.List<com.commercetools.models.Cart.TaxPortion> taxPortions){
      this.taxPortions = taxPortions;
   }
   
   public void setTotalGross(final com.commercetools.models.Common.Money totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.models.Common.Money totalNet){
      this.totalNet = totalNet;
   }

}