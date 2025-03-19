
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Assigns a Customer Group to a Customer. This action generates the CustomerGroupAssignmentAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddCustomerGroupAssignmentAction customerAddCustomerGroupAssignmentAction = CustomerAddCustomerGroupAssignmentAction.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddCustomerGroupAssignmentActionImpl.class)
public interface CustomerAddCustomerGroupAssignmentAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerAddCustomerGroupAssignmentAction
     */
    String ADD_CUSTOMER_GROUP_ASSIGNMENT = "addCustomerGroupAssignment";

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignmentDraft getCustomerGroupAssignment();

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignmentDraft customerGroupAssignment);

    /**
     * factory method
     * @return instance of CustomerAddCustomerGroupAssignmentAction
     */
    public static CustomerAddCustomerGroupAssignmentAction of() {
        return new CustomerAddCustomerGroupAssignmentActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddCustomerGroupAssignmentAction of(final CustomerAddCustomerGroupAssignmentAction template) {
        CustomerAddCustomerGroupAssignmentActionImpl instance = new CustomerAddCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddCustomerGroupAssignmentAction deepCopy(
            @Nullable final CustomerAddCustomerGroupAssignmentAction template) {
        if (template == null) {
            return null;
        }
        CustomerAddCustomerGroupAssignmentActionImpl instance = new CustomerAddCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignmentDraft
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for CustomerAddCustomerGroupAssignmentAction
     * @return builder
     */
    public static CustomerAddCustomerGroupAssignmentActionBuilder builder() {
        return CustomerAddCustomerGroupAssignmentActionBuilder.of();
    }

    /**
     * create builder for CustomerAddCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddCustomerGroupAssignmentActionBuilder builder(
            final CustomerAddCustomerGroupAssignmentAction template) {
        return CustomerAddCustomerGroupAssignmentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddCustomerGroupAssignmentAction(
            Function<CustomerAddCustomerGroupAssignmentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddCustomerGroupAssignmentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddCustomerGroupAssignmentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddCustomerGroupAssignmentAction>";
            }
        };
    }
}
