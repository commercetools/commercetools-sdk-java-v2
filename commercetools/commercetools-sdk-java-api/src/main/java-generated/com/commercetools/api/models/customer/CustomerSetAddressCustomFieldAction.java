
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetAddressCustomFieldActionImpl.class)
public interface CustomerSetAddressCustomFieldAction extends CustomerUpdateAction {

    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setAddressId(final String addressId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CustomerSetAddressCustomFieldAction of() {
        return new CustomerSetAddressCustomFieldActionImpl();
    }

    public static CustomerSetAddressCustomFieldAction of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerSetAddressCustomFieldActionBuilder builder() {
        return CustomerSetAddressCustomFieldActionBuilder.of();
    }

    public static CustomerSetAddressCustomFieldActionBuilder builder(
            final CustomerSetAddressCustomFieldAction template) {
        return CustomerSetAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCustomerSetAddressCustomFieldAction(Function<CustomerSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
