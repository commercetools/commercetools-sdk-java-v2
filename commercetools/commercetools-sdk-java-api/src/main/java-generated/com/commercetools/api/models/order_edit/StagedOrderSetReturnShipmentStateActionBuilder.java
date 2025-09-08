
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = StagedOrderSetReturnShipmentStateAction.builder()
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnShipmentStateActionBuilder
        implements Builder<StagedOrderSetReturnShipmentStateAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnShipmentStateActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetReturnShipmentStateActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>New shipment state of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public StagedOrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @Nullable
    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @Nullable
    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>New shipment state of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
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
        Objects.requireNonNull(shipmentState,
            StagedOrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, returnItemKey, shipmentState);
    }

    /**
     * builds StagedOrderSetReturnShipmentStateAction without checking for non-null required values
     * @return StagedOrderSetReturnShipmentStateAction
     */
    public StagedOrderSetReturnShipmentStateAction buildUnchecked() {
        return new StagedOrderSetReturnShipmentStateActionImpl(returnItemId, returnItemKey, shipmentState);
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
        builder.returnItemKey = template.getReturnItemKey();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
