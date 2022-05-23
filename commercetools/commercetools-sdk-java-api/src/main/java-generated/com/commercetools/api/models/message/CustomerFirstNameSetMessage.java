
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerFirstNameSetMessage customerFirstNameSetMessage = CustomerFirstNameSetMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerFirstNameSetMessageImpl.class)
public interface CustomerFirstNameSetMessage extends Message {

    String CUSTOMER_FIRST_NAME_SET = "CustomerFirstNameSet";

    @JsonProperty("firstName")
    public String getFirstName();

    public void setFirstName(final String firstName);

    public static CustomerFirstNameSetMessage of() {
        return new CustomerFirstNameSetMessageImpl();
    }

    public static CustomerFirstNameSetMessage of(final CustomerFirstNameSetMessage template) {
        CustomerFirstNameSetMessageImpl instance = new CustomerFirstNameSetMessageImpl();
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
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    public static CustomerFirstNameSetMessageBuilder builder() {
        return CustomerFirstNameSetMessageBuilder.of();
    }

    public static CustomerFirstNameSetMessageBuilder builder(final CustomerFirstNameSetMessage template) {
        return CustomerFirstNameSetMessageBuilder.of(template);
    }

    default <T> T withCustomerFirstNameSetMessage(Function<CustomerFirstNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerFirstNameSetMessage>";
            }
        };
    }
}
