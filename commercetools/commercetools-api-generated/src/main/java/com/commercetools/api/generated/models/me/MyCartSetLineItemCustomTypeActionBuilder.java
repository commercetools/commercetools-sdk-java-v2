package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.me.MyCartSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLineItemCustomTypeActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public MyCartSetLineItemCustomTypeActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
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