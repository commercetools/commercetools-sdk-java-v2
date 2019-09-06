package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderSetLineItemCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetLineItemCustomTypeActionImpl.class)
public interface OrderSetLineItemCustomTypeAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setLineItemId(final String lineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static OrderSetLineItemCustomTypeActionImpl of(){
      return new OrderSetLineItemCustomTypeActionImpl();
   }
   

   public static OrderSetLineItemCustomTypeActionImpl of(final OrderSetLineItemCustomTypeAction template) {
      OrderSetLineItemCustomTypeActionImpl instance = new OrderSetLineItemCustomTypeActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}