package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.channel.ChannelSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetCustomFieldActionBuilder {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public ChannelSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public ChannelSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public ChannelSetCustomFieldAction build() {
        return new ChannelSetCustomFieldActionImpl(name, value);
    }

    public static ChannelSetCustomFieldActionBuilder of() {
        return new ChannelSetCustomFieldActionBuilder();
    }

    public static ChannelSetCustomFieldActionBuilder of(final ChannelSetCustomFieldAction template) {
        ChannelSetCustomFieldActionBuilder builder = new ChannelSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
