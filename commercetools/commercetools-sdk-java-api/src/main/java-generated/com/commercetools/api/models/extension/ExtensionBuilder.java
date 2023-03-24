
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
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ExtensionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ExtensionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ExtensionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
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
     *  <p>Maximum time (in milliseconds) that the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     * @param timeoutInMs value to be set
     * @return Builder
     */

    public ExtensionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
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
            triggers, timeoutInMs);
    }

    /**
     * builds Extension without checking for non-null required values
     * @return Extension
     */
    public Extension buildUnchecked() {
        return new ExtensionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, destination,
            triggers, timeoutInMs);
    }

    public static ExtensionBuilder of() {
        return new ExtensionBuilder();
    }

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
        return builder;
    }

}
