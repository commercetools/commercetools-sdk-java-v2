
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The CloudEventsFormat represents event data in a way that conforms to a common specification. The message payload can be found inside the <code>data</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CloudEventsPayload cloudEventsPayload = CloudEventsPayload.builder()
 *             .specversion("{specversion}")
 *             .id("{id}")
 *             .type("{type}")
 *             .source("{source}")
 *             .subject("{subject}")
 *             .time(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CloudEventsPayloadImpl.class)
public interface CloudEventsPayload {

    String CLOUD_EVENTS = "CloudEvents";

    /**
     *  <p>The version of the CloudEvents specification which the event uses.</p>
     */
    @NotNull
    @JsonProperty("specversion")
    public String getSpecversion();

    /**
     *  <p>Unique identifier of the event.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>type</code> is namespaced with <code>com.commercetools</code>, followed by the ReferenceTypeId, the type of Subscription (either <code>message</code> or <code>change</code>), and the message or change type. For example, <code>com.commercetools.product.message.ProductPublished</code> or <code>com.commercetools.order.change.ResourceCreated</code>.</p>
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>The default REST URI of the ReferenceTypeId that triggered this event, including the project key.</p>
     */
    @NotNull
    @JsonProperty("source")
    public String getSource();

    /**
     *  <p>Unique identifier of the resource that triggered the event.</p>
     */
    @NotNull
    @JsonProperty("subject")
    public String getSubject();

    /**
     *  <p>Corresponds to the <code>lastModifiedAt</code> of the resource at the time the event was triggered.</p>
     */
    @NotNull
    @JsonProperty("time")
    public ZonedDateTime getTime();

    /**
     *  <p>Corresponds to the <code>sequenceNumber</code> of a MessageSubscription. Can be used to process messages in the correct order.</p>
     */

    @JsonProperty("sequence")
    public String getSequence();

    /**
     *  <p><code>"Integer"</code></p>
     */

    @JsonProperty("sequencetype")
    public String getSequencetype();

    /**
     *  <p>The URI from which the message can be retrieved if messages are enabled. Only set for MessageSubscriptions.</p>
     */

    @JsonProperty("dataref")
    public String getDataref();

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public DeliveryPayload getData();

    public void setSpecversion(final String specversion);

    public void setId(final String id);

    public void setType(final String type);

    public void setSource(final String source);

    public void setSubject(final String subject);

    public void setTime(final ZonedDateTime time);

    public void setSequence(final String sequence);

    public void setSequencetype(final String sequencetype);

    public void setDataref(final String dataref);

    public void setData(final DeliveryPayload data);

    public static CloudEventsPayload of() {
        return new CloudEventsPayloadImpl();
    }

    public static CloudEventsPayload of(final CloudEventsPayload template) {
        CloudEventsPayloadImpl instance = new CloudEventsPayloadImpl();
        instance.setSpecversion(template.getSpecversion());
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setSource(template.getSource());
        instance.setSubject(template.getSubject());
        instance.setTime(template.getTime());
        instance.setSequence(template.getSequence());
        instance.setSequencetype(template.getSequencetype());
        instance.setDataref(template.getDataref());
        instance.setData(template.getData());
        return instance;
    }

    public static CloudEventsPayloadBuilder builder() {
        return CloudEventsPayloadBuilder.of();
    }

    public static CloudEventsPayloadBuilder builder(final CloudEventsPayload template) {
        return CloudEventsPayloadBuilder.of(template);
    }

    default <T> T withCloudEventsPayload(Function<CloudEventsPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CloudEventsPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CloudEventsPayload>() {
            @Override
            public String toString() {
                return "TypeReference<CloudEventsPayload>";
            }
        };
    }
}
