
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemReturnItemImpl.class)
public interface LineItemReturnItem extends ReturnItem {

    String LINE_ITEM_RETURN_ITEM = "LineItemReturnItem";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    public void setLineItemId(final String lineItemId);

    public static LineItemReturnItem of() {
        return new LineItemReturnItemImpl();
    }

    public static LineItemReturnItem of(final LineItemReturnItem template) {
        LineItemReturnItemImpl instance = new LineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public static LineItemReturnItemBuilder builder() {
        return LineItemReturnItemBuilder.of();
    }

    public static LineItemReturnItemBuilder builder(final LineItemReturnItem template) {
        return LineItemReturnItemBuilder.of(template);
    }

    default <T> T withLineItemReturnItem(Function<LineItemReturnItem, T> helper) {
        return helper.apply(this);
    }
}
