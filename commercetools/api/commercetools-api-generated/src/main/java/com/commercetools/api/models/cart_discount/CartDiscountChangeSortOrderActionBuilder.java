package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeSortOrderActionBuilder {
   
   
   private String sortOrder;
   
   public CartDiscountChangeSortOrderActionBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   
   public String getSortOrder(){
      return this.sortOrder;
   }

   public CartDiscountChangeSortOrderAction build() {
       return new CartDiscountChangeSortOrderActionImpl(sortOrder);
   }
   
   public static CartDiscountChangeSortOrderActionBuilder of() {
      return new CartDiscountChangeSortOrderActionBuilder();
   }
   
   public static CartDiscountChangeSortOrderActionBuilder of(final CartDiscountChangeSortOrderAction template) {
      CartDiscountChangeSortOrderActionBuilder builder = new CartDiscountChangeSortOrderActionBuilder();
      builder.sortOrder = template.getSortOrder();
      return builder;
   }
   
}
