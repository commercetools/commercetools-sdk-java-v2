package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoneyDraft;
import java.lang.Long;
import com.commercetools.models.Common.HighPrecisionMoneyDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class HighPrecisionMoneyDraftBuilder {
   
   
   private java.lang.Long centAmount;
   
   
   private java.lang.String currencyCode;
   
   
   private java.lang.Long preciseAmount;
   
   public HighPrecisionMoneyDraftBuilder centAmount( final java.lang.Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public HighPrecisionMoneyDraftBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   public HighPrecisionMoneyDraftBuilder preciseAmount( final java.lang.Long preciseAmount) {
      this.preciseAmount = preciseAmount;
      return this;
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }
   
   
   public java.lang.Long getPreciseAmount(){
      return this.preciseAmount;
   }

   public HighPrecisionMoneyDraft build() {
       return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, preciseAmount);
   }
   
   public static HighPrecisionMoneyDraftBuilder of() {
      return new HighPrecisionMoneyDraftBuilder();
   }
   
   public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
      HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
      builder.centAmount = template.getCentAmount();
      builder.currencyCode = template.getCurrencyCode();
      builder.preciseAmount = template.getPreciseAmount();
      return builder;
   }
   
}