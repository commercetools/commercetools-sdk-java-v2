package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryPayload;
import com.commercetools.api.models.subscription.PayloadNotIncluded;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.MessageDeliveryPayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessageDeliveryPayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessageDeliveryPayload messageDeliveryPayload = MessageDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MessageDeliveryPayloadBuilder implements Builder<MessageDeliveryPayload> {

    
    
    private String projectKey;
    
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    
    private Long sequenceNumber;
    
    
    
    private Long resourceVersion;
    
    
    @Nullable
    private com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded;

    
    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @param projectKey value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder projectKey( final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param resource value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    
    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param builder function to build the resource value
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder resource(Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder resourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder withResourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }
                    
    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique ID of the message.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Used to ensure all messages of the resource are processed in correct order. The <code>sequenceNumber</code> of the next message of the resource is a successor of the <code>sequenceNumber</code> of the current message.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Version of the resource on which the change was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    
    
    
    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @param builder function to build the payloadNotIncluded value
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder payloadNotIncluded(Function<com.commercetools.api.models.subscription.PayloadNotIncludedBuilder, com.commercetools.api.models.subscription.PayloadNotIncludedBuilder> builder) {
        this.payloadNotIncluded = builder.apply(com.commercetools.api.models.subscription.PayloadNotIncludedBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @param builder function to build the payloadNotIncluded value
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder withPayloadNotIncluded(Function<com.commercetools.api.models.subscription.PayloadNotIncludedBuilder, com.commercetools.api.models.subscription.PayloadNotIncluded> builder) {
        this.payloadNotIncluded = builder.apply(com.commercetools.api.models.subscription.PayloadNotIncludedBuilder.of());
        return this;
    }
                    
    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @param payloadNotIncluded value to be set
     * @return Builder
     */
    
    public MessageDeliveryPayloadBuilder payloadNotIncluded(@Nullable final com.commercetools.api.models.subscription.PayloadNotIncluded payloadNotIncluded) {
        this.payloadNotIncluded = payloadNotIncluded;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @return projectKey
     */
    
    
    public String getProjectKey(){
        return this.projectKey;
    }
    
    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @return resource
     */
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @return resourceUserProvidedIdentifiers
     */
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    /**
     *  <p>Unique ID of the message.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Last seen version of the resource.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Used to ensure all messages of the resource are processed in correct order. The <code>sequenceNumber</code> of the next message of the resource is a successor of the <code>sequenceNumber</code> of the current message.</p>
     * @return sequenceNumber
     */
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    /**
     *  <p>Version of the resource on which the change was performed.</p>
     * @return resourceVersion
     */
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @return payloadNotIncluded
     */
    
    @Nullable
    public com.commercetools.api.models.subscription.PayloadNotIncluded getPayloadNotIncluded(){
        return this.payloadNotIncluded;
    }

    /**
     * builds MessageDeliveryPayload with checking for non-null required values
     * @return MessageDeliveryPayload
     */
    public MessageDeliveryPayload build() {
        Objects.requireNonNull(projectKey, MessageDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, MessageDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(id, MessageDeliveryPayload.class + ": id is missing");
        Objects.requireNonNull(version, MessageDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(createdAt, MessageDeliveryPayload.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, MessageDeliveryPayload.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, MessageDeliveryPayload.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resourceVersion, MessageDeliveryPayload.class + ": resourceVersion is missing");
        return new MessageDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, id, version, createdAt, lastModifiedAt, sequenceNumber, resourceVersion, payloadNotIncluded);
    }
    
    /**
     * builds MessageDeliveryPayload without checking for non-null required values
     * @return MessageDeliveryPayload
     */
    public MessageDeliveryPayload buildUnchecked() {
        return new MessageDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, id, version, createdAt, lastModifiedAt, sequenceNumber, resourceVersion, payloadNotIncluded);
    }

    /**
     * factory method for an instance of MessageDeliveryPayloadBuilder
     * @return builder 
     */
    public static MessageDeliveryPayloadBuilder of() {
        return new MessageDeliveryPayloadBuilder();
    }

    /**
     * create builder for MessageDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessageDeliveryPayloadBuilder of(final MessageDeliveryPayload template) {
        MessageDeliveryPayloadBuilder builder = new MessageDeliveryPayloadBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resourceVersion = template.getResourceVersion();
        builder.payloadNotIncluded = template.getPayloadNotIncluded();
        return builder;
    }

}
