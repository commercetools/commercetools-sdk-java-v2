
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerGroupAssignment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add CustomerGroupAssignment update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentAddedMessagePayload customerGroupAssignmentAddedMessagePayload = CustomerGroupAssignmentAddedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentAddedMessagePayloadImpl.class)
public interface CustomerGroupAssignmentAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupAssignmentAddedMessagePayload
     */
    String CUSTOMER_GROUP_ASSIGNMENT_ADDED = "CustomerGroupAssignmentAdded";

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignment getCustomerGroupAssignment();

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignment customerGroupAssignment);

    /**
     * factory method
     * @return instance of CustomerGroupAssignmentAddedMessagePayload
     */
    public static CustomerGroupAssignmentAddedMessagePayload of() {
        return new CustomerGroupAssignmentAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentAddedMessagePayload of(
            final CustomerGroupAssignmentAddedMessagePayload template) {
        CustomerGroupAssignmentAddedMessagePayloadImpl instance = new CustomerGroupAssignmentAddedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentAddedMessagePayload deepCopy(
            @Nullable final CustomerGroupAssignmentAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentAddedMessagePayloadImpl instance = new CustomerGroupAssignmentAddedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignment
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupAssignmentAddedMessagePayload
     * @return builder
     */
    public static CustomerGroupAssignmentAddedMessagePayloadBuilder builder() {
        return CustomerGroupAssignmentAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentAddedMessagePayloadBuilder builder(
            final CustomerGroupAssignmentAddedMessagePayload template) {
        return CustomerGroupAssignmentAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentAddedMessagePayload(
            Function<CustomerGroupAssignmentAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentAddedMessagePayload>";
            }
        };
    }
}
