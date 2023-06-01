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
import com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction;
import com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction;
import com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction;
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
import com.commercetools.api.models.customer.CustomerUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerUpdateActionBuilder {

    public com.commercetools.api.models.customer.CustomerAddAddressActionBuilder addAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerAddAddressActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerAddStoreActionBuilder addStoreBuilder() {
       return com.commercetools.api.models.customer.CustomerAddStoreActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerChangeAddressActionBuilder changeAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerChangeAddressActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerChangeEmailActionBuilder changeEmailBuilder() {
       return com.commercetools.api.models.customer.CustomerChangeEmailActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerRemoveAddressActionBuilder removeAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveAddressActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerRemoveStoreActionBuilder removeStoreBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveStoreActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetAuthenticationModeActionBuilder setAuthenticationModeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAuthenticationModeActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetCompanyNameActionBuilder setCompanyNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCompanyNameActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomerGroupActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetCustomerNumberActionBuilder setCustomerNumberBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomerNumberActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetDateOfBirthActionBuilder setDateOfBirthBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDateOfBirthActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetExternalIdActionBuilder setExternalIdBuilder() {
       return com.commercetools.api.models.customer.CustomerSetExternalIdActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetFirstNameActionBuilder setFirstNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetFirstNameActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.customer.CustomerSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetLastNameActionBuilder setLastNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetLastNameActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.customer.CustomerSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetMiddleNameActionBuilder setMiddleNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetMiddleNameActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetSalutationActionBuilder setSalutationBuilder() {
       return com.commercetools.api.models.customer.CustomerSetSalutationActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetStoresActionBuilder setStoresBuilder() {
       return com.commercetools.api.models.customer.CustomerSetStoresActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetTitleActionBuilder setTitleBuilder() {
       return com.commercetools.api.models.customer.CustomerSetTitleActionBuilder.of();
    }
    public com.commercetools.api.models.customer.CustomerSetVatIdActionBuilder setVatIdBuilder() {
       return com.commercetools.api.models.customer.CustomerSetVatIdActionBuilder.of();
    }

    /**
     * factory method for an instance of CustomerUpdateActionBuilder
     * @return builder 
     */
    public static CustomerUpdateActionBuilder of() {
        return new CustomerUpdateActionBuilder();
    }

}
