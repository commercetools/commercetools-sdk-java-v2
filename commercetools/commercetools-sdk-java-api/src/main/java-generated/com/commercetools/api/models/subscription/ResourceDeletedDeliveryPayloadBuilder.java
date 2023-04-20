
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
     * @param projectKey value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
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
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     * @param modifiedAt value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     * @param dataErasure value to be set
     * @return Builder
     */

    public ResourceDeletedDeliveryPayloadBuilder dataErasure(@Nullable final Boolean dataErasure) {
        this.dataErasure = dataErasure;
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
     *  <p>Date and time (UTC) the resource was last deleted.</p>
     * @return modifiedAt
     */

    public java.time.ZonedDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     *  <p><code>true</code> if the <code>dataErasure</code> parameter on the <code>DELETE</code> request was set to <code>true</code>.</p>
     * @return dataErasure
     */

    @Nullable
    public Boolean getDataErasure() {
        return this.dataErasure;
    }

    /**
     * builds ResourceDeletedDeliveryPayload with checking for non-null required values
     * @return ResourceDeletedDeliveryPayload
     */
    public ResourceDeletedDeliveryPayload build() {
        Objects.requireNonNull(projectKey, ResourceDeletedDeliveryPayload.class + ": projectKey is missing");
        Objects.requireNonNull(resource, ResourceDeletedDeliveryPayload.class + ": resource is missing");
        Objects.requireNonNull(version, ResourceDeletedDeliveryPayload.class + ": version is missing");
        Objects.requireNonNull(modifiedAt, ResourceDeletedDeliveryPayload.class + ": modifiedAt is missing");
        return new ResourceDeletedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    /**
     * builds ResourceDeletedDeliveryPayload without checking for non-null required values
     * @return ResourceDeletedDeliveryPayload
     */
    public ResourceDeletedDeliveryPayload buildUnchecked() {
        return new ResourceDeletedDeliveryPayloadImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    /**
     * factory method for an instance of ResourceDeletedDeliveryPayloadBuilder
     * @return builder
     */
    public static ResourceDeletedDeliveryPayloadBuilder of() {
        return new ResourceDeletedDeliveryPayloadBuilder();
    }

    /**
     * create builder for ResourceDeletedDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
