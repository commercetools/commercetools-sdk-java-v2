package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public StagedOrderSetLineItemCustomTypeActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public StagedOrderSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public StagedOrderSetLineItemCustomTypeAction build() {
       return new StagedOrderSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }
   
   public static StagedOrderSetLineItemCustomTypeActionBuilder of() {
      return new StagedOrderSetLineItemCustomTypeActionBuilder();
   }
   
   public static StagedOrderSetLineItemCustomTypeActionBuilder of(final StagedOrderSetLineItemCustomTypeAction template) {
      StagedOrderSetLineItemCustomTypeActionBuilder builder = new StagedOrderSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}