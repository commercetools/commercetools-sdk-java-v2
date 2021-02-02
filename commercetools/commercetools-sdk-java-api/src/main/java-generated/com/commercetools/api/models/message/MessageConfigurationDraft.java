
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessageConfigurationDraftImpl.class)
public interface MessageConfigurationDraft {

    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    @NotNull
    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessageConfigurationDraft of() {
        return new MessageConfigurationDraftImpl();
    }

    public static MessageConfigurationDraft of(final MessageConfigurationDraft template) {
        MessageConfigurationDraftImpl instance = new MessageConfigurationDraftImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessageConfigurationDraftBuilder builder() {
        return MessageConfigurationDraftBuilder.of();
    }

    public static MessageConfigurationDraftBuilder builder(final MessageConfigurationDraft template) {
        return MessageConfigurationDraftBuilder.of(template);
    }

    default <T> T withMessageConfigurationDraft(Function<MessageConfigurationDraft, T> helper) {
        return helper.apply(this);
    }
}
