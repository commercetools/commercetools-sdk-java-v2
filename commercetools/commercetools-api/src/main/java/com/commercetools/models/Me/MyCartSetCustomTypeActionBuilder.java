package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.me.MyCartSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public MyCartSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyCartSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public MyCartSetCustomTypeAction build() {
       return new MyCartSetCustomTypeActionImpl(fields, type);
   }
   
   public static MyCartSetCustomTypeActionBuilder of() {
      return new MyCartSetCustomTypeActionBuilder();
   }
   
   public static MyCartSetCustomTypeActionBuilder of(final MyCartSetCustomTypeAction template) {
      MyCartSetCustomTypeActionBuilder builder = new MyCartSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}