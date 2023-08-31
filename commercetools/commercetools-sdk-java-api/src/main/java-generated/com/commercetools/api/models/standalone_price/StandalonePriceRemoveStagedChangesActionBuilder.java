
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceRemoveStagedChangesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceRemoveStagedChangesAction standalonePriceRemoveStagedChangesAction = StandalonePriceRemoveStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceRemoveStagedChangesActionBuilder
        implements Builder<StandalonePriceRemoveStagedChangesAction> {

    /**
     * builds StandalonePriceRemoveStagedChangesAction with checking for non-null required values
     * @return StandalonePriceRemoveStagedChangesAction
     */
    public StandalonePriceRemoveStagedChangesAction build() {
        return new StandalonePriceRemoveStagedChangesActionImpl();
    }

    /**
     * builds StandalonePriceRemoveStagedChangesAction without checking for non-null required values
     * @return StandalonePriceRemoveStagedChangesAction
     */
    public StandalonePriceRemoveStagedChangesAction buildUnchecked() {
        return new StandalonePriceRemoveStagedChangesActionImpl();
    }

    /**
     * factory method for an instance of StandalonePriceRemoveStagedChangesActionBuilder
     * @return builder
     */
    public static StandalonePriceRemoveStagedChangesActionBuilder of() {
        return new StandalonePriceRemoveStagedChangesActionBuilder();
    }

    /**
     * create builder for StandalonePriceRemoveStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceRemoveStagedChangesActionBuilder of(
            final StandalonePriceRemoveStagedChangesAction template) {
        StandalonePriceRemoveStagedChangesActionBuilder builder = new StandalonePriceRemoveStagedChangesActionBuilder();
        return builder;
    }

}
