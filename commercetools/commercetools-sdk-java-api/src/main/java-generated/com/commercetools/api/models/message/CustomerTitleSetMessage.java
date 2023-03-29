
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Title update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerTitleSetMessage customerTitleSetMessage = CustomerTitleSetMessage.builder()
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
@JsonDeserialize(as = CustomerTitleSetMessageImpl.class)
public interface CustomerTitleSetMessage extends Message {

    /**
     * discriminator value for CustomerTitleSetMessage
     */
    String CUSTOMER_TITLE_SET = "CustomerTitleSet";

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of CustomerTitleSetMessage
     */
    public static CustomerTitleSetMessage of() {
        return new CustomerTitleSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerTitleSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerTitleSetMessage of(final CustomerTitleSetMessage template) {
        CustomerTitleSetMessageImpl instance = new CustomerTitleSetMessageImpl();
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
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerTitleSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerTitleSetMessage deepCopy(@Nullable final CustomerTitleSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerTitleSetMessageImpl instance = new CustomerTitleSetMessageImpl();
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
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for CustomerTitleSetMessage
     * @return builder
     */
    public static CustomerTitleSetMessageBuilder builder() {
        return CustomerTitleSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerTitleSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerTitleSetMessageBuilder builder(final CustomerTitleSetMessage template) {
        return CustomerTitleSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerTitleSetMessage(Function<CustomerTitleSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerTitleSetMessage>";
            }
        };
    }
}
