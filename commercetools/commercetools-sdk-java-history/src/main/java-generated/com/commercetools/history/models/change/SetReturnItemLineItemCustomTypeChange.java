
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
 *     SetReturnItemLineItemCustomTypeChange setReturnItemLineItemCustomTypeChange = SetReturnItemLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnItemLineItemCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnItemLineItemCustomTypeChangeImpl.class)
public interface SetReturnItemLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetReturnItemLineItemCustomTypeChange
     */
    String SET_RETURN_ITEM_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetReturnItemLineItemCustomTypeChange";

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
     * @return instance of SetReturnItemLineItemCustomTypeChange
     */
    public static SetReturnItemLineItemCustomTypeChange of() {
        return new SetReturnItemLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnItemLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnItemLineItemCustomTypeChange of(final SetReturnItemLineItemCustomTypeChange template) {
        SetReturnItemLineItemCustomTypeChangeImpl instance = new SetReturnItemLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnItemLineItemCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnItemLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnItemLineItemCustomTypeChange deepCopy(
            @Nullable final SetReturnItemLineItemCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetReturnItemLineItemCustomTypeChangeImpl instance = new SetReturnItemLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetReturnItemLineItemCustomTypeChange
     * @return builder
     */
    public static SetReturnItemLineItemCustomTypeChangeBuilder builder() {
        return SetReturnItemLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetReturnItemLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemLineItemCustomTypeChangeBuilder builder(
            final SetReturnItemLineItemCustomTypeChange template) {
        return SetReturnItemLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnItemLineItemCustomTypeChange(Function<SetReturnItemLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnItemLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnItemLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnItemLineItemCustomTypeChange>";
            }
        };
    }
}
