
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionHttpDestinationImpl implements ExtensionHttpDestination {

    private String type;

    private String url;

    private com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication;

    @JsonCreator
    ExtensionHttpDestinationImpl(@JsonProperty("url") final String url,
            @JsonProperty("authentication") final com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication) {
        this.url = url;
        this.authentication = authentication;
        this.type = HTTP;
    }

    public ExtensionHttpDestinationImpl() {
        this.type = HTTP;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication getAuthentication() {
        return this.authentication;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setAuthentication(
            final com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionHttpDestinationImpl that = (ExtensionHttpDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(url, that.url).append(authentication,
            that.authentication).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(url).append(authentication).toHashCode();
    }

}
