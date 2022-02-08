
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessagesConfigurationImpl.class)
public interface MessagesConfiguration {

    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessagesConfiguration of() {
        return new MessagesConfigurationImpl();
    }

    public static MessagesConfiguration of(final MessagesConfiguration template) {
        MessagesConfigurationImpl instance = new MessagesConfigurationImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessagesConfigurationBuilder builder() {
        return MessagesConfigurationBuilder.of();
    }

    public static MessagesConfigurationBuilder builder(final MessagesConfiguration template) {
        return MessagesConfigurationBuilder.of(template);
    }

    default <T> T withMessagesConfiguration(Function<MessagesConfiguration, T> helper) {
        return helper.apply(this);
    }
}
