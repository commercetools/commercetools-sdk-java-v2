
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestChangeCustomerAction" rel="nofollow">Change Customer</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCustomerChangedMessage quoteRequestCustomerChangedMessage = QuoteRequestCustomerChangedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRequestCustomerChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestCustomerChangedMessageImpl.class)
public interface QuoteRequestCustomerChangedMessage extends Message {

    /**
     * discriminator value for QuoteRequestCustomerChangedMessage
     */
    String QUOTE_REQUEST_CUSTOMER_CHANGED = "QuoteRequestCustomerChanged";

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @return previousCustomer
     */
    @NotNull
    @Valid
    @JsonProperty("previousCustomer")
    public CustomerReference getPreviousCustomer();

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @param previousCustomer value to be set
     */

    public void setPreviousCustomer(final CustomerReference previousCustomer);

    /**
     * factory method
     * @return instance of QuoteRequestCustomerChangedMessage
     */
    public static QuoteRequestCustomerChangedMessage of() {
        return new QuoteRequestCustomerChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestCustomerChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestCustomerChangedMessage of(final QuoteRequestCustomerChangedMessage template) {
        QuoteRequestCustomerChangedMessageImpl instance = new QuoteRequestCustomerChangedMessageImpl();
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

    public QuoteRequestCustomerChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestCustomerChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestCustomerChangedMessage deepCopy(
            @Nullable final QuoteRequestCustomerChangedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteRequestCustomerChangedMessageImpl instance = new QuoteRequestCustomerChangedMessageImpl();
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
     * builder factory method for QuoteRequestCustomerChangedMessage
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessageBuilder builder() {
        return QuoteRequestCustomerChangedMessageBuilder.of();
    }

    /**
     * create builder for QuoteRequestCustomerChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessageBuilder builder(final QuoteRequestCustomerChangedMessage template) {
        return QuoteRequestCustomerChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestCustomerChangedMessage(Function<QuoteRequestCustomerChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCustomerChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCustomerChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCustomerChangedMessage>";
            }
        };
    }
}
