
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupUpdateImpl.class)
public interface CustomerGroupUpdate extends
        com.commercetools.api.models.ResourceUpdate<CustomerGroupUpdate, CustomerGroupUpdateAction, CustomerGroupUpdateBuilder> {

    /**
    *  <p>Expected version of the Customer Group on which the changes should be applied.
    *  If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the Customer Group.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerGroupUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CustomerGroupUpdateAction... actions);

    public void setActions(final List<CustomerGroupUpdateAction> actions);

    public static CustomerGroupUpdate of() {
        return new CustomerGroupUpdateImpl();
    }

    public static CustomerGroupUpdate of(final CustomerGroupUpdate template) {
        CustomerGroupUpdateImpl instance = new CustomerGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CustomerGroupUpdateBuilder builder() {
        return CustomerGroupUpdateBuilder.of();
    }

    public static CustomerGroupUpdateBuilder builder(final CustomerGroupUpdate template) {
        return CustomerGroupUpdateBuilder.of(template);
    }

    default <T> T withCustomerGroupUpdate(Function<CustomerGroupUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupUpdate>";
            }
        };
    }
}
