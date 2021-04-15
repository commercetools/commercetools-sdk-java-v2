
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceCreatedDeliveryBuilder {

    private String projectKey;

    private com.commercetools.api.models.common.Reference resource;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Long version;

    private java.time.ZonedDateTime modifiedAt;

    public ResourceCreatedDeliveryBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public ResourceCreatedDeliveryBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ResourceCreatedDeliveryBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ResourceCreatedDeliveryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ResourceCreatedDeliveryBuilder modifiedAt(final java.time.ZonedDateTime modifiedAt) {
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

    public ResourceCreatedDelivery build() {
        return new ResourceCreatedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, version,
            modifiedAt);
    }

    public static ResourceCreatedDeliveryBuilder of() {
        return new ResourceCreatedDeliveryBuilder();
    }

    public static ResourceCreatedDeliveryBuilder of(final ResourceCreatedDelivery template) {
        ResourceCreatedDeliveryBuilder builder = new ResourceCreatedDeliveryBuilder();
        builder.projectKey = template.getProjectKey();
        builder.resource = template.getResource();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.version = template.getVersion();
        builder.modifiedAt = template.getModifiedAt();
        return builder;
    }

}
