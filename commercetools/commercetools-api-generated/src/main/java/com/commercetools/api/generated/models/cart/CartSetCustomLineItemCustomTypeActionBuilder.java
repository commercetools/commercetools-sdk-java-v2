package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemCustomTypeActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public CartSetCustomLineItemCustomTypeActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CartSetCustomLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CartSetCustomLineItemCustomTypeAction build() {
       return new CartSetCustomLineItemCustomTypeActionImpl(customLineItemId, fields, type);
   }
   
   public static CartSetCustomLineItemCustomTypeActionBuilder of() {
      return new CartSetCustomLineItemCustomTypeActionBuilder();
   }
   
   public static CartSetCustomLineItemCustomTypeActionBuilder of(final CartSetCustomLineItemCustomTypeAction template) {
      CartSetCustomLineItemCustomTypeActionBuilder builder = new CartSetCustomLineItemCustomTypeActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}