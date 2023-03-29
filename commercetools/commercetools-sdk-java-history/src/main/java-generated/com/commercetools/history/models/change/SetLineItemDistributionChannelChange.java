
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDistributionChannelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDistributionChannelChange setLineItemDistributionChannelChange = SetLineItemDistributionChannelChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>setLineItemDistributionChannel</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemDistributionChannel</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItem
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

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
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setLineItem(Optional.ofNullable(template.getLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setVariant(template.getVariant());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Reference::deepCopy)
                .orElse(null));
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
