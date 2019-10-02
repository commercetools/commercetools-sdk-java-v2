package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerAddAddressAction;
import com.commercetools.models.me.MyCustomerAddBillingAddressIdAction;
import com.commercetools.models.me.MyCustomerAddShippingAddressIdAction;
import com.commercetools.models.me.MyCustomerChangeAddressAction;
import com.commercetools.models.me.MyCustomerChangeEmailAction;
import com.commercetools.models.me.MyCustomerRemoveAddressAction;
import com.commercetools.models.me.MyCustomerRemoveBillingAddressIdAction;
import com.commercetools.models.me.MyCustomerRemoveShippingAddressIdAction;
import com.commercetools.models.me.MyCustomerSetCompanyNameAction;
import com.commercetools.models.me.MyCustomerSetCustomFieldAction;
import com.commercetools.models.me.MyCustomerSetCustomTypeAction;
import com.commercetools.models.me.MyCustomerSetDateOfBirthAction;
import com.commercetools.models.me.MyCustomerSetDefaultBillingAddressAction;
import com.commercetools.models.me.MyCustomerSetDefaultShippingAddressAction;
import com.commercetools.models.me.MyCustomerSetFirstNameAction;
import com.commercetools.models.me.MyCustomerSetLastNameAction;
import com.commercetools.models.me.MyCustomerSetLocaleAction;
import com.commercetools.models.me.MyCustomerSetMiddleNameAction;
import com.commercetools.models.me.MyCustomerSetSalutationAction;
import com.commercetools.models.me.MyCustomerSetTitleAction;
import com.commercetools.models.me.MyCustomerSetVatIdAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.me.MyCustomerSetVatIdActionImpl.class, name = "setVatId")
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
public interface MyCustomerUpdateAction  {


   


}