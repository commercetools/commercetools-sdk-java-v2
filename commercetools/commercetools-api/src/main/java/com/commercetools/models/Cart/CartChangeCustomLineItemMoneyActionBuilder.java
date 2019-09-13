package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.common.Money;
import java.lang.String;
import com.commercetools.models.cart.CartChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeCustomLineItemMoneyActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private com.commercetools.models.common.Money money;
   
   public CartChangeCustomLineItemMoneyActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.common.Money getMoney(){
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