
package com.commercetools.api.models.subscription;

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
 * SubscriptionUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionUpdate subscriptionUpdate = SubscriptionUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionUpdateImpl.class)
public interface SubscriptionUpdate extends
        com.commercetools.api.models.ResourceUpdate<SubscriptionUpdate, SubscriptionUpdateAction, SubscriptionUpdateBuilder> {

    /**
     *  <p>Expected version of the Subscription on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Subscription.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<SubscriptionUpdateAction> getActions();

    /**
     *  <p>Expected version of the Subscription on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Subscription.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final SubscriptionUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Subscription.</p>
     * @param actions values to be set
     */

    public void setActions(final List<SubscriptionUpdateAction> actions);

    /**
     * factory method
     * @return instance of SubscriptionUpdate
     */
    public static SubscriptionUpdate of() {
        return new SubscriptionUpdateImpl();
    }

    /**
     * factory method to create a shallow copy SubscriptionUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionUpdate of(final SubscriptionUpdate template) {
        SubscriptionUpdateImpl instance = new SubscriptionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public SubscriptionUpdate copyDeep();

    /**
     * factory method to create a deep copy of SubscriptionUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionUpdate deepCopy(@Nullable final SubscriptionUpdate template) {
        if (template == null) {
            return null;
        }
        SubscriptionUpdateImpl instance = new SubscriptionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.subscription.SubscriptionUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SubscriptionUpdate
     * @return builder
     */
    public static SubscriptionUpdateBuilder builder() {
        return SubscriptionUpdateBuilder.of();
    }

    /**
     * create builder for SubscriptionUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionUpdateBuilder builder(final SubscriptionUpdate template) {
        return SubscriptionUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionUpdate(Function<SubscriptionUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionUpdate>";
            }
        };
    }
}
