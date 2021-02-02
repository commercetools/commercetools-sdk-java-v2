
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MessageConfigurationDraftBuilder {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    public MessageConfigurationDraftBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MessageConfigurationDraftBuilder deleteDaysAfterCreation(final Integer deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Integer getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public MessageConfigurationDraft build() {
        return new MessageConfigurationDraftImpl(enabled, deleteDaysAfterCreation);
    }

    public static MessageConfigurationDraftBuilder of() {
        return new MessageConfigurationDraftBuilder();
    }

    public static MessageConfigurationDraftBuilder of(final MessageConfigurationDraft template) {
        MessageConfigurationDraftBuilder builder = new MessageConfigurationDraftBuilder();
        builder.enabled = template.getEnabled();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        return builder;
    }

}
