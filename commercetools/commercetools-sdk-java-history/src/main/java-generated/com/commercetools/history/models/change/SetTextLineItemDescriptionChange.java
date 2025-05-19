
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set TextLineItem Description update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemDescriptionChange setTextLineItemDescriptionChange = SetTextLineItemDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTextLineItemDescriptionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTextLineItemDescriptionChangeImpl.class)
public interface SetTextLineItemDescriptionChange extends Change {

    /**
     * discriminator value for SetTextLineItemDescriptionChange
     */
    String SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE = "SetTextLineItemDescriptionChange";

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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

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

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * factory method
     * @return instance of SetTextLineItemDescriptionChange
     */
    public static SetTextLineItemDescriptionChange of() {
        return new SetTextLineItemDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTextLineItemDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTextLineItemDescriptionChange of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeImpl instance = new SetTextLineItemDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTextLineItem(template.getTextLineItem());
        return instance;
    }

    public SetTextLineItemDescriptionChange copyDeep();

    /**
     * factory method to create a deep copy of SetTextLineItemDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTextLineItemDescriptionChange deepCopy(@Nullable final SetTextLineItemDescriptionChange template) {
        if (template == null) {
            return null;
        }
        SetTextLineItemDescriptionChangeImpl instance = new SetTextLineItemDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setTextLineItem(
            com.commercetools.history.models.change_value.TextLineItemValue.deepCopy(template.getTextLineItem()));
        return instance;
    }

    /**
     * builder factory method for SetTextLineItemDescriptionChange
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder builder() {
        return SetTextLineItemDescriptionChangeBuilder.of();
    }

    /**
     * create builder for SetTextLineItemDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder builder(final SetTextLineItemDescriptionChange template) {
        return SetTextLineItemDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTextLineItemDescriptionChange(Function<SetTextLineItemDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextLineItemDescriptionChange>";
            }
        };
    }
}
