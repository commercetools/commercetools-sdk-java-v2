
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

    @Nullable
    private java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies;

    @Nullable
    private java.util.List<String> expansionPaths;

    @Nullable
    private com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext;

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     * @param key value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @param destination value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder destination(
            final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @param builder function to build the destination value
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
     * @param triggers value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder triggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder triggers(
            final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers value to be set
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
     * @param builder function to build the triggers value
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
     * @param builder function to build the triggers value
     * @return Builder
     */

    public ExtensionDraftBuilder withTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        this.triggers = new ArrayList<>();
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param builder function to build the triggers value
     * @return Builder
     */

    public ExtensionDraftBuilder addTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTrigger> builder) {
        return plusTriggers(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()));
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param builder function to build the triggers value
     * @return Builder
     */

    public ExtensionDraftBuilder setTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTrigger> builder) {
        return triggers(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()));
    }

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>. We recommend keeping the timeout as low as possible to avoid performance issues.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>commercetools support team</span> and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder dependencies(
            @Nullable final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        this.dependencies = new ArrayList<>(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder dependencies(
            @Nullable final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder plusDependencies(
            @Nullable final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.addAll(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionDraftBuilder plusDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder> builder) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionDraftBuilder withDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder> builder) {
        this.dependencies = new ArrayList<>();
        this.dependencies.add(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionDraftBuilder addDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifier> builder) {
        return plusDependencies(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionDraftBuilder setDependencies(
            Function<com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder, com.commercetools.api.models.extension.ExtensionResourceIdentifier> builder) {
        return dependencies(
            builder.apply(com.commercetools.api.models.extension.ExtensionResourceIdentifierBuilder.of()));
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder expansionPaths(@Nullable final String... expansionPaths) {
        this.expansionPaths = new ArrayList<>(Arrays.asList(expansionPaths));
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder expansionPaths(@Nullable final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder plusExpansionPaths(@Nullable final String... expansionPaths) {
        if (this.expansionPaths == null) {
            this.expansionPaths = new ArrayList<>();
        }
        this.expansionPaths.addAll(Arrays.asList(expansionPaths));
        return this;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @param builder function to build the additionalContext value
     * @return Builder
     */

    public ExtensionDraftBuilder additionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @param builder function to build the additionalContext value
     * @return Builder
     */

    public ExtensionDraftBuilder withAdditionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContextDraft> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @param additionalContext value to be set
     * @return Builder
     */

    public ExtensionDraftBuilder additionalContext(
            @Nullable final com.commercetools.api.models.extension.ExtensionAdditionalContextDraft additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @return destination
     */

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @return triggers
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>. We recommend keeping the timeout as low as possible to avoid performance issues.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>commercetools support team</span> and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    /**
     *  <p>Extensions that must complete before this Extension is called, identified by <code>id</code> or <code>key</code>. Maximum 5 entries. If omitted, the Extension has no dependencies and may run concurrently with other independent Extensions.</p>
     * @return dependencies
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> getDependencies() {
        return this.dependencies;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @return expansionPaths
     */

    @Nullable
    public java.util.List<String> getExpansionPaths() {
        return this.expansionPaths;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @return additionalContext
     */

    @Nullable
    public com.commercetools.api.models.extension.ExtensionAdditionalContextDraft getAdditionalContext() {
        return this.additionalContext;
    }

    /**
     * builds ExtensionDraft with checking for non-null required values
     * @return ExtensionDraft
     */
    public ExtensionDraft build() {
        Objects.requireNonNull(destination, ExtensionDraft.class + ": destination is missing");
        Objects.requireNonNull(triggers, ExtensionDraft.class + ": triggers is missing");
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs, dependencies, expansionPaths,
            additionalContext);
    }

    /**
     * builds ExtensionDraft without checking for non-null required values
     * @return ExtensionDraft
     */
    public ExtensionDraft buildUnchecked() {
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs, dependencies, expansionPaths,
            additionalContext);
    }

    /**
     * factory method for an instance of ExtensionDraftBuilder
     * @return builder
     */
    public static ExtensionDraftBuilder of() {
        return new ExtensionDraftBuilder();
    }

    /**
     * create builder for ExtensionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionDraftBuilder of(final ExtensionDraft template) {
        ExtensionDraftBuilder builder = new ExtensionDraftBuilder();
        builder.key = template.getKey();
        builder.destination = template.getDestination();
        builder.triggers = template.getTriggers();
        builder.timeoutInMs = template.getTimeoutInMs();
        builder.dependencies = template.getDependencies();
        builder.expansionPaths = template.getExpansionPaths();
        builder.additionalContext = template.getAdditionalContext();
        return builder;
    }

}
