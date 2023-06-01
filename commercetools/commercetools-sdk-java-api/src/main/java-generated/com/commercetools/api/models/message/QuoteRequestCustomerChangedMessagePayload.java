package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Change Customer update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCustomerChangedMessagePayload quoteRequestCustomerChangedMessagePayload = QuoteRequestCustomerChangedMessagePayload.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .previousCustomer(previousCustomerBuilder -> previousCustomerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = QuoteRequestCustomerChangedMessagePayloadImpl.class)
public interface QuoteRequestCustomerChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteRequestCustomerChangedMessagePayload
     */
    String QUOTE_REQUEST_CUSTOMER_CHANGED = "QuoteRequestCustomerChanged";

    /**
     *  <p>The Buyer who now owns the Quote Request.</p>
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
     *  <p>The Buyer who now owns the Quote Request.</p>
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
     * @return instance of QuoteRequestCustomerChangedMessagePayload
     */
    public static QuoteRequestCustomerChangedMessagePayload of(){
        return new QuoteRequestCustomerChangedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy QuoteRequestCustomerChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestCustomerChangedMessagePayload of(final QuoteRequestCustomerChangedMessagePayload template) {
        QuoteRequestCustomerChangedMessagePayloadImpl instance = new QuoteRequestCustomerChangedMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        instance.setPreviousCustomer(template.getPreviousCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestCustomerChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestCustomerChangedMessagePayload deepCopy(@Nullable final QuoteRequestCustomerChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRequestCustomerChangedMessagePayloadImpl instance = new QuoteRequestCustomerChangedMessagePayloadImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setPreviousCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getPreviousCustomer()));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestCustomerChangedMessagePayload
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessagePayloadBuilder builder() {
        return QuoteRequestCustomerChangedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for QuoteRequestCustomerChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessagePayloadBuilder builder(final QuoteRequestCustomerChangedMessagePayload template) {
        return QuoteRequestCustomerChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestCustomerChangedMessagePayload(Function<QuoteRequestCustomerChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCustomerChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCustomerChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCustomerChangedMessagePayload>";
            }
        };
    }
}
