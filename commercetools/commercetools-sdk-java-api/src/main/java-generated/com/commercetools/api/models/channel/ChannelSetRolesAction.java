package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelSetRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelSetRolesActionImpl.class)
public interface ChannelSetRolesAction extends ChannelUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelSetRolesActionImpl of(){
        return new ChannelSetRolesActionImpl();
    }
    

    public static ChannelSetRolesActionImpl of(final ChannelSetRolesAction template) {
        ChannelSetRolesActionImpl instance = new ChannelSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    default <T extends Accessor<ChannelSetRolesAction>> T withChannelSetRolesAction(Function<ChannelSetRolesAction, T> helper) {
        return helper.apply(this);
    }
}
