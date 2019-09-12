package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoney;
import java.lang.Long;
import com.commercetools.models.Common.HighPrecisionMoney;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class HighPrecisionMoneyBuilder {
   
   
   private java.lang.Long centAmount;
   
   
   private java.lang.Integer fractionDigits;
   
   
   private java.lang.String currencyCode;
   
   
   private java.lang.Long preciseAmount;
   
   public HighPrecisionMoneyBuilder centAmount( final java.lang.Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public HighPrecisionMoneyBuilder fractionDigits( final java.lang.Integer fractionDigits) {
      this.fractionDigits = fractionDigits;
      return this;
   }
   
   public HighPrecisionMoneyBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   public HighPrecisionMoneyBuilder preciseAmount( final java.lang.Long preciseAmount) {
      this.preciseAmount = preciseAmount;
      return this;
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public java.lang.Integer getFractionDigits(){
      return this.fractionDigits;
   }
   
   
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }
   
   
   public java.lang.Long getPreciseAmount(){
      return this.preciseAmount;
   }

   public HighPrecisionMoney build() {
       return new HighPrecisionMoneyImpl(centAmount, fractionDigits, currencyCode, preciseAmount);
   }
   
   public static HighPrecisionMoneyBuilder of() {
      return new HighPrecisionMoneyBuilder();
   }
   
   public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
      HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
      builder.centAmount = template.getCentAmount();
      builder.fractionDigits = template.getFractionDigits();
      builder.currencyCode = template.getCurrencyCode();
      builder.preciseAmount = template.getPreciseAmount();
      return builder;
   }
   
}