
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderLabelImpl.class)
public interface OrderLabel extends Label {

    String ORDER_LABEL = "OrderLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    public void setCustomerEmail(final String customerEmail);

    public void setOrderNumber(final String orderNumber);

    public static OrderLabel of() {
        return new OrderLabelImpl();
    }

    public static OrderLabel of(final OrderLabel template) {
        OrderLabelImpl instance = new OrderLabelImpl();
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    public static OrderLabelBuilder builder() {
        return OrderLabelBuilder.of();
    }

    public static OrderLabelBuilder builder(final OrderLabel template) {
        return OrderLabelBuilder.of(template);
    }

    default <T> T withOrderLabel(Function<OrderLabel, T> helper) {
        return helper.apply(this);
    }
}
