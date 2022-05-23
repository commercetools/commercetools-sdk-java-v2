
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailVerifyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerify customerEmailVerify = CustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailVerifyBuilder implements Builder<CustomerEmailVerify> {

    @Nullable
    private Long version;

    private String tokenValue;

    /**
     <>
     */

    public CustomerEmailVerifyBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

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
        Objects.requireNonNull(tokenValue, CustomerEmailVerify.class + ": tokenValue is missing");
        return new CustomerEmailVerifyImpl(version, tokenValue);
    }

    /**
     * builds CustomerEmailVerify without checking for non null required values
     */
    public CustomerEmailVerify buildUnchecked() {
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
