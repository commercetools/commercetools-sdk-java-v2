package com.commercetools.api.models.project;


import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint. For more information, see Requesting an access token using an external OAuth 2.0 server.</p>
 *  <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExternalOAuthImpl implements ExternalOAuth, ModelBase {

    
    private String url;
    
    
    private String authorizationHeader;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalOAuthImpl(@JsonProperty("url") final String url, @JsonProperty("authorizationHeader") final String authorizationHeader) {
        this.url = url;
        this.authorizationHeader = authorizationHeader;
    }
    /**
     * create empty instance
     */
    public ExternalOAuthImpl() {
    }

    /**
     *  <p>URL with authorization header. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     */
    
    public String getUrl(){
        return this.url;
    }
    
    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
     */
    
    public String getAuthorizationHeader(){
        return this.authorizationHeader;
    }

    
    public void setUrl(final String url){
        this.url = url;
    }
    
    
    public void setAuthorizationHeader(final String authorizationHeader){
        this.authorizationHeader = authorizationHeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ExternalOAuthImpl that = (ExternalOAuthImpl) o;
    
        return new EqualsBuilder()
                .append(url, that.url)
                .append(authorizationHeader, that.authorizationHeader)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(url)
            .append(authorizationHeader)
            .toHashCode();
    }

}
