
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Customer update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteCustomerChangedMessage quoteCustomerChangedMessage = QuoteCustomerChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .previousCustomer(previousCustomerBuilder -> previousCustomerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteCustomerChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteCustomerChangedMessageImpl.class)
public interface QuoteCustomerChangedMessage extends Message {

    /**
     * discriminator value for QuoteCustomerChangedMessage
     */
    String QUOTE_CUSTOMER_CHANGED = "QuoteCustomerChanged";

    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>The previous Buyer.</p>
     * @return previousCustomer
     */
    @NotNull
    @Valid
    @JsonProperty("previousCustomer")
    public CustomerReference getPreviousCustomer();

    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>The previous Buyer.</p>
     * @param previousCustomer value to be set
     */

    public void setPreviousCustomer(final CustomerReference previousCustomer);

    /**
     * factory method
     * @return instance of QuoteCustomerChangedMessage
     */
    public static QuoteCustomerChangedMessage of() {
        return new QuoteCustomerChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteCustomerChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteCustomerChangedMessage of(final QuoteCustomerChangedMessage template) {
        QuoteCustomerChangedMessageImpl instance = new QuoteCustomerChangedMessageImpl();
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
        instance.setCustomer(template.getCustomer());
        instance.setPreviousCustomer(template.getPreviousCustomer());
        return instance;
    }

    public QuoteCustomerChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of QuoteCustomerChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteCustomerChangedMessage deepCopy(@Nullable final QuoteCustomerChangedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteCustomerChangedMessageImpl instance = new QuoteCustomerChangedMessageImpl();
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
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setPreviousCustomer(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getPreviousCustomer()));
        return instance;
    }

    /**
     * builder factory method for QuoteCustomerChangedMessage
     * @return builder
     */
    public static QuoteCustomerChangedMessageBuilder builder() {
        return QuoteCustomerChangedMessageBuilder.of();
    }

    /**
     * create builder for QuoteCustomerChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteCustomerChangedMessageBuilder builder(final QuoteCustomerChangedMessage template) {
        return QuoteCustomerChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteCustomerChangedMessage(Function<QuoteCustomerChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteCustomerChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteCustomerChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteCustomerChangedMessage>";
            }
        };
    }
}
