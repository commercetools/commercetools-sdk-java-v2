
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetReturnItemCustomFieldAction" rel="nofollow">Set ReturnItem CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnItemCustomLineItemCustomFieldChange setReturnItemCustomLineItemCustomFieldChange = SetReturnItemCustomLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnItemCustomLineItemCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnItemCustomLineItemCustomFieldChangeImpl.class)
public interface SetReturnItemCustomLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetReturnItemCustomLineItemCustomFieldChange
     */
    String SET_RETURN_ITEM_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetReturnItemCustomLineItemCustomFieldChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of SetReturnItemCustomLineItemCustomFieldChange
     */
    public static SetReturnItemCustomLineItemCustomFieldChange of() {
        return new SetReturnItemCustomLineItemCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnItemCustomLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnItemCustomLineItemCustomFieldChange of(
            final SetReturnItemCustomLineItemCustomFieldChange template) {
        SetReturnItemCustomLineItemCustomFieldChangeImpl instance = new SetReturnItemCustomLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnItemCustomLineItemCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnItemCustomLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnItemCustomLineItemCustomFieldChange deepCopy(
            @Nullable final SetReturnItemCustomLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetReturnItemCustomLineItemCustomFieldChangeImpl instance = new SetReturnItemCustomLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetReturnItemCustomLineItemCustomFieldChange
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomFieldChangeBuilder builder() {
        return SetReturnItemCustomLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetReturnItemCustomLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomFieldChangeBuilder builder(
            final SetReturnItemCustomLineItemCustomFieldChange template) {
        return SetReturnItemCustomLineItemCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnItemCustomLineItemCustomFieldChange(
            Function<SetReturnItemCustomLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnItemCustomLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnItemCustomLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnItemCustomLineItemCustomFieldChange>";
            }
        };
    }
}
