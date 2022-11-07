
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceDeletedDeliveryPayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceDeletedDeliveryPayload resourceDeletedDeliveryPayload = ResourceDeletedDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .version(0.3)
 *             .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceDeletedDeliveryPayloadBuilder implements Builder<ResourceDeletedDeliveryPayload> {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    @Nullable
    private Boolean dataErasure;

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     */

    public ResourceDeletedDeliveryPayloadBuilder dataErasure(@Nullable final Boolean dataErasure) {
        this.dataErasure = dataErasure;
        return this;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    @Nullable
    public Boolean getDataErasure() {
        return this.dataErasure;
    }

    public ResourceDeletedDeliveryPayload build() {
        Objects.requireNonNull(projectKey, ResourceDeletedDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, ResourceDeletedDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(version, ResourceDeletedDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(modifiedAt, ResourceDeletedDeliveryPayload.class + ": modifiedAt is missing");
        return new ResourceDeletedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    /**
     * builds ResourceDeletedDeliveryPayload without checking for non null required values
     */
    public ResourceDeletedDeliveryPayload buildUnchecked() {
        return new ResourceDeletedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    public static ResourceDeletedDeliveryPayloadBuilder of() {
        return new ResourceDeletedDeliveryPayloadBuilder();
    }

    public static ResourceDeletedDeliveryPayloadBuilder of(final ResourceDeletedDeliveryPayload template) {
        ResourceDeletedDeliveryPayloadBuilder builder = new ResourceDeletedDeliveryPayloadBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.modifiedAt = template.getModifiedAt();
        builder.dataErasure = template.getDataErasure();
        return builder;
    }

}
