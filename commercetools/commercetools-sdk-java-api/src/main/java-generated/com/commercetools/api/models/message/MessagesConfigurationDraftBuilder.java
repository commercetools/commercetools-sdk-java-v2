
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessagesConfigurationDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagesConfigurationDraft messagesConfigurationDraft = MessagesConfigurationDraft.builder()
 *             .enabled(true)
 *             .deleteDaysAfterCreation(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessagesConfigurationDraftBuilder implements Builder<MessagesConfigurationDraft> {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    /**
     <*  <p>Setting to <code>true</code> activates the Messages Query feature.</p>>
     */

    public MessagesConfigurationDraftBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     <*  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API.</p>>
     */

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
