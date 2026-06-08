
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Indicates that the Cart is <span>locked</span> to prevent changes. Provides metadata about when the lock was created and which <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> initiated it.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLock cartLock = CartLock.builder()
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .clientId("{clientId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartLockImpl.class)
public interface CartLock {

    /**
     *  <p>Date and time (UTC) the Cart was locked.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that locked the Cart.</p>
     * @return clientId
     */
    @NotNull
    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>Date and time (UTC) the Cart was locked.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that locked the Cart.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     * factory method
     * @return instance of CartLock
     */
    public static CartLock of() {
        return new CartLockImpl();
    }

    /**
     * factory method to create a shallow copy CartLock
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartLock of(final CartLock template) {
        CartLockImpl instance = new CartLockImpl();
        instance.setCreatedAt(template.getCreatedAt());
        instance.setClientId(template.getClientId());
        return instance;
    }

    public CartLock copyDeep();

    /**
     * factory method to create a deep copy of CartLock
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartLock deepCopy(@Nullable final CartLock template) {
        if (template == null) {
            return null;
        }
        CartLockImpl instance = new CartLockImpl();
        instance.setCreatedAt(template.getCreatedAt());
        instance.setClientId(template.getClientId());
        return instance;
    }

    /**
     * builder factory method for CartLock
     * @return builder
     */
    public static CartLockBuilder builder() {
        return CartLockBuilder.of();
    }

    /**
     * create builder for CartLock instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockBuilder builder(final CartLock template) {
        return CartLockBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartLock(Function<CartLock, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartLock> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartLock>() {
            @Override
            public String toString() {
                return "TypeReference<CartLock>";
            }
        };
    }
}
