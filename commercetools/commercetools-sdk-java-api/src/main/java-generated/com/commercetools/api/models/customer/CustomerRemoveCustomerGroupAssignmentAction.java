
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Unassigns a Customer Group from a Customer. This action generates the CustomerGroupAssignmentRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveCustomerGroupAssignmentAction customerRemoveCustomerGroupAssignmentAction = CustomerRemoveCustomerGroupAssignmentAction.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveCustomerGroupAssignmentActionImpl.class)
public interface CustomerRemoveCustomerGroupAssignmentAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerRemoveCustomerGroupAssignmentAction
     */
    String REMOVE_CUSTOMER_GROUP_ASSIGNMENT = "removeCustomerGroupAssignment";

    /**
     *  <p>Customer Group to unassign the Customer from.</p>
     * @return customerGroup
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Customer Group to unassign the Customer from.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     * factory method
     * @return instance of CustomerRemoveCustomerGroupAssignmentAction
     */
    public static CustomerRemoveCustomerGroupAssignmentAction of() {
        return new CustomerRemoveCustomerGroupAssignmentActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerRemoveCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerRemoveCustomerGroupAssignmentAction of(
            final CustomerRemoveCustomerGroupAssignmentAction template) {
        CustomerRemoveCustomerGroupAssignmentActionImpl instance = new CustomerRemoveCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerRemoveCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerRemoveCustomerGroupAssignmentAction deepCopy(
            @Nullable final CustomerRemoveCustomerGroupAssignmentAction template) {
        if (template == null) {
            return null;
        }
        CustomerRemoveCustomerGroupAssignmentActionImpl instance = new CustomerRemoveCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerRemoveCustomerGroupAssignmentAction
     * @return builder
     */
    public static CustomerRemoveCustomerGroupAssignmentActionBuilder builder() {
        return CustomerRemoveCustomerGroupAssignmentActionBuilder.of();
    }

    /**
     * create builder for CustomerRemoveCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveCustomerGroupAssignmentActionBuilder builder(
            final CustomerRemoveCustomerGroupAssignmentAction template) {
        return CustomerRemoveCustomerGroupAssignmentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerRemoveCustomerGroupAssignmentAction(
            Function<CustomerRemoveCustomerGroupAssignmentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveCustomerGroupAssignmentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveCustomerGroupAssignmentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveCustomerGroupAssignmentAction>";
            }
        };
    }
}
