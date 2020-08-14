package com.commercetools.api.models.subscription;


import com.commercetools.api.models.subscription.MessageSubscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessageSubscriptionBuilder {

    
    private String resourceTypeId;
    
    @Nullable
    private java.util.List<String> types;

    public MessageSubscriptionBuilder resourceTypeId( final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }
    
    public MessageSubscriptionBuilder types(@Nullable final java.util.List<String> types) {
        this.types = types;
        return this;
    }

    
    public String getResourceTypeId(){
        return this.resourceTypeId;
    }
    
    @Nullable
    public java.util.List<String> getTypes(){
        return this.types;
    }

    public MessageSubscription build() {
        return new MessageSubscriptionImpl(resourceTypeId, types);
    }

    public static MessageSubscriptionBuilder of() {
        return new MessageSubscriptionBuilder();
    }

    public static MessageSubscriptionBuilder of(final MessageSubscription template) {
        MessageSubscriptionBuilder builder = new MessageSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        builder.types = template.getTypes();
        return builder;
    }

}
