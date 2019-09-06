package com.commercetools.models.DiscountCode;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public DiscountCodeSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
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