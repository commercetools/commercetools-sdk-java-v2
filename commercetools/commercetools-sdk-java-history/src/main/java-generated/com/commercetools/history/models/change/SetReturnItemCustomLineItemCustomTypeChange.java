
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetReturnItemCustomTypeAction" rel="nofollow">Set ReturnItem Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnItemCustomLineItemCustomTypeChange setReturnItemCustomLineItemCustomTypeChange = SetReturnItemCustomLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnItemCustomLineItemCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnItemCustomLineItemCustomTypeChangeImpl.class)
public interface SetReturnItemCustomLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetReturnItemCustomLineItemCustomTypeChange
     */
    String SET_RETURN_ITEM_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetReturnItemCustomLineItemCustomTypeChange";

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
     * factory method
     * @return instance of SetReturnItemCustomLineItemCustomTypeChange
     */
    public static SetReturnItemCustomLineItemCustomTypeChange of() {
        return new SetReturnItemCustomLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnItemCustomLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnItemCustomLineItemCustomTypeChange of(
            final SetReturnItemCustomLineItemCustomTypeChange template) {
        SetReturnItemCustomLineItemCustomTypeChangeImpl instance = new SetReturnItemCustomLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnItemCustomLineItemCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnItemCustomLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnItemCustomLineItemCustomTypeChange deepCopy(
            @Nullable final SetReturnItemCustomLineItemCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetReturnItemCustomLineItemCustomTypeChangeImpl instance = new SetReturnItemCustomLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetReturnItemCustomLineItemCustomTypeChange
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomTypeChangeBuilder builder() {
        return SetReturnItemCustomLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetReturnItemCustomLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomTypeChangeBuilder builder(
            final SetReturnItemCustomLineItemCustomTypeChange template) {
        return SetReturnItemCustomLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnItemCustomLineItemCustomTypeChange(
            Function<SetReturnItemCustomLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnItemCustomLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnItemCustomLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnItemCustomLineItemCustomTypeChange>";
            }
        };
    }
}
