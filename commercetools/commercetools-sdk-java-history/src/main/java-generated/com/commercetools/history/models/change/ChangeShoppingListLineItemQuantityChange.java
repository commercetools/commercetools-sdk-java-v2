
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Change ShoppingListLineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShoppingListLineItemQuantityChange changeShoppingListLineItemQuantityChange = ChangeShoppingListLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeShoppingListLineItemQuantityChangeImpl.class)
public interface ChangeShoppingListLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeShoppingListLineItemQuantityChange
     */
    String CHANGE_SHOPPING_LIST_LINE_ITEM_QUANTITY_CHANGE = "ChangeShoppingListLineItemQuantityChange";

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
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    /**
     * factory method
     * @return instance of ChangeShoppingListLineItemQuantityChange
     */
    public static ChangeShoppingListLineItemQuantityChange of() {
        return new ChangeShoppingListLineItemQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeShoppingListLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeShoppingListLineItemQuantityChange of(final ChangeShoppingListLineItemQuantityChange template) {
        ChangeShoppingListLineItemQuantityChangeImpl instance = new ChangeShoppingListLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeShoppingListLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeShoppingListLineItemQuantityChange deepCopy(
            @Nullable final ChangeShoppingListLineItemQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeShoppingListLineItemQuantityChangeImpl instance = new ChangeShoppingListLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(
            com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for ChangeShoppingListLineItemQuantityChange
     * @return builder
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder builder() {
        return ChangeShoppingListLineItemQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeShoppingListLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder builder(
            final ChangeShoppingListLineItemQuantityChange template) {
        return ChangeShoppingListLineItemQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeShoppingListLineItemQuantityChange(
            Function<ChangeShoppingListLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeShoppingListLineItemQuantityChange>";
            }
        };
    }
}
