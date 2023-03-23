
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceCreatedDeliveryPayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceCreatedDeliveryPayload resourceCreatedDeliveryPayload = ResourceCreatedDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .version(0.3)
 *             .modifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceCreatedDeliveryPayloadBuilder implements Builder<ResourceCreatedDeliveryPayload> {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     * @param projectKey
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param resource
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @param modifiedAt
     * @return Builder
     */

    public ResourceCreatedDeliveryPayloadBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
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

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    public ResourceCreatedDeliveryPayload build() {
        Objects.requireNonNull(projectKey, ResourceCreatedDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, ResourceCreatedDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(version, ResourceCreatedDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(modifiedAt, ResourceCreatedDeliveryPayload.class + ": modifiedAt is missing");
        return new ResourceCreatedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt);
    }

    /**
     * builds ResourceCreatedDeliveryPayload without checking for non null required values
     */
    public ResourceCreatedDeliveryPayload buildUnchecked() {
        return new ResourceCreatedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt);
    }

    public static ResourceCreatedDeliveryPayloadBuilder of() {
        return new ResourceCreatedDeliveryPayloadBuilder();
    }

    public static ResourceCreatedDeliveryPayloadBuilder of(final ResourceCreatedDeliveryPayload template) {
        ResourceCreatedDeliveryPayloadBuilder builder = new ResourceCreatedDeliveryPayloadBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.modifiedAt = template.getModifiedAt();
        return builder;
    }

}
