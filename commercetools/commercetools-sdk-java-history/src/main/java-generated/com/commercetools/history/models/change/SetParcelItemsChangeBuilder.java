
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelItemsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelItemsChange setParcelItemsChange = SetParcelItemsChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelItemsChangeBuilder implements Builder<SetParcelItemsChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue;

    /**
     *  <p>Update action for <code>setParcelItems</code></p>
     * @param change
     * @return Builder
     */

    public SetParcelItemsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetParcelItemsChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     * @param parcel
     * @return Builder
     */

    public SetParcelItemsChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder nextValue(
            final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetParcelItemsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetParcelItemsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder previousValue(
            final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetParcelItemsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetParcelItemsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetParcelItemsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getPreviousValue() {
        return this.previousValue;
    }

    public SetParcelItemsChange build() {
        Objects.requireNonNull(change, SetParcelItemsChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelItemsChange.class + ": parcel is missing");
        Objects.requireNonNull(nextValue, SetParcelItemsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetParcelItemsChange.class + ": previousValue is missing");
        return new SetParcelItemsChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * builds SetParcelItemsChange without checking for non null required values
     */
    public SetParcelItemsChange buildUnchecked() {
        return new SetParcelItemsChangeImpl(change, parcel, nextValue, previousValue);
    }

    public static SetParcelItemsChangeBuilder of() {
        return new SetParcelItemsChangeBuilder();
    }

    public static SetParcelItemsChangeBuilder of(final SetParcelItemsChange template) {
        SetParcelItemsChangeBuilder builder = new SetParcelItemsChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
