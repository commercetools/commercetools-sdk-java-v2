
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemState
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemState itemState = ItemState.builder()
 *             .quantity(1)
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemStateImpl.class)
public interface ItemState {

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public Reference getState();

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * set state
     * @param state value to be set
     */

    public void setState(final Reference state);

    /**
     * factory method
     * @return instance of ItemState
     */
    public static ItemState of() {
        return new ItemStateImpl();
    }

    /**
     * factory method to create a shallow copy ItemState
     * @param template instance to be copied
     * @return copy instance
     */
    public static ItemState of(final ItemState template) {
        ItemStateImpl instance = new ItemStateImpl();
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of ItemState
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ItemState deepCopy(@Nullable final ItemState template) {
        if (template == null) {
            return null;
        }
        ItemStateImpl instance = new ItemStateImpl();
        instance.setQuantity(template.getQuantity());
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.history.models.common.Reference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ItemState
     * @return builder
     */
    public static ItemStateBuilder builder() {
        return ItemStateBuilder.of();
    }

    /**
     * create builder for ItemState instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemStateBuilder builder(final ItemState template) {
        return ItemStateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withItemState(Function<ItemState, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ItemState> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemState>() {
            @Override
            public String toString() {
                return "TypeReference<ItemState>";
            }
        };
    }
}
