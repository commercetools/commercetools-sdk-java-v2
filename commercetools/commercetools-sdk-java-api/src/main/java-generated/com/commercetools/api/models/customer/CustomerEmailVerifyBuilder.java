
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerEmailVerifyBuilder {

    @Nullable
    private Long version;

    private String tokenValue;

    public CustomerEmailVerifyBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    public CustomerEmailVerifyBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public CustomerEmailVerify build() {
        return new CustomerEmailVerifyImpl(version, tokenValue);
    }

    public static CustomerEmailVerifyBuilder of() {
        return new CustomerEmailVerifyBuilder();
    }

    public static CustomerEmailVerifyBuilder of(final CustomerEmailVerify template) {
        CustomerEmailVerifyBuilder builder = new CustomerEmailVerifyBuilder();
        builder.version = template.getVersion();
        builder.tokenValue = template.getTokenValue();
        return builder;
    }

}
