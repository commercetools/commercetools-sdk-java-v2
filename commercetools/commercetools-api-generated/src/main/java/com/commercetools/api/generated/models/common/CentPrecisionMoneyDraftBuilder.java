package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.MoneyType;
import com.commercetools.api.generated.models.common.TypedMoneyDraft;
import com.commercetools.api.generated.models.common.CentPrecisionMoneyDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CentPrecisionMoneyDraftBuilder {
   
   
   private Long centAmount;
   
   
   private String currencyCode;
   
   public CentPrecisionMoneyDraftBuilder centAmount( final Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public CentPrecisionMoneyDraftBuilder currencyCode( final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public String getCurrencyCode(){
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