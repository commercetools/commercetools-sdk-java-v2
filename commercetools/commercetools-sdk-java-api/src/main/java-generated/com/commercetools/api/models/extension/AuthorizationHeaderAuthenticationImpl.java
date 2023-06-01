package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.HttpDestinationAuthentication;
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
 *  <p>The <code>Authorization</code> header will be set to the content of <code>headerValue</code>. The authentication scheme (such as <code>Basic</code> or <code>Bearer</code>) should be included in the <code>headerValue</code>.</p>
 *  <p>For example, the <code>headerValue</code> for Basic Authentication should be set to <code>Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==</code>.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AuthorizationHeaderAuthenticationImpl implements AuthorizationHeaderAuthentication, ModelBase {

    
    private String type;
    
    
    private String headerValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AuthorizationHeaderAuthenticationImpl(@JsonProperty("headerValue") final String headerValue) {
        this.headerValue = headerValue;
        this.type =  AUTHORIZATION_HEADER;
    }
    /**
     * create empty instance
     */
    public AuthorizationHeaderAuthenticationImpl() {
        this.type =  AUTHORIZATION_HEADER;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */
    
    public String getHeaderValue(){
        return this.headerValue;
    }

    
    public void setHeaderValue(final String headerValue){
        this.headerValue = headerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AuthorizationHeaderAuthenticationImpl that = (AuthorizationHeaderAuthenticationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(headerValue, that.headerValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(headerValue)
            .toHashCode();
    }

}
