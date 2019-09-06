package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditSetCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderEditSetCustomTypeActionImpl.class)
public interface OrderEditSetCustomTypeAction extends OrderEditUpdateAction {

   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public Object getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final Object fields);
   
   public static OrderEditSetCustomTypeActionImpl of(){
      return new OrderEditSetCustomTypeActionImpl();
   }
   

   public static OrderEditSetCustomTypeActionImpl of(final OrderEditSetCustomTypeAction template) {
      OrderEditSetCustomTypeActionImpl instance = new OrderEditSetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}