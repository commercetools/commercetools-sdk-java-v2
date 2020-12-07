package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.error.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingRoleOnChannelErrorImpl implements MissingRoleOnChannelError {

    private String code;
    
    private String message;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;
    
    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    @JsonCreator
    MissingRoleOnChannelErrorImpl(@JsonProperty("message") final String message, @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel, @JsonProperty("missingRole") final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.message = message;
        this.channel = channel;
        this.missingRole = missingRole;
        this.code = "MissingRoleOnChannel";
    }
    public MissingRoleOnChannelErrorImpl() {
        this.code = "MissingRoleOnChannel";
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel(){
        return this.channel;
    }
    
    
    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole(){
        return this.missingRole;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel){
        this.channel = channel;
    }
    
    public void setMissingRole(final com.commercetools.api.models.channel.ChannelRoleEnum missingRole){
        this.missingRole = missingRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MissingRoleOnChannelErrorImpl that = (MissingRoleOnChannelErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(channel)
            .append(missingRole)
            .toHashCode();
    }

}
