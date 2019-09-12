package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerAddAddressAction;
import com.commercetools.models.Customer.CustomerAddBillingAddressIdAction;
import com.commercetools.models.Customer.CustomerAddShippingAddressIdAction;
import com.commercetools.models.Customer.CustomerChangeAddressAction;
import com.commercetools.models.Customer.CustomerChangeEmailAction;
import com.commercetools.models.Customer.CustomerRemoveAddressAction;
import com.commercetools.models.Customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.models.Customer.CustomerRemoveShippingAddressIdAction;
import com.commercetools.models.Customer.CustomerSetCompanyNameAction;
import com.commercetools.models.Customer.CustomerSetCustomFieldAction;
import com.commercetools.models.Customer.CustomerSetCustomTypeAction;
import com.commercetools.models.Customer.CustomerSetCustomerGroupAction;
import com.commercetools.models.Customer.CustomerSetCustomerNumberAction;
import com.commercetools.models.Customer.CustomerSetDateOfBirthAction;
import com.commercetools.models.Customer.CustomerSetDefaultBillingAddressAction;
import com.commercetools.models.Customer.CustomerSetDefaultShippingAddressAction;
import com.commercetools.models.Customer.CustomerSetExternalIdAction;
import com.commercetools.models.Customer.CustomerSetFirstNameAction;
import com.commercetools.models.Customer.CustomerSetKeyAction;
import com.commercetools.models.Customer.CustomerSetLastNameAction;
import com.commercetools.models.Customer.CustomerSetLocaleAction;
import com.commercetools.models.Customer.CustomerSetMiddleNameAction;
import com.commercetools.models.Customer.CustomerSetSalutationAction;
import com.commercetools.models.Customer.CustomerSetTitleAction;
import com.commercetools.models.Customer.CustomerSetVatIdAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetCustomerNumberActionImpl.class, name = "setCustomerNumber"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.Customer.CustomerSetVatIdActionImpl.class, name = "setVatId")
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