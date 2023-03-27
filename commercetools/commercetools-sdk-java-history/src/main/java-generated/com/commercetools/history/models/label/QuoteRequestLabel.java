
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestLabel quoteRequestLabel = QuoteRequestLabel.builder()
 *             .key("{key}")
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestLabelImpl.class)
public interface QuoteRequestLabel extends Label {

    /**
     * discriminator value for QuoteRequestLabel
     */
    String QUOTE_REQUEST_LABEL = "QuoteRequestLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set customer
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     * factory method
     * @return instance of QuoteRequestLabel
     */
    public static QuoteRequestLabel of() {
        return new QuoteRequestLabelImpl();
    }

    /**
     * factory method to copy an instance of QuoteRequestLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestLabel of(final QuoteRequestLabel template) {
        QuoteRequestLabelImpl instance = new QuoteRequestLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestLabel
     * @return builder
     */
    public static QuoteRequestLabelBuilder builder() {
        return QuoteRequestLabelBuilder.of();
    }

    /**
     * create builder for QuoteRequestLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestLabelBuilder builder(final QuoteRequestLabel template) {
        return QuoteRequestLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestLabel(Function<QuoteRequestLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestLabel>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestLabel>";
            }
        };
    }
}
