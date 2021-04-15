
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderReturnInfoAddedMessagePayloadBuilder {

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
