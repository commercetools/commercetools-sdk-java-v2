package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public StagedOrderSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public StagedOrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public StagedOrderSetCustomFieldAction build() {
       return new StagedOrderSetCustomFieldActionImpl(name, value);
   }
   
   public static StagedOrderSetCustomFieldActionBuilder of() {
      return new StagedOrderSetCustomFieldActionBuilder();
   }
   
   public static StagedOrderSetCustomFieldActionBuilder of(final StagedOrderSetCustomFieldAction template) {
      StagedOrderSetCustomFieldActionBuilder builder = new StagedOrderSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}