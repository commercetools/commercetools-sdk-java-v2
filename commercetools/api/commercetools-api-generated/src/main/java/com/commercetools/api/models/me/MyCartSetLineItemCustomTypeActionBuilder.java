package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLineItemCustomTypeActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;
   
   public MyCartSetLineItemCustomTypeActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public MyCartSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   public MyCartSetLineItemCustomTypeAction build() {
       return new MyCartSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
   }
   
   public static MyCartSetLineItemCustomTypeActionBuilder of() {
      return new MyCartSetLineItemCustomTypeActionBuilder();
   }
   
   public static MyCartSetLineItemCustomTypeActionBuilder of(final MyCartSetLineItemCustomTypeAction template) {
      MyCartSetLineItemCustomTypeActionBuilder builder = new MyCartSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.type = template.getType();
      builder.fields = template.getFields();
      return builder;
   }
   
}
