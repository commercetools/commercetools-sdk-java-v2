
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
 *     CustomerGroupAssignmentRemovedMessage customerGroupAssignmentRemovedMessage = CustomerGroupAssignmentRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupAssignmentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentRemovedMessageImpl.class)
public interface CustomerGroupAssignmentRemovedMessage extends Message {

    /**
     * discriminator value for CustomerGroupAssignmentRemovedMessage
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
     * @return instance of CustomerGroupAssignmentRemovedMessage
     */
    public static CustomerGroupAssignmentRemovedMessage of() {
        return new CustomerGroupAssignmentRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentRemovedMessage of(final CustomerGroupAssignmentRemovedMessage template) {
        CustomerGroupAssignmentRemovedMessageImpl instance = new CustomerGroupAssignmentRemovedMessageImpl();
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

    public CustomerGroupAssignmentRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentRemovedMessage deepCopy(
            @Nullable final CustomerGroupAssignmentRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentRemovedMessageImpl instance = new CustomerGroupAssignmentRemovedMessageImpl();
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
     * builder factory method for CustomerGroupAssignmentRemovedMessage
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessageBuilder builder() {
        return CustomerGroupAssignmentRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessageBuilder builder(
            final CustomerGroupAssignmentRemovedMessage template) {
        return CustomerGroupAssignmentRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentRemovedMessage(Function<CustomerGroupAssignmentRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentRemovedMessage>";
            }
        };
    }
}
