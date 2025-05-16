
package com.commercetools.api.models.store;

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
 * StoreUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreUpdate storeUpdate = StoreUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreUpdateImpl.class)
public interface StoreUpdate
        extends com.commercetools.api.models.ResourceUpdate<StoreUpdate, StoreUpdateAction, StoreUpdateBuilder> {

    /**
     *  <p>Expected version of the Store on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StoreUpdateAction> getActions();

    /**
     *  <p>Expected version of the Store on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final StoreUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Store.</p>
     * @param actions values to be set
     */

    public void setActions(final List<StoreUpdateAction> actions);

    /**
     * factory method
     * @return instance of StoreUpdate
     */
    public static StoreUpdate of() {
        return new StoreUpdateImpl();
    }

    /**
     * factory method to create a shallow copy StoreUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreUpdate of(final StoreUpdate template) {
        StoreUpdateImpl instance = new StoreUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public StoreUpdate copyDeep();

    /**
     * factory method to create a deep copy of StoreUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreUpdate deepCopy(@Nullable final StoreUpdate template) {
        if (template == null) {
            return null;
        }
        StoreUpdateImpl instance = new StoreUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreUpdate
     * @return builder
     */
    public static StoreUpdateBuilder builder() {
        return StoreUpdateBuilder.of();
    }

    /**
     * create builder for StoreUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreUpdateBuilder builder(final StoreUpdate template) {
        return StoreUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreUpdate(Function<StoreUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StoreUpdate>";
            }
        };
    }
}
