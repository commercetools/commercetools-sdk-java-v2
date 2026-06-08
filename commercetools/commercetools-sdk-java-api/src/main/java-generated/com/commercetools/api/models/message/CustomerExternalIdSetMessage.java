
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetExternalIdAction" rel="nofollow">Set External ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerExternalIdSetMessage customerExternalIdSetMessage = CustomerExternalIdSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerExternalIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerExternalIdSetMessageImpl.class)
public interface CustomerExternalIdSetMessage extends Message {

    /**
     * discriminator value for CustomerExternalIdSetMessage
     */
    String CUSTOMER_EXTERNAL_ID_SET = "CustomerExternalIdSet";

    /**
     *  <p>The identifier that was set.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>The identifier that was set.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     * factory method
     * @return instance of CustomerExternalIdSetMessage
     */
    public static CustomerExternalIdSetMessage of() {
        return new CustomerExternalIdSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerExternalIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerExternalIdSetMessage of(final CustomerExternalIdSetMessage template) {
        CustomerExternalIdSetMessageImpl instance = new CustomerExternalIdSetMessageImpl();
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
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public CustomerExternalIdSetMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerExternalIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerExternalIdSetMessage deepCopy(@Nullable final CustomerExternalIdSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerExternalIdSetMessageImpl instance = new CustomerExternalIdSetMessageImpl();
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
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    /**
     * builder factory method for CustomerExternalIdSetMessage
     * @return builder
     */
    public static CustomerExternalIdSetMessageBuilder builder() {
        return CustomerExternalIdSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerExternalIdSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerExternalIdSetMessageBuilder builder(final CustomerExternalIdSetMessage template) {
        return CustomerExternalIdSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerExternalIdSetMessage(Function<CustomerExternalIdSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerExternalIdSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerExternalIdSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerExternalIdSetMessage>";
            }
        };
    }
}
