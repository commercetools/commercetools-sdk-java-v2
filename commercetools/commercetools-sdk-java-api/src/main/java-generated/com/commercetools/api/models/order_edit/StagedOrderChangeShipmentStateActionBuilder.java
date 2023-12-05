
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeShipmentStateAction stagedOrderChangeShipmentStateAction = StagedOrderChangeShipmentStateAction.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeShipmentStateActionBuilder implements Builder<StagedOrderChangeShipmentStateAction> {

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    /**
     *  <p>New shipment status of the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public StagedOrderChangeShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>New shipment status of the Order.</p>
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds StagedOrderChangeShipmentStateAction with checking for non-null required values
     * @return StagedOrderChangeShipmentStateAction
     */
    public StagedOrderChangeShipmentStateAction build() {
        Objects.requireNonNull(shipmentState,
            StagedOrderChangeShipmentStateAction.class + ": shipmentState is missing");
        return new StagedOrderChangeShipmentStateActionImpl(shipmentState);
    }

    /**
     * builds StagedOrderChangeShipmentStateAction without checking for non-null required values
     * @return StagedOrderChangeShipmentStateAction
     */
    public StagedOrderChangeShipmentStateAction buildUnchecked() {
        return new StagedOrderChangeShipmentStateActionImpl(shipmentState);
    }

    /**
     * factory method for an instance of StagedOrderChangeShipmentStateActionBuilder
     * @return builder
     */
    public static StagedOrderChangeShipmentStateActionBuilder of() {
        return new StagedOrderChangeShipmentStateActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeShipmentStateActionBuilder of(final StagedOrderChangeShipmentStateAction template) {
        StagedOrderChangeShipmentStateActionBuilder builder = new StagedOrderChangeShipmentStateActionBuilder();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
