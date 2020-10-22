package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.customer.CustomerSetCustomFieldActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomFieldActionImpl.class)
public interface CustomerSetCustomFieldAction extends CustomerUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static CustomerSetCustomFieldActionImpl of(){
        return new CustomerSetCustomFieldActionImpl();
    }
    

    public static CustomerSetCustomFieldActionImpl of(final CustomerSetCustomFieldAction template) {
        CustomerSetCustomFieldActionImpl instance = new CustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<CustomerSetCustomFieldAction>> T withCustomerSetCustomFieldAction(Function<CustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
