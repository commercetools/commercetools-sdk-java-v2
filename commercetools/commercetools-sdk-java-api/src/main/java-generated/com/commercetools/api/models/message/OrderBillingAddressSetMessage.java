
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderBillingAddressSetMessageImpl.class)
public interface OrderBillingAddressSetMessage extends OrderMessage {

    String ORDER_BILLING_ADDRESS_SET = "OrderBillingAddressSet";

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static OrderBillingAddressSetMessage of() {
        return new OrderBillingAddressSetMessageImpl();
    }

    public static OrderBillingAddressSetMessage of(final OrderBillingAddressSetMessage template) {
        OrderBillingAddressSetMessageImpl instance = new OrderBillingAddressSetMessageImpl();
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
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static OrderBillingAddressSetMessageBuilder builder() {
        return OrderBillingAddressSetMessageBuilder.of();
    }

    public static OrderBillingAddressSetMessageBuilder builder(final OrderBillingAddressSetMessage template) {
        return OrderBillingAddressSetMessageBuilder.of(template);
    }

    default <T> T withOrderBillingAddressSetMessage(Function<OrderBillingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderBillingAddressSetMessage>";
            }
        };
    }
}
