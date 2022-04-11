
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderReturnInfoSetMessagePayloadBuilder implements Builder<OrderReturnInfoSetMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    public OrderReturnInfoSetMessagePayloadBuilder returnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    public OrderReturnInfoSetMessagePayloadBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public OrderReturnInfoSetMessagePayloadBuilder plusReturnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.addAll(Arrays.asList(returnInfo));
        return this;
    }

    public OrderReturnInfoSetMessagePayloadBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    public OrderReturnInfoSetMessagePayloadBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    public OrderReturnInfoSetMessagePayload build() {
        return new OrderReturnInfoSetMessagePayloadImpl(returnInfo);
    }

    /**
     * builds OrderReturnInfoSetMessagePayload without checking for non null required values
     */
    public OrderReturnInfoSetMessagePayload buildUnchecked() {
        return new OrderReturnInfoSetMessagePayloadImpl(returnInfo);
    }

    public static OrderReturnInfoSetMessagePayloadBuilder of() {
        return new OrderReturnInfoSetMessagePayloadBuilder();
    }

    public static OrderReturnInfoSetMessagePayloadBuilder of(final OrderReturnInfoSetMessagePayload template) {
        OrderReturnInfoSetMessagePayloadBuilder builder = new OrderReturnInfoSetMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
