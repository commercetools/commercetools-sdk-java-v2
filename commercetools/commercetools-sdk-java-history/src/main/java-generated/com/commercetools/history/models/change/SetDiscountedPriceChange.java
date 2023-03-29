
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDiscountedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountedPriceChange setDiscountedPriceChange = SetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDiscountedPriceChangeImpl.class)
public interface SetDiscountedPriceChange extends Change {

    /**
     * discriminator value for SetDiscountedPriceChange
     */
    String SET_DISCOUNTED_PRICE_CHANGE = "SetDiscountedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setDiscountedPrice</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *  <p>Update action for <code>setDiscountedPrice</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set priceId
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Price previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Price nextValue);

    /**
     * factory method
     * @return instance of SetDiscountedPriceChange
     */
    public static SetDiscountedPriceChange of() {
        return new SetDiscountedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDiscountedPriceChange of(final SetDiscountedPriceChange template) {
        SetDiscountedPriceChangeImpl instance = new SetDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDiscountedPriceChange deepCopy(@Nullable final SetDiscountedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetDiscountedPriceChangeImpl instance = new SetDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(com.commercetools.history.models.common.Price.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Price.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDiscountedPriceChange
     * @return builder
     */
    public static SetDiscountedPriceChangeBuilder builder() {
        return SetDiscountedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountedPriceChangeBuilder builder(final SetDiscountedPriceChange template) {
        return SetDiscountedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDiscountedPriceChange(Function<SetDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDiscountedPriceChange>";
            }
        };
    }
}
