
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MessagesConfigurationBuilder implements Builder<MessagesConfiguration> {

    private Boolean enabled;

    @Nullable
    private Integer deleteDaysAfterCreation;

    public MessagesConfigurationBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MessagesConfigurationBuilder deleteDaysAfterCreation(@Nullable final Integer deleteDaysAfterCreation) {
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

    public MessagesConfiguration build() {
        Objects.requireNonNull(enabled, MessagesConfiguration.class + ": enabled is missing");
        return new MessagesConfigurationImpl(enabled, deleteDaysAfterCreation);
    }

    /**
     * builds MessagesConfiguration without checking for non null required values
     */
    public MessagesConfiguration buildUnchecked() {
        return new MessagesConfigurationImpl(enabled, deleteDaysAfterCreation);
    }

    public static MessagesConfigurationBuilder of() {
        return new MessagesConfigurationBuilder();
    }

    public static MessagesConfigurationBuilder of(final MessagesConfiguration template) {
        MessagesConfigurationBuilder builder = new MessagesConfigurationBuilder();
        builder.enabled = template.getEnabled();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        return builder;
    }

}
