
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemCustomFieldChange setCustomLineItemCustomFieldChange = SetCustomLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemCustomFieldChangeImpl.class)
public interface SetCustomLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetCustomLineItemCustomFieldChange
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetCustomLineItemCustomFieldChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemCustomField</code></p>
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
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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
     *  <p>Update action for <code>setCustomLineItemCustomField</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set customLineItem
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

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
     * @return instance of SetCustomLineItemCustomFieldChange
     */
    public static SetCustomLineItemCustomFieldChange of() {
        return new SetCustomLineItemCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemCustomFieldChange of(final SetCustomLineItemCustomFieldChange template) {
        SetCustomLineItemCustomFieldChangeImpl instance = new SetCustomLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemCustomFieldChange deepCopy(
            @Nullable final SetCustomLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemCustomFieldChangeImpl instance = new SetCustomLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomLineItem(Optional.ofNullable(template.getCustomLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemCustomFieldChange
     * @return builder
     */
    public static SetCustomLineItemCustomFieldChangeBuilder builder() {
        return SetCustomLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemCustomFieldChangeBuilder builder(final SetCustomLineItemCustomFieldChange template) {
        return SetCustomLineItemCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemCustomFieldChange(Function<SetCustomLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemCustomFieldChange>";
            }
        };
    }
}
