
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ClientLoggingBuilder implements Builder<ClientLogging> {

    @Nullable
    private String clientId;

    @Nullable
    private String externalUserId;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    public ClientLoggingBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    public ClientLoggingBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    public ClientLoggingBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    public ClientLoggingBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public ClientLoggingBuilder anonymousId(@Nullable final String anonymousId) {
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

    public ClientLogging build() {
        return new ClientLoggingImpl(clientId, externalUserId, customer, anonymousId);
    }

    /**
     * builds ClientLogging without checking for non null required values
     */
    public ClientLogging buildUnchecked() {
        return new ClientLoggingImpl(clientId, externalUserId, customer, anonymousId);
    }

    public static ClientLoggingBuilder of() {
        return new ClientLoggingBuilder();
    }

    public static ClientLoggingBuilder of(final ClientLogging template) {
        ClientLoggingBuilder builder = new ClientLoggingBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
