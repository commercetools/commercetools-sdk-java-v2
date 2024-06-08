
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
 *     QuoteCustomerChangedMessagePayload quoteCustomerChangedMessagePayload = QuoteCustomerChangedMessagePayload.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .previousCustomer(previousCustomerBuilder -> previousCustomerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteCustomerChangedMessagePayloadImpl.class)
public interface QuoteCustomerChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteCustomerChangedMessagePayload
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
     * @return instance of QuoteCustomerChangedMessagePayload
     */
    public static QuoteCustomerChangedMessagePayload of() {
        return new QuoteCustomerChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteCustomerChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteCustomerChangedMessagePayload of(final QuoteCustomerChangedMessagePayload template) {
        QuoteCustomerChangedMessagePayloadImpl instance = new QuoteCustomerChangedMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        instance.setPreviousCustomer(template.getPreviousCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteCustomerChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteCustomerChangedMessagePayload deepCopy(
            @Nullable final QuoteCustomerChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteCustomerChangedMessagePayloadImpl instance = new QuoteCustomerChangedMessagePayloadImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setPreviousCustomer(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getPreviousCustomer()));
        return instance;
    }

    /**
     * builder factory method for QuoteCustomerChangedMessagePayload
     * @return builder
     */
    public static QuoteCustomerChangedMessagePayloadBuilder builder() {
        return QuoteCustomerChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteCustomerChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteCustomerChangedMessagePayloadBuilder builder(final QuoteCustomerChangedMessagePayload template) {
        return QuoteCustomerChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteCustomerChangedMessagePayload(Function<QuoteCustomerChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteCustomerChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteCustomerChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteCustomerChangedMessagePayload>";
            }
        };
    }
}
