
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemDistributionChannelAction" rel="nofollow">Set LineItem DistributionChannel</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDistributionChannelChange setLineItemDistributionChannelChange = SetLineItemDistributionChannelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemDistributionChannelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemDistributionChannelChangeImpl.class)
public interface SetLineItemDistributionChannelChange extends Change {

    /**
     * discriminator value for SetLineItemDistributionChannelChange
     */
    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL_CHANGE = "SetLineItemDistributionChannelChange";

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
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
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

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetLineItemDistributionChannelChange
     */
    public static SetLineItemDistributionChannelChange of() {
        return new SetLineItemDistributionChannelChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemDistributionChannelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDistributionChannelChange of(final SetLineItemDistributionChannelChange template) {
        SetLineItemDistributionChannelChangeImpl instance = new SetLineItemDistributionChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetLineItemDistributionChannelChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemDistributionChannelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemDistributionChannelChange deepCopy(
            @Nullable final SetLineItemDistributionChannelChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemDistributionChannelChangeImpl instance = new SetLineItemDistributionChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetLineItemDistributionChannelChange
     * @return builder
     */
    public static SetLineItemDistributionChannelChangeBuilder builder() {
        return SetLineItemDistributionChannelChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemDistributionChannelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDistributionChannelChangeBuilder builder(
            final SetLineItemDistributionChannelChange template) {
        return SetLineItemDistributionChannelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemDistributionChannelChange(Function<SetLineItemDistributionChannelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDistributionChannelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDistributionChannelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDistributionChannelChange>";
            }
        };
    }
}
