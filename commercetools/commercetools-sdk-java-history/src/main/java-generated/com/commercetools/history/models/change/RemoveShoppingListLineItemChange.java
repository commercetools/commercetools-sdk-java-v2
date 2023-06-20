
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Remove ShoppingListLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShoppingListLineItemChange removeShoppingListLineItemChange = RemoveShoppingListLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveShoppingListLineItemChangeImpl.class)
public interface RemoveShoppingListLineItemChange extends Change {

    /**
     * discriminator value for RemoveShoppingListLineItemChange
     */
    String REMOVE_SHOPPING_LIST_LINE_ITEM_CHANGE = "RemoveShoppingListLineItemChange";

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
    public LineItem getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LineItem previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LineItem nextValue);

    /**
     * factory method
     * @return instance of RemoveShoppingListLineItemChange
     */
    public static RemoveShoppingListLineItemChange of() {
        return new RemoveShoppingListLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveShoppingListLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveShoppingListLineItemChange of(final RemoveShoppingListLineItemChange template) {
        RemoveShoppingListLineItemChangeImpl instance = new RemoveShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveShoppingListLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveShoppingListLineItemChange deepCopy(@Nullable final RemoveShoppingListLineItemChange template) {
        if (template == null) {
            return null;
        }
        RemoveShoppingListLineItemChangeImpl instance = new RemoveShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveShoppingListLineItemChange
     * @return builder
     */
    public static RemoveShoppingListLineItemChangeBuilder builder() {
        return RemoveShoppingListLineItemChangeBuilder.of();
    }

    /**
     * create builder for RemoveShoppingListLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShoppingListLineItemChangeBuilder builder(final RemoveShoppingListLineItemChange template) {
        return RemoveShoppingListLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveShoppingListLineItemChange(Function<RemoveShoppingListLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveShoppingListLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveShoppingListLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveShoppingListLineItemChange>";
            }
        };
    }
}
