
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = StagedQuoteCreatedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteCreatedMessagePayloadBuilder implements Builder<StagedQuoteCreatedMessagePayload> {

    public StagedQuoteCreatedMessagePayload build() {
        return new StagedQuoteCreatedMessagePayloadImpl();
    }

    /**
     * builds StagedQuoteCreatedMessagePayload without checking for non null required values
     */
    public StagedQuoteCreatedMessagePayload buildUnchecked() {
        return new StagedQuoteCreatedMessagePayloadImpl();
    }

    public static StagedQuoteCreatedMessagePayloadBuilder of() {
        return new StagedQuoteCreatedMessagePayloadBuilder();
    }

    public static StagedQuoteCreatedMessagePayloadBuilder of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadBuilder builder = new StagedQuoteCreatedMessagePayloadBuilder();
        return builder;
    }

}
