
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    /**
     * discriminator value for StandalonePriceApplyStagedChangesAction
     */
    String APPLY_STAGED_CHANGES = "applyStagedChanges";

    /**
     * factory method
     * @return instance of StandalonePriceApplyStagedChangesAction
     */
    public static StandalonePriceApplyStagedChangesAction of() {
        return new StandalonePriceApplyStagedChangesActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceApplyStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceApplyStagedChangesAction of(final StandalonePriceApplyStagedChangesAction template) {
        StandalonePriceApplyStagedChangesActionImpl instance = new StandalonePriceApplyStagedChangesActionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceApplyStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceApplyStagedChangesAction deepCopy(
            @Nullable final StandalonePriceApplyStagedChangesAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceApplyStagedChangesActionImpl instance = new StandalonePriceApplyStagedChangesActionImpl();
        return instance;
    }

    /**
     * builder factory method for StandalonePriceApplyStagedChangesAction
     * @return builder
     */
    public static StandalonePriceApplyStagedChangesActionBuilder builder() {
        return StandalonePriceApplyStagedChangesActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceApplyStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceApplyStagedChangesActionBuilder builder(
            final StandalonePriceApplyStagedChangesAction template) {
        return StandalonePriceApplyStagedChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceApplyStagedChangesAction(
            Function<StandalonePriceApplyStagedChangesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceApplyStagedChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceApplyStagedChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceApplyStagedChangesAction>";
            }
        };
    }
}
