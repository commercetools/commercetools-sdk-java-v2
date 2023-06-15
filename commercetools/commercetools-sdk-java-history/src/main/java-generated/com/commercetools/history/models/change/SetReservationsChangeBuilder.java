
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReservationsChangeBuilder implements Builder<SetReservationsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reservation> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> nextValue;

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
     * builds SetReservationsChange with checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange build() {
        Objects.requireNonNull(change, SetReservationsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetReservationsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetReservationsChange.class + ": nextValue is missing");
        return new SetReservationsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetReservationsChange without checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange buildUnchecked() {
        return new SetReservationsChangeImpl(change, previousValue, nextValue);
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
        return builder;
    }

}
