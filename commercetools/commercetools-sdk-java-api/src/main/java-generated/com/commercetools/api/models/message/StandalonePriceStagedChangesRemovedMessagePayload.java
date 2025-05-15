
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.standalone_price.StagedStandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesRemovedMessagePayload standalonePriceStagedChangesRemovedMessagePayload = StandalonePriceStagedChangesRemovedMessagePayload.builder()
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceStagedChangesRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceStagedChangesRemovedMessagePayloadImpl.class)
public interface StandalonePriceStagedChangesRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceStagedChangesRemovedMessagePayload
     */
    String STANDALONE_PRICE_STAGED_CHANGES_REMOVED = "StandalonePriceStagedChangesRemoved";

    /**
     *  <p>Removed changes of the StandalonePrice after the Remove Staged Changes update action.</p>
     * @return stagedChanges
     */
    @NotNull
    @Valid
    @JsonProperty("stagedChanges")
    public StagedStandalonePrice getStagedChanges();

    /**
     *  <p>Removed changes of the StandalonePrice after the Remove Staged Changes update action.</p>
     * @param stagedChanges value to be set
     */

    public void setStagedChanges(final StagedStandalonePrice stagedChanges);

    /**
     * factory method
     * @return instance of StandalonePriceStagedChangesRemovedMessagePayload
     */
    public static StandalonePriceStagedChangesRemovedMessagePayload of() {
        return new StandalonePriceStagedChangesRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceStagedChangesRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceStagedChangesRemovedMessagePayload of(
            final StandalonePriceStagedChangesRemovedMessagePayload template) {
        StandalonePriceStagedChangesRemovedMessagePayloadImpl instance = new StandalonePriceStagedChangesRemovedMessagePayloadImpl();
        instance.setStagedChanges(template.getStagedChanges());
        return instance;
    }

    public StandalonePriceStagedChangesRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceStagedChangesRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceStagedChangesRemovedMessagePayload deepCopy(
            @Nullable final StandalonePriceStagedChangesRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceStagedChangesRemovedMessagePayloadImpl instance = new StandalonePriceStagedChangesRemovedMessagePayloadImpl();
        instance.setStagedChanges(
            com.commercetools.api.models.standalone_price.StagedStandalonePrice.deepCopy(template.getStagedChanges()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceStagedChangesRemovedMessagePayload
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessagePayloadBuilder builder() {
        return StandalonePriceStagedChangesRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceStagedChangesRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessagePayloadBuilder builder(
            final StandalonePriceStagedChangesRemovedMessagePayload template) {
        return StandalonePriceStagedChangesRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceStagedChangesRemovedMessagePayload(
            Function<StandalonePriceStagedChangesRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceStagedChangesRemovedMessagePayload>";
            }
        };
    }
}
