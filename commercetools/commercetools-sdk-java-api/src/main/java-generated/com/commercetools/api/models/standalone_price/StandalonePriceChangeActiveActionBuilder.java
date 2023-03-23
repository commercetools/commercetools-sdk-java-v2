
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceChangeActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = StandalonePriceChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeActiveActionBuilder implements Builder<StandalonePriceChangeActiveAction> {

    private Boolean active;

    /**
     *  <p>New value to set for the <code>active</code> field of the StandalonePrice.</p>
     * @param active
     * @return Builder
     */

    public StandalonePriceChangeActiveActionBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getActive() {
        return this.active;
    }

    public StandalonePriceChangeActiveAction build() {
        Objects.requireNonNull(active, StandalonePriceChangeActiveAction.class + ": active is missing");
        return new StandalonePriceChangeActiveActionImpl(active);
    }

    /**
     * builds StandalonePriceChangeActiveAction without checking for non null required values
     */
    public StandalonePriceChangeActiveAction buildUnchecked() {
        return new StandalonePriceChangeActiveActionImpl(active);
    }

    public static StandalonePriceChangeActiveActionBuilder of() {
        return new StandalonePriceChangeActiveActionBuilder();
    }

    public static StandalonePriceChangeActiveActionBuilder of(final StandalonePriceChangeActiveAction template) {
        StandalonePriceChangeActiveActionBuilder builder = new StandalonePriceChangeActiveActionBuilder();
        builder.active = template.getActive();
        return builder;
    }

}
