package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerAddAddressAction;
import com.commercetools.api.generated.models.customer.CustomerAddBillingAddressIdAction;
import com.commercetools.api.generated.models.customer.CustomerAddShippingAddressIdAction;
import com.commercetools.api.generated.models.customer.CustomerChangeAddressAction;
import com.commercetools.api.generated.models.customer.CustomerChangeEmailAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveAddressAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveShippingAddressIdAction;
import com.commercetools.api.generated.models.customer.CustomerSetCompanyNameAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomFieldAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomTypeAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomerGroupAction;
import com.commercetools.api.generated.models.customer.CustomerSetCustomerNumberAction;
import com.commercetools.api.generated.models.customer.CustomerSetDateOfBirthAction;
import com.commercetools.api.generated.models.customer.CustomerSetDefaultBillingAddressAction;
import com.commercetools.api.generated.models.customer.CustomerSetDefaultShippingAddressAction;
import com.commercetools.api.generated.models.customer.CustomerSetExternalIdAction;
import com.commercetools.api.generated.models.customer.CustomerSetFirstNameAction;
import com.commercetools.api.generated.models.customer.CustomerSetKeyAction;
import com.commercetools.api.generated.models.customer.CustomerSetLastNameAction;
import com.commercetools.api.generated.models.customer.CustomerSetLocaleAction;
import com.commercetools.api.generated.models.customer.CustomerSetMiddleNameAction;
import com.commercetools.api.generated.models.customer.CustomerSetSalutationAction;
import com.commercetools.api.generated.models.customer.CustomerSetTitleAction;
import com.commercetools.api.generated.models.customer.CustomerSetVatIdAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerUpdateActionImpl implements CustomerUpdateAction {

   private String action;

   @JsonCreator
   CustomerUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}