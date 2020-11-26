package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerAddAddressAction;
import com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction;
import com.commercetools.api.models.me.MyCustomerAddShippingAddressIdAction;
import com.commercetools.api.models.me.MyCustomerChangeAddressAction;
import com.commercetools.api.models.me.MyCustomerChangeEmailAction;
import com.commercetools.api.models.me.MyCustomerRemoveAddressAction;
import com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction;
import com.commercetools.api.models.me.MyCustomerSetCompanyNameAction;
import com.commercetools.api.models.me.MyCustomerSetCustomFieldAction;
import com.commercetools.api.models.me.MyCustomerSetCustomTypeAction;
import com.commercetools.api.models.me.MyCustomerSetDateOfBirthAction;
import com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressAction;
import com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressAction;
import com.commercetools.api.models.me.MyCustomerSetFirstNameAction;
import com.commercetools.api.models.me.MyCustomerSetLastNameAction;
import com.commercetools.api.models.me.MyCustomerSetLocaleAction;
import com.commercetools.api.models.me.MyCustomerSetMiddleNameAction;
import com.commercetools.api.models.me.MyCustomerSetSalutationAction;
import com.commercetools.api.models.me.MyCustomerSetTitleAction;
import com.commercetools.api.models.me.MyCustomerSetVatIdAction;
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
public final class MyCustomerUpdateActionImpl implements MyCustomerUpdateAction {

    private String action;

    @JsonCreator
    MyCustomerUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public MyCustomerUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


}
