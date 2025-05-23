
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The <code>Authorization</code> header will be set to the content of <code>headerValue</code>. The authentication scheme (such as <code>Basic</code> or <code>Bearer</code>) should be included in the <code>headerValue</code>.</p>
 *  <p>For example, the <code>headerValue</code> for Basic Authentication should be set to <code>Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AuthorizationHeaderAuthenticationImpl implements AuthorizationHeaderAuthentication, ModelBase {

    private String type;

    private String headerValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AuthorizationHeaderAuthenticationImpl(@JsonProperty("headerValue") final String headerValue) {
        this.headerValue = headerValue;
        this.type = AUTHORIZATION_HEADER;
    }

    /**
     * create empty instance
     */
    public AuthorizationHeaderAuthenticationImpl() {
        this.type = AUTHORIZATION_HEADER;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

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

        AuthorizationHeaderAuthenticationImpl that = (AuthorizationHeaderAuthenticationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(headerValue, that.headerValue)
                .append(type, that.type)
                .append(headerValue, that.headerValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(headerValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("headerValue", headerValue)
                .build();
    }

    @Override
    public AuthorizationHeaderAuthentication copyDeep() {
        return AuthorizationHeaderAuthentication.deepCopy(this);
    }
}
