
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerLabelImpl.class)
public interface CustomerLabel extends Label {

    String CUSTOMER_LABEL = "CustomerLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("firstName")
    public String getFirstName();

    @NotNull
    @JsonProperty("lastName")
    public String getLastName();

    @NotNull
    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setCustomerNumber(final String customerNumber);

    public static CustomerLabel of() {
        return new CustomerLabelImpl();
    }

    public static CustomerLabel of(final CustomerLabel template) {
        CustomerLabelImpl instance = new CustomerLabelImpl();
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    public static CustomerLabelBuilder builder() {
        return CustomerLabelBuilder.of();
    }

    public static CustomerLabelBuilder builder(final CustomerLabel template) {
        return CustomerLabelBuilder.of(template);
    }

    default <T> T withCustomerLabel(Function<CustomerLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLabel>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLabel>";
            }
        };
    }
}
