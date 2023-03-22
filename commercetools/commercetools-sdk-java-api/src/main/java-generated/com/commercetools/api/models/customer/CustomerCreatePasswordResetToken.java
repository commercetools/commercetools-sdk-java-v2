
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreatePasswordResetToken
 *
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
@JsonDeserialize(as = CustomerCreatePasswordResetTokenImpl.class)
public interface CustomerCreatePasswordResetToken {

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @return ttlMinutes
     */

    @JsonProperty("ttlMinutes")
    public Long getTtlMinutes();

    public void setEmail(final String email);

    public void setTtlMinutes(final Long ttlMinutes);

    public static CustomerCreatePasswordResetToken of() {
        return new CustomerCreatePasswordResetTokenImpl();
    }

    public static CustomerCreatePasswordResetToken of(final CustomerCreatePasswordResetToken template) {
        CustomerCreatePasswordResetTokenImpl instance = new CustomerCreatePasswordResetTokenImpl();
        instance.setEmail(template.getEmail());
        instance.setTtlMinutes(template.getTtlMinutes());
        return instance;
    }

    public static CustomerCreatePasswordResetTokenBuilder builder() {
        return CustomerCreatePasswordResetTokenBuilder.of();
    }

    public static CustomerCreatePasswordResetTokenBuilder builder(final CustomerCreatePasswordResetToken template) {
        return CustomerCreatePasswordResetTokenBuilder.of(template);
    }

    default <T> T withCustomerCreatePasswordResetToken(Function<CustomerCreatePasswordResetToken, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatePasswordResetToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatePasswordResetToken>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatePasswordResetToken>";
            }
        };
    }
}
