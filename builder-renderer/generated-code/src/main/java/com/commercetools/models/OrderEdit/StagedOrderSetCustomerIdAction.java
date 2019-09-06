package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomerIdActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomerIdActionImpl.class)
public interface StagedOrderSetCustomerIdAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("customerId")
   public String getCustomerId();

   public void setCustomerId(final String customerId);
   
   public static StagedOrderSetCustomerIdActionImpl of(){
      return new StagedOrderSetCustomerIdActionImpl();
   }
   

   public static StagedOrderSetCustomerIdActionImpl of(final StagedOrderSetCustomerIdAction template) {
      StagedOrderSetCustomerIdActionImpl instance = new StagedOrderSetCustomerIdActionImpl();
      instance.setCustomerId(template.getCustomerId());
      return instance;
   }

}