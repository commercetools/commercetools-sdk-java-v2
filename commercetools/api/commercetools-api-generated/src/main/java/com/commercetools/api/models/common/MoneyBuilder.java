package com.commercetools.api.models.common;

import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.Money;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneyBuilder {
   
   
   private Long centAmount;
   
   
   private String currencyCode;
   
   public MoneyBuilder centAmount( final Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public MoneyBuilder currencyCode( final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public String getCurrencyCode(){
      return this.currencyCode;
   }

   public Money build() {
       return new MoneyImpl(centAmount, currencyCode);
   }
   
   public static MoneyBuilder of() {
      return new MoneyBuilder();
   }
   
   public static MoneyBuilder of(final Money template) {
      MoneyBuilder builder = new MoneyBuilder();
      builder.centAmount = template.getCentAmount();
      builder.currencyCode = template.getCurrencyCode();
      return builder;
   }
   
}
