
package com.commercetools.history.models;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ModifiedByBuilder {

    private String id;

    private String type;

    @Nullable
    private com.commercetools.history.models.common.Reference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String clientId;

    private Boolean isPlatformClient;

    public ModifiedByBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ModifiedByBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public ModifiedByBuilder customer(@Nullable final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    public ModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    public ModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    public ModifiedByBuilder isPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    public ModifiedBy build() {
        return new ModifiedByImpl(id, type, customer, anonymousId, clientId, isPlatformClient);
    }

    public static ModifiedByBuilder of() {
        return new ModifiedByBuilder();
    }

    public static ModifiedByBuilder of(final ModifiedBy template) {
        ModifiedByBuilder builder = new ModifiedByBuilder();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.clientId = template.getClientId();
        builder.isPlatformClient = template.getIsPlatformClient();
        return builder;
    }

}
