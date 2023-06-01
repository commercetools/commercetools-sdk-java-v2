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
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerUpdateActionBuilder {

    public com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder addAddressBuilder() {
       return com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
       return com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
       return com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder changeAddressBuilder() {
       return com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder changeEmailBuilder() {
       return com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder removeAddressBuilder() {
       return com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
       return com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
       return com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder setCompanyNameBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder setDateOfBirthBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder setFirstNameBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder setLastNameBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder setMiddleNameBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder setSalutationBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder setTitleBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder setVatIdBuilder() {
       return com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder.of();
    }

    /**
     * factory method for an instance of MyCustomerUpdateActionBuilder
     * @return builder 
     */
    public static MyCustomerUpdateActionBuilder of() {
        return new MyCustomerUpdateActionBuilder();
    }

}
