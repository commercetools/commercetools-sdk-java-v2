
package com.commercetools.checkout.models.application;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationLogoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationLogo applicationLogo = ApplicationLogo.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationLogoBuilder implements Builder<ApplicationLogo> {

    @Nullable
    private String url;

    /**
     *  <p>URL of the logo.</p>
     * @param url value to be set
     * @return Builder
     */

    public ApplicationLogoBuilder url(@Nullable final String url) {
        this.url = url;
        return this;
    }

    /**
     *  <p>URL of the logo.</p>
     * @return url
     */

    @Nullable
    public String getUrl() {
        return this.url;
    }

    /**
     * builds ApplicationLogo with checking for non-null required values
     * @return ApplicationLogo
     */
    public ApplicationLogo build() {
        return new ApplicationLogoImpl(url);
    }

    /**
     * builds ApplicationLogo without checking for non-null required values
     * @return ApplicationLogo
     */
    public ApplicationLogo buildUnchecked() {
        return new ApplicationLogoImpl(url);
    }

    /**
     * factory method for an instance of ApplicationLogoBuilder
     * @return builder
     */
    public static ApplicationLogoBuilder of() {
        return new ApplicationLogoBuilder();
    }

    /**
     * create builder for ApplicationLogo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationLogoBuilder of(final ApplicationLogo template) {
        ApplicationLogoBuilder builder = new ApplicationLogoBuilder();
        builder.url = template.getUrl();
        return builder;
    }

}
