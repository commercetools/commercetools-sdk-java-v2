
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReturnItemImpl.class)
public interface ReturnItem {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("comment")
    public String getComment();

    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public String getLastModifiedAt();

    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    public void setId(final String id);

    public void setQuantity(final Integer quantity);

    public void setType(final String type);

    public void setComment(final String comment);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public void setPaymentState(final ReturnPaymentState paymentState);

    public void setLastModifiedAt(final String lastModifiedAt);

    public void setCreatedAt(final String createdAt);

    public static ReturnItem of() {
        return new ReturnItemImpl();
    }

    public static ReturnItem of(final ReturnItem template) {
        ReturnItemImpl instance = new ReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setType(template.getType());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public static ReturnItemBuilder builder() {
        return ReturnItemBuilder.of();
    }

    public static ReturnItemBuilder builder(final ReturnItem template) {
        return ReturnItemBuilder.of(template);
    }

    default <T> T withReturnItem(Function<ReturnItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItem>";
            }
        };
    }
}
