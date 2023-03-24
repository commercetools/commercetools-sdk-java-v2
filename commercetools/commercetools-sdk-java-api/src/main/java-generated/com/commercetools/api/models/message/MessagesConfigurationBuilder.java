
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessagesConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagesConfiguration messagesConfiguration = MessagesConfiguration.builder()
 *             .enabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessagesConfigurationBuilder implements Builder<MessagesConfiguration> {

    private Boolean enabled;

    @Nullable
    private Integer deleteDaysAfterCreation;

    /**
     *  <p>When <code>true</code>, the Messages Query feature is active.</p>
     * @param enabled value to be set
     * @return Builder
     */

    public MessagesConfigurationBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API. This field may not be present on Projects created before 8 October 2018.</p>
     * @param deleteDaysAfterCreation value to be set
     * @return Builder
     */

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

    /**
     * builds MessagesConfiguration with checking for non-null required values
     * @return MessagesConfiguration
     */
    public MessagesConfiguration build() {
        Objects.requireNonNull(enabled, MessagesConfiguration.class + ": enabled is missing");
        return new MessagesConfigurationImpl(enabled, deleteDaysAfterCreation);
    }

    /**
     * builds MessagesConfiguration without checking for non-null required values
     * @return MessagesConfiguration
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
