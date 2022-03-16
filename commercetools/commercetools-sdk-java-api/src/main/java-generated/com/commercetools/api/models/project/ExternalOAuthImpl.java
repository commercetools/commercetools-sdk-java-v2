
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Represents a RFC 7662 compliant <a href="https://datatracker.ietf.org/doc/html/rfc7662">OAuth 2.0 Token Introspection</a> endpoint. For more information, see <a href="/../api/authorization#requesting-an-access-token-using-an-external-oauth-server">Requesting an access token using an external OAuth 2.0 server</a>.</p>
*  <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExternalOAuthImpl implements ExternalOAuth, ModelBase {

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

    /**
    *  <p>URL with authorization header.</p>
    */
    public String getUrl() {
        return this.url;
    }

    /**
    *  <p>Partially hidden on retrieval.</p>
    */
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
