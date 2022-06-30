
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDeletedMessagePayload stagedQuoteDeletedMessagePayload = StagedQuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteDeletedMessagePayloadBuilder implements Builder<StagedQuoteDeletedMessagePayload> {

    public StagedQuoteDeletedMessagePayload build() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }

    /**
     * builds StagedQuoteDeletedMessagePayload without checking for non null required values
     */
    public StagedQuoteDeletedMessagePayload buildUnchecked() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }

    public static StagedQuoteDeletedMessagePayloadBuilder of() {
        return new StagedQuoteDeletedMessagePayloadBuilder();
    }

    public static StagedQuoteDeletedMessagePayloadBuilder of(final StagedQuoteDeletedMessagePayload template) {
        StagedQuoteDeletedMessagePayloadBuilder builder = new StagedQuoteDeletedMessagePayloadBuilder();
        return builder;
    }

}
