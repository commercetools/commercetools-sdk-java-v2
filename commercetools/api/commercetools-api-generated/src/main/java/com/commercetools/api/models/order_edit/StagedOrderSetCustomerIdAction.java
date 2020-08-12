package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
