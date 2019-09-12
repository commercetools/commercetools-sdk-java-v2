package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerAddAddressAction;
import com.commercetools.models.Me.MyCustomerAddBillingAddressIdAction;
import com.commercetools.models.Me.MyCustomerAddShippingAddressIdAction;
import com.commercetools.models.Me.MyCustomerChangeAddressAction;
import com.commercetools.models.Me.MyCustomerChangeEmailAction;
import com.commercetools.models.Me.MyCustomerRemoveAddressAction;
import com.commercetools.models.Me.MyCustomerRemoveBillingAddressIdAction;
import com.commercetools.models.Me.MyCustomerRemoveShippingAddressIdAction;
import com.commercetools.models.Me.MyCustomerSetCompanyNameAction;
import com.commercetools.models.Me.MyCustomerSetCustomFieldAction;
import com.commercetools.models.Me.MyCustomerSetCustomTypeAction;
import com.commercetools.models.Me.MyCustomerSetDateOfBirthAction;
import com.commercetools.models.Me.MyCustomerSetDefaultBillingAddressAction;
import com.commercetools.models.Me.MyCustomerSetDefaultShippingAddressAction;
import com.commercetools.models.Me.MyCustomerSetFirstNameAction;
import com.commercetools.models.Me.MyCustomerSetLastNameAction;
import com.commercetools.models.Me.MyCustomerSetLocaleAction;
import com.commercetools.models.Me.MyCustomerSetMiddleNameAction;
import com.commercetools.models.Me.MyCustomerSetSalutationAction;
import com.commercetools.models.Me.MyCustomerSetTitleAction;
import com.commercetools.models.Me.MyCustomerSetVatIdAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyCustomerSetVatIdActionImpl.class, name = "setVatId")
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