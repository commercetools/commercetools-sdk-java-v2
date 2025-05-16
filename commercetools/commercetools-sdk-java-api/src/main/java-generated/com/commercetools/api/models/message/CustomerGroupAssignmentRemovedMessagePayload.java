
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
 *  <p>Generated after a successful Remove CustomerGroupAssignment update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentRemovedMessagePayload customerGroupAssignmentRemovedMessagePayload = CustomerGroupAssignmentRemovedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupAssignmentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentRemovedMessagePayloadImpl.class)
public interface CustomerGroupAssignmentRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupAssignmentRemovedMessagePayload
     */
    String CUSTOMER_GROUP_ASSIGNMENT_REMOVED = "CustomerGroupAssignmentRemoved";

    /**
     *  <p>Customer Group removed during the Remove CustomerGroupAssignment update action.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignment getCustomerGroupAssignment();

    /**
     *  <p>Customer Group removed during the Remove CustomerGroupAssignment update action.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignment customerGroupAssignment);

    /**
     * factory method
     * @return instance of CustomerGroupAssignmentRemovedMessagePayload
     */
    public static CustomerGroupAssignmentRemovedMessagePayload of() {
        return new CustomerGroupAssignmentRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentRemovedMessagePayload of(
            final CustomerGroupAssignmentRemovedMessagePayload template) {
        CustomerGroupAssignmentRemovedMessagePayloadImpl instance = new CustomerGroupAssignmentRemovedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    public CustomerGroupAssignmentRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentRemovedMessagePayload deepCopy(
            @Nullable final CustomerGroupAssignmentRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentRemovedMessagePayloadImpl instance = new CustomerGroupAssignmentRemovedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignment
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupAssignmentRemovedMessagePayload
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessagePayloadBuilder builder() {
        return CustomerGroupAssignmentRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessagePayloadBuilder builder(
            final CustomerGroupAssignmentRemovedMessagePayload template) {
        return CustomerGroupAssignmentRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentRemovedMessagePayload(
            Function<CustomerGroupAssignmentRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentRemovedMessagePayload>";
            }
        };
    }
}
