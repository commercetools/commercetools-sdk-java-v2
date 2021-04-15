
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalOAuthBuilder {

    private String url;

    private String authorizationHeader;

    public ExternalOAuthBuilder url(final String url) {
        this.url = url;
        return this;
    }

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
