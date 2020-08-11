package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetCustomFieldActionBuilder {


   private String name;

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;

   public StagedOrderSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }

   public StagedOrderSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }


   public String getName(){
      return this.name;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public StagedOrderSetCustomFieldAction build() {
       return new StagedOrderSetCustomFieldActionImpl(name, value);
   }

   public static StagedOrderSetCustomFieldActionBuilder of() {
      return new StagedOrderSetCustomFieldActionBuilder();
   }

   public static StagedOrderSetCustomFieldActionBuilder of(final StagedOrderSetCustomFieldAction template) {
      StagedOrderSetCustomFieldActionBuilder builder = new StagedOrderSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }

}
