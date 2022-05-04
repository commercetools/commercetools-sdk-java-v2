
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeRemovedMessageImpl.class)
public interface OrderDiscountCodeRemovedMessage extends OrderMessage {

    String ORDER_DISCOUNT_CODE_REMOVED = "OrderDiscountCodeRemoved";

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeRemovedMessage of() {
        return new OrderDiscountCodeRemovedMessageImpl();
    }

    public static OrderDiscountCodeRemovedMessage of(final OrderDiscountCodeRemovedMessage template) {
        OrderDiscountCodeRemovedMessageImpl instance = new OrderDiscountCodeRemovedMessageImpl();
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
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static OrderDiscountCodeRemovedMessageBuilder builder() {
        return OrderDiscountCodeRemovedMessageBuilder.of();
    }

    public static OrderDiscountCodeRemovedMessageBuilder builder(final OrderDiscountCodeRemovedMessage template) {
        return OrderDiscountCodeRemovedMessageBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeRemovedMessage(Function<OrderDiscountCodeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeRemovedMessage>";
            }
        };
    }
}
