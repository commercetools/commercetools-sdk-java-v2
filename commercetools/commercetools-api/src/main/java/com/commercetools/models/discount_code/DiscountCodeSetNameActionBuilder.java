package com.commercetools.models.discount_code;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.discount_code.DiscountCodeSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   public DiscountCodeSetNameActionBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public DiscountCodeSetNameAction build() {
       return new DiscountCodeSetNameActionImpl(name);
   }
   
   public static DiscountCodeSetNameActionBuilder of() {
      return new DiscountCodeSetNameActionBuilder();
   }
   
   public static DiscountCodeSetNameActionBuilder of(final DiscountCodeSetNameAction template) {
      DiscountCodeSetNameActionBuilder builder = new DiscountCodeSetNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}