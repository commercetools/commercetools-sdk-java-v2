
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValidFromAndUntilSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromAndUntilSetMessagePayload standalonePriceValidFromAndUntilSetMessagePayload = StandalonePriceValidFromAndUntilSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidFromAndUntilSetMessagePayloadBuilder
        implements Builder<StandalonePriceValidFromAndUntilSetMessagePayload> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime previousValidFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.time.ZonedDateTime previousValidUntil;

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessagePayloadBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param previousValidFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessagePayloadBuilder previousValidFrom(
            @Nullable final java.time.ZonedDateTime previousValidFrom) {
        this.previousValidFrom = previousValidFrom;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessagePayloadBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param previousValidUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessagePayloadBuilder previousValidUntil(
            @Nullable final java.time.ZonedDateTime previousValidUntil) {
        this.previousValidUntil = previousValidUntil;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return previousValidFrom
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidFrom() {
        return this.previousValidFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return previousValidUntil
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidUntil() {
        return this.previousValidUntil;
    }

    /**
     * builds StandalonePriceValidFromAndUntilSetMessagePayload with checking for non-null required values
     * @return StandalonePriceValidFromAndUntilSetMessagePayload
     */
    public StandalonePriceValidFromAndUntilSetMessagePayload build() {
        return new StandalonePriceValidFromAndUntilSetMessagePayloadImpl(validFrom, previousValidFrom, validUntil,
            previousValidUntil);
    }

    /**
     * builds StandalonePriceValidFromAndUntilSetMessagePayload without checking for non-null required values
     * @return StandalonePriceValidFromAndUntilSetMessagePayload
     */
    public StandalonePriceValidFromAndUntilSetMessagePayload buildUnchecked() {
        return new StandalonePriceValidFromAndUntilSetMessagePayloadImpl(validFrom, previousValidFrom, validUntil,
            previousValidUntil);
    }

    /**
     * factory method for an instance of StandalonePriceValidFromAndUntilSetMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayloadBuilder of() {
        return new StandalonePriceValidFromAndUntilSetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceValidFromAndUntilSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayloadBuilder of(
            final StandalonePriceValidFromAndUntilSetMessagePayload template) {
        StandalonePriceValidFromAndUntilSetMessagePayloadBuilder builder = new StandalonePriceValidFromAndUntilSetMessagePayloadBuilder();
        builder.validFrom = template.getValidFrom();
        builder.previousValidFrom = template.getPreviousValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.previousValidUntil = template.getPreviousValidUntil();
        return builder;
    }

}
