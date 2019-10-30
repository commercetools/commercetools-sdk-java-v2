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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerAddAddressActionImpl.class, name = "addAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerAddBillingAddressIdActionImpl.class, name = "addBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerAddShippingAddressIdActionImpl.class, name = "addShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerChangeAddressActionImpl.class, name = "changeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerChangeEmailActionImpl.class, name = "changeEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerRemoveAddressActionImpl.class, name = "removeAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerRemoveBillingAddressIdActionImpl.class, name = "removeBillingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerRemoveShippingAddressIdActionImpl.class, name = "removeShippingAddressId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetCompanyNameActionImpl.class, name = "setCompanyName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetDateOfBirthActionImpl.class, name = "setDateOfBirth"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetDefaultBillingAddressActionImpl.class, name = "setDefaultBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetDefaultShippingAddressActionImpl.class, name = "setDefaultShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetFirstNameActionImpl.class, name = "setFirstName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetLastNameActionImpl.class, name = "setLastName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetMiddleNameActionImpl.class, name = "setMiddleName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetSalutationActionImpl.class, name = "setSalutation"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.me.MyCustomerSetVatIdActionImpl.class, name = "setVatId")
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