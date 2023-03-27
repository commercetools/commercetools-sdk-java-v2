
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Provides descriptive information specific to the resource.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Label label = Label.customObjectLabelBuilder()
 *             key("{key}")
 *             container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.CustomObjectLabelImpl.class, name = CustomObjectLabel.CUSTOM_OBJECT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.CustomerLabelImpl.class, name = CustomerLabel.CUSTOMER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.LocalizedLabelImpl.class, name = LocalizedLabel.LOCALIZED_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.OrderLabelImpl.class, name = OrderLabel.ORDER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.PaymentLabelImpl.class, name = PaymentLabel.PAYMENT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.ProductLabelImpl.class, name = ProductLabel.PRODUCT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.QuoteLabelImpl.class, name = QuoteLabel.QUOTE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.QuoteRequestLabelImpl.class, name = QuoteRequestLabel.QUOTE_REQUEST_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.ReviewLabelImpl.class, name = ReviewLabel.REVIEW_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.StagedQuoteLabelImpl.class, name = StagedQuoteLabel.STAGED_QUOTE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.StringLabelImpl.class, name = StringLabel.STRING_LABEL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = LabelImpl.class, visible = true)
@JsonDeserialize(as = LabelImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Label {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * builder for customObjectLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.CustomObjectLabelBuilder customObjectLabelBuilder() {
        return com.commercetools.history.models.label.CustomObjectLabelBuilder.of();
    }

    /**
     * builder for customerLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.CustomerLabelBuilder customerLabelBuilder() {
        return com.commercetools.history.models.label.CustomerLabelBuilder.of();
    }

    /**
     * builder for localizedLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.LocalizedLabelBuilder localizedLabelBuilder() {
        return com.commercetools.history.models.label.LocalizedLabelBuilder.of();
    }

    /**
     * builder for orderLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.OrderLabelBuilder orderLabelBuilder() {
        return com.commercetools.history.models.label.OrderLabelBuilder.of();
    }

    /**
     * builder for paymentLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.PaymentLabelBuilder paymentLabelBuilder() {
        return com.commercetools.history.models.label.PaymentLabelBuilder.of();
    }

    /**
     * builder for productLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.ProductLabelBuilder productLabelBuilder() {
        return com.commercetools.history.models.label.ProductLabelBuilder.of();
    }

    /**
     * builder for quoteLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.QuoteLabelBuilder quoteLabelBuilder() {
        return com.commercetools.history.models.label.QuoteLabelBuilder.of();
    }

    /**
     * builder for quoteRequestLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.QuoteRequestLabelBuilder quoteRequestLabelBuilder() {
        return com.commercetools.history.models.label.QuoteRequestLabelBuilder.of();
    }

    /**
     * builder for reviewLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.ReviewLabelBuilder reviewLabelBuilder() {
        return com.commercetools.history.models.label.ReviewLabelBuilder.of();
    }

    /**
     * builder for stagedQuoteLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.StagedQuoteLabelBuilder stagedQuoteLabelBuilder() {
        return com.commercetools.history.models.label.StagedQuoteLabelBuilder.of();
    }

    /**
     * builder for stringLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.StringLabelBuilder stringLabelBuilder() {
        return com.commercetools.history.models.label.StringLabelBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLabel(Function<Label, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Label> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Label>() {
            @Override
            public String toString() {
                return "TypeReference<Label>";
            }
        };
    }
}
