package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddAddressActionImpl.class)
public interface CustomerAddAddressAction extends CustomerUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddAddressActionImpl of(){
        return new CustomerAddAddressActionImpl();
    }
    

    public static CustomerAddAddressActionImpl of(final CustomerAddAddressAction template) {
        CustomerAddAddressActionImpl instance = new CustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T> T withCustomerAddAddressAction(Function<CustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }
}
