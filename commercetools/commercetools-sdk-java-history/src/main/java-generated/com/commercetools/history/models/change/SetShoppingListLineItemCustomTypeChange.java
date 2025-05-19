
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set ShoppingListLineItem Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShoppingListLineItemCustomTypeChange setShoppingListLineItemCustomTypeChange = SetShoppingListLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShoppingListLineItemCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShoppingListLineItemCustomTypeChangeImpl.class)
public interface SetShoppingListLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetShoppingListLineItemCustomTypeChange
     */
    String SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetShoppingListLineItemCustomTypeChange";

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
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

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

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    /**
     * factory method
     * @return instance of SetShoppingListLineItemCustomTypeChange
     */
    public static SetShoppingListLineItemCustomTypeChange of() {
        return new SetShoppingListLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShoppingListLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShoppingListLineItemCustomTypeChange of(final SetShoppingListLineItemCustomTypeChange template) {
        SetShoppingListLineItemCustomTypeChangeImpl instance = new SetShoppingListLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public SetShoppingListLineItemCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetShoppingListLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShoppingListLineItemCustomTypeChange deepCopy(
            @Nullable final SetShoppingListLineItemCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetShoppingListLineItemCustomTypeChangeImpl instance = new SetShoppingListLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        instance.setLineItem(
            com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for SetShoppingListLineItemCustomTypeChange
     * @return builder
     */
    public static SetShoppingListLineItemCustomTypeChangeBuilder builder() {
        return SetShoppingListLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetShoppingListLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShoppingListLineItemCustomTypeChangeBuilder builder(
            final SetShoppingListLineItemCustomTypeChange template) {
        return SetShoppingListLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShoppingListLineItemCustomTypeChange(
            Function<SetShoppingListLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShoppingListLineItemCustomTypeChange>";
            }
        };
    }
}
