
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
 *     BusinessUnitCustomerGroupAssignmentRemovedMessage businessUnitCustomerGroupAssignmentRemovedMessage = BusinessUnitCustomerGroupAssignmentRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomerGroupAssignmentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomerGroupAssignmentRemovedMessageImpl.class)
public interface BusinessUnitCustomerGroupAssignmentRemovedMessage extends Message {

    /**
     * discriminator value for BusinessUnitCustomerGroupAssignmentRemovedMessage
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
     * @return instance of BusinessUnitCustomerGroupAssignmentRemovedMessage
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessage of() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomerGroupAssignmentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessage of(
            final BusinessUnitCustomerGroupAssignmentRemovedMessage template) {
        BusinessUnitCustomerGroupAssignmentRemovedMessageImpl instance = new BusinessUnitCustomerGroupAssignmentRemovedMessageImpl();
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

    public BusinessUnitCustomerGroupAssignmentRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomerGroupAssignmentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomerGroupAssignmentRemovedMessage deepCopy(
            @Nullable final BusinessUnitCustomerGroupAssignmentRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomerGroupAssignmentRemovedMessageImpl instance = new BusinessUnitCustomerGroupAssignmentRemovedMessageImpl();
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
     * builder factory method for BusinessUnitCustomerGroupAssignmentRemovedMessage
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder builder() {
        return BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder builder(
            final BusinessUnitCustomerGroupAssignmentRemovedMessage template) {
        return BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomerGroupAssignmentRemovedMessage(
            Function<BusinessUnitCustomerGroupAssignmentRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomerGroupAssignmentRemovedMessage>";
            }
        };
    }
}
