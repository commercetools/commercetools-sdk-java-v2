
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentRemovedMessagePayload businessUnitCustomerGroupAssignmentRemovedMessagePayload = BusinessUnitCustomerGroupAssignmentRemovedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomerGroupAssignmentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl.class)
public interface BusinessUnitCustomerGroupAssignmentRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOMER_GROUP_ASSIGNMENT_REMOVED = "BusinessUnitCustomerGroupAssignmentRemoved";

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignment getCustomerGroupAssignment();

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignment customerGroupAssignment);

    /**
     * factory method
     * @return instance of BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayload of() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayload of(
            final BusinessUnitCustomerGroupAssignmentRemovedMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomerGroupAssignmentRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignment
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder builder() {
        return BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder builder(
            final BusinessUnitCustomerGroupAssignmentRemovedMessagePayload template) {
        return BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomerGroupAssignmentRemovedMessagePayload(
            Function<BusinessUnitCustomerGroupAssignmentRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessagePayload>";
            }
        };
    }
}
