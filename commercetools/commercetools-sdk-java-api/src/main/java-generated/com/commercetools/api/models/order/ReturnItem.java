
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.CustomLineItemReturnItemImpl.class, name = CustomLineItemReturnItem.CUSTOM_LINE_ITEM_RETURN_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.LineItemReturnItemImpl.class, name = LineItemReturnItem.LINE_ITEM_RETURN_ITEM) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ReturnItemImpl.class, visible = true)
@JsonDeserialize(as = ReturnItemImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ReturnItem extends com.commercetools.api.models.Customizable<ReturnItem> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @JsonProperty("comment")
    public String getComment();

    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
    *  <p>Custom Fields of this return item.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    public void setId(final String id);

    public void setQuantity(final Long quantity);

    public void setComment(final String comment);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public void setPaymentState(final ReturnPaymentState paymentState);

    public void setCustom(final CustomFields custom);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setCreatedAt(final ZonedDateTime createdAt);

    default <T> T withReturnItem(Function<ReturnItem, T> helper) {
        return helper.apply(this);
    }
}
