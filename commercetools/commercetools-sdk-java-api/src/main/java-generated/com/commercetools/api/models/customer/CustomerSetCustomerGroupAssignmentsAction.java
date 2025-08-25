
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Assigns multiple Customer Groups to a Customer. This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupAssignmentsSetMessage" rel="nofollow">CustomerGroupAssignmentsSetMessage</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerGroupAssignmentsAction customerSetCustomerGroupAssignmentsAction = CustomerSetCustomerGroupAssignmentsAction.builder()
 *             .plusCustomerGroupAssignments(customerGroupAssignmentsBuilder -> customerGroupAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerGroupAssignments")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomerGroupAssignmentsActionImpl.class)
public interface CustomerSetCustomerGroupAssignmentsAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomerGroupAssignmentsAction
     */
    String SET_CUSTOMER_GROUP_ASSIGNMENTS = "setCustomerGroupAssignments";

    /**
     *  <p>Customer Groups to assign the Customer to.</p>
     * @return customerGroupAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignmentDraft> getCustomerGroupAssignments();

    /**
     *  <p>Customer Groups to assign the Customer to.</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignmentDraft... customerGroupAssignments);

    /**
     *  <p>Customer Groups to assign the Customer to.</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignmentDraft> customerGroupAssignments);

    /**
     * factory method
     * @return instance of CustomerSetCustomerGroupAssignmentsAction
     */
    public static CustomerSetCustomerGroupAssignmentsAction of() {
        return new CustomerSetCustomerGroupAssignmentsActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetCustomerGroupAssignmentsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomerGroupAssignmentsAction of(
            final CustomerSetCustomerGroupAssignmentsAction template) {
        CustomerSetCustomerGroupAssignmentsActionImpl instance = new CustomerSetCustomerGroupAssignmentsActionImpl();
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        return instance;
    }

    public CustomerSetCustomerGroupAssignmentsAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetCustomerGroupAssignmentsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetCustomerGroupAssignmentsAction deepCopy(
            @Nullable final CustomerSetCustomerGroupAssignmentsAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetCustomerGroupAssignmentsActionImpl instance = new CustomerSetCustomerGroupAssignmentsActionImpl();
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignmentDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerSetCustomerGroupAssignmentsAction
     * @return builder
     */
    public static CustomerSetCustomerGroupAssignmentsActionBuilder builder() {
        return CustomerSetCustomerGroupAssignmentsActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCustomerGroupAssignmentsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerGroupAssignmentsActionBuilder builder(
            final CustomerSetCustomerGroupAssignmentsAction template) {
        return CustomerSetCustomerGroupAssignmentsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCustomerGroupAssignmentsAction(
            Function<CustomerSetCustomerGroupAssignmentsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAssignmentsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAssignmentsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomerGroupAssignmentsAction>";
            }
        };
    }
}
