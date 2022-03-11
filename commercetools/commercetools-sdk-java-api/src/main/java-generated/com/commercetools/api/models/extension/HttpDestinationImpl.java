
package com.commercetools.api.models.extension;

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
*  <p>We recommend an encrypted <code>HTTPS</code> connection for production setups. However, we also accept unencrypted <code>HTTP</code> connections for development purposes. HTTP redirects will not be followed and cache headers will be ignored.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class HttpDestinationImpl implements HttpDestination, ModelBase {

    private String type;

    private String url;

    private com.commercetools.api.models.extension.HttpDestinationAuthentication authentication;

    @JsonCreator
    HttpDestinationImpl(@JsonProperty("url") final String url,
            @JsonProperty("authentication") final com.commercetools.api.models.extension.HttpDestinationAuthentication authentication) {
        this.url = url;
        this.authentication = authentication;
        this.type = HTTP;
    }

    public HttpDestinationImpl() {
        this.type = HTTP;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>URL to the target destination.</p>
    */
    public String getUrl() {
        return this.url;
    }

    /**
    *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
    */
    public com.commercetools.api.models.extension.HttpDestinationAuthentication getAuthentication() {
        return this.authentication;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setAuthentication(
            final com.commercetools.api.models.extension.HttpDestinationAuthentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        HttpDestinationImpl that = (HttpDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(url, that.url)
                .append(authentication, that.authentication)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(url).append(authentication).toHashCode();
    }

}
