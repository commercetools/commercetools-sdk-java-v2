
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerLastNameSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLastNameSetMessage customerLastNameSetMessage = CustomerLastNameSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerLastNameSetMessageImpl.class)
public interface CustomerLastNameSetMessage extends Message {

    String CUSTOMER_LAST_NAME_SET = "CustomerLastNameSet";

    /**
     <>
     */

    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static CustomerLastNameSetMessage of() {
        return new CustomerLastNameSetMessageImpl();
    }

    public static CustomerLastNameSetMessage of(final CustomerLastNameSetMessage template) {
        CustomerLastNameSetMessageImpl instance = new CustomerLastNameSetMessageImpl();
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
        instance.setLastName(template.getLastName());
        return instance;
    }

    public static CustomerLastNameSetMessageBuilder builder() {
        return CustomerLastNameSetMessageBuilder.of();
    }

    public static CustomerLastNameSetMessageBuilder builder(final CustomerLastNameSetMessage template) {
        return CustomerLastNameSetMessageBuilder.of(template);
    }

    default <T> T withCustomerLastNameSetMessage(Function<CustomerLastNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLastNameSetMessage>";
            }
        };
    }
}
