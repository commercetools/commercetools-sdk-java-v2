package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeOrderHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeOrderHintActionBuilder {
   
   
   private java.lang.String orderHint;
   
   public CategoryChangeOrderHintActionBuilder orderHint( final java.lang.String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }

   public CategoryChangeOrderHintAction build() {
       return new CategoryChangeOrderHintActionImpl(orderHint);
   }
   
   public static CategoryChangeOrderHintActionBuilder of() {
      return new CategoryChangeOrderHintActionBuilder();
   }
   
   public static CategoryChangeOrderHintActionBuilder of(final CategoryChangeOrderHintAction template) {
      CategoryChangeOrderHintActionBuilder builder = new CategoryChangeOrderHintActionBuilder();
      builder.orderHint = template.getOrderHint();
      return builder;
   }
   
}