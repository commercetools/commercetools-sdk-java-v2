package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl;

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
@JsonDeserialize(as = CustomerGroupResourceIdentifierImpl.class)
public interface CustomerGroupResourceIdentifier extends ResourceIdentifier {



    public static CustomerGroupResourceIdentifier of(){
        return new CustomerGroupResourceIdentifierImpl();
    }
    

    public static CustomerGroupResourceIdentifier of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierImpl instance = new CustomerGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerGroupResourceIdentifierBuilder builder(){
        return CustomerGroupResourceIdentifierBuilder.of();
    }
    
    public static CustomerGroupResourceIdentifierBuilder builder(final CustomerGroupResourceIdentifier template){
        return CustomerGroupResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withCustomerGroupResourceIdentifier(Function<CustomerGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
