
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetExternalOAuthActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetExternalOAuthAction projectSetExternalOAuthAction = ProjectSetExternalOAuthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetExternalOAuthActionBuilder implements Builder<ProjectSetExternalOAuthAction> {

    @Nullable
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProjectSetExternalOAuthActionBuilder externalOAuth(
            Function<com.commercetools.api.models.project.ExternalOAuthBuilder, com.commercetools.api.models.project.ExternalOAuthBuilder> builder) {
        this.externalOAuth = builder.apply(com.commercetools.api.models.project.ExternalOAuthBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProjectSetExternalOAuthActionBuilder externalOAuth(
            @Nullable final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    public ProjectSetExternalOAuthAction build() {
        return new ProjectSetExternalOAuthActionImpl(externalOAuth);
    }

    /**
     * builds ProjectSetExternalOAuthAction without checking for non null required values
     */
    public ProjectSetExternalOAuthAction buildUnchecked() {
        return new ProjectSetExternalOAuthActionImpl(externalOAuth);
    }

    public static ProjectSetExternalOAuthActionBuilder of() {
        return new ProjectSetExternalOAuthActionBuilder();
    }

    public static ProjectSetExternalOAuthActionBuilder of(final ProjectSetExternalOAuthAction template) {
        ProjectSetExternalOAuthActionBuilder builder = new ProjectSetExternalOAuthActionBuilder();
        builder.externalOAuth = template.getExternalOAuth();
        return builder;
    }

}
