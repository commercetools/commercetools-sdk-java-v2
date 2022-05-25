
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPasswordUpdatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordUpdatedMessage customerPasswordUpdatedMessage = CustomerPasswordUpdatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .reset(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordUpdatedMessageImpl.class)
public interface CustomerPasswordUpdatedMessage extends Message {

    String CUSTOMER_PASSWORD_UPDATED = "CustomerPasswordUpdated";

    /**
     *  <p>true, if password has been updated during Customer's Password Reset workflow.</p>
     */
    @NotNull
    @JsonProperty("reset")
    public Boolean getReset();

    public void setReset(final Boolean reset);

    public static CustomerPasswordUpdatedMessage of() {
        return new CustomerPasswordUpdatedMessageImpl();
    }

    public static CustomerPasswordUpdatedMessage of(final CustomerPasswordUpdatedMessage template) {
        CustomerPasswordUpdatedMessageImpl instance = new CustomerPasswordUpdatedMessageImpl();
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
        instance.setReset(template.getReset());
        return instance;
    }

    public static CustomerPasswordUpdatedMessageBuilder builder() {
        return CustomerPasswordUpdatedMessageBuilder.of();
    }

    public static CustomerPasswordUpdatedMessageBuilder builder(final CustomerPasswordUpdatedMessage template) {
        return CustomerPasswordUpdatedMessageBuilder.of(template);
    }

    default <T> T withCustomerPasswordUpdatedMessage(Function<CustomerPasswordUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordUpdatedMessage>";
            }
        };
    }
}
