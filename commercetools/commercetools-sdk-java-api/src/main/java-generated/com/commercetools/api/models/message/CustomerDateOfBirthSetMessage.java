
package com.commercetools.api.models.message;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Date of Birth update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDateOfBirthSetMessage customerDateOfBirthSetMessage = CustomerDateOfBirthSetMessage.builder()
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
@JsonDeserialize(as = CustomerDateOfBirthSetMessageImpl.class)
public interface CustomerDateOfBirthSetMessage extends Message {

    /**
     * discriminator value for CustomerDateOfBirthSetMessage
     */
    String CUSTOMER_DATE_OF_BIRTH_SET = "CustomerDateOfBirthSet";

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @return dateOfBirth
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @param dateOfBirth value to be set
     */

    public void setDateOfBirth(final LocalDate dateOfBirth);

    /**
     * factory method
     * @return instance of CustomerDateOfBirthSetMessage
     */
    public static CustomerDateOfBirthSetMessage of() {
        return new CustomerDateOfBirthSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDateOfBirthSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDateOfBirthSetMessage of(final CustomerDateOfBirthSetMessage template) {
        CustomerDateOfBirthSetMessageImpl instance = new CustomerDateOfBirthSetMessageImpl();
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
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerDateOfBirthSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDateOfBirthSetMessage deepCopy(@Nullable final CustomerDateOfBirthSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerDateOfBirthSetMessageImpl instance = new CustomerDateOfBirthSetMessageImpl();
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
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * builder factory method for CustomerDateOfBirthSetMessage
     * @return builder
     */
    public static CustomerDateOfBirthSetMessageBuilder builder() {
        return CustomerDateOfBirthSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerDateOfBirthSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDateOfBirthSetMessageBuilder builder(final CustomerDateOfBirthSetMessage template) {
        return CustomerDateOfBirthSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDateOfBirthSetMessage(Function<CustomerDateOfBirthSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDateOfBirthSetMessage>";
            }
        };
    }
}
