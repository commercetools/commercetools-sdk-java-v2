
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreatePasswordResetTokenBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreatePasswordResetToken customerCreatePasswordResetToken = CustomerCreatePasswordResetToken.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCreatePasswordResetTokenBuilder implements Builder<CustomerCreatePasswordResetToken> {

    private String email;

    @Nullable
    private Long ttlMinutes;

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @param email
     * @return Builder
     */

    public CustomerCreatePasswordResetTokenBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @param ttlMinutes
     * @return Builder
     */

    public CustomerCreatePasswordResetTokenBuilder ttlMinutes(@Nullable final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    @Nullable
    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    public CustomerCreatePasswordResetToken build() {
        Objects.requireNonNull(email, CustomerCreatePasswordResetToken.class + ": email is missing");
        return new CustomerCreatePasswordResetTokenImpl(email, ttlMinutes);
    }

    /**
     * builds CustomerCreatePasswordResetToken without checking for non null required values
     */
    public CustomerCreatePasswordResetToken buildUnchecked() {
        return new CustomerCreatePasswordResetTokenImpl(email, ttlMinutes);
    }

    public static CustomerCreatePasswordResetTokenBuilder of() {
        return new CustomerCreatePasswordResetTokenBuilder();
    }

    public static CustomerCreatePasswordResetTokenBuilder of(final CustomerCreatePasswordResetToken template) {
        CustomerCreatePasswordResetTokenBuilder builder = new CustomerCreatePasswordResetTokenBuilder();
        builder.email = template.getEmail();
        builder.ttlMinutes = template.getTtlMinutes();
        return builder;
    }

}
