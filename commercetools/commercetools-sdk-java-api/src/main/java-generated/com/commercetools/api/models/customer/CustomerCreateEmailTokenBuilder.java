
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreateEmailTokenBuilder
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
public class CustomerCreateEmailTokenBuilder implements Builder<CustomerCreateEmailToken> {

    private String id;

    @Nullable
    private Long version;

    private Long ttlMinutes;

    @Nullable
    private Boolean invalidateOlderTokens;

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerCreateEmailTokenBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomerCreateEmailTokenBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @param ttlMinutes value to be set
     * @return Builder
     */

    public CustomerCreateEmailTokenBuilder ttlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
        return this;
    }

    /**
     *  <p>If set to <code>true</code>, all email tokens issued previously for the Customer will be invalidated.</p>
     * @param invalidateOlderTokens value to be set
     * @return Builder
     */

    public CustomerCreateEmailTokenBuilder invalidateOlderTokens(@Nullable final Boolean invalidateOlderTokens) {
        this.invalidateOlderTokens = invalidateOlderTokens;
        return this;
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Expected version of the Customer.</p>
     * @return version
     */

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @return ttlMinutes
     */

    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    /**
     *  <p>If set to <code>true</code>, all email tokens issued previously for the Customer will be invalidated.</p>
     * @return invalidateOlderTokens
     */

    @Nullable
    public Boolean getInvalidateOlderTokens() {
        return this.invalidateOlderTokens;
    }

    /**
     * builds CustomerCreateEmailToken with checking for non-null required values
     * @return CustomerCreateEmailToken
     */
    public CustomerCreateEmailToken build() {
        Objects.requireNonNull(id, CustomerCreateEmailToken.class + ": id is missing");
        Objects.requireNonNull(ttlMinutes, CustomerCreateEmailToken.class + ": ttlMinutes is missing");
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes, invalidateOlderTokens);
    }

    /**
     * builds CustomerCreateEmailToken without checking for non-null required values
     * @return CustomerCreateEmailToken
     */
    public CustomerCreateEmailToken buildUnchecked() {
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes, invalidateOlderTokens);
    }

    /**
     * factory method for an instance of CustomerCreateEmailTokenBuilder
     * @return builder
     */
    public static CustomerCreateEmailTokenBuilder of() {
        return new CustomerCreateEmailTokenBuilder();
    }

    /**
     * create builder for CustomerCreateEmailToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreateEmailTokenBuilder of(final CustomerCreateEmailToken template) {
        CustomerCreateEmailTokenBuilder builder = new CustomerCreateEmailTokenBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.ttlMinutes = template.getTtlMinutes();
        builder.invalidateOlderTokens = template.getInvalidateOlderTokens();
        return builder;
    }

}
