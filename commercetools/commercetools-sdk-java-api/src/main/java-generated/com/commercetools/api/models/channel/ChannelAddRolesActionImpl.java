package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
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
public final class ChannelAddRolesActionImpl implements ChannelAddRolesAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    @JsonCreator
    ChannelAddRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        this.action = "addRoles";
    }
    public ChannelAddRolesActionImpl() {
        this.action = "addRoles";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles(){
        return this.roles;
    }

    public void setRoles(final com.commercetools.api.models.channel.ChannelRoleEnum ...roles){
       this.roles = new ArrayList<>(Arrays.asList(roles));
    }
    
    public void setRoles(final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles){
       this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChannelAddRolesActionImpl that = (ChannelAddRolesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(roles, that.roles)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(roles)
            .toHashCode();
    }

}
