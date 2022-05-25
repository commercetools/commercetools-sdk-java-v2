
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalOAuthBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalOAuth externalOAuth = ExternalOAuth.builder()
 *             .url("{url}")
 *             .authorizationHeader("{authorizationHeader}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalOAuthBuilder implements Builder<ExternalOAuth> {

    private String url;

    private String authorizationHeader;

    /**
     *  <p>URL with authorization header.</p>
     */

    public ExternalOAuthBuilder url(final String url) {
        this.url = url;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval.</p>
     */

    public ExternalOAuthBuilder authorizationHeader(final String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public String getAuthorizationHeader() {
        return this.authorizationHeader;
    }

    public ExternalOAuth build() {
        Objects.requireNonNull(url, ExternalOAuth.class + ": url is missing");
        Objects.requireNonNull(authorizationHeader, ExternalOAuth.class + ": authorizationHeader is missing");
        return new ExternalOAuthImpl(url, authorizationHeader);
    }

    /**
     * builds ExternalOAuth without checking for non null required values
     */
    public ExternalOAuth buildUnchecked() {
        return new ExternalOAuthImpl(url, authorizationHeader);
    }

    public static ExternalOAuthBuilder of() {
        return new ExternalOAuthBuilder();
    }

    public static ExternalOAuthBuilder of(final ExternalOAuth template) {
        ExternalOAuthBuilder builder = new ExternalOAuthBuilder();
        builder.url = template.getUrl();
        builder.authorizationHeader = template.getAuthorizationHeader();
        return builder;
    }

}
