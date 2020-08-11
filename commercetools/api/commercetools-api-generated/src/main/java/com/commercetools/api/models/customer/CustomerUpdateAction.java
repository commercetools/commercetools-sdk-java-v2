package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerAddAddressAction;
import com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction;
import com.commercetools.api.models.customer.CustomerChangeAddressAction;
import com.commercetools.api.models.customer.CustomerChangeEmailAction;
import com.commercetools.api.models.customer.CustomerRemoveAddressAction;
import com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction;
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
import com.commercetools.api.models.customer.CustomerSetTitleAction;
import com.commercetools.api.models.customer.CustomerSetVatIdAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomerNumberActionImpl.class, name = "setCustomerNumber"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetVatIdActionImpl.class, name = "setVatId")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = CustomerUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CustomerUpdateAction  {





}
