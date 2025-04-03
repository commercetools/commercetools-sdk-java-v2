
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerCreatedEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerCreatedEventData importContainerCreatedEventData = ImportContainerCreatedEventData.builder()
 *             .key("{key}")
 *             .version(1)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerCreatedEventDataBuilder implements Builder<ImportContainerCreatedEventData> {

    private String key;

    private Integer version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>The <code>key</code> of the created Import Container.</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventDataBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The <code>version</code> of the created Import Container.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventDataBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Import Container was created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventDataBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Import Container was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventDataBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the created Import Container.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <code>version</code> of the created Import Container.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Import Container was created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Import Container was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * builds ImportContainerCreatedEventData with checking for non-null required values
     * @return ImportContainerCreatedEventData
     */
    public ImportContainerCreatedEventData build() {
        Objects.requireNonNull(key, ImportContainerCreatedEventData.class + ": key is missing");
        Objects.requireNonNull(version, ImportContainerCreatedEventData.class + ": version is missing");
        Objects.requireNonNull(createdAt, ImportContainerCreatedEventData.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportContainerCreatedEventData.class + ": lastModifiedAt is missing");
        return new ImportContainerCreatedEventDataImpl(key, version, createdAt, lastModifiedAt);
    }

    /**
     * builds ImportContainerCreatedEventData without checking for non-null required values
     * @return ImportContainerCreatedEventData
     */
    public ImportContainerCreatedEventData buildUnchecked() {
        return new ImportContainerCreatedEventDataImpl(key, version, createdAt, lastModifiedAt);
    }

    /**
     * factory method for an instance of ImportContainerCreatedEventDataBuilder
     * @return builder
     */
    public static ImportContainerCreatedEventDataBuilder of() {
        return new ImportContainerCreatedEventDataBuilder();
    }

    /**
     * create builder for ImportContainerCreatedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerCreatedEventDataBuilder of(final ImportContainerCreatedEventData template) {
        ImportContainerCreatedEventDataBuilder builder = new ImportContainerCreatedEventDataBuilder();
        builder.key = template.getKey();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
