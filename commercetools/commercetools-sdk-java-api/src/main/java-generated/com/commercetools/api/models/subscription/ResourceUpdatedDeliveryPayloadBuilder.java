
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
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @param projectKey value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Version of the resource before the update.</p>
     * @param oldVersion value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder oldVersion(final Long oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the resource was last updated.</p>
     * @param modifiedAt value to be set
     * @return Builder
     */

    public ResourceUpdatedDeliveryPayloadBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @return projectKey
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Version of the resource before the update.</p>
     * @return oldVersion
     */

    public Long getOldVersion() {
        return this.oldVersion;
    }

    /**
     *  <p>Date and time (UTC) the resource was last updated.</p>
     * @return modifiedAt
     */

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * builds ResourceUpdatedDeliveryPayload with checking for non-null required values
     * @return ResourceUpdatedDeliveryPayload
     */
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
     * builds ResourceUpdatedDeliveryPayload without checking for non-null required values
     * @return ResourceUpdatedDeliveryPayload
     */
    public ResourceUpdatedDeliveryPayload buildUnchecked() {
        return new ResourceUpdatedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            oldVersion, modifiedAt);
    }

    /**
     * factory method for an instance of ResourceUpdatedDeliveryPayloadBuilder
     * @return builder
     */
    public static ResourceUpdatedDeliveryPayloadBuilder of() {
        return new ResourceUpdatedDeliveryPayloadBuilder();
    }

    /**
     * create builder for ResourceUpdatedDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
