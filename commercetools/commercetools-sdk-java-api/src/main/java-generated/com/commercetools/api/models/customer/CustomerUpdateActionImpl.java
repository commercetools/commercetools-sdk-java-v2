package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerAddAddressAction;
import com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction;
import com.commercetools.api.models.customer.CustomerAddStoreAction;
import com.commercetools.api.models.customer.CustomerChangeAddressAction;
import com.commercetools.api.models.customer.CustomerChangeEmailAction;
import com.commercetools.api.models.customer.CustomerRemoveAddressAction;
import com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction;
import com.commercetools.api.models.customer.CustomerRemoveStoreAction;
import com.commercetools.api.models.customer.CustomerSetCompanyNameAction;
import com.commercetools.api.models.customer.CustomerSetCustomFieldAction;
import com.commercetools.api.models.customer.CustomerSetCustomTypeAction;
import com.commercetools.api.models.customer.CustomerSetCustomerGroupAction;
import com.commercetools.api.models.customer.CustomerSetCustomerNumberAction;
import com.commercetools.api.models.customer.CustomerSetDateOfBirthAction;
import com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction;
import com.commercetools.api.models.customer.CustomerSetExternalIdAction;
import com.commercetools.api.models.customer.CustomerSetFirstNameAction;
import com.commercetools.api.models.customer.CustomerSetKeyAction;
import com.commercetools.api.models.customer.CustomerSetLastNameAction;
import com.commercetools.api.models.customer.CustomerSetLocaleAction;
import com.commercetools.api.models.customer.CustomerSetMiddleNameAction;
import com.commercetools.api.models.customer.CustomerSetSalutationAction;
import com.commercetools.api.models.customer.CustomerSetStoresAction;
import com.commercetools.api.models.customer.CustomerSetTitleAction;
import com.commercetools.api.models.customer.CustomerSetVatIdAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
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
    CustomerUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public CustomerUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}
