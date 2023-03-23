
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
     *  <p>Staged Quote that was created.</p>
     * @return Builder
     */

    public StagedQuoteCreatedMessagePayloadBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        this.stagedQuote = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Staged Quote that was created.</p>
     * @param stagedQuote
     * @return Builder
     */

    public StagedQuoteCreatedMessagePayloadBuilder stagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuote stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    public com.commercetools.api.models.staged_quote.StagedQuote getStagedQuote() {
        return this.stagedQuote;
    }

    public StagedQuoteCreatedMessagePayload build() {
        Objects.requireNonNull(stagedQuote, StagedQuoteCreatedMessagePayload.class + ": stagedQuote is missing");
        return new StagedQuoteCreatedMessagePayloadImpl(stagedQuote);
    }

    /**
     * builds StagedQuoteCreatedMessagePayload without checking for non null required values
     */
    public StagedQuoteCreatedMessagePayload buildUnchecked() {
        return new StagedQuoteCreatedMessagePayloadImpl(stagedQuote);
    }

    public static StagedQuoteCreatedMessagePayloadBuilder of() {
        return new StagedQuoteCreatedMessagePayloadBuilder();
    }

    public static StagedQuoteCreatedMessagePayloadBuilder of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadBuilder builder = new StagedQuoteCreatedMessagePayloadBuilder();
        builder.stagedQuote = template.getStagedQuote();
        return builder;
    }

}
