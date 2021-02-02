
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderCustomerEmailSetMessagePayloadImpl.class)
public interface OrderCustomerEmailSetMessagePayload extends MessagePayload {

    String ORDER_CUSTOMER_EMAIL_SET = "OrderCustomerEmailSet";

    @JsonProperty("email")
    public String getEmail();

    @JsonProperty("oldEmail")
    public String getOldEmail();

    public void setEmail(final String email);

    public void setOldEmail(final String oldEmail);

    public static OrderCustomerEmailSetMessagePayload of() {
        return new OrderCustomerEmailSetMessagePayloadImpl();
    }

    public static OrderCustomerEmailSetMessagePayload of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder builder() {
        return OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder builder(
            final OrderCustomerEmailSetMessagePayload template) {
        return OrderCustomerEmailSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomerEmailSetMessagePayload(Function<OrderCustomerEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
