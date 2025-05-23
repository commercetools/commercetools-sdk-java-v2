
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change ShoppingListLineItems Order update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShoppingListLineItemsOrderChange changeShoppingListLineItemsOrderChange = ChangeShoppingListLineItemsOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeShoppingListLineItemsOrderChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeShoppingListLineItemsOrderChangeImpl.class)
public interface ChangeShoppingListLineItemsOrderChange extends Change {

    /**
     * discriminator value for ChangeShoppingListLineItemsOrderChange
     */
    String CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE = "ChangeShoppingListLineItemsOrderChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<ShoppingListLineItemValue> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ShoppingListLineItemValue> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final ShoppingListLineItemValue... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ShoppingListLineItemValue> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ShoppingListLineItemValue... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ShoppingListLineItemValue> nextValue);

    /**
     * factory method
     * @return instance of ChangeShoppingListLineItemsOrderChange
     */
    public static ChangeShoppingListLineItemsOrderChange of() {
        return new ChangeShoppingListLineItemsOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeShoppingListLineItemsOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeShoppingListLineItemsOrderChange of(final ChangeShoppingListLineItemsOrderChange template) {
        ChangeShoppingListLineItemsOrderChangeImpl instance = new ChangeShoppingListLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeShoppingListLineItemsOrderChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeShoppingListLineItemsOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeShoppingListLineItemsOrderChange deepCopy(
            @Nullable final ChangeShoppingListLineItemsOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeShoppingListLineItemsOrderChangeImpl instance = new ChangeShoppingListLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.ShoppingListLineItemValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.ShoppingListLineItemValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeShoppingListLineItemsOrderChange
     * @return builder
     */
    public static ChangeShoppingListLineItemsOrderChangeBuilder builder() {
        return ChangeShoppingListLineItemsOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeShoppingListLineItemsOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShoppingListLineItemsOrderChangeBuilder builder(
            final ChangeShoppingListLineItemsOrderChange template) {
        return ChangeShoppingListLineItemsOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeShoppingListLineItemsOrderChange(
            Function<ChangeShoppingListLineItemsOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemsOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemsOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeShoppingListLineItemsOrderChange>";
            }
        };
    }
}
