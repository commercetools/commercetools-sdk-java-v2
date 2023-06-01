package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
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
 * ChannelAddRolesAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelAddRolesActionImpl implements ChannelAddRolesAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChannelAddRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        this.action =  ADD_ROLES;
    }
    /**
     * create empty instance
     */
    public ChannelAddRolesActionImpl() {
        this.action =  ADD_ROLES;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     */
    
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
