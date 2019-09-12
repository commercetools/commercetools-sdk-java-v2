package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public StagedOrderSetCustomLineItemCustomFieldActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public StagedOrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public StagedOrderSetCustomLineItemCustomFieldAction build() {
       return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
   }
   
   public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of() {
      return new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
      StagedOrderSetCustomLineItemCustomFieldActionBuilder builder = new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}