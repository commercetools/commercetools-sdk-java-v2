
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnPaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnPaymentStateAction stagedOrderSetReturnPaymentStateAction = StagedOrderSetReturnPaymentStateAction.builder()
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnPaymentStateActionBuilder implements Builder<StagedOrderSetReturnPaymentStateAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnPaymentStateActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetReturnPaymentStateActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>New Payment status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public StagedOrderSetReturnPaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
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
     *  <p>New Payment status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @return paymentState
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds StagedOrderSetReturnPaymentStateAction with checking for non-null required values
     * @return StagedOrderSetReturnPaymentStateAction
     */
    public StagedOrderSetReturnPaymentStateAction build() {
        Objects.requireNonNull(paymentState,
            StagedOrderSetReturnPaymentStateAction.class + ": paymentState is missing");
        return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, returnItemKey, paymentState);
    }

    /**
     * builds StagedOrderSetReturnPaymentStateAction without checking for non-null required values
     * @return StagedOrderSetReturnPaymentStateAction
     */
    public StagedOrderSetReturnPaymentStateAction buildUnchecked() {
        return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, returnItemKey, paymentState);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnPaymentStateActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder of() {
        return new StagedOrderSetReturnPaymentStateActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnPaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder of(
            final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionBuilder builder = new StagedOrderSetReturnPaymentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnItemKey = template.getReturnItemKey();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
