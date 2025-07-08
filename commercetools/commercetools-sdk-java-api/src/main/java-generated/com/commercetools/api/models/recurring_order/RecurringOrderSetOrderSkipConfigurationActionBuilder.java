
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetOrderSkipConfigurationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetOrderSkipConfigurationAction recurringOrderSetOrderSkipConfigurationAction = RecurringOrderSetOrderSkipConfigurationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetOrderSkipConfigurationActionBuilder
        implements Builder<RecurringOrderSetOrderSkipConfigurationAction> {

    @Nullable
    private com.commercetools.api.models.recurring_order.SkipConfigurationDraft skipConfiguration;

    @Nullable
    private java.time.ZonedDateTime updatedExpiresAt;

    /**
     *  <p>Configuration for skipping the next orders of the Recurring Order.</p>
     * @param skipConfiguration value to be set
     * @return Builder
     */

    public RecurringOrderSetOrderSkipConfigurationActionBuilder skipConfiguration(
            @Nullable final com.commercetools.api.models.recurring_order.SkipConfigurationDraft skipConfiguration) {
        this.skipConfiguration = skipConfiguration;
        return this;
    }

    /**
     *  <p>Configuration for skipping the next orders of the Recurring Order.</p>
     * @param builder function to build the skipConfiguration value
     * @return Builder
     */

    public RecurringOrderSetOrderSkipConfigurationActionBuilder skipConfiguration(
            Function<com.commercetools.api.models.recurring_order.SkipConfigurationDraftBuilder, Builder<? extends com.commercetools.api.models.recurring_order.SkipConfigurationDraft>> builder) {
        this.skipConfiguration = builder
                .apply(com.commercetools.api.models.recurring_order.SkipConfigurationDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order will resume and start to generate new orders.</p>
     * @param updatedExpiresAt value to be set
     * @return Builder
     */

    public RecurringOrderSetOrderSkipConfigurationActionBuilder updatedExpiresAt(
            @Nullable final java.time.ZonedDateTime updatedExpiresAt) {
        this.updatedExpiresAt = updatedExpiresAt;
        return this;
    }

    /**
     *  <p>Configuration for skipping the next orders of the Recurring Order.</p>
     * @return skipConfiguration
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.SkipConfigurationDraft getSkipConfiguration() {
        return this.skipConfiguration;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order will resume and start to generate new orders.</p>
     * @return updatedExpiresAt
     */

    @Nullable
    public java.time.ZonedDateTime getUpdatedExpiresAt() {
        return this.updatedExpiresAt;
    }

    /**
     * builds RecurringOrderSetOrderSkipConfigurationAction with checking for non-null required values
     * @return RecurringOrderSetOrderSkipConfigurationAction
     */
    public RecurringOrderSetOrderSkipConfigurationAction build() {
        return new RecurringOrderSetOrderSkipConfigurationActionImpl(skipConfiguration, updatedExpiresAt);
    }

    /**
     * builds RecurringOrderSetOrderSkipConfigurationAction without checking for non-null required values
     * @return RecurringOrderSetOrderSkipConfigurationAction
     */
    public RecurringOrderSetOrderSkipConfigurationAction buildUnchecked() {
        return new RecurringOrderSetOrderSkipConfigurationActionImpl(skipConfiguration, updatedExpiresAt);
    }

    /**
     * factory method for an instance of RecurringOrderSetOrderSkipConfigurationActionBuilder
     * @return builder
     */
    public static RecurringOrderSetOrderSkipConfigurationActionBuilder of() {
        return new RecurringOrderSetOrderSkipConfigurationActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetOrderSkipConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetOrderSkipConfigurationActionBuilder of(
            final RecurringOrderSetOrderSkipConfigurationAction template) {
        RecurringOrderSetOrderSkipConfigurationActionBuilder builder = new RecurringOrderSetOrderSkipConfigurationActionBuilder();
        builder.skipConfiguration = template.getSkipConfiguration();
        builder.updatedExpiresAt = template.getUpdatedExpiresAt();
        return builder;
    }

}
