
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectSetExternalOAuthActionBuilder implements Builder<ProjectSetExternalOAuthAction> {

    @Nullable
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

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
