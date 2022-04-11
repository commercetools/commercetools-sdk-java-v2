
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MessageSubscriptionBuilder implements Builder<MessageSubscription> {

    private String resourceTypeId;

    @Nullable
    private java.util.List<String> types;

    public MessageSubscriptionBuilder resourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    public MessageSubscriptionBuilder types(@Nullable final String... types) {
        this.types = new ArrayList<>(Arrays.asList(types));
        return this;
    }

    public MessageSubscriptionBuilder types(@Nullable final java.util.List<String> types) {
        this.types = types;
        return this;
    }

    public MessageSubscriptionBuilder plusTypes(@Nullable final String... types) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.addAll(Arrays.asList(types));
        return this;
    }

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    @Nullable
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public MessageSubscription build() {
        Objects.requireNonNull(resourceTypeId, MessageSubscription.class + ": resourceTypeId is missing");
        return new MessageSubscriptionImpl(resourceTypeId, types);
    }

    /**
     * builds MessageSubscription without checking for non null required values
     */
    public MessageSubscription buildUnchecked() {
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
