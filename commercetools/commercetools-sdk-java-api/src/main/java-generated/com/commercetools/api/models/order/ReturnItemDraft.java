
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft {

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    @JsonProperty("lineItemId")
    public String getLineItemId();

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @JsonProperty("comment")
    public String getComment();

    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    public void setQuantity(final Long quantity);

    public void setLineItemId(final String lineItemId);

    public void setCustomLineItemId(final String customLineItemId);

    public void setComment(final String comment);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public static ReturnItemDraft of() {
        return new ReturnItemDraftImpl();
    }

    public static ReturnItemDraft of(final ReturnItemDraft template) {
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static ReturnItemDraftBuilder builder() {
        return ReturnItemDraftBuilder.of();
    }

    public static ReturnItemDraftBuilder builder(final ReturnItemDraft template) {
        return ReturnItemDraftBuilder.of(template);
    }

    default <T> T withReturnItemDraft(Function<ReturnItemDraft, T> helper) {
        return helper.apply(this);
    }
}
