
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
 *             .deliveryId("{deliveryId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddParcelToDeliveryChangeBuilder implements Builder<AddParcelToDeliveryChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel nextValue;

    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     * @param change
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param deliveryId
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public AddParcelToDeliveryChangeBuilder nextValue(final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Parcel getNextValue() {
        return this.nextValue;
    }

    public AddParcelToDeliveryChange build() {
        Objects.requireNonNull(change, AddParcelToDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, AddParcelToDeliveryChange.class + ": deliveryId is missing");
        Objects.requireNonNull(nextValue, AddParcelToDeliveryChange.class + ": nextValue is missing");
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }

    /**
     * builds AddParcelToDeliveryChange without checking for non null required values
     */
    public AddParcelToDeliveryChange buildUnchecked() {
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }

    public static AddParcelToDeliveryChangeBuilder of() {
        return new AddParcelToDeliveryChangeBuilder();
    }

    public static AddParcelToDeliveryChangeBuilder of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeBuilder builder = new AddParcelToDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
