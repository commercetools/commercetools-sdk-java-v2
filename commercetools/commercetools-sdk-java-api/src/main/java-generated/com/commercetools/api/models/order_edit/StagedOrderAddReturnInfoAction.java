
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddReturnInfoActionImpl.class)
public interface StagedOrderAddReturnInfoAction extends StagedOrderUpdateAction {

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

    public static StagedOrderAddReturnInfoAction of() {
        return new StagedOrderAddReturnInfoActionImpl();
    }

    public static StagedOrderAddReturnInfoAction of(final StagedOrderAddReturnInfoAction template) {
        StagedOrderAddReturnInfoActionImpl instance = new StagedOrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(template.getItems());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public static StagedOrderAddReturnInfoActionBuilder builder() {
        return StagedOrderAddReturnInfoActionBuilder.of();
    }

    public static StagedOrderAddReturnInfoActionBuilder builder(final StagedOrderAddReturnInfoAction template) {
        return StagedOrderAddReturnInfoActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddReturnInfoAction(Function<StagedOrderAddReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddReturnInfoAction>";
            }
        };
    }
}
