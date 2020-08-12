package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerGroupActionImpl;

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
