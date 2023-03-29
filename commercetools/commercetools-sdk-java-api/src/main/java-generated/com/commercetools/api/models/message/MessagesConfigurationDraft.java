
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines the configuration for the Messages Query feature for the Project.</p>
 *
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
@JsonDeserialize(as = MessagesConfigurationDraftImpl.class)
public interface MessagesConfigurationDraft extends io.vrap.rmf.base.client.Draft<MessagesConfigurationDraft> {

    /**
     *  <p>Setting to <code>true</code> activates the Messages Query feature.</p>
     * @return enabled
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API.</p>
     * @return deleteDaysAfterCreation
     */
    @NotNull
    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    /**
     *  <p>Setting to <code>true</code> activates the Messages Query feature.</p>
     * @param enabled value to be set
     */

    public void setEnabled(final Boolean enabled);

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API.</p>
     * @param deleteDaysAfterCreation value to be set
     */

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    /**
     * factory method
     * @return instance of MessagesConfigurationDraft
     */
    public static MessagesConfigurationDraft of() {
        return new MessagesConfigurationDraftImpl();
    }

    /**
     * factory method to create a shallow copy MessagesConfigurationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MessagesConfigurationDraft of(final MessagesConfigurationDraft template) {
        MessagesConfigurationDraftImpl instance = new MessagesConfigurationDraftImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    /**
     * factory method to create a deep copy of MessagesConfigurationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MessagesConfigurationDraft deepCopy(@Nullable final MessagesConfigurationDraft template) {
        if (template == null) {
            return null;
        }
        MessagesConfigurationDraftImpl instance = new MessagesConfigurationDraftImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    /**
     * builder factory method for MessagesConfigurationDraft
     * @return builder
     */
    public static MessagesConfigurationDraftBuilder builder() {
        return MessagesConfigurationDraftBuilder.of();
    }

    /**
     * create builder for MessagesConfigurationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessagesConfigurationDraftBuilder builder(final MessagesConfigurationDraft template) {
        return MessagesConfigurationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessagesConfigurationDraft(Function<MessagesConfigurationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessagesConfigurationDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagesConfigurationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MessagesConfigurationDraft>";
            }
        };
    }
}
