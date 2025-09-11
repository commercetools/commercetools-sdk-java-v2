
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddParcelToDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddParcelToDeliveryChange addParcelToDeliveryChange = AddParcelToDeliveryChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddParcelToDeliveryChangeBuilder implements Builder<AddParcelToDeliveryChange> {

    private String change;

    private com.commercetools.history.models.common.Parcel nextValue;

    private String deliveryId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder nextValue(final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> to which the Parcel was added.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Parcel getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> to which the Parcel was added.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds AddParcelToDeliveryChange with checking for non-null required values
     * @return AddParcelToDeliveryChange
     */
    public AddParcelToDeliveryChange build() {
        Objects.requireNonNull(change, AddParcelToDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddParcelToDeliveryChange.class + ": nextValue is missing");
        Objects.requireNonNull(deliveryId, AddParcelToDeliveryChange.class + ": deliveryId is missing");
        return new AddParcelToDeliveryChangeImpl(change, nextValue, deliveryId);
    }

    /**
     * builds AddParcelToDeliveryChange without checking for non-null required values
     * @return AddParcelToDeliveryChange
     */
    public AddParcelToDeliveryChange buildUnchecked() {
        return new AddParcelToDeliveryChangeImpl(change, nextValue, deliveryId);
    }

    /**
     * factory method for an instance of AddParcelToDeliveryChangeBuilder
     * @return builder
     */
    public static AddParcelToDeliveryChangeBuilder of() {
        return new AddParcelToDeliveryChangeBuilder();
    }

    /**
     * create builder for AddParcelToDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddParcelToDeliveryChangeBuilder of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeBuilder builder = new AddParcelToDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
