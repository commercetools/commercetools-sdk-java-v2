package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
import com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceApplyStagedChangesActionBuilder implements Builder<StandalonePriceApplyStagedChangesAction> {




    /**
     * builds StandalonePriceApplyStagedChangesAction with checking for non-null required values
     * @return StandalonePriceApplyStagedChangesAction
     */
    public StandalonePriceApplyStagedChangesAction build() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }
    
    /**
     * builds StandalonePriceApplyStagedChangesAction without checking for non-null required values
     * @return StandalonePriceApplyStagedChangesAction
     */
    public StandalonePriceApplyStagedChangesAction buildUnchecked() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }

    /**
     * factory method for an instance of StandalonePriceApplyStagedChangesActionBuilder
     * @return builder 
     */
    public static StandalonePriceApplyStagedChangesActionBuilder of() {
        return new StandalonePriceApplyStagedChangesActionBuilder();
    }

    /**
     * create builder for StandalonePriceApplyStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceApplyStagedChangesActionBuilder of(final StandalonePriceApplyStagedChangesAction template) {
        StandalonePriceApplyStagedChangesActionBuilder builder = new StandalonePriceApplyStagedChangesActionBuilder();
        return builder;
    }

}
