
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceApplyStagedChangesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceApplyStagedChangesAction standalonePriceApplyStagedChangesAction = StandalonePriceApplyStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceApplyStagedChangesActionBuilder
        implements Builder<StandalonePriceApplyStagedChangesAction> {

    public StandalonePriceApplyStagedChangesAction build() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }

    /**
     * builds StandalonePriceApplyStagedChangesAction without checking for non null required values
     */
    public StandalonePriceApplyStagedChangesAction buildUnchecked() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }

    public static StandalonePriceApplyStagedChangesActionBuilder of() {
        return new StandalonePriceApplyStagedChangesActionBuilder();
    }

    public static StandalonePriceApplyStagedChangesActionBuilder of(
            final StandalonePriceApplyStagedChangesAction template) {
        StandalonePriceApplyStagedChangesActionBuilder builder = new StandalonePriceApplyStagedChangesActionBuilder();
        return builder;
    }

}
