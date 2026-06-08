
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     *  <p>Unique identifier of the Customer.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Expected version of the Customer.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @return ttlMinutes
     */
    @NotNull
    @JsonProperty("ttlMinutes")
    public Long getTtlMinutes();

    /**
     *  <p>If set to <code>true</code>, all email tokens issued previously for the Customer will be invalidated.</p>
     * @return invalidateOlderTokens
     */

    @JsonProperty("invalidateOlderTokens")
    public Boolean getInvalidateOlderTokens();

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @param ttlMinutes value to be set
     */

    public void setTtlMinutes(final Long ttlMinutes);

    /**
     *  <p>If set to <code>true</code>, all email tokens issued previously for the Customer will be invalidated.</p>
     * @param invalidateOlderTokens value to be set
     */

    public void setInvalidateOlderTokens(final Boolean invalidateOlderTokens);

    /**
     * factory method
     * @return instance of CustomerCreateEmailToken
     */
    public static CustomerCreateEmailToken of() {
        return new CustomerCreateEmailTokenImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCreateEmailToken
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCreateEmailToken of(final CustomerCreateEmailToken template) {
        CustomerCreateEmailTokenImpl instance = new CustomerCreateEmailTokenImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setTtlMinutes(template.getTtlMinutes());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
        return instance;
    }

    public CustomerCreateEmailToken copyDeep();

    /**
     * factory method to create a deep copy of CustomerCreateEmailToken
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCreateEmailToken deepCopy(@Nullable final CustomerCreateEmailToken template) {
        if (template == null) {
            return null;
        }
        CustomerCreateEmailTokenImpl instance = new CustomerCreateEmailTokenImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setTtlMinutes(template.getTtlMinutes());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
        return instance;
    }

    /**
     * builder factory method for CustomerCreateEmailToken
     * @return builder
     */
    public static CustomerCreateEmailTokenBuilder builder() {
        return CustomerCreateEmailTokenBuilder.of();
    }

    /**
     * create builder for CustomerCreateEmailToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreateEmailTokenBuilder builder(final CustomerCreateEmailToken template) {
        return CustomerCreateEmailTokenBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCreateEmailToken(Function<CustomerCreateEmailToken, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreateEmailToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreateEmailToken>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreateEmailToken>";
            }
        };
    }
}
