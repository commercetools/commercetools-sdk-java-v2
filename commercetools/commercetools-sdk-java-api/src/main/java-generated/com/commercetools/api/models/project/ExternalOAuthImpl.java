
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint. For more information, see Requesting an access token using an external OAuth 2.0 server.</p>
 *  <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalOAuthImpl implements ExternalOAuth, ModelBase {

    private String url;

    private String authorizationHeader;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalOAuthImpl(@JsonProperty("url") final String url,
            @JsonProperty("authorizationHeader") final String authorizationHeader) {
        this.url = url;
        this.authorizationHeader = authorizationHeader;
    }

    /**
     * create empty instance
     */
    public ExternalOAuthImpl() {
    }

    /**
     *  <p>URL with authorization header.</p>
     */

    public String getUrl() {
        return this.url;
    }

    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
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
                .append(url, that.url)
                .append(authorizationHeader, that.authorizationHeader)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(url).append(authorizationHeader).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("url", url)
                .append("authorizationHeader", authorizationHeader)
                .build();
    }

    @Override
    public ExternalOAuth copyDeep() {
        return ExternalOAuth.deepCopy(this);
    }
}
