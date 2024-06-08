
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
 *  <p>Generated after a successful Apply Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesAppliedMessagePayload standalonePriceStagedChangesAppliedMessagePayload = StandalonePriceStagedChangesAppliedMessagePayload.builder()
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceStagedChangesAppliedMessagePayloadImpl.class)
public interface StandalonePriceStagedChangesAppliedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceStagedChangesAppliedMessagePayload
     */
    String STANDALONE_PRICE_STAGED_CHANGES_APPLIED = "StandalonePriceStagedChangesApplied";

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @return stagedChanges
     */
    @NotNull
    @Valid
    @JsonProperty("stagedChanges")
    public StagedStandalonePrice getStagedChanges();

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @param stagedChanges value to be set
     */

    public void setStagedChanges(final StagedStandalonePrice stagedChanges);

    /**
     * factory method
     * @return instance of StandalonePriceStagedChangesAppliedMessagePayload
     */
    public static StandalonePriceStagedChangesAppliedMessagePayload of() {
        return new StandalonePriceStagedChangesAppliedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceStagedChangesAppliedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceStagedChangesAppliedMessagePayload of(
            final StandalonePriceStagedChangesAppliedMessagePayload template) {
        StandalonePriceStagedChangesAppliedMessagePayloadImpl instance = new StandalonePriceStagedChangesAppliedMessagePayloadImpl();
        instance.setStagedChanges(template.getStagedChanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceStagedChangesAppliedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceStagedChangesAppliedMessagePayload deepCopy(
            @Nullable final StandalonePriceStagedChangesAppliedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceStagedChangesAppliedMessagePayloadImpl instance = new StandalonePriceStagedChangesAppliedMessagePayloadImpl();
        instance.setStagedChanges(
            com.commercetools.api.models.standalone_price.StagedStandalonePrice.deepCopy(template.getStagedChanges()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceStagedChangesAppliedMessagePayload
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder() {
        return StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceStagedChangesAppliedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder(
            final StandalonePriceStagedChangesAppliedMessagePayload template) {
        return StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceStagedChangesAppliedMessagePayload(
            Function<StandalonePriceStagedChangesAppliedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceStagedChangesAppliedMessagePayload>";
            }
        };
    }
}
