
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents an individual Customer Group assignment as a Reference to a CustomerGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignment customerGroupAssignment = CustomerGroupAssignment.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentImpl.class)
public interface CustomerGroupAssignment {

    /**
     *  <p>Reference to a Customer Group.</p>
     * @return customerGroup
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a Customer Group.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     * factory method
     * @return instance of CustomerGroupAssignment
     */
    public static CustomerGroupAssignment of() {
        return new CustomerGroupAssignmentImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignment of(final CustomerGroupAssignment template) {
        CustomerGroupAssignmentImpl instance = new CustomerGroupAssignmentImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignment deepCopy(@Nullable final CustomerGroupAssignment template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentImpl instance = new CustomerGroupAssignmentImpl();
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupAssignment
     * @return builder
     */
    public static CustomerGroupAssignmentBuilder builder() {
        return CustomerGroupAssignmentBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentBuilder builder(final CustomerGroupAssignment template) {
        return CustomerGroupAssignmentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignment(Function<CustomerGroupAssignment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignment>";
            }
        };
    }
}
