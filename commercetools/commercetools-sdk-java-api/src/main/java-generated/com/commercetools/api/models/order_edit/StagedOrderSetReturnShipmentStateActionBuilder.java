
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = StagedOrderSetReturnShipmentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnShipmentStateActionBuilder
        implements Builder<StagedOrderSetReturnShipmentStateAction> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnShipmentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */

    public StagedOrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     * value of returnItemId}
     * @return returnItemId
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     * value of shipmentState}
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds StagedOrderSetReturnShipmentStateAction with checking for non-null required values
     * @return StagedOrderSetReturnShipmentStateAction
     */
    public StagedOrderSetReturnShipmentStateAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnShipmentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(shipmentState,
            StagedOrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * builds StagedOrderSetReturnShipmentStateAction without checking for non-null required values
     * @return StagedOrderSetReturnShipmentStateAction
     */
    public StagedOrderSetReturnShipmentStateAction buildUnchecked() {
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnShipmentStateActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnShipmentStateActionBuilder of() {
        return new StagedOrderSetReturnShipmentStateActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnShipmentStateActionBuilder of(
            final StagedOrderSetReturnShipmentStateAction template) {
        StagedOrderSetReturnShipmentStateActionBuilder builder = new StagedOrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
