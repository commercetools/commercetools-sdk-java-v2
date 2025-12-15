
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.PriceTier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceAddPriceTierAction" rel="nofollow">Add Price Tier</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemovePriceTierAction" rel="nofollow">Remove Price Tier</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetPriceTiersAction" rel="nofollow">Set Price Tiers</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetPriceTiersChange standalonePriceSetPriceTiersChange = StandalonePriceSetPriceTiersChange.builder()
 *             .change("{change}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetPriceTiersChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetPriceTiersChangeImpl.class)
public interface StandalonePriceSetPriceTiersChange extends Change {

    /**
     * discriminator value for StandalonePriceSetPriceTiersChange
     */
    String STANDALONE_PRICE_SET_PRICE_TIERS_CHANGE = "StandalonePriceSetPriceTiersChange";

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
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */
    @NotNull
    @Valid
    @JsonProperty("addedItems")
    public List<PriceTier> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<PriceTier> getRemovedItems();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<PriceTier> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<PriceTier> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    @JsonIgnore
    public void setAddedItems(final PriceTier... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<PriceTier> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final PriceTier... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<PriceTier> removedItems);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final PriceTier... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<PriceTier> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final PriceTier... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<PriceTier> nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceSetPriceTiersChange
     */
    public static StandalonePriceSetPriceTiersChange of() {
        return new StandalonePriceSetPriceTiersChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetPriceTiersChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetPriceTiersChange of(final StandalonePriceSetPriceTiersChange template) {
        StandalonePriceSetPriceTiersChangeImpl instance = new StandalonePriceSetPriceTiersChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetPriceTiersChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetPriceTiersChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetPriceTiersChange deepCopy(
            @Nullable final StandalonePriceSetPriceTiersChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetPriceTiersChangeImpl instance = new StandalonePriceSetPriceTiersChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetPriceTiersChange
     * @return builder
     */
    public static StandalonePriceSetPriceTiersChangeBuilder builder() {
        return StandalonePriceSetPriceTiersChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetPriceTiersChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersChangeBuilder builder(final StandalonePriceSetPriceTiersChange template) {
        return StandalonePriceSetPriceTiersChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetPriceTiersChange(Function<StandalonePriceSetPriceTiersChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetPriceTiersChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetPriceTiersChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetPriceTiersChange>";
            }
        };
    }
}
