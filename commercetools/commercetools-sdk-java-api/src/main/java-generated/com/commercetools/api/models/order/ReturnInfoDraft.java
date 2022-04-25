
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
@JsonDeserialize(as = ReturnInfoDraftImpl.class)
public interface ReturnInfoDraft {

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    /**
    *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
    */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    public void setItems(final List<ReturnItemDraft> items);

    public void setReturnTrackingId(final String returnTrackingId);

    public void setReturnDate(final ZonedDateTime returnDate);

    public static ReturnInfoDraft of() {
        return new ReturnInfoDraftImpl();
    }

    public static ReturnInfoDraft of(final ReturnInfoDraft template) {
        ReturnInfoDraftImpl instance = new ReturnInfoDraftImpl();
        instance.setItems(template.getItems());
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public static ReturnInfoDraftBuilder builder() {
        return ReturnInfoDraftBuilder.of();
    }

    public static ReturnInfoDraftBuilder builder(final ReturnInfoDraft template) {
        return ReturnInfoDraftBuilder.of(template);
    }

    default <T> T withReturnInfoDraft(Function<ReturnInfoDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoDraft>";
            }
        };
    }
}
