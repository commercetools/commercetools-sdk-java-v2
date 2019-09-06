package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public CartSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CartSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CartSetCustomTypeAction build() {
       return new CartSetCustomTypeActionImpl(fields, type);
   }
   
   public static CartSetCustomTypeActionBuilder of() {
      return new CartSetCustomTypeActionBuilder();
   }
   
   public static CartSetCustomTypeActionBuilder of(final CartSetCustomTypeAction template) {
      CartSetCustomTypeActionBuilder builder = new CartSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}