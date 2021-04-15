
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LastModifiedByBuilder {

    @Nullable
    private String clientId;

    @Nullable
    private String externalUserId;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    public LastModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    public LastModifiedByBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    public LastModifiedByBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public LastModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    @Nullable
    public String getExternalUserId() {
        return this.externalUserId;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public LastModifiedBy build() {
        return new LastModifiedByImpl(clientId, externalUserId, customer, anonymousId);
    }

    public static LastModifiedByBuilder of() {
        return new LastModifiedByBuilder();
    }

    public static LastModifiedByBuilder of(final LastModifiedBy template) {
        LastModifiedByBuilder builder = new LastModifiedByBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
