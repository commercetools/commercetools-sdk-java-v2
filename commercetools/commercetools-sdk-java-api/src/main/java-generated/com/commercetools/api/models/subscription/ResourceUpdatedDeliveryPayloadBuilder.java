
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceUpdatedDeliveryPayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceUpdatedDeliveryPayload resourceUpdatedDeliveryPayload = ResourceUpdatedDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .version(0.3)
 *             .oldVersion(0.3)
 *             .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceUpdatedDeliveryPayloadBuilder implements Builder<ResourceUpdatedDeliveryPayload> {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private Long oldVersion;

    private java.time.ZonedDateTime modifiedAt;

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public ResourceUpdatedDeliveryPayloadBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     <*  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>>
     */

    public ResourceUpdatedDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder oldVersion(final Long oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }

    /**
     <>
     */

    public ResourceUpdatedDeliveryPayloadBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
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

    public Long getOldVersion() {
        return this.oldVersion;
    }

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    public ResourceUpdatedDeliveryPayload build() {
        Objects.requireNonNull(projectKey, ResourceUpdatedDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, ResourceUpdatedDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(version, ResourceUpdatedDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(oldVersion, ResourceUpdatedDeliveryPayload.class + ": oldVersion is missing");
        Objects.requireNonNull(modifiedAt, ResourceUpdatedDeliveryPayload.class + ": modifiedAt is missing");
        return new ResourceUpdatedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            oldVersion, modifiedAt);
    }

    /**
     * builds ResourceUpdatedDeliveryPayload without checking for non null required values
     */
    public ResourceUpdatedDeliveryPayload buildUnchecked() {
        return new ResourceUpdatedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            oldVersion, modifiedAt);
    }

    public static ResourceUpdatedDeliveryPayloadBuilder of() {
        return new ResourceUpdatedDeliveryPayloadBuilder();
    }

    public static ResourceUpdatedDeliveryPayloadBuilder of(final ResourceUpdatedDeliveryPayload template) {
        ResourceUpdatedDeliveryPayloadBuilder builder = new ResourceUpdatedDeliveryPayloadBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.oldVersion = template.getOldVersion();
        builder.modifiedAt = template.getModifiedAt();
        return builder;
    }

}
