
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestLabelBuilder
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
public class QuoteRequestLabelBuilder implements Builder<QuoteRequestLabel> {

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    /**
     *  <p>User-defined unique identifier of the Quote Request.</p>
     * @param key value to be set
     * @return Builder
     */

    public QuoteRequestLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Buyer who raised the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestLabelBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Buyer who raised the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestLabelBuilder withCustomer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Buyer who raised the Quote Request.</p>
     * @param customer value to be set
     * @return Builder
     */

    public QuoteRequestLabelBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Quote Request.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Buyer who raised the Quote Request.</p>
     * @return customer
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     * builds QuoteRequestLabel with checking for non-null required values
     * @return QuoteRequestLabel
     */
    public QuoteRequestLabel build() {
        Objects.requireNonNull(key, QuoteRequestLabel.class + ": key is missing");
        Objects.requireNonNull(customer, QuoteRequestLabel.class + ": customer is missing");
        return new QuoteRequestLabelImpl(key, customer);
    }

    /**
     * builds QuoteRequestLabel without checking for non-null required values
     * @return QuoteRequestLabel
     */
    public QuoteRequestLabel buildUnchecked() {
        return new QuoteRequestLabelImpl(key, customer);
    }

    /**
     * factory method for an instance of QuoteRequestLabelBuilder
     * @return builder
     */
    public static QuoteRequestLabelBuilder of() {
        return new QuoteRequestLabelBuilder();
    }

    /**
     * create builder for QuoteRequestLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestLabelBuilder of(final QuoteRequestLabel template) {
        QuoteRequestLabelBuilder builder = new QuoteRequestLabelBuilder();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        return builder;
    }

}
