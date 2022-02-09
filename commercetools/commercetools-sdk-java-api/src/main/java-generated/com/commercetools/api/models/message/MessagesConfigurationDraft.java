
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessagesConfigurationDraftImpl.class)
public interface MessagesConfigurationDraft {

    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    @NotNull
    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessagesConfigurationDraft of() {
        return new MessagesConfigurationDraftImpl();
    }

    public static MessagesConfigurationDraft of(final MessagesConfigurationDraft template) {
        MessagesConfigurationDraftImpl instance = new MessagesConfigurationDraftImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessagesConfigurationDraftBuilder builder() {
        return MessagesConfigurationDraftBuilder.of();
    }

    public static MessagesConfigurationDraftBuilder builder(final MessagesConfigurationDraft template) {
        return MessagesConfigurationDraftBuilder.of(template);
    }

    default <T> T withMessagesConfigurationDraft(Function<MessagesConfigurationDraft, T> helper) {
        return helper.apply(this);
    }
}