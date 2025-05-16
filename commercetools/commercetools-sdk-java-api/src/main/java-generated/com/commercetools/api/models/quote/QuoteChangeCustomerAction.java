
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changes the owner of a Quote to a different Customer. Customer Group is not updated. This update action produces the Quote Customer Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteChangeCustomerAction quoteChangeCustomerAction = QuoteChangeCustomerAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomer")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteChangeCustomerActionImpl.class)
public interface QuoteChangeCustomerAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteChangeCustomerAction
     */
    String CHANGE_CUSTOMER = "changeCustomer";

    /**
     *  <p>New Customer to own the Quote.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>New Customer to own the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     * factory method
     * @return instance of QuoteChangeCustomerAction
     */
    public static QuoteChangeCustomerAction of() {
        return new QuoteChangeCustomerActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteChangeCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteChangeCustomerAction of(final QuoteChangeCustomerAction template) {
        QuoteChangeCustomerActionImpl instance = new QuoteChangeCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public QuoteChangeCustomerAction copyDeep();

    /**
     * factory method to create a deep copy of QuoteChangeCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteChangeCustomerAction deepCopy(@Nullable final QuoteChangeCustomerAction template) {
        if (template == null) {
            return null;
        }
        QuoteChangeCustomerActionImpl instance = new QuoteChangeCustomerActionImpl();
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for QuoteChangeCustomerAction
     * @return builder
     */
    public static QuoteChangeCustomerActionBuilder builder() {
        return QuoteChangeCustomerActionBuilder.of();
    }

    /**
     * create builder for QuoteChangeCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteChangeCustomerActionBuilder builder(final QuoteChangeCustomerAction template) {
        return QuoteChangeCustomerActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteChangeCustomerAction(Function<QuoteChangeCustomerAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteChangeCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteChangeCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteChangeCustomerAction>";
            }
        };
    }
}
