
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentsSetMessagePayload businessUnitCustomerGroupAssignmentsSetMessagePayload = BusinessUnitCustomerGroupAssignmentsSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomerGroupAssignmentsSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl.class)
public interface BusinessUnitCustomerGroupAssignmentsSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     */
    String BUSINESS_UNIT_CUSTOMER_GROUP_ASSIGNMENTS_SET = "BusinessUnitCustomerGroupAssignmentsSet";

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignment> getCustomerGroupAssignments();

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return oldCustomerGroupAssignments
     */
    @Valid
    @JsonProperty("oldCustomerGroupAssignments")
    public List<CustomerGroupAssignment> getOldCustomerGroupAssignments();

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignment... customerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignment> customerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setOldCustomerGroupAssignments(final CustomerGroupAssignment... oldCustomerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments values to be set
     */

    public void setOldCustomerGroupAssignments(final List<CustomerGroupAssignment> oldCustomerGroupAssignments);

    /**
     * factory method
     * @return instance of BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayload of() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayload of(
            final BusinessUnitCustomerGroupAssignmentsSetMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl();
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        instance.setOldCustomerGroupAssignments(template.getOldCustomerGroupAssignments());
        return instance;
    }

    public BusinessUnitCustomerGroupAssignmentsSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomerGroupAssignmentsSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadImpl();
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldCustomerGroupAssignments(Optional.ofNullable(template.getOldCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomerGroupAssignmentsSetMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder builder() {
        return BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder builder(
            final BusinessUnitCustomerGroupAssignmentsSetMessagePayload template) {
        return BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomerGroupAssignmentsSetMessagePayload(
            Function<BusinessUnitCustomerGroupAssignmentsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentsSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentsSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomerGroupAssignmentsSetMessagePayload>";
            }
        };
    }
}
