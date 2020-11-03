package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelRemoveRolesActionImpl;

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
@JsonDeserialize(as = ChannelRemoveRolesActionImpl.class)
public interface ChannelRemoveRolesAction extends ChannelUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum ...roles);
    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelRemoveRolesActionImpl of(){
        return new ChannelRemoveRolesActionImpl();
    }
    

    public static ChannelRemoveRolesActionImpl of(final ChannelRemoveRolesAction template) {
        ChannelRemoveRolesActionImpl instance = new ChannelRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    default <T> T withChannelRemoveRolesAction(Function<ChannelRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }
}
