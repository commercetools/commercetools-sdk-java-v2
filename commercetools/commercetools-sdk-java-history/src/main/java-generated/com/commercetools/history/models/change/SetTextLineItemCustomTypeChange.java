
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set TextLineItem Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomTypeChange setTextLineItemCustomTypeChange = SetTextLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTextLineItemCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTextLineItemCustomTypeChangeImpl.class)
public interface SetTextLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetTextLineItemCustomTypeChange
     */
    String SET_TEXT_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetTextLineItemCustomTypeChange";

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

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * factory method
     * @return instance of SetTextLineItemCustomTypeChange
     */
    public static SetTextLineItemCustomTypeChange of() {
        return new SetTextLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTextLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTextLineItemCustomTypeChange of(final SetTextLineItemCustomTypeChange template) {
        SetTextLineItemCustomTypeChangeImpl instance = new SetTextLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTextLineItem(template.getTextLineItem());
        return instance;
    }

    public SetTextLineItemCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetTextLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTextLineItemCustomTypeChange deepCopy(@Nullable final SetTextLineItemCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetTextLineItemCustomTypeChangeImpl instance = new SetTextLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        instance.setTextLineItem(
            com.commercetools.history.models.change_value.TextLineItemValue.deepCopy(template.getTextLineItem()));
        return instance;
    }

    /**
     * builder factory method for SetTextLineItemCustomTypeChange
     * @return builder
     */
    public static SetTextLineItemCustomTypeChangeBuilder builder() {
        return SetTextLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetTextLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemCustomTypeChangeBuilder builder(final SetTextLineItemCustomTypeChange template) {
        return SetTextLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTextLineItemCustomTypeChange(Function<SetTextLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextLineItemCustomTypeChange>";
            }
        };
    }
}
