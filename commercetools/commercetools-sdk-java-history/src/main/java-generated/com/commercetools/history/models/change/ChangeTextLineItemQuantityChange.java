
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListChangeTextLineItemQuantityAction" rel="nofollow">Change TextLineItem Quantity</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemQuantityChange changeTextLineItemQuantityChange = ChangeTextLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTextLineItemQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemQuantityChangeImpl.class)
public interface ChangeTextLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeTextLineItemQuantityChange
     */
    String CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE = "ChangeTextLineItemQuantityChange";

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
     *  <p>Holds information about the updated Text Line Item.</p>
     * @return textLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();

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
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * factory method
     * @return instance of ChangeTextLineItemQuantityChange
     */
    public static ChangeTextLineItemQuantityChange of() {
        return new ChangeTextLineItemQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTextLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTextLineItemQuantityChange of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeImpl instance = new ChangeTextLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTextLineItem(template.getTextLineItem());
        return instance;
    }

    public ChangeTextLineItemQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeTextLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTextLineItemQuantityChange deepCopy(@Nullable final ChangeTextLineItemQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeTextLineItemQuantityChangeImpl instance = new ChangeTextLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTextLineItem(
            com.commercetools.history.models.change_value.TextLineItemValue.deepCopy(template.getTextLineItem()));
        return instance;
    }

    /**
     * builder factory method for ChangeTextLineItemQuantityChange
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder builder() {
        return ChangeTextLineItemQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeTextLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder builder(final ChangeTextLineItemQuantityChange template) {
        return ChangeTextLineItemQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTextLineItemQuantityChange(Function<ChangeTextLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemQuantityChange>";
            }
        };
    }
}
