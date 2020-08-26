package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetMiddleNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetMiddleNameActionImpl.class)
public interface CustomerSetMiddleNameAction extends CustomerUpdateAction {

    
    
    @JsonProperty("middleName")
    public String getMiddleName();

    public void setMiddleName(final String middleName);

    public static CustomerSetMiddleNameActionImpl of(){
        return new CustomerSetMiddleNameActionImpl();
    }
    

    public static CustomerSetMiddleNameActionImpl of(final CustomerSetMiddleNameAction template) {
        CustomerSetMiddleNameActionImpl instance = new CustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

}
