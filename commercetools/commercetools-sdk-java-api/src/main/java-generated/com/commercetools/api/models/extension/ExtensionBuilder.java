
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Extension extension = Extension.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusTriggers(triggersBuilder -> triggersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionBuilder implements Builder<Extension> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    @Nullable
    private Integer timeoutInMs;

    @Nullable
    private java.util.List<com.commercetools.api.models.extension.ExtensionReference> dependencies;

    @Nullable
    private java.util.List<String> expansionPaths;

    @Nullable
    private com.commercetools.api.models.extension.ExtensionAdditionalContext additionalContext;

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param id value to be set
     * @return Builder
     */

    public ExtensionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Extension.</p>
     * @param version value to be set
     * @return Builder
     */

    public ExtensionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Extension was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ExtensionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Extension was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ExtensionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ExtensionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ExtensionBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ExtensionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ExtensionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ExtensionBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ExtensionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param key value to be set
     * @return Builder
     */

    public ExtensionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The configuration for the Extension, including its type, location and authentication details.</p>
     * @param destination value to be set
     * @return Builder
     */

    public ExtensionBuilder destination(final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>The configuration for the Extension, including its type, location and authentication details.</p>
     * @param builder function to build the destination value
     * @return Builder
     */

    public ExtensionBuilder destination(
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

    public ExtensionBuilder triggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers value to be set
     * @return Builder
     */

    public ExtensionBuilder triggers(
            final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers value to be set
     * @return Builder
     */

    public ExtensionBuilder plusTriggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
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

    public ExtensionBuilder plusTriggers(
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

    public ExtensionBuilder withTriggers(
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

    public ExtensionBuilder addTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTrigger> builder) {
        return plusTriggers(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()));
    }

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param builder function to build the triggers value
     * @return Builder
     */

    public ExtensionBuilder setTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTrigger> builder) {
        return triggers(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()));
    }

    /**
     *  <p>Maximum time (in milliseconds) that the Extension can respond within. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>commercetools support team</span> and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     * @return Builder
     */

    public ExtensionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionBuilder dependencies(
            @Nullable final com.commercetools.api.models.extension.ExtensionReference... dependencies) {
        this.dependencies = new ArrayList<>(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionBuilder dependencies(
            @Nullable final java.util.List<com.commercetools.api.models.extension.ExtensionReference> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param dependencies value to be set
     * @return Builder
     */

    public ExtensionBuilder plusDependencies(
            @Nullable final com.commercetools.api.models.extension.ExtensionReference... dependencies) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.addAll(Arrays.asList(dependencies));
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionBuilder plusDependencies(
            Function<com.commercetools.api.models.extension.ExtensionReferenceBuilder, com.commercetools.api.models.extension.ExtensionReferenceBuilder> builder) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionBuilder withDependencies(
            Function<com.commercetools.api.models.extension.ExtensionReferenceBuilder, com.commercetools.api.models.extension.ExtensionReferenceBuilder> builder) {
        this.dependencies = new ArrayList<>();
        this.dependencies
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionBuilder addDependencies(
            Function<com.commercetools.api.models.extension.ExtensionReferenceBuilder, com.commercetools.api.models.extension.ExtensionReference> builder) {
        return plusDependencies(builder.apply(com.commercetools.api.models.extension.ExtensionReferenceBuilder.of()));
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @param builder function to build the dependencies value
     * @return Builder
     */

    public ExtensionBuilder setDependencies(
            Function<com.commercetools.api.models.extension.ExtensionReferenceBuilder, com.commercetools.api.models.extension.ExtensionReference> builder) {
        return dependencies(builder.apply(com.commercetools.api.models.extension.ExtensionReferenceBuilder.of()));
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionBuilder expansionPaths(@Nullable final String... expansionPaths) {
        this.expansionPaths = new ArrayList<>(Arrays.asList(expansionPaths));
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionBuilder expansionPaths(@Nullable final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
        return this;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths value to be set
     * @return Builder
     */

    public ExtensionBuilder plusExpansionPaths(@Nullable final String... expansionPaths) {
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

    public ExtensionBuilder additionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContextBuilder> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @param builder function to build the additionalContext value
     * @return Builder
     */

    public ExtensionBuilder withAdditionalContext(
            Function<com.commercetools.api.models.extension.ExtensionAdditionalContextBuilder, com.commercetools.api.models.extension.ExtensionAdditionalContext> builder) {
        this.additionalContext = builder
                .apply(com.commercetools.api.models.extension.ExtensionAdditionalContextBuilder.of());
        return this;
    }

    /**
     *  <p>Configures additional information included in the payload sent to the API Extension.</p>
     * @param additionalContext value to be set
     * @return Builder
     */

    public ExtensionBuilder additionalContext(
            @Nullable final com.commercetools.api.models.extension.ExtensionAdditionalContext additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Extension.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Extension was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Extension was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The configuration for the Extension, including its type, location and authentication details.</p>
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
     *  <p>Maximum time (in milliseconds) that the Extension can respond within. If no timeout is provided, the default value is used for all <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionResourceTypeId" rel="nofollow">types of Extensions</a>.</p>
     *  <p>The limit of 10000 ms (10 seconds) can be increased per Project after we review the performance impact. Please contact the <span>commercetools support team</span> and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    /**
     *  <p>References to other Extensions that must complete before this Extension is called. The Extension receives the resource state after all transitive ancestors' update actions have been applied. Maximum 5 entries.</p>
     * @return dependencies
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.extension.ExtensionReference> getDependencies() {
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
    public com.commercetools.api.models.extension.ExtensionAdditionalContext getAdditionalContext() {
        return this.additionalContext;
    }

    /**
     * builds Extension with checking for non-null required values
     * @return Extension
     */
    public Extension build() {
        Objects.requireNonNull(id, Extension.class + ": id is missing");
        Objects.requireNonNull(version, Extension.class + ": version is missing");
        Objects.requireNonNull(createdAt, Extension.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Extension.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(destination, Extension.class + ": destination is missing");
        Objects.requireNonNull(triggers, Extension.class + ": triggers is missing");
        return new ExtensionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, destination,
            triggers, timeoutInMs, dependencies, expansionPaths, additionalContext);
    }

    /**
     * builds Extension without checking for non-null required values
     * @return Extension
     */
    public Extension buildUnchecked() {
        return new ExtensionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, destination,
            triggers, timeoutInMs, dependencies, expansionPaths, additionalContext);
    }

    /**
     * factory method for an instance of ExtensionBuilder
     * @return builder
     */
    public static ExtensionBuilder of() {
        return new ExtensionBuilder();
    }

    /**
     * create builder for Extension instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionBuilder of(final Extension template) {
        ExtensionBuilder builder = new ExtensionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
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
