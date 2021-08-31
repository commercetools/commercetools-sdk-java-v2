
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CreatedByBuilder implements Builder<CreatedBy> {

    @Nullable
    private String clientId;

    @Nullable
    private String externalUserId;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    public CreatedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    public CreatedByBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    public CreatedByBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    public CreatedByBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public CreatedByBuilder anonymousId(@Nullable final String anonymousId) {
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

    public CreatedBy build() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId);
    }

    /**
     * builds CreatedBy without checking for non null required values
     */
    public CreatedBy buildUnchecked() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId);
    }

    public static CreatedByBuilder of() {
        return new CreatedByBuilder();
    }

    public static CreatedByBuilder of(final CreatedBy template) {
        CreatedByBuilder builder = new CreatedByBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
