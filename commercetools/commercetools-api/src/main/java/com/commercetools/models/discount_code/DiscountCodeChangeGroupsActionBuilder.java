package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.discount_code.DiscountCodeChangeGroupsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeChangeGroupsActionBuilder {
   
   
   private java.util.List<java.lang.String> groups;
   
   public DiscountCodeChangeGroupsActionBuilder groups( final java.util.List<java.lang.String> groups) {
      this.groups = groups;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getGroups(){
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