package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetKeyActionImpl;

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
@JsonDeserialize(as = CustomerSetKeyActionImpl.class)
public interface CustomerSetKeyAction extends CustomerUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CustomerSetKeyActionImpl of(){
        return new CustomerSetKeyActionImpl();
    }
    

    public static CustomerSetKeyActionImpl of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionImpl instance = new CustomerSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T extends Accessor<CustomerSetKeyAction>> T withCustomerSetKeyAction(Function<CustomerSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
