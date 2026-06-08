
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
 *     BusinessUnitCustomerGroupAssignmentAddedMessage businessUnitCustomerGroupAssignmentAddedMessage = BusinessUnitCustomerGroupAssignmentAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomerGroupAssignmentAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomerGroupAssignmentAddedMessageImpl.class)
public interface BusinessUnitCustomerGroupAssignmentAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitCustomerGroupAssignmentAddedMessage
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
     * @return instance of BusinessUnitCustomerGroupAssignmentAddedMessage
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessage of() {
        return new BusinessUnitCustomerGroupAssignmentAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomerGroupAssignmentAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessage of(
            final BusinessUnitCustomerGroupAssignmentAddedMessage template) {
        BusinessUnitCustomerGroupAssignmentAddedMessageImpl instance = new BusinessUnitCustomerGroupAssignmentAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    public BusinessUnitCustomerGroupAssignmentAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomerGroupAssignmentAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomerGroupAssignmentAddedMessage deepCopy(
            @Nullable final BusinessUnitCustomerGroupAssignmentAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomerGroupAssignmentAddedMessageImpl instance = new BusinessUnitCustomerGroupAssignmentAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignment
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomerGroupAssignmentAddedMessage
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessageBuilder builder() {
        return BusinessUnitCustomerGroupAssignmentAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessageBuilder builder(
            final BusinessUnitCustomerGroupAssignmentAddedMessage template) {
        return BusinessUnitCustomerGroupAssignmentAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomerGroupAssignmentAddedMessage(
            Function<BusinessUnitCustomerGroupAssignmentAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomerGroupAssignmentAddedMessage>";
            }
        };
    }
}
