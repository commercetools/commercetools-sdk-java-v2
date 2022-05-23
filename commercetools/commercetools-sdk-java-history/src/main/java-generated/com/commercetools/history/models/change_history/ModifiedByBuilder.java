
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ModifiedByBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ModifiedBy modifiedBy = ModifiedBy.builder()
 *             .id("{id}")
 *             .type("{type}")
 *             .isPlatformClient(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ModifiedByBuilder implements Builder<ModifiedBy> {

    private String id;

    private String type;

    @Nullable
    private com.commercetools.history.models.common.Reference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String clientId;

    private Boolean isPlatformClient;

    /**
     <*  <p>ID of the Merchant Center user who made the change. Present only if the change was made in the Merchant Center.</p>>
     */

    public ModifiedByBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Indicates whether the change was made by a user or the API client with or without an External user ID.</p>>
     */

    public ModifiedByBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>>
     */

    public ModifiedByBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>>
     */

    public ModifiedByBuilder customer(@Nullable final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     <*  <p>Present only if the change was made using a token from an Anonymous Session.</p>>
     */

    public ModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     <*  <p>ID of the API Client that made the change. Present only if the change was made using an API Client.</p>>
     */

    public ModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     <*  <p><code>true</code> if the change was made via Merchant Center or ImpEx.</p>>
     */

    public ModifiedByBuilder isPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    public ModifiedBy build() {
        Objects.requireNonNull(id, ModifiedBy.class + ": id is missing");
        Objects.requireNonNull(type, ModifiedBy.class + ": type is missing");
        Objects.requireNonNull(isPlatformClient, ModifiedBy.class + ": isPlatformClient is missing");
        return new ModifiedByImpl(id, type, customer, anonymousId, clientId, isPlatformClient);
    }

    /**
     * builds ModifiedBy without checking for non null required values
     */
    public ModifiedBy buildUnchecked() {
        return new ModifiedByImpl(id, type, customer, anonymousId, clientId, isPlatformClient);
    }

    public static ModifiedByBuilder of() {
        return new ModifiedByBuilder();
    }

    public static ModifiedByBuilder of(final ModifiedBy template) {
        ModifiedByBuilder builder = new ModifiedByBuilder();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.clientId = template.getClientId();
        builder.isPlatformClient = template.getIsPlatformClient();
        return builder;
    }

}
