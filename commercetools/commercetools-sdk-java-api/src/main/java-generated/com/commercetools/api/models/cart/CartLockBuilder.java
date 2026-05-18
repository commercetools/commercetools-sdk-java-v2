
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartLockBuilder
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
public class CartLockBuilder implements Builder<CartLock> {

    private java.time.ZonedDateTime createdAt;

    private String clientId;

    /**
     *  <p>Date and time (UTC) the Cart was locked.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CartLockBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that locked the Cart.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public CartLockBuilder clientId(final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Cart was locked.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that locked the Cart.</p>
     * @return clientId
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * builds CartLock with checking for non-null required values
     * @return CartLock
     */
    public CartLock build() {
        Objects.requireNonNull(createdAt, CartLock.class + ": createdAt is missing");
        Objects.requireNonNull(clientId, CartLock.class + ": clientId is missing");
        return new CartLockImpl(createdAt, clientId);
    }

    /**
     * builds CartLock without checking for non-null required values
     * @return CartLock
     */
    public CartLock buildUnchecked() {
        return new CartLockImpl(createdAt, clientId);
    }

    /**
     * factory method for an instance of CartLockBuilder
     * @return builder
     */
    public static CartLockBuilder of() {
        return new CartLockBuilder();
    }

    /**
     * create builder for CartLock instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockBuilder of(final CartLock template) {
        CartLockBuilder builder = new CartLockBuilder();
        builder.createdAt = template.getCreatedAt();
        builder.clientId = template.getClientId();
        return builder;
    }

}
