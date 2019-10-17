package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public DiscountCodeSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public DiscountCodeSetDescriptionAction build() {
       return new DiscountCodeSetDescriptionActionImpl(description);
   }
   
   public static DiscountCodeSetDescriptionActionBuilder of() {
      return new DiscountCodeSetDescriptionActionBuilder();
   }
   
   public static DiscountCodeSetDescriptionActionBuilder of(final DiscountCodeSetDescriptionAction template) {
      DiscountCodeSetDescriptionActionBuilder builder = new DiscountCodeSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}