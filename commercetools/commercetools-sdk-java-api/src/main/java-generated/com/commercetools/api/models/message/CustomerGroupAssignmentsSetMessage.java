
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
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentsSetMessage customerGroupAssignmentsSetMessage = CustomerGroupAssignmentsSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusCustomerGroupAssignments(customerGroupAssignmentsBuilder -> customerGroupAssignmentsBuilder)
 *             .plusOldCustomerGroupAssignments(oldCustomerGroupAssignmentsBuilder -> oldCustomerGroupAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupAssignmentsSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentsSetMessageImpl.class)
public interface CustomerGroupAssignmentsSetMessage extends Message {

    /**
     * discriminator value for CustomerGroupAssignmentsSetMessage
     */
    String CUSTOMER_GROUP_ASSIGNMENTS_SET = "CustomerGroupAssignmentsSet";

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignment> getCustomerGroupAssignments();

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return oldCustomerGroupAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("oldCustomerGroupAssignments")
    public List<CustomerGroupAssignment> getOldCustomerGroupAssignments();

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
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setOldCustomerGroupAssignments(final CustomerGroupAssignment... oldCustomerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments values to be set
     */

    public void setOldCustomerGroupAssignments(final List<CustomerGroupAssignment> oldCustomerGroupAssignments);

    /**
     * factory method
     * @return instance of CustomerGroupAssignmentsSetMessage
     */
    public static CustomerGroupAssignmentsSetMessage of() {
        return new CustomerGroupAssignmentsSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentsSetMessage of(final CustomerGroupAssignmentsSetMessage template) {
        CustomerGroupAssignmentsSetMessageImpl instance = new CustomerGroupAssignmentsSetMessageImpl();
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
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        instance.setOldCustomerGroupAssignments(template.getOldCustomerGroupAssignments());
        return instance;
    }

    public CustomerGroupAssignmentsSetMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentsSetMessage deepCopy(
            @Nullable final CustomerGroupAssignmentsSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentsSetMessageImpl instance = new CustomerGroupAssignmentsSetMessageImpl();
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
     * builder factory method for CustomerGroupAssignmentsSetMessage
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessageBuilder builder() {
        return CustomerGroupAssignmentsSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentsSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessageBuilder builder(final CustomerGroupAssignmentsSetMessage template) {
        return CustomerGroupAssignmentsSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentsSetMessage(Function<CustomerGroupAssignmentsSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentsSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentsSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentsSetMessage>";
            }
        };
    }
}
