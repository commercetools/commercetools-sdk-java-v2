
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAction standalonePriceSetValidFromAction = StandalonePriceSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidFromActionBuilder implements Builder<StandalonePriceSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
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
     * builds StandalonePriceSetValidFromAction with checking for non-null required values
     * @return StandalonePriceSetValidFromAction
     */
    public StandalonePriceSetValidFromAction build() {
        return new StandalonePriceSetValidFromActionImpl(validFrom);
    }

    /**
     * builds StandalonePriceSetValidFromAction without checking for non-null required values
     * @return StandalonePriceSetValidFromAction
     */
    public StandalonePriceSetValidFromAction buildUnchecked() {
        return new StandalonePriceSetValidFromActionImpl(validFrom);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidFromActionBuilder
     * @return builder
     */
    public static StandalonePriceSetValidFromActionBuilder of() {
        return new StandalonePriceSetValidFromActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromActionBuilder of(final StandalonePriceSetValidFromAction template) {
        StandalonePriceSetValidFromActionBuilder builder = new StandalonePriceSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
