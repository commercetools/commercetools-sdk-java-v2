
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
public final class ExtensionAuthorizationHeaderAuthenticationImpl
        implements ExtensionAuthorizationHeaderAuthentication {

    private String type;

    private String headerValue;

    @JsonCreator
    ExtensionAuthorizationHeaderAuthenticationImpl(@JsonProperty("headerValue") final String headerValue) {
        this.headerValue = headerValue;
        this.type = AUTHORIZATION_HEADER;
    }

    public ExtensionAuthorizationHeaderAuthenticationImpl() {
        this.type = AUTHORIZATION_HEADER;
    }

    public String getType() {
        return this.type;
    }

    public String getHeaderValue() {
        return this.headerValue;
    }

    public void setHeaderValue(final String headerValue) {
        this.headerValue = headerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionAuthorizationHeaderAuthenticationImpl that = (ExtensionAuthorizationHeaderAuthenticationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(headerValue, that.headerValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(headerValue).toHashCode();
    }

}
