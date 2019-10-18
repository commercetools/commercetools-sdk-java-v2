package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategoryChangeOrderHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryChangeOrderHintActionBuilder {
   
   
   private String orderHint;
   
   public CategoryChangeOrderHintActionBuilder orderHint( final String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   
   public String getOrderHint(){
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