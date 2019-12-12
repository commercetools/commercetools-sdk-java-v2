package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.MoneyType;
import com.commercetools.api.generated.models.common.TypedMoney;
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
public final class HighPrecisionMoneyImpl implements HighPrecisionMoney {

   private Long centAmount;
   
   private Integer fractionDigits;
   
   private com.commercetools.api.generated.models.common.MoneyType type;
   
   private String currencyCode;
   
   private Long preciseAmount;

   @JsonCreator
   HighPrecisionMoneyImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("fractionDigits") final Integer fractionDigits, @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("preciseAmount") final Long preciseAmount) {
      this.centAmount = centAmount;
      this.fractionDigits = fractionDigits;
      this.currencyCode = currencyCode;
      this.preciseAmount = preciseAmount;
      this.type = MoneyType.findEnumViaJsonName("highPrecision").get();
   }
   public HighPrecisionMoneyImpl() {
      
   }
   
   
   public Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public Integer getFractionDigits(){
      return this.fractionDigits;
   }
   
   
   public com.commercetools.api.generated.models.common.MoneyType getType(){
      return this.type;
   }
   
   /**
   *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public String getCurrencyCode(){
      return this.currencyCode;
   }
   
   
   public Long getPreciseAmount(){
      return this.preciseAmount;
   }

   public void setCentAmount(final Long centAmount){
      this.centAmount = centAmount;
   }
   
   public void setFractionDigits(final Integer fractionDigits){
      this.fractionDigits = fractionDigits;
   }
   
   public void setCurrencyCode(final String currencyCode){
      this.currencyCode = currencyCode;
   }
   
   public void setPreciseAmount(final Long preciseAmount){
      this.preciseAmount = preciseAmount;
   }

}