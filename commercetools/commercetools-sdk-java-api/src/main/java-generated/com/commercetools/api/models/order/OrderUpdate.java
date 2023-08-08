
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdate orderUpdate = OrderUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderUpdateImpl.class)
public interface OrderUpdate
        extends com.commercetools.api.models.ResourceUpdate<OrderUpdate, OrderUpdateAction, OrderUpdateBuilder> {

    /**
     *  <p>Expected version of the Order on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<OrderUpdateAction> getActions();

    /**
     *  <p>Expected version of the Order on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final OrderUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Order.</p>
     * @param actions values to be set
     */

    public void setActions(final List<OrderUpdateAction> actions);

    /**
     * factory method
     * @return instance of OrderUpdate
     */
    public static OrderUpdate of() {
        return new OrderUpdateImpl();
    }

    /**
     * factory method to create a shallow copy OrderUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderUpdate of(final OrderUpdate template) {
        OrderUpdateImpl instance = new OrderUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderUpdate deepCopy(@Nullable final OrderUpdate template) {
        if (template == null) {
            return null;
        }
        OrderUpdateImpl instance = new OrderUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderUpdate
     * @return builder
     */
    public static OrderUpdateBuilder builder() {
        return OrderUpdateBuilder.of();
    }

    /**
     * create builder for OrderUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderUpdateBuilder builder(final OrderUpdate template) {
        return OrderUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderUpdate(Function<OrderUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdate>";
            }
        };
    }
}
