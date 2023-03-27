
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
     * @param uri value to be set
     * @return Builder
     */

    public AzureEventGridDestinationBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessKey value to be set
     * @return Builder
     */

    public AzureEventGridDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     *  <p>URI of the topic.</p>
     * @return uri
     */

    public String getUri() {
        return this.uri;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessKey
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * builds AzureEventGridDestination with checking for non-null required values
     * @return AzureEventGridDestination
     */
    public AzureEventGridDestination build() {
        Objects.requireNonNull(uri, AzureEventGridDestination.class + ": uri is missing");
        Objects.requireNonNull(accessKey, AzureEventGridDestination.class + ": accessKey is missing");
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    /**
     * builds AzureEventGridDestination without checking for non-null required values
     * @return AzureEventGridDestination
     */
    public AzureEventGridDestination buildUnchecked() {
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    /**
     * factory method for an instance of AzureEventGridDestinationBuilder
     * @return builder
     */
    public static AzureEventGridDestinationBuilder of() {
        return new AzureEventGridDestinationBuilder();
    }

    /**
     * create builder for AzureEventGridDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureEventGridDestinationBuilder of(final AzureEventGridDestination template) {
        AzureEventGridDestinationBuilder builder = new AzureEventGridDestinationBuilder();
        builder.uri = template.getUri();
        builder.accessKey = template.getAccessKey();
        return builder;
    }

}
