package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.MoneyType;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.common.HighPrecisionMoney;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class HighPrecisionMoneyBuilder {
   
   
   private Long centAmount;
   
   
   private Integer fractionDigits;
   
   
   private String currencyCode;
   
   
   private Long preciseAmount;
   
   public HighPrecisionMoneyBuilder centAmount( final Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public HighPrecisionMoneyBuilder fractionDigits( final Integer fractionDigits) {
      this.fractionDigits = fractionDigits;
      return this;
   }
   
   public HighPrecisionMoneyBuilder currencyCode( final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   public HighPrecisionMoneyBuilder preciseAmount( final Long preciseAmount) {
      this.preciseAmount = preciseAmount;
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
   
   
   public Long getPreciseAmount(){
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