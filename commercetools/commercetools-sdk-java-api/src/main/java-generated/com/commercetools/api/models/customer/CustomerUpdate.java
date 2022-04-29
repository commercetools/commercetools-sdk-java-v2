
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerUpdateImpl.class)
public interface CustomerUpdate extends
        com.commercetools.api.models.ResourceUpdate<CustomerUpdate, CustomerUpdateAction, CustomerUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CustomerUpdateAction... actions);

    public void setActions(final List<CustomerUpdateAction> actions);

    public static CustomerUpdate of() {
        return new CustomerUpdateImpl();
    }

    public static CustomerUpdate of(final CustomerUpdate template) {
        CustomerUpdateImpl instance = new CustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CustomerUpdateBuilder builder() {
        return CustomerUpdateBuilder.of();
    }

    public static CustomerUpdateBuilder builder(final CustomerUpdate template) {
        return CustomerUpdateBuilder.of(template);
    }

    default <T> T withCustomerUpdate(Function<CustomerUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerUpdate>";
            }
        };
    }
}
