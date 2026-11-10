
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = StagedQuoteCreatedMessagePayload.builder()
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteCreatedMessagePayloadBuilder implements Builder<StagedQuoteCreatedMessagePayload> {

    private com.commercetools.api.models.staged_quote.StagedQuote stagedQuote;

    /**
     *  <p><span>Staged Quote</span> that was created.</p>
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public StagedQuoteCreatedMessagePayloadBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        this.stagedQuote = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p><span>Staged Quote</span> that was created.</p>
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public StagedQuoteCreatedMessagePayloadBuilder withStagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuote> builder) {
        this.stagedQuote = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of());
        return this;
    }

    /**
     *  <p><span>Staged Quote</span> that was created.</p>
     * @param stagedQuote value to be set
     * @return Builder
     */

    public StagedQuoteCreatedMessagePayloadBuilder stagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuote stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     *  <p><span>Staged Quote</span> that was created.</p>
     * @return stagedQuote
     */

    public com.commercetools.api.models.staged_quote.StagedQuote getStagedQuote() {
        return this.stagedQuote;
    }

    /**
     * builds StagedQuoteCreatedMessagePayload with checking for non-null required values
     * @return StagedQuoteCreatedMessagePayload
     */
    public StagedQuoteCreatedMessagePayload build() {
        Objects.requireNonNull(stagedQuote, StagedQuoteCreatedMessagePayload.class + ": stagedQuote is missing");
        return new StagedQuoteCreatedMessagePayloadImpl(stagedQuote);
    }

    /**
     * builds StagedQuoteCreatedMessagePayload without checking for non-null required values
     * @return StagedQuoteCreatedMessagePayload
     */
    public StagedQuoteCreatedMessagePayload buildUnchecked() {
        return new StagedQuoteCreatedMessagePayloadImpl(stagedQuote);
    }

    /**
     * factory method for an instance of StagedQuoteCreatedMessagePayloadBuilder
     * @return builder
     */
    public static StagedQuoteCreatedMessagePayloadBuilder of() {
        return new StagedQuoteCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for StagedQuoteCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteCreatedMessagePayloadBuilder of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadBuilder builder = new StagedQuoteCreatedMessagePayloadBuilder();
        builder.stagedQuote = template.getStagedQuote();
        return builder;
    }

}
