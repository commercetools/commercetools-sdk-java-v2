package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerAddAddressAction;
import com.commercetools.models.customer.CustomerAddBillingAddressIdAction;
import com.commercetools.models.customer.CustomerAddShippingAddressIdAction;
import com.commercetools.models.customer.CustomerChangeAddressAction;
import com.commercetools.models.customer.CustomerChangeEmailAction;
import com.commercetools.models.customer.CustomerRemoveAddressAction;
import com.commercetools.models.customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.models.customer.CustomerRemoveShippingAddressIdAction;
import com.commercetools.models.customer.CustomerSetCompanyNameAction;
import com.commercetools.models.customer.CustomerSetCustomFieldAction;
import com.commercetools.models.customer.CustomerSetCustomTypeAction;
import com.commercetools.models.customer.CustomerSetCustomerGroupAction;
import com.commercetools.models.customer.CustomerSetCustomerNumberAction;
import com.commercetools.models.customer.CustomerSetDateOfBirthAction;
import com.commercetools.models.customer.CustomerSetDefaultBillingAddressAction;
import com.commercetools.models.customer.CustomerSetDefaultShippingAddressAction;
import com.commercetools.models.customer.CustomerSetExternalIdAction;
import com.commercetools.models.customer.CustomerSetFirstNameAction;
import com.commercetools.models.customer.CustomerSetKeyAction;
import com.commercetools.models.customer.CustomerSetLastNameAction;
import com.commercetools.models.customer.CustomerSetLocaleAction;
import com.commercetools.models.customer.CustomerSetMiddleNameAction;
import com.commercetools.models.customer.CustomerSetSalutationAction;
import com.commercetools.models.customer.CustomerSetTitleAction;
import com.commercetools.models.customer.CustomerSetVatIdAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetCustomerNumberActionImpl.class, name = "setCustomerNumber"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.customer.CustomerSetVatIdActionImpl.class, name = "setVatId")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CustomerUpdateAction  {


   


}