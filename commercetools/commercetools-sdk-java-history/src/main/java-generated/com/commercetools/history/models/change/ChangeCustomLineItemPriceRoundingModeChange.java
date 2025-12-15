
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
 *     ChangeCustomLineItemPriceRoundingModeChange changeCustomLineItemPriceRoundingModeChange = ChangeCustomLineItemPriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeCustomLineItemPriceRoundingModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeCustomLineItemPriceRoundingModeChangeImpl.class)
public interface ChangeCustomLineItemPriceRoundingModeChange extends Change {

    /**
     * discriminator value for ChangeCustomLineItemPriceRoundingModeChange
     */
    String CHANGE_CUSTOM_LINE_ITEM_PRICE_ROUNDING_MODE_CHANGE = "ChangeCustomLineItemPriceRoundingModeChange";

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

    public void setPreviousValue(final RoundingMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final RoundingMode nextValue);

    /**
     * factory method
     * @return instance of ChangeCustomLineItemPriceRoundingModeChange
     */
    public static ChangeCustomLineItemPriceRoundingModeChange of() {
        return new ChangeCustomLineItemPriceRoundingModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeCustomLineItemPriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeCustomLineItemPriceRoundingModeChange of(
            final ChangeCustomLineItemPriceRoundingModeChange template) {
        ChangeCustomLineItemPriceRoundingModeChangeImpl instance = new ChangeCustomLineItemPriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeCustomLineItemPriceRoundingModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeCustomLineItemPriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeCustomLineItemPriceRoundingModeChange deepCopy(
            @Nullable final ChangeCustomLineItemPriceRoundingModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeCustomLineItemPriceRoundingModeChangeImpl instance = new ChangeCustomLineItemPriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeCustomLineItemPriceRoundingModeChange
     * @return builder
     */
    public static ChangeCustomLineItemPriceRoundingModeChangeBuilder builder() {
        return ChangeCustomLineItemPriceRoundingModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeCustomLineItemPriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCustomLineItemPriceRoundingModeChangeBuilder builder(
            final ChangeCustomLineItemPriceRoundingModeChange template) {
        return ChangeCustomLineItemPriceRoundingModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeCustomLineItemPriceRoundingModeChange(
            Function<ChangeCustomLineItemPriceRoundingModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemPriceRoundingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemPriceRoundingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCustomLineItemPriceRoundingModeChange>";
            }
        };
    }
}
