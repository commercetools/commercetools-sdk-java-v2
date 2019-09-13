package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomFieldActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomFieldAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static StagedOrderSetCustomLineItemCustomFieldActionImpl of(){
      return new StagedOrderSetCustomLineItemCustomFieldActionImpl();
   }
   

   public static StagedOrderSetCustomLineItemCustomFieldActionImpl of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
      StagedOrderSetCustomLineItemCustomFieldActionImpl instance = new StagedOrderSetCustomLineItemCustomFieldActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}