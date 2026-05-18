
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
 *     SetReturnItemLineItemCustomFieldChange setReturnItemLineItemCustomFieldChange = SetReturnItemLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnItemLineItemCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnItemLineItemCustomFieldChangeImpl.class)
public interface SetReturnItemLineItemCustomFieldChange extends Change {

    /**
     * discriminator value for SetReturnItemLineItemCustomFieldChange
     */
    String SET_RETURN_ITEM_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetReturnItemLineItemCustomFieldChange";

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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

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
     * @return instance of SetReturnItemLineItemCustomFieldChange
     */
    public static SetReturnItemLineItemCustomFieldChange of() {
        return new SetReturnItemLineItemCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnItemLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnItemLineItemCustomFieldChange of(final SetReturnItemLineItemCustomFieldChange template) {
        SetReturnItemLineItemCustomFieldChangeImpl instance = new SetReturnItemLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnItemLineItemCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnItemLineItemCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnItemLineItemCustomFieldChange deepCopy(
            @Nullable final SetReturnItemLineItemCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetReturnItemLineItemCustomFieldChangeImpl instance = new SetReturnItemLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetReturnItemLineItemCustomFieldChange
     * @return builder
     */
    public static SetReturnItemLineItemCustomFieldChangeBuilder builder() {
        return SetReturnItemLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetReturnItemLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemLineItemCustomFieldChangeBuilder builder(
            final SetReturnItemLineItemCustomFieldChange template) {
        return SetReturnItemLineItemCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnItemLineItemCustomFieldChange(
            Function<SetReturnItemLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnItemLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnItemLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnItemLineItemCustomFieldChange>";
            }
        };
    }
}
