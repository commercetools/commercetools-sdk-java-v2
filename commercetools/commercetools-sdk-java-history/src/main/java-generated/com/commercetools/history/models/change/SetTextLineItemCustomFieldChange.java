
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setChange(final String change);

    public void setName(final String name);

    public void setCustomTypeId(final String customTypeId);

    public void setTextLineItem(final TextLineItemValue textLineItem);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetTextLineItemCustomFieldChange of() {
        return new SetTextLineItemCustomFieldChangeImpl();
    }

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

    public static SetTextLineItemCustomFieldChangeBuilder builder() {
        return SetTextLineItemCustomFieldChangeBuilder.of();
    }

    public static SetTextLineItemCustomFieldChangeBuilder builder(final SetTextLineItemCustomFieldChange template) {
        return SetTextLineItemCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetTextLineItemCustomFieldChange(Function<SetTextLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextLineItemCustomFieldChange>";
            }
        };
    }
}
