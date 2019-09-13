package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public StagedOrderSetLineItemCustomFieldActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderSetLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public StagedOrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public StagedOrderSetLineItemCustomFieldAction build() {
       return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static StagedOrderSetLineItemCustomFieldActionBuilder of() {
      return new StagedOrderSetLineItemCustomFieldActionBuilder();
   }
   
   public static StagedOrderSetLineItemCustomFieldActionBuilder of(final StagedOrderSetLineItemCustomFieldAction template) {
      StagedOrderSetLineItemCustomFieldActionBuilder builder = new StagedOrderSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}