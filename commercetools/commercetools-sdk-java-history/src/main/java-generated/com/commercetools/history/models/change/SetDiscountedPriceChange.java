
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountedPrice;
import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetDiscountedPriceAction" rel="nofollow">Set Discounted Embedded Price</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountedPriceChange setDiscountedPriceChange = SetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDiscountedPriceChange")
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
    public DiscountedPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedPrice getNextValue();

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Embedded Price of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountedPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedPrice nextValue);

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Embedded Price of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param price value to be set
     */

    public void setPrice(final Price price);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        instance.setPrice(template.getPrice());
        return instance;
    }

    public SetDiscountedPriceChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedPrice.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        instance.setPrice(com.commercetools.history.models.common.Price.deepCopy(template.getPrice()));
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
