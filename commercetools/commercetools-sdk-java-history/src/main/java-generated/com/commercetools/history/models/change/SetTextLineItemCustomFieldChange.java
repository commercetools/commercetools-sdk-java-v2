
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = SetTextLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTextLineItemCustomFieldChangeImpl.class)
public interface SetTextLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetTextLineItemCustomFieldChange
     */
    String SET_TEXT_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetTextLineItemCustomFieldChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setTextLineItemCustomField</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

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
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setTextLineItemCustomField</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set customTypeId
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     * set textLineItem
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of SetTextLineItemCustomFieldChange
     */
    public static SetTextLineItemCustomFieldChange of() {
        return new SetTextLineItemCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTextLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTextLineItemCustomFieldChange of(final SetTextLineItemCustomFieldChange template) {
        SetTextLineItemCustomFieldChangeImpl instance = new SetTextLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetTextLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTextLineItemCustomFieldChange deepCopy(@Nullable final SetTextLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetTextLineItemCustomFieldChangeImpl instance = new SetTextLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setTextLineItem(Optional.ofNullable(template.getTextLineItem())
                .map(com.commercetools.history.models.change_value.TextLineItemValue::deepCopy)
                .orElse(null));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetTextLineItemCustomFieldChange
     * @return builder
     */
    public static SetTextLineItemCustomFieldChangeBuilder builder() {
        return SetTextLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetTextLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemCustomFieldChangeBuilder builder(final SetTextLineItemCustomFieldChange template) {
        return SetTextLineItemCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTextLineItemCustomFieldChange(Function<SetTextLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextLineItemCustomFieldChange>";
            }
        };
    }
}
