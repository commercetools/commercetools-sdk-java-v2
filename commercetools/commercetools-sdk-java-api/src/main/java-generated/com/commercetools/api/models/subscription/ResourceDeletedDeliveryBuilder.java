
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceDeletedDeliveryBuilder implements Builder<ResourceDeletedDelivery> {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    @Nullable
    private Boolean dataErasure;

    public ResourceDeletedDeliveryBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public ResourceDeletedDeliveryBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ResourceDeletedDeliveryBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ResourceDeletedDeliveryBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ResourceDeletedDeliveryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ResourceDeletedDeliveryBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    public ResourceDeletedDeliveryBuilder dataErasure(@Nullable final Boolean dataErasure) {
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

    public ResourceDeletedDelivery build() {
        Objects.requireNonNull(projectKey, ResourceDeletedDelivery.class + ": projectKey is missing");
        Objects.requireNonNull(resource, ResourceDeletedDelivery.class + ": resource is missing");
        Objects.requireNonNull(version, ResourceDeletedDelivery.class + ": version is missing");
        Objects.requireNonNull(modifiedAt, ResourceDeletedDelivery.class + ": modifiedAt is missing");
        return new ResourceDeletedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    /**
     * builds ResourceDeletedDelivery without checking for non null required values
     */
    public ResourceDeletedDelivery buildUnchecked() {
        return new ResourceDeletedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt, dataErasure);
    }

    public static ResourceDeletedDeliveryBuilder of() {
        return new ResourceDeletedDeliveryBuilder();
    }

    public static ResourceDeletedDeliveryBuilder of(final ResourceDeletedDelivery template) {
        ResourceDeletedDeliveryBuilder builder = new ResourceDeletedDeliveryBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.modifiedAt = template.getModifiedAt();
        builder.dataErasure = template.getDataErasure();
        return builder;
    }

}
