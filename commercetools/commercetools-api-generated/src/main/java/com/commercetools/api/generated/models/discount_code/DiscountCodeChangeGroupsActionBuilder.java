package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeChangeGroupsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeChangeGroupsActionBuilder {
   
   
   private java.util.List<String> groups;
   
   public DiscountCodeChangeGroupsActionBuilder groups( final java.util.List<String> groups) {
      this.groups = groups;
      return this;
   }
   
   
   public java.util.List<String> getGroups(){
      return this.groups;
   }

   public DiscountCodeChangeGroupsAction build() {
       return new DiscountCodeChangeGroupsActionImpl(groups);
   }
   
   public static DiscountCodeChangeGroupsActionBuilder of() {
      return new DiscountCodeChangeGroupsActionBuilder();
   }
   
   public static DiscountCodeChangeGroupsActionBuilder of(final DiscountCodeChangeGroupsAction template) {
      DiscountCodeChangeGroupsActionBuilder builder = new DiscountCodeChangeGroupsActionBuilder();
      builder.groups = template.getGroups();
      return builder;
   }
   
}