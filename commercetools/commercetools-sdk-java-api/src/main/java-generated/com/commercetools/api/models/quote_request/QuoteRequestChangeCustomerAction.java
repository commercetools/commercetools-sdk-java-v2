
package com.commercetools.api.models.quote_request;

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
 *  <p>Changes the owner of a Quote Request to a different Customer. Customer Group is not updated. This update action produces the Quote Request Customer Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestChangeCustomerAction quoteRequestChangeCustomerAction = QuoteRequestChangeCustomerAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomer")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestChangeCustomerActionImpl.class)
public interface QuoteRequestChangeCustomerAction extends QuoteRequestUpdateAction {

    /**
     * discriminator value for QuoteRequestChangeCustomerAction
     */
    String CHANGE_CUSTOMER = "changeCustomer";

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     * factory method
     * @return instance of QuoteRequestChangeCustomerAction
     */
    public static QuoteRequestChangeCustomerAction of() {
        return new QuoteRequestChangeCustomerActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestChangeCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestChangeCustomerAction of(final QuoteRequestChangeCustomerAction template) {
        QuoteRequestChangeCustomerActionImpl instance = new QuoteRequestChangeCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public QuoteRequestChangeCustomerAction copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestChangeCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestChangeCustomerAction deepCopy(@Nullable final QuoteRequestChangeCustomerAction template) {
        if (template == null) {
            return null;
        }
        QuoteRequestChangeCustomerActionImpl instance = new QuoteRequestChangeCustomerActionImpl();
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestChangeCustomerAction
     * @return builder
     */
    public static QuoteRequestChangeCustomerActionBuilder builder() {
        return QuoteRequestChangeCustomerActionBuilder.of();
    }

    /**
     * create builder for QuoteRequestChangeCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestChangeCustomerActionBuilder builder(final QuoteRequestChangeCustomerAction template) {
        return QuoteRequestChangeCustomerActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestChangeCustomerAction(Function<QuoteRequestChangeCustomerAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestChangeCustomerAction>";
            }
        };
    }
}
