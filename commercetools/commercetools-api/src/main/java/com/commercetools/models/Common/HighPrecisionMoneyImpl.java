package com.commercetools.models.common;

import com.commercetools.models.common.MoneyType;
import com.commercetools.models.common.TypedMoney;
import java.lang.Long;
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
public final class HighPrecisionMoneyImpl implements HighPrecisionMoney {

   private java.lang.Long centAmount;
   
   private java.lang.Integer fractionDigits;
   
   private com.commercetools.models.common.MoneyType type;
   
   private java.lang.String currencyCode;
   
   private java.lang.Long preciseAmount;

   @JsonCreator
   HighPrecisionMoneyImpl(@JsonProperty("centAmount") final java.lang.Long centAmount, @JsonProperty("fractionDigits") final java.lang.Integer fractionDigits, @JsonProperty("currencyCode") final java.lang.String currencyCode, @JsonProperty("preciseAmount") final java.lang.Long preciseAmount) {
      this.centAmount = centAmount;
      this.fractionDigits = fractionDigits;
      this.currencyCode = currencyCode;
      this.preciseAmount = preciseAmount;
      this.type = MoneyType.findEnumViaJsonName("highPrecision").get();
   }
   public HighPrecisionMoneyImpl() {
      
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public java.lang.Integer getFractionDigits(){
      return this.fractionDigits;
   }
   
   
   public com.commercetools.models.common.MoneyType getType(){
      return this.type;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }
   
   
   public java.lang.Long getPreciseAmount(){
      return this.preciseAmount;
   }

   public void setCentAmount(final java.lang.Long centAmount){
      this.centAmount = centAmount;
   }
   
   public void setFractionDigits(final java.lang.Integer fractionDigits){
      this.fractionDigits = fractionDigits;
   }
   
   public void setCurrencyCode(final java.lang.String currencyCode){
      this.currencyCode = currencyCode;
   }
   
   public void setPreciseAmount(final java.lang.Long preciseAmount){
      this.preciseAmount = preciseAmount;
   }

}