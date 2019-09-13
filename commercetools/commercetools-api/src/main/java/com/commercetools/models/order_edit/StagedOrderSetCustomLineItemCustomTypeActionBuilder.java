package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public StagedOrderSetCustomLineItemCustomTypeAction build() {
       return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, fields, type);
   }
   
   public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of() {
      return new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of(final StagedOrderSetCustomLineItemCustomTypeAction template) {
      StagedOrderSetCustomLineItemCustomTypeActionBuilder builder = new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}