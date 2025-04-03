
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The CloudEventsFormat represents event data in a way that conforms to a common specification. The payload can be found inside the <code>data</code> field.</p>
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

    /**
     * discriminator value for CloudEventsPayload
     */
    String CLOUD_EVENTS = "CloudEvents";

    /**
     *  <p>The version of the CloudEvents specification which the event uses.</p>
     * @return specversion
     */
    @NotNull
    @JsonProperty("specversion")
    public String getSpecversion();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>type</code> is namespaced with <code>com.commercetools</code>, followed by the ReferenceTypeId, the type of Subscription (either <code>message</code> or <code>change</code>), and the message or change type. For example, <code>com.commercetools.product.message.ProductPublished</code> or <code>com.commercetools.order.change.ResourceCreated</code>.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>The default REST URI of the ReferenceTypeId that triggered this event, including the project key.</p>
     * @return source
     */
    @NotNull
    @JsonProperty("source")
    public String getSource();

    /**
     *  <p>Unique identifier of the resource that triggered the event.</p>
     * @return subject
     */
    @NotNull
    @JsonProperty("subject")
    public String getSubject();

    /**
     *  <p>Corresponds to the <code>lastModifiedAt</code> of the resource at the time the event was triggered.</p>
     * @return time
     */
    @NotNull
    @JsonProperty("time")
    public ZonedDateTime getTime();

    /**
     *  <p>Corresponds to the <code>sequenceNumber</code> of a MessageSubscription. Can be used to process messages in the correct order.</p>
     * @return sequence
     */

    @JsonProperty("sequence")
    public String getSequence();

    /**
     *  <p><code>"Integer"</code></p>
     * @return sequencetype
     */

    @JsonProperty("sequencetype")
    public String getSequencetype();

    /**
     *  <p>The URI from which the message can be retrieved if messages are enabled. Only set for MessageSubscriptions.</p>
     * @return dataref
     */

    @JsonProperty("dataref")
    public String getDataref();

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload, EventDeliveryPayload.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public DeliveryPayload getData();

    /**
     *  <p>The version of the CloudEvents specification which the event uses.</p>
     * @param specversion value to be set
     */

    public void setSpecversion(final String specversion);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The <code>type</code> is namespaced with <code>com.commercetools</code>, followed by the ReferenceTypeId, the type of Subscription (either <code>message</code> or <code>change</code>), and the message or change type. For example, <code>com.commercetools.product.message.ProductPublished</code> or <code>com.commercetools.order.change.ResourceCreated</code>.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>The default REST URI of the ReferenceTypeId that triggered this event, including the project key.</p>
     * @param source value to be set
     */

    public void setSource(final String source);

    /**
     *  <p>Unique identifier of the resource that triggered the event.</p>
     * @param subject value to be set
     */

    public void setSubject(final String subject);

    /**
     *  <p>Corresponds to the <code>lastModifiedAt</code> of the resource at the time the event was triggered.</p>
     * @param time value to be set
     */

    public void setTime(final ZonedDateTime time);

    /**
     *  <p>Corresponds to the <code>sequenceNumber</code> of a MessageSubscription. Can be used to process messages in the correct order.</p>
     * @param sequence value to be set
     */

    public void setSequence(final String sequence);

    /**
     *  <p><code>"Integer"</code></p>
     * @param sequencetype value to be set
     */

    public void setSequencetype(final String sequencetype);

    /**
     *  <p>The URI from which the message can be retrieved if messages are enabled. Only set for MessageSubscriptions.</p>
     * @param dataref value to be set
     */

    public void setDataref(final String dataref);

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload, EventDeliveryPayload.</p>
     * @param data value to be set
     */

    public void setData(final DeliveryPayload data);

    /**
     * factory method
     * @return instance of CloudEventsPayload
     */
    public static CloudEventsPayload of() {
        return new CloudEventsPayloadImpl();
    }

    /**
     * factory method to create a shallow copy CloudEventsPayload
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of CloudEventsPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CloudEventsPayload deepCopy(@Nullable final CloudEventsPayload template) {
        if (template == null) {
            return null;
        }
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
        instance.setData(com.commercetools.api.models.subscription.DeliveryPayload.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CloudEventsPayload
     * @return builder
     */
    public static CloudEventsPayloadBuilder builder() {
        return CloudEventsPayloadBuilder.of();
    }

    /**
     * create builder for CloudEventsPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CloudEventsPayloadBuilder builder(final CloudEventsPayload template) {
        return CloudEventsPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCloudEventsPayload(Function<CloudEventsPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CloudEventsPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CloudEventsPayload>() {
            @Override
            public String toString() {
                return "TypeReference<CloudEventsPayload>";
            }
        };
    }
}
