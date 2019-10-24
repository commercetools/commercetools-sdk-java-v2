package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public DiscountCodeSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public DiscountCodeSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public DiscountCodeSetCustomFieldAction build() {
       return new DiscountCodeSetCustomFieldActionImpl(name, value);
   }
   
   public static DiscountCodeSetCustomFieldActionBuilder of() {
      return new DiscountCodeSetCustomFieldActionBuilder();
   }
   
   public static DiscountCodeSetCustomFieldActionBuilder of(final DiscountCodeSetCustomFieldAction template) {
      DiscountCodeSetCustomFieldActionBuilder builder = new DiscountCodeSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}