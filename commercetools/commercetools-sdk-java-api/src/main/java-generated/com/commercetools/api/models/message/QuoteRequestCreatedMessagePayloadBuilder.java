
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCreatedMessagePayload quoteRequestCreatedMessagePayload = QuoteRequestCreatedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestCreatedMessagePayloadBuilder implements Builder<QuoteRequestCreatedMessagePayload> {

    public QuoteRequestCreatedMessagePayload build() {
        return new QuoteRequestCreatedMessagePayloadImpl();
    }

    /**
     * builds QuoteRequestCreatedMessagePayload without checking for non null required values
     */
    public QuoteRequestCreatedMessagePayload buildUnchecked() {
        return new QuoteRequestCreatedMessagePayloadImpl();
    }

    public static QuoteRequestCreatedMessagePayloadBuilder of() {
        return new QuoteRequestCreatedMessagePayloadBuilder();
    }

    public static QuoteRequestCreatedMessagePayloadBuilder of(final QuoteRequestCreatedMessagePayload template) {
        QuoteRequestCreatedMessagePayloadBuilder builder = new QuoteRequestCreatedMessagePayloadBuilder();
        return builder;
    }

}
