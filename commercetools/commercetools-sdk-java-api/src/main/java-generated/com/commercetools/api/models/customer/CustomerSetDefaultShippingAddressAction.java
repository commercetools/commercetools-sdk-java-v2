package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetDefaultShippingAddressActionImpl.class)
public interface CustomerSetDefaultShippingAddressAction extends CustomerUpdateAction {

    /**
    *  <p>If not defined, the customer's <code>defaultShippingAddress</code> is unset.</p>
    */
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);
    
    public void setAddressKey(final String addressKey);

    public static CustomerSetDefaultShippingAddressActionImpl of(){
        return new CustomerSetDefaultShippingAddressActionImpl();
    }
    

    public static CustomerSetDefaultShippingAddressActionImpl of(final CustomerSetDefaultShippingAddressAction template) {
        CustomerSetDefaultShippingAddressActionImpl instance = new CustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    default <T extends Accessor<CustomerSetDefaultShippingAddressAction>> T withCustomerSetDefaultShippingAddressAction(Function<CustomerSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
