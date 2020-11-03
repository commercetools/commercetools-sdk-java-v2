package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelAddRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelAddRolesActionImpl.class)
public interface ChannelAddRolesAction extends ChannelUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum ...roles);
    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelAddRolesActionImpl of(){
        return new ChannelAddRolesActionImpl();
    }
    

    public static ChannelAddRolesActionImpl of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionImpl instance = new ChannelAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    default <T> T withChannelAddRolesAction(Function<ChannelAddRolesAction, T> helper) {
        return helper.apply(this);
    }
}
