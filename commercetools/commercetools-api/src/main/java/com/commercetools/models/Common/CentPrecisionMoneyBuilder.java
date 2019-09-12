package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Common.CentPrecisionMoney;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CentPrecisionMoneyBuilder {
   
   
   private java.lang.Long centAmount;
   
   
   private java.lang.Integer fractionDigits;
   
   
   private java.lang.String currencyCode;
   
   public CentPrecisionMoneyBuilder centAmount( final java.lang.Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public CentPrecisionMoneyBuilder fractionDigits( final java.lang.Integer fractionDigits) {
      this.fractionDigits = fractionDigits;
      return this;
   }
   
   public CentPrecisionMoneyBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
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

   public CentPrecisionMoney build() {
       return new CentPrecisionMoneyImpl(centAmount, fractionDigits, currencyCode);
   }
   
   public static CentPrecisionMoneyBuilder of() {
      return new CentPrecisionMoneyBuilder();
   }
   
   public static CentPrecisionMoneyBuilder of(final CentPrecisionMoney template) {
      CentPrecisionMoneyBuilder builder = new CentPrecisionMoneyBuilder();
      builder.centAmount = template.getCentAmount();
      builder.fractionDigits = template.getFractionDigits();
      builder.currencyCode = template.getCurrencyCode();
      return builder;
   }
   
}