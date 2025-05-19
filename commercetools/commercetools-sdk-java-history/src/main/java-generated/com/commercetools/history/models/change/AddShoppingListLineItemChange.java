
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add ShoppingListLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddShoppingListLineItemChange addShoppingListLineItemChange = AddShoppingListLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddShoppingListLineItemChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddShoppingListLineItemChangeImpl.class)
public interface AddShoppingListLineItemChange extends Change {

    /**
     * discriminator value for AddShoppingListLineItemChange
     */
    String ADD_SHOPPING_LIST_LINE_ITEM_CHANGE = "AddShoppingListLineItemChange";

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
     * @return instance of AddShoppingListLineItemChange
     */
    public static AddShoppingListLineItemChange of() {
        return new AddShoppingListLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddShoppingListLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddShoppingListLineItemChange of(final AddShoppingListLineItemChange template) {
        AddShoppingListLineItemChangeImpl instance = new AddShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddShoppingListLineItemChange copyDeep();

    /**
     * factory method to create a deep copy of AddShoppingListLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddShoppingListLineItemChange deepCopy(@Nullable final AddShoppingListLineItemChange template) {
        if (template == null) {
            return null;
        }
        AddShoppingListLineItemChangeImpl instance = new AddShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddShoppingListLineItemChange
     * @return builder
     */
    public static AddShoppingListLineItemChangeBuilder builder() {
        return AddShoppingListLineItemChangeBuilder.of();
    }

    /**
     * create builder for AddShoppingListLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddShoppingListLineItemChangeBuilder builder(final AddShoppingListLineItemChange template) {
        return AddShoppingListLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddShoppingListLineItemChange(Function<AddShoppingListLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddShoppingListLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddShoppingListLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddShoppingListLineItemChange>";
            }
        };
    }
}
