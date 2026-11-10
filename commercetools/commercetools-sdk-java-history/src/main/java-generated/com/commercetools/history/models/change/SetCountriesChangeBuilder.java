
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCountriesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountriesChange setCountriesChange = SetCountriesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCountriesChangeBuilder implements Builder<SetCountriesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StoreCountry> previousValue;

    private java.util.List<com.commercetools.history.models.common.StoreCountry> nextValue;

    private java.util.List<com.commercetools.history.models.common.StoreCountry> addedItems;

    private java.util.List<com.commercetools.history.models.common.StoreCountry> removedItems;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StoreCountry... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StoreCountry> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.StoreCountry... previousValue) {
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

    public SetCountriesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder nextValue(
            final com.commercetools.history.models.common.StoreCountry... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StoreCountry> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.StoreCountry... nextValue) {
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

    public SetCountriesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCountriesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder addedItems(
            final com.commercetools.history.models.common.StoreCountry... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.StoreCountry> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.StoreCountry... addedItems) {
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

    public SetCountriesChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder removedItems(
            final com.commercetools.history.models.common.StoreCountry... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.StoreCountry> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCountriesChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.StoreCountry... removedItems) {
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

    public SetCountriesChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCountriesChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.StoreCountry> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.StoreCountry> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.StoreCountry> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.StoreCountry> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds SetCountriesChange with checking for non-null required values
     * @return SetCountriesChange
     */
    public SetCountriesChange build() {
        Objects.requireNonNull(change, SetCountriesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCountriesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCountriesChange.class + ": nextValue is missing");
        Objects.requireNonNull(addedItems, SetCountriesChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetCountriesChange.class + ": removedItems is missing");
        return new SetCountriesChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * builds SetCountriesChange without checking for non-null required values
     * @return SetCountriesChange
     */
    public SetCountriesChange buildUnchecked() {
        return new SetCountriesChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * factory method for an instance of SetCountriesChangeBuilder
     * @return builder
     */
    public static SetCountriesChangeBuilder of() {
        return new SetCountriesChangeBuilder();
    }

    /**
     * create builder for SetCountriesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCountriesChangeBuilder of(final SetCountriesChange template) {
        SetCountriesChangeBuilder builder = new SetCountriesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
