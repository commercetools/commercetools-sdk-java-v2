package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.OrderEditSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetCustomTypeActionBuilder {
   
   @Nullable
   private JsonNode fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public OrderEditSetCustomTypeActionBuilder fields(@Nullable final JsonNode fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderEditSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public JsonNode getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderEditSetCustomTypeAction build() {
       return new OrderEditSetCustomTypeActionImpl(fields, type);
   }
   
   public static OrderEditSetCustomTypeActionBuilder of() {
      return new OrderEditSetCustomTypeActionBuilder();
   }
   
   public static OrderEditSetCustomTypeActionBuilder of(final OrderEditSetCustomTypeAction template) {
      OrderEditSetCustomTypeActionBuilder builder = new OrderEditSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}