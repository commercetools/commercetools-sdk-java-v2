
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
 *             .isPlatformClient(true)
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ModifiedByBuilder implements Builder<ModifiedBy> {

    private Boolean isPlatformClient;

    @Nullable
    private String id;

    private String type;

    @Nullable
    private String clientId;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.history.models.common.Reference customer;

    @Nullable
    private com.commercetools.history.models.common.Reference associate;

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center.</p>
     * @param isPlatformClient value to be set
     * @return Builder
     */

    public ModifiedByBuilder isPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
        return this;
    }

    /**
     *  <p><span>ID</span> of the Merchant Center user who made the change.</p>
     *  <p>Present only if <code>isPlatformClient</code> is <code>true</code>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ModifiedByBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an <span>external user ID</span>, the value is <code>"external-user"</code>.</li>
     *   <li>If the change was made by an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a>, the value is <code>"associate"</code>.</li>
     *  </ul>
     * @param type value to be set
     * @return Builder
     */

    public ModifiedByBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p><span>ID</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public ModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>Present only if the change was made using a token from an <span>anonymous session</span>.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who made the change.</p>
     *  <p>Present only if the change was made using a token from the <span>password flow</span>.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ModifiedByBuilder customer(@Nullable final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who made the change.</p>
     *  <p>Present only if the change was made using a token from the <span>password flow</span>.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ModifiedByBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> who made the change in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @param associate value to be set
     * @return Builder
     */

    public ModifiedByBuilder associate(@Nullable final com.commercetools.history.models.common.Reference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> who made the change in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ModifiedByBuilder associate(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.associate = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center.</p>
     * @return isPlatformClient
     */

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    /**
     *  <p><span>ID</span> of the Merchant Center user who made the change.</p>
     *  <p>Present only if <code>isPlatformClient</code> is <code>true</code>.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an <span>external user ID</span>, the value is <code>"external-user"</code>.</li>
     *   <li>If the change was made by an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a>, the value is <code>"associate"</code>.</li>
     *  </ul>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><span>ID</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Present only if the change was made using a token from an <span>anonymous session</span>.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who made the change.</p>
     *  <p>Present only if the change was made using a token from the <span>password flow</span>.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> who made the change in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @return associate
     */

    @Nullable
    public com.commercetools.history.models.common.Reference getAssociate() {
        return this.associate;
    }

    /**
     * builds ModifiedBy with checking for non-null required values
     * @return ModifiedBy
     */
    public ModifiedBy build() {
        Objects.requireNonNull(isPlatformClient, ModifiedBy.class + ": isPlatformClient is missing");
        Objects.requireNonNull(type, ModifiedBy.class + ": type is missing");
        return new ModifiedByImpl(isPlatformClient, id, type, clientId, anonymousId, customer, associate);
    }

    /**
     * builds ModifiedBy without checking for non-null required values
     * @return ModifiedBy
     */
    public ModifiedBy buildUnchecked() {
        return new ModifiedByImpl(isPlatformClient, id, type, clientId, anonymousId, customer, associate);
    }

    /**
     * factory method for an instance of ModifiedByBuilder
     * @return builder
     */
    public static ModifiedByBuilder of() {
        return new ModifiedByBuilder();
    }

    /**
     * create builder for ModifiedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ModifiedByBuilder of(final ModifiedBy template) {
        ModifiedByBuilder builder = new ModifiedByBuilder();
        builder.isPlatformClient = template.getIsPlatformClient();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.clientId = template.getClientId();
        builder.anonymousId = template.getAnonymousId();
        builder.customer = template.getCustomer();
        builder.associate = template.getAssociate();
        return builder;
    }

}
