
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShoppingListLineItemsOrderChange
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
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<ShoppingListLineItemValue> getPreviousValue();

    /**
     *
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
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final ShoppingListLineItemValue... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ShoppingListLineItemValue> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ShoppingListLineItemValue... nextValue);

    /**
     * set nextValue
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
     * factory method to copy an instance of ChangeShoppingListLineItemsOrderChange
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
