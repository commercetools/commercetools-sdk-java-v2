
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribution attribution = Attribution.builder()
 *             .source(AttributionSource.IMPORT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributionBuilder implements Builder<Attribution> {

    @Nullable
    private String clientId;

    private com.commercetools.api.models.common.AttributionSource source;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that created or modified the resource.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public AttributionBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>Method used to initiate the creation or modification of the resource.</p>
     * @param source value to be set
     * @return Builder
     */

    public AttributionBuilder source(final com.commercetools.api.models.common.AttributionSource source) {
        this.source = source;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that created or modified the resource.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Method used to initiate the creation or modification of the resource.</p>
     * @return source
     */

    public com.commercetools.api.models.common.AttributionSource getSource() {
        return this.source;
    }

    /**
     * builds Attribution with checking for non-null required values
     * @return Attribution
     */
    public Attribution build() {
        Objects.requireNonNull(source, Attribution.class + ": source is missing");
        return new AttributionImpl(clientId, source);
    }

    /**
     * builds Attribution without checking for non-null required values
     * @return Attribution
     */
    public Attribution buildUnchecked() {
        return new AttributionImpl(clientId, source);
    }

    /**
     * factory method for an instance of AttributionBuilder
     * @return builder
     */
    public static AttributionBuilder of() {
        return new AttributionBuilder();
    }

    /**
     * create builder for Attribution instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributionBuilder of(final Attribution template) {
        AttributionBuilder builder = new AttributionBuilder();
        builder.clientId = template.getClientId();
        builder.source = template.getSource();
        return builder;
    }

}
