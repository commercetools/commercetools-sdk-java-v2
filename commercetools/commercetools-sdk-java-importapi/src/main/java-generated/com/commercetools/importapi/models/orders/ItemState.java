
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.StateKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ItemState
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemState itemState = ItemState.builder()
 *             .quantity(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemStateImpl.class)
public interface ItemState {

    /**
     *  <p>Number of Line Items or Custom Line Items in this State.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     *  <p>Number of Line Items or Custom Line Items in this State.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>State of the Line Items or Custom Line Items in a custom workflow. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param state value to be set
     */

    public void setState(final StateKeyReference state);

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

    public ItemState copyDeep();

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
        instance.setState(com.commercetools.importapi.models.common.StateKeyReference.deepCopy(template.getState()));
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
