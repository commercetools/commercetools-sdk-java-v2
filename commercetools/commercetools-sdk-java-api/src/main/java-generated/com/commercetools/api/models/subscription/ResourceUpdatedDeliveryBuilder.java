
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceUpdatedDeliveryBuilder {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private Long oldVersion;

    private java.time.ZonedDateTime modifiedAt;

    public ResourceUpdatedDeliveryBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public ResourceUpdatedDeliveryBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ResourceUpdatedDeliveryBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ResourceUpdatedDeliveryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ResourceUpdatedDeliveryBuilder oldVersion(final Long oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }

    public ResourceUpdatedDeliveryBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
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

    public ResourceUpdatedDelivery build() {
        return new ResourceUpdatedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            oldVersion, modifiedAt);
    }

    public static ResourceUpdatedDeliveryBuilder of() {
        return new ResourceUpdatedDeliveryBuilder();
    }

    public static ResourceUpdatedDeliveryBuilder of(final ResourceUpdatedDelivery template) {
        ResourceUpdatedDeliveryBuilder builder = new ResourceUpdatedDeliveryBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.oldVersion = template.getOldVersion();
        builder.modifiedAt = template.getModifiedAt();
        return builder;
    }

}
