
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Applies all staged changes to the StandalonePrice by overwriting all current values with the values in the StagedStandalonePrice. After successfully applied, the StagedStandalonePrice will be removed from the StandalonePrice. An <code>applyStagedChanges</code> update action on a StandalonePrice that does not contain any staged changes will return a <code>400 Bad Request</code> error. Applying staged changes successfully will produce the StandalonePriceStagedChangesApplied Message.</p>
 *
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
@JsonDeserialize(as = StandalonePriceApplyStagedChangesActionImpl.class)
public interface StandalonePriceApplyStagedChangesAction extends StandalonePriceUpdateAction {

    String APPLY_STAGED_CHANGES = "applyStagedChanges";

    public static StandalonePriceApplyStagedChangesAction of() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }

    public static StandalonePriceApplyStagedChangesAction of(final StandalonePriceApplyStagedChangesAction template) {
        StandalonePriceApplyStagedChangesActionImpl instance = new StandalonePriceApplyStagedChangesActionImpl();
        return instance;
    }

    public static StandalonePriceApplyStagedChangesActionBuilder builder() {
        return StandalonePriceApplyStagedChangesActionBuilder.of();
    }

    public static StandalonePriceApplyStagedChangesActionBuilder builder(
            final StandalonePriceApplyStagedChangesAction template) {
        return StandalonePriceApplyStagedChangesActionBuilder.of(template);
    }

    default <T> T withStandalonePriceApplyStagedChangesAction(
            Function<StandalonePriceApplyStagedChangesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceApplyStagedChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceApplyStagedChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceApplyStagedChangesAction>";
            }
        };
    }
}
