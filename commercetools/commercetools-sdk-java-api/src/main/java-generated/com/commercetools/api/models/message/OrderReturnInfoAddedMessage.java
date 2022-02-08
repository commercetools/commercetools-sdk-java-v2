
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderReturnInfoAddedMessageImpl.class)
public interface OrderReturnInfoAddedMessage extends OrderMessage {

    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    public void setReturnInfo(final ReturnInfo returnInfo);

    public static OrderReturnInfoAddedMessage of() {
        return new OrderReturnInfoAddedMessageImpl();
    }

    public static OrderReturnInfoAddedMessage of(final OrderReturnInfoAddedMessage template) {
        OrderReturnInfoAddedMessageImpl instance = new OrderReturnInfoAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static OrderReturnInfoAddedMessageBuilder builder() {
        return OrderReturnInfoAddedMessageBuilder.of();
    }

    public static OrderReturnInfoAddedMessageBuilder builder(final OrderReturnInfoAddedMessage template) {
        return OrderReturnInfoAddedMessageBuilder.of(template);
    }

    default <T> T withOrderReturnInfoAddedMessage(Function<OrderReturnInfoAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
