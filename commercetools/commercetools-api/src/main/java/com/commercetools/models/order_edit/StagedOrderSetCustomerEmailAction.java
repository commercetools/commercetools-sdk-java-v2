package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomerEmailActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomerEmailActionImpl.class)
public interface StagedOrderSetCustomerEmailAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static StagedOrderSetCustomerEmailActionImpl of(){
      return new StagedOrderSetCustomerEmailActionImpl();
   }
   

   public static StagedOrderSetCustomerEmailActionImpl of(final StagedOrderSetCustomerEmailAction template) {
      StagedOrderSetCustomerEmailActionImpl instance = new StagedOrderSetCustomerEmailActionImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}