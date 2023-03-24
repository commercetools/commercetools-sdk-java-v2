
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
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReservationsChangeBuilder implements Builder<SetReservationsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reservation> nextValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> previousValue;

    /**
     *  <p>Update action for <code>setReservations</code> on inventories</p>
     * @param change value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reservation... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
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
     *
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
     *
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
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reservation... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReservationsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
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
     *
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
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReservationsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReservationBuilder, com.commercetools.history.models.common.ReservationBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReservationBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetReservationsChange with checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange build() {
        Objects.requireNonNull(change, SetReservationsChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetReservationsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetReservationsChange.class + ": previousValue is missing");
        return new SetReservationsChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReservationsChange without checking for non-null required values
     * @return SetReservationsChange
     */
    public SetReservationsChange buildUnchecked() {
        return new SetReservationsChangeImpl(change, nextValue, previousValue);
    }

    public static SetReservationsChangeBuilder of() {
        return new SetReservationsChangeBuilder();
    }

    public static SetReservationsChangeBuilder of(final SetReservationsChange template) {
        SetReservationsChangeBuilder builder = new SetReservationsChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
