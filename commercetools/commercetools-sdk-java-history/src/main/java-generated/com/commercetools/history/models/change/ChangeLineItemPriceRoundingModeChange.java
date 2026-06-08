
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.RoundingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangePriceRoundingModeAction" rel="nofollow">Change Price Rounding Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemPriceRoundingModeChange changeLineItemPriceRoundingModeChange = ChangeLineItemPriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLineItemPriceRoundingModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLineItemPriceRoundingModeChangeImpl.class)
public interface ChangeLineItemPriceRoundingModeChange extends Change {

    /**
     * discriminator value for ChangeLineItemPriceRoundingModeChange
     */
    String CHANGE_LINE_ITEM_PRICE_ROUNDING_MODE_CHANGE = "ChangeLineItemPriceRoundingModeChange";

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
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
    @JsonProperty("previousValue")
    public RoundingMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public RoundingMode getNextValue();

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
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

    public void setPreviousValue(final RoundingMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final RoundingMode nextValue);

    /**
     * factory method
     * @return instance of ChangeLineItemPriceRoundingModeChange
     */
    public static ChangeLineItemPriceRoundingModeChange of() {
        return new ChangeLineItemPriceRoundingModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLineItemPriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLineItemPriceRoundingModeChange of(final ChangeLineItemPriceRoundingModeChange template) {
        ChangeLineItemPriceRoundingModeChangeImpl instance = new ChangeLineItemPriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeLineItemPriceRoundingModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLineItemPriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLineItemPriceRoundingModeChange deepCopy(
            @Nullable final ChangeLineItemPriceRoundingModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeLineItemPriceRoundingModeChangeImpl instance = new ChangeLineItemPriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariant(template.getVariant());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeLineItemPriceRoundingModeChange
     * @return builder
     */
    public static ChangeLineItemPriceRoundingModeChangeBuilder builder() {
        return ChangeLineItemPriceRoundingModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeLineItemPriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemPriceRoundingModeChangeBuilder builder(
            final ChangeLineItemPriceRoundingModeChange template) {
        return ChangeLineItemPriceRoundingModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLineItemPriceRoundingModeChange(Function<ChangeLineItemPriceRoundingModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemPriceRoundingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemPriceRoundingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemPriceRoundingModeChange>";
            }
        };
    }
}
