
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemNameChange changeTextLineItemNameChange = ChangeTextLineItemNameChange.builder()
 *             .change("{change}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemNameChangeImpl.class)
public interface ChangeTextLineItemNameChange extends Change {

    /**
     * discriminator value for ChangeTextLineItemNameChange
     */
    String CHANGE_TEXT_LINE_ITEM_NAME_CHANGE = "ChangeTextLineItemNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changeTextLineItemName</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return textLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>changeTextLineItemName</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set textLineItem
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of ChangeTextLineItemNameChange
     */
    public static ChangeTextLineItemNameChange of() {
        return new ChangeTextLineItemNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTextLineItemNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTextLineItemNameChange of(final ChangeTextLineItemNameChange template) {
        ChangeTextLineItemNameChangeImpl instance = new ChangeTextLineItemNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTextLineItemNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTextLineItemNameChange deepCopy(@Nullable final ChangeTextLineItemNameChange template) {
        if (template == null) {
            return null;
        }
        ChangeTextLineItemNameChangeImpl instance = new ChangeTextLineItemNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(Optional.ofNullable(template.getTextLineItem())
                .map(com.commercetools.history.models.change_value.TextLineItemValue::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeTextLineItemNameChange
     * @return builder
     */
    public static ChangeTextLineItemNameChangeBuilder builder() {
        return ChangeTextLineItemNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeTextLineItemNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemNameChangeBuilder builder(final ChangeTextLineItemNameChange template) {
        return ChangeTextLineItemNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTextLineItemNameChange(Function<ChangeTextLineItemNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemNameChange>";
            }
        };
    }
}
