
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.standalone_price.StagedStandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String STANDALONE_PRICE_STAGED_CHANGES_APPLIED = "StandalonePriceStagedChangesApplied";

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("stagedChanges")
    public StagedStandalonePrice getStagedChanges();

    public void setStagedChanges(final StagedStandalonePrice stagedChanges);

    public static StandalonePriceStagedChangesAppliedMessagePayload of() {
        return new StandalonePriceStagedChangesAppliedMessagePayloadImpl();
    }

    public static StandalonePriceStagedChangesAppliedMessagePayload of(
            final StandalonePriceStagedChangesAppliedMessagePayload template) {
        StandalonePriceStagedChangesAppliedMessagePayloadImpl instance = new StandalonePriceStagedChangesAppliedMessagePayloadImpl();
        instance.setStagedChanges(template.getStagedChanges());
        return instance;
    }

    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder() {
        return StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }

    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder(
            final StandalonePriceStagedChangesAppliedMessagePayload template) {
        return StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceStagedChangesAppliedMessagePayload(
            Function<StandalonePriceStagedChangesAppliedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesAppliedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceStagedChangesAppliedMessagePayload>";
            }
        };
    }
}
