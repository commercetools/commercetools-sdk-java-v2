package com.commercetools.models.common;

import com.commercetools.models.common.MoneyType;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.common.CentPrecisionMoney;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CentPrecisionMoneyBuilder {
   
   
   private Long centAmount;
   
   
   private Integer fractionDigits;
   
   
   private String currencyCode;
   
   public CentPrecisionMoneyBuilder centAmount( final Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public CentPrecisionMoneyBuilder fractionDigits( final Integer fractionDigits) {
      this.fractionDigits = fractionDigits;
      return this;
   }
   
   public CentPrecisionMoneyBuilder currencyCode( final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public Integer getFractionDigits(){
      return this.fractionDigits;
   }
   
   
   public String getCurrencyCode(){
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