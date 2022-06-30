
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDeletedMessagePayload quoteDeletedMessagePayload = QuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteDeletedMessagePayloadBuilder implements Builder<QuoteDeletedMessagePayload> {

    public QuoteDeletedMessagePayload build() {
        return new QuoteDeletedMessagePayloadImpl();
    }

    /**
     * builds QuoteDeletedMessagePayload without checking for non null required values
     */
    public QuoteDeletedMessagePayload buildUnchecked() {
        return new QuoteDeletedMessagePayloadImpl();
    }

    public static QuoteDeletedMessagePayloadBuilder of() {
        return new QuoteDeletedMessagePayloadBuilder();
    }

    public static QuoteDeletedMessagePayloadBuilder of(final QuoteDeletedMessagePayload template) {
        QuoteDeletedMessagePayloadBuilder builder = new QuoteDeletedMessagePayloadBuilder();
        return builder;
    }

}
