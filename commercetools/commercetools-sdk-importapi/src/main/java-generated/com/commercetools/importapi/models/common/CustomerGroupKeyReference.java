package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>References a customer group by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupKeyReferenceImpl.class)
public interface CustomerGroupKeyReference extends KeyReference {



    public static CustomerGroupKeyReferenceImpl of(){
        return new CustomerGroupKeyReferenceImpl();
    }


    public static CustomerGroupKeyReferenceImpl of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceImpl instance = new CustomerGroupKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
