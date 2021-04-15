
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetReturnPaymentStateActionBuilder {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    public StagedOrderSetReturnPaymentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public StagedOrderSetReturnPaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public StagedOrderSetReturnPaymentStateAction build() {
        return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
    }

    public static StagedOrderSetReturnPaymentStateActionBuilder of() {
        return new StagedOrderSetReturnPaymentStateActionBuilder();
    }

    public static StagedOrderSetReturnPaymentStateActionBuilder of(
            final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionBuilder builder = new StagedOrderSetReturnPaymentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
