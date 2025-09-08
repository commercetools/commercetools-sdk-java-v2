
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StandalonePriceUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceUpdate standalonePriceUpdate = StandalonePriceUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceUpdateImpl.class)
public interface StandalonePriceUpdate extends
        com.commercetools.api.models.ResourceUpdate<StandalonePriceUpdate, StandalonePriceUpdateAction, StandalonePriceUpdateBuilder> {

    /**
     *  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StandalonePriceUpdateAction> getActions();

    /**
     *  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final StandalonePriceUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param actions values to be set
     */

    public void setActions(final List<StandalonePriceUpdateAction> actions);

    /**
     * factory method
     * @return instance of StandalonePriceUpdate
     */
    public static StandalonePriceUpdate of() {
        return new StandalonePriceUpdateImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceUpdate of(final StandalonePriceUpdate template) {
        StandalonePriceUpdateImpl instance = new StandalonePriceUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public StandalonePriceUpdate copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceUpdate deepCopy(@Nullable final StandalonePriceUpdate template) {
        if (template == null) {
            return null;
        }
        StandalonePriceUpdateImpl instance = new StandalonePriceUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceUpdate
     * @return builder
     */
    public static StandalonePriceUpdateBuilder builder() {
        return StandalonePriceUpdateBuilder.of();
    }

    /**
     * create builder for StandalonePriceUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceUpdateBuilder builder(final StandalonePriceUpdate template) {
        return StandalonePriceUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceUpdate(Function<StandalonePriceUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceUpdate>";
            }
        };
    }
}
