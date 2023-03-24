
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GoogleCloudFunctionDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GoogleCloudFunctionDestination googleCloudFunctionDestination = GoogleCloudFunctionDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GoogleCloudFunctionDestinationBuilder implements Builder<GoogleCloudFunctionDestination> {

    private String url;

    /**
     *  <p>URL to the target function.</p>
     * @param url value to be set
     * @return Builder
     */

    public GoogleCloudFunctionDestinationBuilder url(final String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    /**
     * builds GoogleCloudFunctionDestination with checking for non-null required values
     * @return GoogleCloudFunctionDestination
     */
    public GoogleCloudFunctionDestination build() {
        Objects.requireNonNull(url, GoogleCloudFunctionDestination.class + ": url is missing");
        return new GoogleCloudFunctionDestinationImpl(url);
    }

    /**
     * builds GoogleCloudFunctionDestination without checking for non-null required values
     * @return GoogleCloudFunctionDestination
     */
    public GoogleCloudFunctionDestination buildUnchecked() {
        return new GoogleCloudFunctionDestinationImpl(url);
    }

    public static GoogleCloudFunctionDestinationBuilder of() {
        return new GoogleCloudFunctionDestinationBuilder();
    }

    public static GoogleCloudFunctionDestinationBuilder of(final GoogleCloudFunctionDestination template) {
        GoogleCloudFunctionDestinationBuilder builder = new GoogleCloudFunctionDestinationBuilder();
        builder.url = template.getUrl();
        return builder;
    }

}
