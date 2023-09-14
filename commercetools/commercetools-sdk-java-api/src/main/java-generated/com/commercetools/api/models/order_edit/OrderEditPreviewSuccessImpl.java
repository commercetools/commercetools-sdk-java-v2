
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The data is not persisted but is dynamically pulled by dry-running the update actions from <code>stagedActions</code> on the current version of the related Order, not from the Order version at the time the OrderEdit was created. Therefore, it cannot be queried.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditPreviewSuccessImpl implements OrderEditPreviewSuccess, ModelBase {

    private String type;

    private com.commercetools.api.models.order_edit.StagedOrder preview;

    private java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditPreviewSuccessImpl(
            @JsonProperty("preview") final com.commercetools.api.models.order_edit.StagedOrder preview,
            @JsonProperty("messagePayloads") final java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads) {
        this.preview = preview;
        this.messagePayloads = messagePayloads;
        this.type = PREVIEW_SUCCESS;
    }

    /**
     * create empty instance
     */
    public OrderEditPreviewSuccessImpl() {
        this.type = PREVIEW_SUCCESS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>A preview of the edited Order as it will be after all <code>stagedActions</code> (incl. optional Order API Extensions) are applied.</p>
     */

    public com.commercetools.api.models.order_edit.StagedOrder getPreview() {
        return this.preview;
    }

    /**
     *  <p>Messages that will be generated if the edit is applied.</p>
     */

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
                .append(type, that.type)
                .append(preview, that.preview)
                .append(messagePayloads, that.messagePayloads)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(preview).append(messagePayloads).toHashCode();
    }

}
