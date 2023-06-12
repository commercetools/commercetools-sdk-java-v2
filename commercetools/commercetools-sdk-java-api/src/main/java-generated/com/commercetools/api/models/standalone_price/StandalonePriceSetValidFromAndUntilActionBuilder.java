
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidFromAndUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAndUntilAction standalonePriceSetValidFromAndUntilAction = StandalonePriceSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidFromAndUntilActionBuilder
        implements Builder<StandalonePriceSetValidFromAndUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilActionBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds StandalonePriceSetValidFromAndUntilAction with checking for non-null required values
     * @return StandalonePriceSetValidFromAndUntilAction
     */
    public StandalonePriceSetValidFromAndUntilAction build() {
        return new StandalonePriceSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * builds StandalonePriceSetValidFromAndUntilAction without checking for non-null required values
     * @return StandalonePriceSetValidFromAndUntilAction
     */
    public StandalonePriceSetValidFromAndUntilAction buildUnchecked() {
        return new StandalonePriceSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidFromAndUntilActionBuilder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilActionBuilder of() {
        return new StandalonePriceSetValidFromAndUntilActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilActionBuilder of(
            final StandalonePriceSetValidFromAndUntilAction template) {
        StandalonePriceSetValidFromAndUntilActionBuilder builder = new StandalonePriceSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
