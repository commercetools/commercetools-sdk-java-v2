
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerToken
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerToken customerToken = CustomerToken.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerTokenImpl.class)
public interface CustomerToken {

    /**
     *  <p>Unique identifier of the token.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Date and time (UTC) the token was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>When the token is created, <code>lastModifiedAt</code> is set to <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>The <code>id</code> of the Customer.</p>
     * @return customerId
     */
    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Date and time (UTC) the token expires.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Value of the token.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setId(final String id);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setCustomerId(final String customerId);

    public void setExpiresAt(final ZonedDateTime expiresAt);

    public void setValue(final String value);

    public static CustomerToken of() {
        return new CustomerTokenImpl();
    }

    public static CustomerToken of(final CustomerToken template) {
        CustomerTokenImpl instance = new CustomerTokenImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerTokenBuilder builder() {
        return CustomerTokenBuilder.of();
    }

    public static CustomerTokenBuilder builder(final CustomerToken template) {
        return CustomerTokenBuilder.of(template);
    }

    default <T> T withCustomerToken(Function<CustomerToken, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerToken>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerToken>";
            }
        };
    }
}
