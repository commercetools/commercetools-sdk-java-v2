package com.commercetools.models.order_edit;

import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomerGroupActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomerGroupActionImpl.class)
public interface StagedOrderSetCustomerGroupAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public static StagedOrderSetCustomerGroupActionImpl of(){
      return new StagedOrderSetCustomerGroupActionImpl();
   }
   

   public static StagedOrderSetCustomerGroupActionImpl of(final StagedOrderSetCustomerGroupAction template) {
      StagedOrderSetCustomerGroupActionImpl instance = new StagedOrderSetCustomerGroupActionImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}