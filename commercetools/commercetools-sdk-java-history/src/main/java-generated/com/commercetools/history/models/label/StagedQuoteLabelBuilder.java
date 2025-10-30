
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
     *  <p>User-defined unique identifier of the Staged Quote.</p>
     * @param key value to be set
     * @return Builder
     */

    public StagedQuoteLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param customer value to be set
     * @return Builder
     */

    public StagedQuoteLabelBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public StagedQuoteLabelBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param quoteRequest value to be set
     * @return Builder
     */

    public StagedQuoteLabelBuilder quoteRequest(final com.commercetools.history.models.common.Reference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public StagedQuoteLabelBuilder quoteRequest(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.quoteRequest = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Staged Quote.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @return customer
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @return quoteRequest
     */

    public com.commercetools.history.models.common.Reference getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     * builds StagedQuoteLabel with checking for non-null required values
     * @return StagedQuoteLabel
     */
    public StagedQuoteLabel build() {
        Objects.requireNonNull(key, StagedQuoteLabel.class + ": key is missing");
        Objects.requireNonNull(customer, StagedQuoteLabel.class + ": customer is missing");
        Objects.requireNonNull(quoteRequest, StagedQuoteLabel.class + ": quoteRequest is missing");
        return new StagedQuoteLabelImpl(key, customer, quoteRequest);
    }

    /**
     * builds StagedQuoteLabel without checking for non-null required values
     * @return StagedQuoteLabel
     */
    public StagedQuoteLabel buildUnchecked() {
        return new StagedQuoteLabelImpl(key, customer, quoteRequest);
    }

    /**
     * factory method for an instance of StagedQuoteLabelBuilder
     * @return builder
     */
    public static StagedQuoteLabelBuilder of() {
        return new StagedQuoteLabelBuilder();
    }

    /**
     * create builder for StagedQuoteLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteLabelBuilder of(final StagedQuoteLabel template) {
        StagedQuoteLabelBuilder builder = new StagedQuoteLabelBuilder();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        builder.quoteRequest = template.getQuoteRequest();
        return builder;
    }

}
