
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetLineItemCustomFieldAction" rel="nofollow">Set LineItem CustomField</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemCustomFieldAction" rel="nofollow">Set LineItem CustomField</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomFieldChange setOrderLineItemCustomFieldChange = SetOrderLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .customTypeId("{customTypeId}")
 *             .name("{name}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetOrderLineItemCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderLineItemCustomFieldChangeImpl.class)
public interface SetOrderLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetOrderLineItemCustomFieldChange
     */
    String SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetOrderLineItemCustomFieldChange";

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
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>sku</code> or <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

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
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>sku</code> or <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetOrderLineItemCustomFieldChange
     */
    public static SetOrderLineItemCustomFieldChange of() {
        return new SetOrderLineItemCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetOrderLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderLineItemCustomFieldChange of(final SetOrderLineItemCustomFieldChange template) {
        SetOrderLineItemCustomFieldChangeImpl instance = new SetOrderLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetOrderLineItemCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetOrderLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderLineItemCustomFieldChange deepCopy(
            @Nullable final SetOrderLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetOrderLineItemCustomFieldChangeImpl instance = new SetOrderLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetOrderLineItemCustomFieldChange
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder builder() {
        return SetOrderLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetOrderLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder builder(final SetOrderLineItemCustomFieldChange template) {
        return SetOrderLineItemCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderLineItemCustomFieldChange(Function<SetOrderLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderLineItemCustomFieldChange>";
            }
        };
    }
}
