package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction> actions;
   
   
   private Long version;
   
   public CartDiscountUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CartDiscountUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public CartDiscountUpdate build() {
       return new CartDiscountUpdateImpl(actions, version);
   }
   
   public static CartDiscountUpdateBuilder of() {
      return new CartDiscountUpdateBuilder();
   }
   
   public static CartDiscountUpdateBuilder of(final CartDiscountUpdate template) {
      CartDiscountUpdateBuilder builder = new CartDiscountUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}