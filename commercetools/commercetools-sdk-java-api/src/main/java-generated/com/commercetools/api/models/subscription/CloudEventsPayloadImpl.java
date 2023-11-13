
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The CloudEventsFormat represents event data in a way that conforms to a common specification. The message payload can be found inside the <code>data</code> field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CloudEventsPayloadImpl implements CloudEventsPayload, ModelBase {

    private String specversion;

    private String id;

    private String type;

    private String source;

    private String subject;

    private java.time.ZonedDateTime time;

    private String sequence;

    private String sequencetype;

    private String dataref;

    private com.commercetools.api.models.subscription.DeliveryPayload data;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CloudEventsPayloadImpl(@JsonProperty("specversion") final String specversion, @JsonProperty("id") final String id,
            @JsonProperty("type") final String type, @JsonProperty("source") final String source,
            @JsonProperty("subject") final String subject, @JsonProperty("time") final java.time.ZonedDateTime time,
            @JsonProperty("sequence") final String sequence, @JsonProperty("sequencetype") final String sequencetype,
            @JsonProperty("dataref") final String dataref,
            @JsonProperty("data") final com.commercetools.api.models.subscription.DeliveryPayload data) {
        this.specversion = specversion;
        this.id = id;
        this.type = type;
        this.source = source;
        this.subject = subject;
        this.time = time;
        this.sequence = sequence;
        this.sequencetype = sequencetype;
        this.dataref = dataref;
        this.data = data;
    }

    /**
     * create empty instance
     */
    public CloudEventsPayloadImpl() {
    }

    /**
     *  <p>The version of the CloudEvents specification which the event uses.</p>
     */

    public String getSpecversion() {
        return this.specversion;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>type</code> is namespaced with <code>com.commercetools</code>, followed by the ReferenceTypeId, the type of Subscription (either <code>message</code> or <code>change</code>), and the message or change type. For example, <code>com.commercetools.product.message.ProductPublished</code> or <code>com.commercetools.order.change.ResourceCreated</code>.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The default REST URI of the ReferenceTypeId that triggered this event, including the project key.</p>
     */

    public String getSource() {
        return this.source;
    }

    /**
     *  <p>Unique identifier of the resource that triggered the event.</p>
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     *  <p>Corresponds to the <code>lastModifiedAt</code> of the resource at the time the event was triggered.</p>
     */

    public java.time.ZonedDateTime getTime() {
        return this.time;
    }

    /**
     *  <p>Corresponds to the <code>sequenceNumber</code> of a MessageSubscription. Can be used to process messages in the correct order.</p>
     */

    public String getSequence() {
        return this.sequence;
    }

    /**
     *  <p><code>"Integer"</code></p>
     */

    public String getSequencetype() {
        return this.sequencetype;
    }

    /**
     *  <p>The URI from which the message can be retrieved if messages are enabled. Only set for MessageSubscriptions.</p>
     */

    public String getDataref() {
        return this.dataref;
    }

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload.</p>
     */

    public com.commercetools.api.models.subscription.DeliveryPayload getData() {
        return this.data;
    }

    public void setSpecversion(final String specversion) {
        this.specversion = specversion;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public void setTime(final java.time.ZonedDateTime time) {
        this.time = time;
    }

    public void setSequence(final String sequence) {
        this.sequence = sequence;
    }

    public void setSequencetype(final String sequencetype) {
        this.sequencetype = sequencetype;
    }

    public void setDataref(final String dataref) {
        this.dataref = dataref;
    }

    public void setData(final com.commercetools.api.models.subscription.DeliveryPayload data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CloudEventsPayloadImpl that = (CloudEventsPayloadImpl) o;

        return new EqualsBuilder().append(specversion, that.specversion)
                .append(id, that.id)
                .append(type, that.type)
                .append(source, that.source)
                .append(subject, that.subject)
                .append(time, that.time)
                .append(sequence, that.sequence)
                .append(sequencetype, that.sequencetype)
                .append(dataref, that.dataref)
                .append(data, that.data)
                .append(specversion, that.specversion)
                .append(id, that.id)
                .append(type, that.type)
                .append(source, that.source)
                .append(subject, that.subject)
                .append(time, that.time)
                .append(sequence, that.sequence)
                .append(sequencetype, that.sequencetype)
                .append(dataref, that.dataref)
                .append(data, that.data)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(specversion)
                .append(id)
                .append(type)
                .append(source)
                .append(subject)
                .append(time)
                .append(sequence)
                .append(sequencetype)
                .append(dataref)
                .append(data)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("specversion", specversion)
                .append("id", id)
                .append("type", type)
                .append("source", source)
                .append("subject", subject)
                .append("time", time)
                .append("sequence", sequence)
                .append("sequencetype", sequencetype)
                .append("dataref", dataref)
                .append("data", data)
                .build();
    }

}
