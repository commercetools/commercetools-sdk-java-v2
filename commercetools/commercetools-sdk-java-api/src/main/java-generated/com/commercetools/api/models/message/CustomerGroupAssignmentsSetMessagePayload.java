
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerGroupAssignment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentsSetMessagePayload customerGroupAssignmentsSetMessagePayload = CustomerGroupAssignmentsSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupAssignmentsSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentsSetMessagePayloadImpl.class)
public interface CustomerGroupAssignmentsSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupAssignmentsSetMessagePayload
     */
    String CUSTOMER_GROUP_ASSIGNMENTS_SET = "CustomerGroupAssignmentsSet";

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignment> getCustomerGroupAssignments();

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignment... customerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignment> customerGroupAssignments);

    /**
     * factory method
     * @return instance of CustomerGroupAssignmentsSetMessagePayload
     */
    public static CustomerGroupAssignmentsSetMessagePayload of() {
        return new CustomerGroupAssignmentsSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentsSetMessagePayload of(
            final CustomerGroupAssignmentsSetMessagePayload template) {
        CustomerGroupAssignmentsSetMessagePayloadImpl instance = new CustomerGroupAssignmentsSetMessagePayloadImpl();
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        return instance;
    }

    public CustomerGroupAssignmentsSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentsSetMessagePayload deepCopy(
            @Nullable final CustomerGroupAssignmentsSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentsSetMessagePayloadImpl instance = new CustomerGroupAssignmentsSetMessagePayloadImpl();
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupAssignmentsSetMessagePayload
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessagePayloadBuilder builder() {
        return CustomerGroupAssignmentsSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessagePayloadBuilder builder(
            final CustomerGroupAssignmentsSetMessagePayload template) {
        return CustomerGroupAssignmentsSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentsSetMessagePayload(
            Function<CustomerGroupAssignmentsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentsSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentsSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentsSetMessagePayload>";
            }
        };
    }
}
