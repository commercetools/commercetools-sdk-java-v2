
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreateEmailToken
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreateEmailToken customerCreateEmailToken = CustomerCreateEmailToken.builder()
 *             .id("{id}")
 *             .ttlMinutes(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCreateEmailTokenImpl.class)
public interface CustomerCreateEmailToken {

    /**
     *  <p>Unique identifier of the email token.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     */
    @NotNull
    @JsonProperty("ttlMinutes")
    public Long getTtlMinutes();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setTtlMinutes(final Long ttlMinutes);

    public static CustomerCreateEmailToken of() {
        return new CustomerCreateEmailTokenImpl();
    }

    public static CustomerCreateEmailToken of(final CustomerCreateEmailToken template) {
        CustomerCreateEmailTokenImpl instance = new CustomerCreateEmailTokenImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setTtlMinutes(template.getTtlMinutes());
        return instance;
    }

    public static CustomerCreateEmailTokenBuilder builder() {
        return CustomerCreateEmailTokenBuilder.of();
    }

    public static CustomerCreateEmailTokenBuilder builder(final CustomerCreateEmailToken template) {
        return CustomerCreateEmailTokenBuilder.of(template);
    }

    default <T> T withCustomerCreateEmailToken(Function<CustomerCreateEmailToken, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreateEmailToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreateEmailToken>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreateEmailToken>";
            }
        };
    }
}
