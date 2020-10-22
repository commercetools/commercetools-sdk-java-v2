package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionImpl;

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
@JsonDeserialize(as = CustomerGroupChangeNameActionImpl.class)
public interface CustomerGroupChangeNameAction extends CustomerGroupUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static CustomerGroupChangeNameActionImpl of(){
        return new CustomerGroupChangeNameActionImpl();
    }
    

    public static CustomerGroupChangeNameActionImpl of(final CustomerGroupChangeNameAction template) {
        CustomerGroupChangeNameActionImpl instance = new CustomerGroupChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    default <T extends Accessor<CustomerGroupChangeNameAction>> T withCustomerGroupChangeNameAction(Function<CustomerGroupChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
