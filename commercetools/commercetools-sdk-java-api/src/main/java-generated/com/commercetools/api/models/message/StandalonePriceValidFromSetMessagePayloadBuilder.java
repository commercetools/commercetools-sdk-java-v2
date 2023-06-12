
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValidFromSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromSetMessagePayload standalonePriceValidFromSetMessagePayload = StandalonePriceValidFromSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidFromSetMessagePayloadBuilder
        implements Builder<StandalonePriceValidFromSetMessagePayload> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime previousValidFrom;

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromSetMessagePayloadBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @param previousValidFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromSetMessagePayloadBuilder previousValidFrom(
            @Nullable final java.time.ZonedDateTime previousValidFrom) {
        this.previousValidFrom = previousValidFrom;
        return this;
    }

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @return previousValidFrom
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidFrom() {
        return this.previousValidFrom;
    }

    /**
     * builds StandalonePriceValidFromSetMessagePayload with checking for non-null required values
     * @return StandalonePriceValidFromSetMessagePayload
     */
    public StandalonePriceValidFromSetMessagePayload build() {
        return new StandalonePriceValidFromSetMessagePayloadImpl(validFrom, previousValidFrom);
    }

    /**
     * builds StandalonePriceValidFromSetMessagePayload without checking for non-null required values
     * @return StandalonePriceValidFromSetMessagePayload
     */
    public StandalonePriceValidFromSetMessagePayload buildUnchecked() {
        return new StandalonePriceValidFromSetMessagePayloadImpl(validFrom, previousValidFrom);
    }

    /**
     * factory method for an instance of StandalonePriceValidFromSetMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceValidFromSetMessagePayloadBuilder of() {
        return new StandalonePriceValidFromSetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceValidFromSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromSetMessagePayloadBuilder of(
            final StandalonePriceValidFromSetMessagePayload template) {
        StandalonePriceValidFromSetMessagePayloadBuilder builder = new StandalonePriceValidFromSetMessagePayloadBuilder();
        builder.validFrom = template.getValidFrom();
        builder.previousValidFrom = template.getPreviousValidFrom();
        return builder;
    }

}
