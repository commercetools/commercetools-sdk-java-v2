package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public CartSetLineItemCustomTypeActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CartSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
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

   public CartSetLineItemCustomTypeAction build() {
       return new CartSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }
   
   public static CartSetLineItemCustomTypeActionBuilder of() {
      return new CartSetLineItemCustomTypeActionBuilder();
   }
   
   public static CartSetLineItemCustomTypeActionBuilder of(final CartSetLineItemCustomTypeAction template) {
      CartSetLineItemCustomTypeActionBuilder builder = new CartSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}