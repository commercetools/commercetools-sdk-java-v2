
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MessagesConfigurationDraftBuilder implements Builder<MessagesConfigurationDraft> {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    public MessagesConfigurationDraftBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MessagesConfigurationDraftBuilder deleteDaysAfterCreation(final Integer deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Integer getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public MessagesConfigurationDraft build() {
        Objects.requireNonNull(enabled, MessagesConfigurationDraft.class + ": enabled is missing");
        Objects.requireNonNull(deleteDaysAfterCreation,
            MessagesConfigurationDraft.class + ": deleteDaysAfterCreation is missing");
        return new MessagesConfigurationDraftImpl(enabled, deleteDaysAfterCreation);
    }

    /**
     * builds MessagesConfigurationDraft without checking for non null required values
     */
    public MessagesConfigurationDraft buildUnchecked() {
        return new MessagesConfigurationDraftImpl(enabled, deleteDaysAfterCreation);
    }

    public static MessagesConfigurationDraftBuilder of() {
        return new MessagesConfigurationDraftBuilder();
    }

    public static MessagesConfigurationDraftBuilder of(final MessagesConfigurationDraft template) {
        MessagesConfigurationDraftBuilder builder = new MessagesConfigurationDraftBuilder();
        builder.enabled = template.getEnabled();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        return builder;
    }

}
