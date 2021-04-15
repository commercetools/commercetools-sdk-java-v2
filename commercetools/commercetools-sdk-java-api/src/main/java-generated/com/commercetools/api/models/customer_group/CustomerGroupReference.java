
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupReferenceImpl.class)
public interface CustomerGroupReference extends Reference {

    String CUSTOMER_GROUP = "customer-group";

    @Valid
    @JsonProperty("obj")
    public CustomerGroup getObj();

    public void setObj(final CustomerGroup obj);

    public static CustomerGroupReference of() {
        return new CustomerGroupReferenceImpl();
    }

    public static CustomerGroupReference of(final CustomerGroupReference template) {
        CustomerGroupReferenceImpl instance = new CustomerGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CustomerGroupReferenceBuilder builder() {
        return CustomerGroupReferenceBuilder.of();
    }

    public static CustomerGroupReferenceBuilder builder(final CustomerGroupReference template) {
        return CustomerGroupReferenceBuilder.of(template);
    }

    default <T> T withCustomerGroupReference(Function<CustomerGroupReference, T> helper) {
        return helper.apply(this);
    }
}
