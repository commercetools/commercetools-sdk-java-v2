
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
     *
     */

    public QuoteRequestLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public QuoteRequestLabelBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public QuoteRequestLabelBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    public QuoteRequestLabel build() {
        Objects.requireNonNull(key, QuoteRequestLabel.class + ": key is missing");
        Objects.requireNonNull(customer, QuoteRequestLabel.class + ": customer is missing");
        return new QuoteRequestLabelImpl(key, customer);
    }

    /**
     * builds QuoteRequestLabel without checking for non null required values
     */
    public QuoteRequestLabel buildUnchecked() {
        return new QuoteRequestLabelImpl(key, customer);
    }

    public static QuoteRequestLabelBuilder of() {
        return new QuoteRequestLabelBuilder();
    }

    public static QuoteRequestLabelBuilder of(final QuoteRequestLabel template) {
        QuoteRequestLabelBuilder builder = new QuoteRequestLabelBuilder();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        return builder;
    }

}
