
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CloudEventsPayloadBuilder
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
public class CloudEventsPayloadBuilder implements Builder<CloudEventsPayload> {

    private String specversion;

    private String id;

    private String type;

    private String source;

    private String subject;

    private java.time.ZonedDateTime time;

    @Nullable
    private String sequence;

    @Nullable
    private String sequencetype;

    @Nullable
    private String dataref;

    private com.commercetools.api.models.subscription.DeliveryPayload data;

    /**
     *  <p>The version of the CloudEvents specification which the event uses.</p>
     * @param specversion value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder specversion(final String specversion) {
        this.specversion = specversion;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param id value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>type</code> is namespaced with <code>com.commercetools</code>, followed by the ReferenceTypeId, the type of Subscription (either <code>message</code> or <code>change</code>), and the message or change type. For example, <code>com.commercetools.product.message.ProductPublished</code> or <code>com.commercetools.order.change.ResourceCreated</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>The default REST URI of the ReferenceTypeId that triggered this event, including the project key.</p>
     * @param source value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder source(final String source) {
        this.source = source;
        return this;
    }

    /**
     *  <p>Unique identifier of the resource that triggered the event.</p>
     * @param subject value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder subject(final String subject) {
        this.subject = subject;
        return this;
    }

    /**
     *  <p>Corresponds to the <code>lastModifiedAt</code> of the resource at the time the event was triggered.</p>
     * @param time value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder time(final java.time.ZonedDateTime time) {
        this.time = time;
        return this;
    }

    /**
     *  <p>Corresponds to the <code>sequenceNumber</code> of a MessageSubscription. Can be used to process messages in the correct order.</p>
     * @param sequence value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder sequence(@Nullable final String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     *  <p><code>"Integer"</code></p>
     * @param sequencetype value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder sequencetype(@Nullable final String sequencetype) {
        this.sequencetype = sequencetype;
        return this;
    }

    /**
     *  <p>The URI from which the message can be retrieved if messages are enabled. Only set for MessageSubscriptions.</p>
     * @param dataref value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder dataref(@Nullable final String dataref) {
        this.dataref = dataref;
        return this;
    }

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload.</p>
     * @param data value to be set
     * @return Builder
     */

    public CloudEventsPayloadBuilder data(final com.commercetools.api.models.subscription.DeliveryPayload data) {
        this.data = data;
        return this;
    }

    /**
     *  <p>MessageDeliveryPayload, ResourceCreatedDeliveryPayload, ResourceUpdatedDeliveryPayload, or ResourceDeletedDeliveryPayload.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CloudEventsPayloadBuilder data(
            Function<com.commercetools.api.models.subscription.DeliveryPayloadBuilder, Builder<? extends com.commercetools.api.models.subscription.DeliveryPayload>> builder) {
        this.data = builder.apply(com.commercetools.api.models.subscription.DeliveryPayloadBuilder.of()).build();
        return this;
    }

    public String getSpecversion() {
        return this.specversion;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getSource() {
        return this.source;
    }

    public String getSubject() {
        return this.subject;
    }

    public java.time.ZonedDateTime getTime() {
        return this.time;
    }

    @Nullable
    public String getSequence() {
        return this.sequence;
    }

    @Nullable
    public String getSequencetype() {
        return this.sequencetype;
    }

    @Nullable
    public String getDataref() {
        return this.dataref;
    }

    public com.commercetools.api.models.subscription.DeliveryPayload getData() {
        return this.data;
    }

    /**
     * builds CloudEventsPayload with checking for non-null required values
     * @return CloudEventsPayload
     */
    public CloudEventsPayload build() {
        Objects.requireNonNull(specversion, CloudEventsPayload.class + ": specversion is missing");
        Objects.requireNonNull(id, CloudEventsPayload.class + ": id is missing");
        Objects.requireNonNull(type, CloudEventsPayload.class + ": type is missing");
        Objects.requireNonNull(source, CloudEventsPayload.class + ": source is missing");
        Objects.requireNonNull(subject, CloudEventsPayload.class + ": subject is missing");
        Objects.requireNonNull(time, CloudEventsPayload.class + ": time is missing");
        Objects.requireNonNull(data, CloudEventsPayload.class + ": data is missing");
        return new CloudEventsPayloadImpl(specversion, id, type, source, subject, time, sequence, sequencetype, dataref,
            data);
    }

    /**
     * builds CloudEventsPayload without checking for non-null required values
     * @return CloudEventsPayload
     */
    public CloudEventsPayload buildUnchecked() {
        return new CloudEventsPayloadImpl(specversion, id, type, source, subject, time, sequence, sequencetype, dataref,
            data);
    }

    public static CloudEventsPayloadBuilder of() {
        return new CloudEventsPayloadBuilder();
    }

    public static CloudEventsPayloadBuilder of(final CloudEventsPayload template) {
        CloudEventsPayloadBuilder builder = new CloudEventsPayloadBuilder();
        builder.specversion = template.getSpecversion();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.source = template.getSource();
        builder.subject = template.getSubject();
        builder.time = template.getTime();
        builder.sequence = template.getSequence();
        builder.sequencetype = template.getSequencetype();
        builder.dataref = template.getDataref();
        builder.data = template.getData();
        return builder;
    }

}
