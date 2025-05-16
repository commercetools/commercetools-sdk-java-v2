
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes all staged changes from the StandalonePrice. Removing staged changes successfully produces the StandalonePriceStagedChangesRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceRemoveStagedChangesAction standalonePriceRemoveStagedChangesAction = StandalonePriceRemoveStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeStagedChanges")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceRemoveStagedChangesActionImpl.class)
public interface StandalonePriceRemoveStagedChangesAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceRemoveStagedChangesAction
     */
    String REMOVE_STAGED_CHANGES = "removeStagedChanges";

    /**
     * factory method
     * @return instance of StandalonePriceRemoveStagedChangesAction
     */
    public static StandalonePriceRemoveStagedChangesAction of() {
        return new StandalonePriceRemoveStagedChangesActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceRemoveStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceRemoveStagedChangesAction of(final StandalonePriceRemoveStagedChangesAction template) {
        StandalonePriceRemoveStagedChangesActionImpl instance = new StandalonePriceRemoveStagedChangesActionImpl();
        return instance;
    }

    public StandalonePriceRemoveStagedChangesAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceRemoveStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceRemoveStagedChangesAction deepCopy(
            @Nullable final StandalonePriceRemoveStagedChangesAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceRemoveStagedChangesActionImpl instance = new StandalonePriceRemoveStagedChangesActionImpl();
        return instance;
    }

    /**
     * builder factory method for StandalonePriceRemoveStagedChangesAction
     * @return builder
     */
    public static StandalonePriceRemoveStagedChangesActionBuilder builder() {
        return StandalonePriceRemoveStagedChangesActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceRemoveStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceRemoveStagedChangesActionBuilder builder(
            final StandalonePriceRemoveStagedChangesAction template) {
        return StandalonePriceRemoveStagedChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceRemoveStagedChangesAction(
            Function<StandalonePriceRemoveStagedChangesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceRemoveStagedChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceRemoveStagedChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceRemoveStagedChangesAction>";
            }
        };
    }
}
