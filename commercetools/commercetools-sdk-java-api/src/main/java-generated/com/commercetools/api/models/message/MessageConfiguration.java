
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessageConfigurationImpl.class)
public interface MessageConfiguration {

    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessageConfiguration of() {
        return new MessageConfigurationImpl();
    }

    public static MessageConfiguration of(final MessageConfiguration template) {
        MessageConfigurationImpl instance = new MessageConfigurationImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessageConfigurationBuilder builder() {
        return MessageConfigurationBuilder.of();
    }

    public static MessageConfigurationBuilder builder(final MessageConfiguration template) {
        return MessageConfigurationBuilder.of(template);
    }

    default <T> T withMessageConfiguration(Function<MessageConfiguration, T> helper) {
        return helper.apply(this);
    }
}
