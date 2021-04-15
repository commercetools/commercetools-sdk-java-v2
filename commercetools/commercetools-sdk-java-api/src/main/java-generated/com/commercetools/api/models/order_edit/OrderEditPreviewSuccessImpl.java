
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditPreviewSuccessImpl implements OrderEditPreviewSuccess {

    private String type;

    private com.commercetools.api.models.order_edit.StagedOrder preview;

    private java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads;

    @JsonCreator
    OrderEditPreviewSuccessImpl(
            @JsonProperty("preview") final com.commercetools.api.models.order_edit.StagedOrder preview,
            @JsonProperty("messagePayloads") final java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads) {
        this.preview = preview;
        this.messagePayloads = messagePayloads;
        this.type = PREVIEW_SUCCESS;
    }

    public OrderEditPreviewSuccessImpl() {
        this.type = PREVIEW_SUCCESS;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order_edit.StagedOrder getPreview() {
        return this.preview;
    }

    public java.util.List<com.commercetools.api.models.message.MessagePayload> getMessagePayloads() {
        return this.messagePayloads;
    }

    public void setPreview(final com.commercetools.api.models.order_edit.StagedOrder preview) {
        this.preview = preview;
    }

    public void setMessagePayloads(final com.commercetools.api.models.message.MessagePayload... messagePayloads) {
        this.messagePayloads = new ArrayList<>(Arrays.asList(messagePayloads));
    }

    public void setMessagePayloads(
            final java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads) {
        this.messagePayloads = messagePayloads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditPreviewSuccessImpl that = (OrderEditPreviewSuccessImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(preview, that.preview)
                .append(messagePayloads, that.messagePayloads)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(preview).append(messagePayloads).toHashCode();
    }

}
