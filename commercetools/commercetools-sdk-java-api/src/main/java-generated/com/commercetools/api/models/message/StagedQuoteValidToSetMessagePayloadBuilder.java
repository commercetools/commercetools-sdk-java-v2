
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteValidToSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteValidToSetMessagePayload stagedQuoteValidToSetMessagePayload = StagedQuoteValidToSetMessagePayload.builder()
 *             .validTo(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteValidToSetMessagePayloadBuilder implements Builder<StagedQuoteValidToSetMessagePayload> {

    private java.time.ZonedDateTime validTo;

    /**
     *
     */

    public StagedQuoteValidToSetMessagePayloadBuilder validTo(final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    public StagedQuoteValidToSetMessagePayload build() {
        Objects.requireNonNull(validTo, StagedQuoteValidToSetMessagePayload.class + ": validTo is missing");
        return new StagedQuoteValidToSetMessagePayloadImpl(validTo);
    }

    /**
     * builds StagedQuoteValidToSetMessagePayload without checking for non null required values
     */
    public StagedQuoteValidToSetMessagePayload buildUnchecked() {
        return new StagedQuoteValidToSetMessagePayloadImpl(validTo);
    }

    public static StagedQuoteValidToSetMessagePayloadBuilder of() {
        return new StagedQuoteValidToSetMessagePayloadBuilder();
    }

    public static StagedQuoteValidToSetMessagePayloadBuilder of(final StagedQuoteValidToSetMessagePayload template) {
        StagedQuoteValidToSetMessagePayloadBuilder builder = new StagedQuoteValidToSetMessagePayloadBuilder();
        builder.validTo = template.getValidTo();
        return builder;
    }

}
