
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentAddedMessagePayload businessUnitCustomerGroupAssignmentAddedMessagePayload = BusinessUnitCustomerGroupAssignmentAddedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomerGroupAssignmentAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl.class)
public interface BusinessUnitCustomerGroupAssignmentAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOMER_GROUP_ASSIGNMENT_ADDED = "BusinessUnitCustomerGroupAssignmentAdded";

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignment getCustomerGroupAssignment();

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignment customerGroupAssignment);

    /**
     * factory method
     * @return instance of BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayload of() {
        return new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayload of(
            final BusinessUnitCustomerGroupAssignmentAddedMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    public BusinessUnitCustomerGroupAssignmentAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomerGroupAssignmentAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl instance = new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignment
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder builder() {
        return BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder builder(
            final BusinessUnitCustomerGroupAssignmentAddedMessagePayload template) {
        return BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomerGroupAssignmentAddedMessagePayload(
            Function<BusinessUnitCustomerGroupAssignmentAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessagePayload>";
            }
        };
    }
}
