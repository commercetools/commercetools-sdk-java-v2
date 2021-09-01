
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MessageConfigurationBuilder implements Builder<MessageConfiguration> {

    private Boolean enabled;

    @Nullable
    private Integer deleteDaysAfterCreation;

    public MessageConfigurationBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MessageConfigurationBuilder deleteDaysAfterCreation(@Nullable final Integer deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public Integer getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public MessageConfiguration build() {
        Objects.requireNonNull(enabled, MessageConfiguration.class + ": enabled is missing");
        return new MessageConfigurationImpl(enabled, deleteDaysAfterCreation);
    }

    /**
     * builds MessageConfiguration without checking for non null required values
     */
    public MessageConfiguration buildUnchecked() {
        return new MessageConfigurationImpl(enabled, deleteDaysAfterCreation);
    }

    public static MessageConfigurationBuilder of() {
        return new MessageConfigurationBuilder();
    }

    public static MessageConfigurationBuilder of(final MessageConfiguration template) {
        MessageConfigurationBuilder builder = new MessageConfigurationBuilder();
        builder.enabled = template.getEnabled();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        return builder;
    }

}
