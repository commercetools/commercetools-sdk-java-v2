
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LabelBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LabelBuilder {

    public com.commercetools.history.models.label.CustomObjectLabelBuilder customObjectLabelBuilder() {
        return com.commercetools.history.models.label.CustomObjectLabelBuilder.of();
    }

    public com.commercetools.history.models.label.CustomerLabelBuilder customerLabelBuilder() {
        return com.commercetools.history.models.label.CustomerLabelBuilder.of();
    }

    public com.commercetools.history.models.label.LocalizedLabelBuilder localizedLabelBuilder() {
        return com.commercetools.history.models.label.LocalizedLabelBuilder.of();
    }

    public com.commercetools.history.models.label.OrderLabelBuilder orderLabelBuilder() {
        return com.commercetools.history.models.label.OrderLabelBuilder.of();
    }

    public com.commercetools.history.models.label.PaymentLabelBuilder paymentLabelBuilder() {
        return com.commercetools.history.models.label.PaymentLabelBuilder.of();
    }

    public com.commercetools.history.models.label.ProductLabelBuilder productLabelBuilder() {
        return com.commercetools.history.models.label.ProductLabelBuilder.of();
    }

    public com.commercetools.history.models.label.QuoteLabelBuilder quoteLabelBuilder() {
        return com.commercetools.history.models.label.QuoteLabelBuilder.of();
    }

    public com.commercetools.history.models.label.QuoteRequestLabelBuilder quoteRequestLabelBuilder() {
        return com.commercetools.history.models.label.QuoteRequestLabelBuilder.of();
    }

    public com.commercetools.history.models.label.ReviewLabelBuilder reviewLabelBuilder() {
        return com.commercetools.history.models.label.ReviewLabelBuilder.of();
    }

    public com.commercetools.history.models.label.StagedQuoteLabelBuilder stagedQuoteLabelBuilder() {
        return com.commercetools.history.models.label.StagedQuoteLabelBuilder.of();
    }

    public com.commercetools.history.models.label.StringLabelBuilder stringLabelBuilder() {
        return com.commercetools.history.models.label.StringLabelBuilder.of();
    }

    /**
     * factory method for an instance of LabelBuilder
     * @return builder
     */
    public static LabelBuilder of() {
        return new LabelBuilder();
    }
}
