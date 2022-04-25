
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft extends com.commercetools.api.models.CustomizableDraft<ReturnItemDraft> {

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

    /**
    *  <p>Custom Fields of this return item.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setQuantity(final Long quantity);

    public void setLineItemId(final String lineItemId);

    public void setCustomLineItemId(final String customLineItemId);

    public void setComment(final String comment);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public void setCustom(final CustomFieldsDraft custom);

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
        instance.setCustom(template.getCustom());
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

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItemDraft>";
            }
        };
    }
}
