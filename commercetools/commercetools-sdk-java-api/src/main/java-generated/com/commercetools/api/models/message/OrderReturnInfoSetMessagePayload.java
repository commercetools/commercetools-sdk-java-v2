
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderReturnInfoSetMessagePayloadImpl.class)
public interface OrderReturnInfoSetMessagePayload extends OrderMessagePayload {

    String RETURN_INFO_SET = "ReturnInfoSet";

    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    public static OrderReturnInfoSetMessagePayload of() {
        return new OrderReturnInfoSetMessagePayloadImpl();
    }

    public static OrderReturnInfoSetMessagePayload of(final OrderReturnInfoSetMessagePayload template) {
        OrderReturnInfoSetMessagePayloadImpl instance = new OrderReturnInfoSetMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static OrderReturnInfoSetMessagePayloadBuilder builder() {
        return OrderReturnInfoSetMessagePayloadBuilder.of();
    }

    public static OrderReturnInfoSetMessagePayloadBuilder builder(final OrderReturnInfoSetMessagePayload template) {
        return OrderReturnInfoSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderReturnInfoSetMessagePayload(Function<OrderReturnInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
