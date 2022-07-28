
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

    String QUOTE_REQUEST_LABEL = "QuoteRequestLabel";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    public void setKey(final String key);

    public void setCustomer(final Reference customer);

    public static QuoteRequestLabel of() {
        return new QuoteRequestLabelImpl();
    }

    public static QuoteRequestLabel of(final QuoteRequestLabel template) {
        QuoteRequestLabelImpl instance = new QuoteRequestLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static QuoteRequestLabelBuilder builder() {
        return QuoteRequestLabelBuilder.of();
    }

    public static QuoteRequestLabelBuilder builder(final QuoteRequestLabel template) {
        return QuoteRequestLabelBuilder.of(template);
    }

    default <T> T withQuoteRequestLabel(Function<QuoteRequestLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestLabel>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestLabel>";
            }
        };
    }
}
