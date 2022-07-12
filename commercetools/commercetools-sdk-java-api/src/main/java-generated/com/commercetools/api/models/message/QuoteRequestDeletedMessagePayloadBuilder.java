
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestDeletedMessagePayload quoteRequestDeletedMessagePayload = QuoteRequestDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestDeletedMessagePayloadBuilder implements Builder<QuoteRequestDeletedMessagePayload> {

    public QuoteRequestDeletedMessagePayload build() {
        return new QuoteRequestDeletedMessagePayloadImpl();
    }

    /**
     * builds QuoteRequestDeletedMessagePayload without checking for non null required values
     */
    public QuoteRequestDeletedMessagePayload buildUnchecked() {
        return new QuoteRequestDeletedMessagePayloadImpl();
    }

    public static QuoteRequestDeletedMessagePayloadBuilder of() {
        return new QuoteRequestDeletedMessagePayloadBuilder();
    }

    public static QuoteRequestDeletedMessagePayloadBuilder of(final QuoteRequestDeletedMessagePayload template) {
        QuoteRequestDeletedMessagePayloadBuilder builder = new QuoteRequestDeletedMessagePayloadBuilder();
        return builder;
    }

}
