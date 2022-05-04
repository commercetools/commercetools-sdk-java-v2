
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupReferenceImpl.class)
public interface CustomerGroupReference extends Reference, com.commercetools.api.models.Identifiable<CustomerGroup> {

    String CUSTOMER_GROUP = "customer-group";

    /**
    *  <p>Contains the representation of the expanded Customer Group. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for Customer Groups.</p>
    */
    @Valid
    @JsonProperty("obj")
    public CustomerGroup getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final CustomerGroup obj);

    public void setId(final String id);

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

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupReference>";
            }
        };
    }
}
