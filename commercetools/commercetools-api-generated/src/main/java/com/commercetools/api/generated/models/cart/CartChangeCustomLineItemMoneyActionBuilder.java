package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.CartChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeCustomLineItemMoneyActionBuilder {
   
   
   private String customLineItemId;
   
   
   private com.commercetools.api.generated.models.common.Money money;
   
   public CartChangeCustomLineItemMoneyActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.api.generated.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }

   public CartChangeCustomLineItemMoneyAction build() {
       return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
   }
   
   public static CartChangeCustomLineItemMoneyActionBuilder of() {
      return new CartChangeCustomLineItemMoneyActionBuilder();
   }
   
   public static CartChangeCustomLineItemMoneyActionBuilder of(final CartChangeCustomLineItemMoneyAction template) {
      CartChangeCustomLineItemMoneyActionBuilder builder = new CartChangeCustomLineItemMoneyActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.money = template.getMoney();
      return builder;
   }
   
}