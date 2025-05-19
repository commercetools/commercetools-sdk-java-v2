
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Provides descriptive information specific to the resource.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Label label = Label.associateRoleLabelBuilder()
 *             key("{key}")
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
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

    public Label copyDeep();

    /**
     * factory method to create a deep copy of Label
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Label deepCopy(@Nullable final Label template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof LabelImpl)) {
            return template.copyDeep();
        }
        LabelImpl instance = new LabelImpl();
        return instance;
    }

    /**
     * builder for associateRoleLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.AssociateRoleLabelBuilder associateRoleLabelBuilder() {
        return com.commercetools.history.models.label.AssociateRoleLabelBuilder.of();
    }

    /**
     * builder for businessUnitLabel subtype
     * @return builder
     */
    public static com.commercetools.history.models.label.BusinessUnitLabelBuilder businessUnitLabelBuilder() {
        return com.commercetools.history.models.label.BusinessUnitLabelBuilder.of();
    }

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
