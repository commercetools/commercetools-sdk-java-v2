
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderReturnInfoAddedMessagePayloadBuilder implements Builder<OrderReturnInfoAddedMessagePayload> {

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    public OrderReturnInfoAddedMessagePayloadBuilder returnInfo(
            final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    public OrderReturnInfoAddedMessagePayload build() {
        Objects.requireNonNull(returnInfo, OrderReturnInfoAddedMessagePayload.class + ": returnInfo is missing");
        return new OrderReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    /**
     * builds OrderReturnInfoAddedMessagePayload without checking for non null required values
     */
    public OrderReturnInfoAddedMessagePayload buildUnchecked() {
        return new OrderReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder of() {
        return new OrderReturnInfoAddedMessagePayloadBuilder();
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder of(final OrderReturnInfoAddedMessagePayload template) {
        OrderReturnInfoAddedMessagePayloadBuilder builder = new OrderReturnInfoAddedMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
