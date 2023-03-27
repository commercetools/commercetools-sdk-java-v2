
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveParcelFromDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveParcelFromDeliveryChange removeParcelFromDeliveryChange = RemoveParcelFromDeliveryChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryChangeBuilder implements Builder<RemoveParcelFromDeliveryChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel previousValue;

    /**
     *  <p>Update action for <code>removeParcelFromDelivery</code></p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeParcelFromDelivery</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of deliveryId}
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveParcelFromDeliveryChange with checking for non-null required values
     * @return RemoveParcelFromDeliveryChange
     */
    public RemoveParcelFromDeliveryChange build() {
        Objects.requireNonNull(change, RemoveParcelFromDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, RemoveParcelFromDeliveryChange.class + ": deliveryId is missing");
        Objects.requireNonNull(previousValue, RemoveParcelFromDeliveryChange.class + ": previousValue is missing");
        return new RemoveParcelFromDeliveryChangeImpl(change, deliveryId, previousValue);
    }

    /**
     * builds RemoveParcelFromDeliveryChange without checking for non-null required values
     * @return RemoveParcelFromDeliveryChange
     */
    public RemoveParcelFromDeliveryChange buildUnchecked() {
        return new RemoveParcelFromDeliveryChangeImpl(change, deliveryId, previousValue);
    }

    /**
     * factory method for an instance of RemoveParcelFromDeliveryChangeBuilder
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder of() {
        return new RemoveParcelFromDeliveryChangeBuilder();
    }

    /**
     * create builder for RemoveParcelFromDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder of(final RemoveParcelFromDeliveryChange template) {
        RemoveParcelFromDeliveryChangeBuilder builder = new RemoveParcelFromDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
