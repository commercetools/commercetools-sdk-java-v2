
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValidUntilSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidUntilSetMessagePayload standalonePriceValidUntilSetMessagePayload = StandalonePriceValidUntilSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidUntilSetMessagePayloadBuilder
        implements Builder<StandalonePriceValidUntilSetMessagePayload> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.time.ZonedDateTime previousValidUntil;

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidUntilSetMessagePayloadBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param previousValidUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidUntilSetMessagePayloadBuilder previousValidUntil(
            @Nullable final java.time.ZonedDateTime previousValidUntil) {
        this.previousValidUntil = previousValidUntil;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return previousValidUntil
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidUntil() {
        return this.previousValidUntil;
    }

    /**
     * builds StandalonePriceValidUntilSetMessagePayload with checking for non-null required values
     * @return StandalonePriceValidUntilSetMessagePayload
     */
    public StandalonePriceValidUntilSetMessagePayload build() {
        return new StandalonePriceValidUntilSetMessagePayloadImpl(validUntil, previousValidUntil);
    }

    /**
     * builds StandalonePriceValidUntilSetMessagePayload without checking for non-null required values
     * @return StandalonePriceValidUntilSetMessagePayload
     */
    public StandalonePriceValidUntilSetMessagePayload buildUnchecked() {
        return new StandalonePriceValidUntilSetMessagePayloadImpl(validUntil, previousValidUntil);
    }

    /**
     * factory method for an instance of StandalonePriceValidUntilSetMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessagePayloadBuilder of() {
        return new StandalonePriceValidUntilSetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceValidUntilSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessagePayloadBuilder of(
            final StandalonePriceValidUntilSetMessagePayload template) {
        StandalonePriceValidUntilSetMessagePayloadBuilder builder = new StandalonePriceValidUntilSetMessagePayloadBuilder();
        builder.validUntil = template.getValidUntil();
        builder.previousValidUntil = template.getPreviousValidUntil();
        return builder;
    }

}
