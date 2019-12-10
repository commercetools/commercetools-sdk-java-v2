package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerAddAddressAction;
import com.commercetools.api.generated.models.me.MyCustomerAddBillingAddressIdAction;
import com.commercetools.api.generated.models.me.MyCustomerAddShippingAddressIdAction;
import com.commercetools.api.generated.models.me.MyCustomerChangeAddressAction;
import com.commercetools.api.generated.models.me.MyCustomerChangeEmailAction;
import com.commercetools.api.generated.models.me.MyCustomerRemoveAddressAction;
import com.commercetools.api.generated.models.me.MyCustomerRemoveBillingAddressIdAction;
import com.commercetools.api.generated.models.me.MyCustomerRemoveShippingAddressIdAction;
import com.commercetools.api.generated.models.me.MyCustomerSetCompanyNameAction;
import com.commercetools.api.generated.models.me.MyCustomerSetCustomFieldAction;
import com.commercetools.api.generated.models.me.MyCustomerSetCustomTypeAction;
import com.commercetools.api.generated.models.me.MyCustomerSetDateOfBirthAction;
import com.commercetools.api.generated.models.me.MyCustomerSetDefaultBillingAddressAction;
import com.commercetools.api.generated.models.me.MyCustomerSetDefaultShippingAddressAction;
import com.commercetools.api.generated.models.me.MyCustomerSetFirstNameAction;
import com.commercetools.api.generated.models.me.MyCustomerSetLastNameAction;
import com.commercetools.api.generated.models.me.MyCustomerSetLocaleAction;
import com.commercetools.api.generated.models.me.MyCustomerSetMiddleNameAction;
import com.commercetools.api.generated.models.me.MyCustomerSetSalutationAction;
import com.commercetools.api.generated.models.me.MyCustomerSetTitleAction;
import com.commercetools.api.generated.models.me.MyCustomerSetVatIdAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerUpdateActionImpl implements MyCustomerUpdateAction {

   private String action;

   @JsonCreator
   MyCustomerUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}