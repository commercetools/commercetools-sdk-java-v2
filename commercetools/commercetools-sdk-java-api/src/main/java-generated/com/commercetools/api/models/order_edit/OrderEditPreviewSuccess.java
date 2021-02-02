
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditPreviewSuccessImpl.class)
public interface OrderEditPreviewSuccess extends OrderEditResult {

    String PREVIEW_SUCCESS = "PreviewSuccess";

    @NotNull
    @Valid
    @JsonProperty("preview")
    public StagedOrder getPreview();

    @NotNull
    @Valid
    @JsonProperty("messagePayloads")
    public List<MessagePayload> getMessagePayloads();

    public void setPreview(final StagedOrder preview);

    @JsonIgnore
    public void setMessagePayloads(final MessagePayload... messagePayloads);

    public void setMessagePayloads(final List<MessagePayload> messagePayloads);

    public static OrderEditPreviewSuccess of() {
        return new OrderEditPreviewSuccessImpl();
    }

    public static OrderEditPreviewSuccess of(final OrderEditPreviewSuccess template) {
        OrderEditPreviewSuccessImpl instance = new OrderEditPreviewSuccessImpl();
        instance.setPreview(template.getPreview());
        instance.setMessagePayloads(template.getMessagePayloads());
        return instance;
    }

    public static OrderEditPreviewSuccessBuilder builder() {
        return OrderEditPreviewSuccessBuilder.of();
    }

    public static OrderEditPreviewSuccessBuilder builder(final OrderEditPreviewSuccess template) {
        return OrderEditPreviewSuccessBuilder.of(template);
    }

    default <T> T withOrderEditPreviewSuccess(Function<OrderEditPreviewSuccess, T> helper) {
        return helper.apply(this);
    }
}
