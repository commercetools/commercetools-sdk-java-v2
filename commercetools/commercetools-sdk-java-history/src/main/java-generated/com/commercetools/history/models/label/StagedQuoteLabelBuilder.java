
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteLabel stagedQuoteLabel = StagedQuoteLabel.builder()
 *             .key("{key}")
 *             .customer(customerBuilder -> customerBuilder)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteLabelBuilder implements Builder<StagedQuoteLabel> {

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    private com.commercetools.history.models.common.Reference quoteRequest;

    /**
     *
     */

    public StagedQuoteLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public StagedQuoteLabelBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StagedQuoteLabelBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *
     */

    public StagedQuoteLabelBuilder quoteRequest(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StagedQuoteLabelBuilder quoteRequest(final com.commercetools.history.models.common.Reference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    public com.commercetools.history.models.common.Reference getQuoteRequest() {
        return this.quoteRequest;
    }

    public StagedQuoteLabel build() {
        Objects.requireNonNull(key, StagedQuoteLabel.class + ": key is missing");
        Objects.requireNonNull(customer, StagedQuoteLabel.class + ": customer is missing");
        Objects.requireNonNull(quoteRequest, StagedQuoteLabel.class + ": quoteRequest is missing");
        return new StagedQuoteLabelImpl(key, customer, quoteRequest);
    }

    /**
     * builds StagedQuoteLabel without checking for non null required values
     */
    public StagedQuoteLabel buildUnchecked() {
        return new StagedQuoteLabelImpl(key, customer, quoteRequest);
    }

    public static StagedQuoteLabelBuilder of() {
        return new StagedQuoteLabelBuilder();
    }

    public static StagedQuoteLabelBuilder of(final StagedQuoteLabel template) {
        StagedQuoteLabelBuilder builder = new StagedQuoteLabelBuilder();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        builder.quoteRequest = template.getQuoteRequest();
        return builder;
    }

}
