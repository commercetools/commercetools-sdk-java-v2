
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderAddReturnInfoActionImpl.class)
public interface OrderAddReturnInfoAction extends OrderUpdateAction {

    String ADD_RETURN_INFO = "addReturnInfo";

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    public void setReturnTrackingId(final String returnTrackingId);

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    public void setItems(final List<ReturnItemDraft> items);

    public void setReturnDate(final ZonedDateTime returnDate);

    public static OrderAddReturnInfoAction of() {
        return new OrderAddReturnInfoActionImpl();
    }

    public static OrderAddReturnInfoAction of(final OrderAddReturnInfoAction template) {
        OrderAddReturnInfoActionImpl instance = new OrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(template.getItems());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public static OrderAddReturnInfoActionBuilder builder() {
        return OrderAddReturnInfoActionBuilder.of();
    }

    public static OrderAddReturnInfoActionBuilder builder(final OrderAddReturnInfoAction template) {
        return OrderAddReturnInfoActionBuilder.of(template);
    }

    default <T> T withOrderAddReturnInfoAction(Function<OrderAddReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddReturnInfoAction>";
            }
        };
    }
}
