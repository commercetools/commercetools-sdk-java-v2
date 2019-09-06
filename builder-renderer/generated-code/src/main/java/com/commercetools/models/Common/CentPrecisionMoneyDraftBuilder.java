package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoneyDraft;
import com.commercetools.models.Common.CentPrecisionMoneyDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CentPrecisionMoneyDraftBuilder {
   
   
   private java.lang.Long centAmount;
   
   
   private java.lang.String currencyCode;
   
   public CentPrecisionMoneyDraftBuilder centAmount( final java.lang.Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public CentPrecisionMoneyDraftBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }

   public CentPrecisionMoneyDraft build() {
       return new CentPrecisionMoneyDraftImpl(centAmount, currencyCode);
   }
   
   public static CentPrecisionMoneyDraftBuilder of() {
      return new CentPrecisionMoneyDraftBuilder();
   }
   
   public static CentPrecisionMoneyDraftBuilder of(final CentPrecisionMoneyDraft template) {
      CentPrecisionMoneyDraftBuilder builder = new CentPrecisionMoneyDraftBuilder();
      builder.centAmount = template.getCentAmount();
      builder.currencyCode = template.getCurrencyCode();
      return builder;
   }
   
}