
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetPriceTiersChangeBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetPriceTiersChangeBuilder implements Builder<StandalonePriceSetPriceTiersChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.PriceTier> addedItems;

    private java.util.List<com.commercetools.history.models.common.PriceTier> removedItems;

    private java.util.List<com.commercetools.history.models.common.PriceTier> previousValue;

    private java.util.List<com.commercetools.history.models.common.PriceTier> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addedItems(
            final com.commercetools.history.models.common.PriceTier... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.PriceTier> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.PriceTier... addedItems) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.addAll(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder removedItems(
            final com.commercetools.history.models.common.PriceTier... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.PriceTier> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.PriceTier... removedItems) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.addAll(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder previousValue(
            final com.commercetools.history.models.common.PriceTier... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.PriceTier> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.PriceTier... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder nextValue(
            final com.commercetools.history.models.common.PriceTier... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.PriceTier> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.PriceTier... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTierBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.PriceTierBuilder, com.commercetools.history.models.common.PriceTier> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.PriceTierBuilder.of()));
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.PriceTier> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.PriceTier> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.PriceTier> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.PriceTier> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds StandalonePriceSetPriceTiersChange with checking for non-null required values
     * @return StandalonePriceSetPriceTiersChange
     */
    public StandalonePriceSetPriceTiersChange build() {
        Objects.requireNonNull(change, StandalonePriceSetPriceTiersChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, StandalonePriceSetPriceTiersChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, StandalonePriceSetPriceTiersChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, StandalonePriceSetPriceTiersChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetPriceTiersChange.class + ": nextValue is missing");
        return new StandalonePriceSetPriceTiersChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetPriceTiersChange without checking for non-null required values
     * @return StandalonePriceSetPriceTiersChange
     */
    public StandalonePriceSetPriceTiersChange buildUnchecked() {
        return new StandalonePriceSetPriceTiersChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetPriceTiersChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersChangeBuilder of() {
        return new StandalonePriceSetPriceTiersChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetPriceTiersChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersChangeBuilder of(final StandalonePriceSetPriceTiersChange template) {
        StandalonePriceSetPriceTiersChangeBuilder builder = new StandalonePriceSetPriceTiersChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
