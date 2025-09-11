
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
 * SetLineItemProductKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductKeyChange setLineItemProductKeyChange = SetLineItemProductKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemProductKeyChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemProductKeyChangeImpl.class)
public interface SetLineItemProductKeyChange extends Change {

    /**
     * discriminator value for SetLineItemProductKeyChange
     */
    String SET_LINE_ITEM_PRODUCT_KEY_CHANGE = "SetLineItemProductKeyChange";

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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
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
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
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

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetLineItemProductKeyChange
     */
    public static SetLineItemProductKeyChange of() {
        return new SetLineItemProductKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemProductKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemProductKeyChange of(final SetLineItemProductKeyChange template) {
        SetLineItemProductKeyChangeImpl instance = new SetLineItemProductKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetLineItemProductKeyChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemProductKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemProductKeyChange deepCopy(@Nullable final SetLineItemProductKeyChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemProductKeyChangeImpl instance = new SetLineItemProductKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetLineItemProductKeyChange
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder builder() {
        return SetLineItemProductKeyChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemProductKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder builder(final SetLineItemProductKeyChange template) {
        return SetLineItemProductKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemProductKeyChange(Function<SetLineItemProductKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductKeyChange>";
            }
        };
    }
}
