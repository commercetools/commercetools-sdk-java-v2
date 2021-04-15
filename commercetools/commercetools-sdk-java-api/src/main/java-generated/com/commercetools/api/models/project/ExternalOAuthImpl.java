
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalOAuthImpl implements ExternalOAuth {

    private String url;

    private String authorizationHeader;

    @JsonCreator
    ExternalOAuthImpl(@JsonProperty("url") final String url,
            @JsonProperty("authorizationHeader") final String authorizationHeader) {
        this.url = url;
        this.authorizationHeader = authorizationHeader;
    }

    public ExternalOAuthImpl() {
    }

    public String getUrl() {
        return this.url;
    }

    public String getAuthorizationHeader() {
        return this.authorizationHeader;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setAuthorizationHeader(final String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExternalOAuthImpl that = (ExternalOAuthImpl) o;

        return new EqualsBuilder().append(url, that.url)
                .append(authorizationHeader, that.authorizationHeader)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(url).append(authorizationHeader).toHashCode();
    }

}
