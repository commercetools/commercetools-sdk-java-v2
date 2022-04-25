
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
@JsonDeserialize(as = OrderReturnInfoSetMessageImpl.class)
public interface OrderReturnInfoSetMessage extends OrderMessage {

    String RETURN_INFO_SET = "ReturnInfoSet";

    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    public static OrderReturnInfoSetMessage of() {
        return new OrderReturnInfoSetMessageImpl();
    }

    public static OrderReturnInfoSetMessage of(final OrderReturnInfoSetMessage template) {
        OrderReturnInfoSetMessageImpl instance = new OrderReturnInfoSetMessageImpl();
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

    public static OrderReturnInfoSetMessageBuilder builder() {
        return OrderReturnInfoSetMessageBuilder.of();
    }

    public static OrderReturnInfoSetMessageBuilder builder(final OrderReturnInfoSetMessage template) {
        return OrderReturnInfoSetMessageBuilder.of(template);
    }

    default <T> T withOrderReturnInfoSetMessage(Function<OrderReturnInfoSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderReturnInfoSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReturnInfoSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReturnInfoSetMessage>";
            }
        };
    }
}
