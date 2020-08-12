package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetCustomerGroupActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomerGroupActionImpl.class)
public interface CustomerSetCustomerGroupAction extends CustomerUpdateAction {

   /**
   *  <p>If not defined, the customer group is unset.</p>
   */
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public static CustomerSetCustomerGroupActionImpl of(){
      return new CustomerSetCustomerGroupActionImpl();
   }
   

   public static CustomerSetCustomerGroupActionImpl of(final CustomerSetCustomerGroupAction template) {
      CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}
