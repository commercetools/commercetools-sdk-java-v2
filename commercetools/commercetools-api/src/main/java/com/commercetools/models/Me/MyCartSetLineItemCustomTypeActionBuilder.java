package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public MyCartSetLineItemCustomTypeActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
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

   public MyCartSetLineItemCustomTypeAction build() {
       return new MyCartSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }
   
   public static MyCartSetLineItemCustomTypeActionBuilder of() {
      return new MyCartSetLineItemCustomTypeActionBuilder();
   }
   
   public static MyCartSetLineItemCustomTypeActionBuilder of(final MyCartSetLineItemCustomTypeAction template) {
      MyCartSetLineItemCustomTypeActionBuilder builder = new MyCartSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}