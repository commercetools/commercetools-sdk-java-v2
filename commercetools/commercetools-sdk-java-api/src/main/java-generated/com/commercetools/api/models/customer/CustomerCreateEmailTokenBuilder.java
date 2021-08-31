
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerCreateEmailTokenBuilder implements Builder<CustomerCreateEmailToken> {

    private String id;

    @Nullable
    private Long version;

    private Long ttlMinutes;

    public CustomerCreateEmailTokenBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerCreateEmailTokenBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    public CustomerCreateEmailTokenBuilder ttlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    public CustomerCreateEmailToken build() {
        Objects.requireNonNull(id, CustomerCreateEmailToken.class + ": id is missing");
        Objects.requireNonNull(ttlMinutes, CustomerCreateEmailToken.class + ": ttlMinutes is missing");
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes);
    }

    /**
     * builds CustomerCreateEmailToken without checking for non null required values
     */
    public CustomerCreateEmailToken buildUnchecked() {
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes);
    }

    public static CustomerCreateEmailTokenBuilder of() {
        return new CustomerCreateEmailTokenBuilder();
    }

    public static CustomerCreateEmailTokenBuilder of(final CustomerCreateEmailToken template) {
        CustomerCreateEmailTokenBuilder builder = new CustomerCreateEmailTokenBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.ttlMinutes = template.getTtlMinutes();
        return builder;
    }

}
