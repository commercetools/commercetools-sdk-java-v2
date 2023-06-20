
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidUntilAction standalonePriceSetValidUntilAction = StandalonePriceSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidUntilActionBuilder implements Builder<StandalonePriceSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
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
     * builds StandalonePriceSetValidUntilAction with checking for non-null required values
     * @return StandalonePriceSetValidUntilAction
     */
    public StandalonePriceSetValidUntilAction build() {
        return new StandalonePriceSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds StandalonePriceSetValidUntilAction without checking for non-null required values
     * @return StandalonePriceSetValidUntilAction
     */
    public StandalonePriceSetValidUntilAction buildUnchecked() {
        return new StandalonePriceSetValidUntilActionImpl(validUntil);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidUntilActionBuilder
     * @return builder
     */
    public static StandalonePriceSetValidUntilActionBuilder of() {
        return new StandalonePriceSetValidUntilActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidUntilActionBuilder of(final StandalonePriceSetValidUntilAction template) {
        StandalonePriceSetValidUntilActionBuilder builder = new StandalonePriceSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
