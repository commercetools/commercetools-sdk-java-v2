package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetAddressCustomFieldActionBuilder {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public ChannelSetAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public ChannelSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public ChannelSetAddressCustomFieldAction build() {
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    public static ChannelSetAddressCustomFieldActionBuilder of() {
        return new ChannelSetAddressCustomFieldActionBuilder();
    }

    public static ChannelSetAddressCustomFieldActionBuilder of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionBuilder builder = new ChannelSetAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
