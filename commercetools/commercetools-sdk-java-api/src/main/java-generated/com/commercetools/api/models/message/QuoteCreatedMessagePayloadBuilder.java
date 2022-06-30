
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteCreatedMessagePayload quoteCreatedMessagePayload = QuoteCreatedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteCreatedMessagePayloadBuilder implements Builder<QuoteCreatedMessagePayload> {

    public QuoteCreatedMessagePayload build() {
        return new QuoteCreatedMessagePayloadImpl();
    }

    /**
     * builds QuoteCreatedMessagePayload without checking for non null required values
     */
    public QuoteCreatedMessagePayload buildUnchecked() {
        return new QuoteCreatedMessagePayloadImpl();
    }

    public static QuoteCreatedMessagePayloadBuilder of() {
        return new QuoteCreatedMessagePayloadBuilder();
    }

    public static QuoteCreatedMessagePayloadBuilder of(final QuoteCreatedMessagePayload template) {
        QuoteCreatedMessagePayloadBuilder builder = new QuoteCreatedMessagePayloadBuilder();
        return builder;
    }

}
