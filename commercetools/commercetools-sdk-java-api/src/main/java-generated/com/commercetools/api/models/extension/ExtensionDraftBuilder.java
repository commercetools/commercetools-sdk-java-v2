
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionDraft extensionDraft = ExtensionDraft.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusTriggers(triggersBuilder -> triggersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionDraftBuilder implements Builder<ExtensionDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    @Nullable
    private Integer timeoutInMs;

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     * @param key
     * @return Builder
     */

    public ExtensionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @param destination
     * @return Builder
     */

    public ExtensionDraftBuilder destination(
            final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @return Builder
     */

    public ExtensionDraftBuilder destination(
            Function<com.commercetools.api.models.extension.ExtensionDestinationBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionDestination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.extension.ExtensionDestinationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers
     * @return Builder
     */

    public ExtensionDraftBuilder triggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers
     * @return Builder
     */

    public ExtensionDraftBuilder triggers(
            final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers
     * @return Builder
     */

    public ExtensionDraftBuilder plusTriggers(
            final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.addAll(Arrays.asList(triggers));
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @return Builder
     */

    public ExtensionDraftBuilder plusTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @return Builder
     */

    public ExtensionDraftBuilder withTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        this.triggers = new ArrayList<>();
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact our support via the Support Portal and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs
     * @return Builder
     */

    public ExtensionDraftBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    public ExtensionDraft build() {
        Objects.requireNonNull(destination, ExtensionDraft.class + ": destination is missing");
        Objects.requireNonNull(triggers, ExtensionDraft.class + ": triggers is missing");
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs);
    }

    /**
     * builds ExtensionDraft without checking for non null required values
     */
    public ExtensionDraft buildUnchecked() {
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs);
    }

    public static ExtensionDraftBuilder of() {
        return new ExtensionDraftBuilder();
    }

    public static ExtensionDraftBuilder of(final ExtensionDraft template) {
        ExtensionDraftBuilder builder = new ExtensionDraftBuilder();
        builder.key = template.getKey();
        builder.destination = template.getDestination();
        builder.triggers = template.getTriggers();
        builder.timeoutInMs = template.getTimeoutInMs();
        return builder;
    }

}
