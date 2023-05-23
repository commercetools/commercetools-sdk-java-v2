
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HttpDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HttpDestination httpDestination = HttpDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HttpDestinationBuilder implements Builder<HttpDestination> {

    private String url;

    @Nullable
    private com.commercetools.api.models.extension.HttpDestinationAuthentication authentication;

    /**
     *  <p>URL to the target destination. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @param url value to be set
     * @return Builder
     */

    public HttpDestinationBuilder url(final String url) {
        this.url = url;
        return this;
    }

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     * @param authentication value to be set
     * @return Builder
     */

    public HttpDestinationBuilder authentication(
            @Nullable final com.commercetools.api.models.extension.HttpDestinationAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     * @param builder function to build the authentication value
     * @return Builder
     */

    public HttpDestinationBuilder authentication(
            Function<com.commercetools.api.models.extension.HttpDestinationAuthenticationBuilder, Builder<? extends com.commercetools.api.models.extension.HttpDestinationAuthentication>> builder) {
        this.authentication = builder
                .apply(com.commercetools.api.models.extension.HttpDestinationAuthenticationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>URL to the target destination. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @return url
     */

    public String getUrl() {
        return this.url;
    }

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     * @return authentication
     */

    @Nullable
    public com.commercetools.api.models.extension.HttpDestinationAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * builds HttpDestination with checking for non-null required values
     * @return HttpDestination
     */
    public HttpDestination build() {
        Objects.requireNonNull(url, HttpDestination.class + ": url is missing");
        return new HttpDestinationImpl(url, authentication);
    }

    /**
     * builds HttpDestination without checking for non-null required values
     * @return HttpDestination
     */
    public HttpDestination buildUnchecked() {
        return new HttpDestinationImpl(url, authentication);
    }

    /**
     * factory method for an instance of HttpDestinationBuilder
     * @return builder
     */
    public static HttpDestinationBuilder of() {
        return new HttpDestinationBuilder();
    }

    /**
     * create builder for HttpDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HttpDestinationBuilder of(final HttpDestination template) {
        HttpDestinationBuilder builder = new HttpDestinationBuilder();
        builder.url = template.getUrl();
        builder.authentication = template.getAuthentication();
        return builder;
    }

}
