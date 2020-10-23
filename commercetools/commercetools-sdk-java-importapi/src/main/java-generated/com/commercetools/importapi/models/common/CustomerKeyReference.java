package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CustomerKeyReferenceImpl;

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

/**
*  <p>References a customer by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerKeyReferenceImpl.class)
public interface CustomerKeyReference extends KeyReference {



    public static CustomerKeyReferenceImpl of(){
        return new CustomerKeyReferenceImpl();
    }
    

    public static CustomerKeyReferenceImpl of(final CustomerKeyReference template) {
        CustomerKeyReferenceImpl instance = new CustomerKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withCustomerKeyReference(Function<CustomerKeyReference, T> helper) {
        return helper.apply(this);
    }
}
