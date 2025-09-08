
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
 *  <p>Change triggered automatically due to a user-initiated change.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductSlugChange setLineItemProductSlugChange = SetLineItemProductSlugChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemProductSlugChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemProductSlugChangeImpl.class)
public interface SetLineItemProductSlugChange extends Change {

    /**
     * discriminator value for SetLineItemProductSlugChange
     */
    String SET_LINE_ITEM_PRODUCT_SLUG_CHANGE = "SetLineItemProductSlugChange";

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
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

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

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetLineItemProductSlugChange
     */
    public static SetLineItemProductSlugChange of() {
        return new SetLineItemProductSlugChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemProductSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemProductSlugChange of(final SetLineItemProductSlugChange template) {
        SetLineItemProductSlugChangeImpl instance = new SetLineItemProductSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetLineItemProductSlugChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemProductSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemProductSlugChange deepCopy(@Nullable final SetLineItemProductSlugChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemProductSlugChangeImpl instance = new SetLineItemProductSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetLineItemProductSlugChange
     * @return builder
     */
    public static SetLineItemProductSlugChangeBuilder builder() {
        return SetLineItemProductSlugChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemProductSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductSlugChangeBuilder builder(final SetLineItemProductSlugChange template) {
        return SetLineItemProductSlugChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemProductSlugChange(Function<SetLineItemProductSlugChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductSlugChange>";
            }
        };
    }
}
