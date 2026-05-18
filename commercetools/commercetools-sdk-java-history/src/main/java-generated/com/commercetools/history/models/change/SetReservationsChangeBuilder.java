
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReservationsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReservationsChange setReservationsChange = SetReservationsChange.builder()
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
public class SetReservationsChangeBuilder implements Builder<SetReservationsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reservation> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> nextValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> addedItems;

    private java.util.List<com.commercetools.history.models.common.Reservation> removedItems;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reservation... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Reservation... previousValue) {
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

    public SetReservationsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reservation... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Reservation... nextValue) {
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

    public SetReservationsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder addedItems(
            final com.commercetools.history.models.common.Reservation... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.Reservation> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.Reservation... addedItems) {
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

    public SetReservationsChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder removedItems(
            final com.commercetools.history.models.common.Reservation... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.Reservation> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.Reservation... removedItems) {
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

    public SetReservationsChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetReservationsChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.Reservation> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.Reservation> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Reservation> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.Reservation> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.Reservation> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds SetReservationsChange with checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange build() {
        Objects.requireNonNull(change, SetReservationsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetReservationsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetReservationsChange.class + ": nextValue is missing");
        Objects.requireNonNull(addedItems, SetReservationsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetReservationsChange.class + ": removedItems is missing");
        return new SetReservationsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * builds SetReservationsChange without checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange buildUnchecked() {
        return new SetReservationsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * factory method for an instance of SetReservationsChangeBuilder
     * @return builder
     */
    public static SetReservationsChangeBuilder of() {
        return new SetReservationsChangeBuilder();
    }

    /**
     * create builder for SetReservationsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReservationsChangeBuilder of(final SetReservationsChange template) {
        SetReservationsChangeBuilder builder = new SetReservationsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
