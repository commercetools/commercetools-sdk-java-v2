
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AzureEventGridDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureEventGridDestination azureEventGridDestination = AzureEventGridDestination.builder()
 *             .uri("{uri}")
 *             .accessKey("{accessKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AzureEventGridDestinationBuilder implements Builder<AzureEventGridDestination> {

    private String uri;

    private String accessKey;

    /**
     *  <p>URI of the topic.</p>
     */

    public AzureEventGridDestinationBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public AzureEventGridDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public AzureEventGridDestination build() {
        Objects.requireNonNull(uri, AzureEventGridDestination.class + ": uri is missing");
        Objects.requireNonNull(accessKey, AzureEventGridDestination.class + ": accessKey is missing");
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    /**
     * builds AzureEventGridDestination without checking for non null required values
     */
    public AzureEventGridDestination buildUnchecked() {
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    public static AzureEventGridDestinationBuilder of() {
        return new AzureEventGridDestinationBuilder();
    }

    public static AzureEventGridDestinationBuilder of(final AzureEventGridDestination template) {
        AzureEventGridDestinationBuilder builder = new AzureEventGridDestinationBuilder();
        builder.uri = template.getUri();
        builder.accessKey = template.getAccessKey();
        return builder;
    }

}
