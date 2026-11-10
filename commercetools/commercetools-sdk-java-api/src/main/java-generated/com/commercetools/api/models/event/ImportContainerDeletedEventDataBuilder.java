
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerDeletedEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDeletedEventData importContainerDeletedEventData = ImportContainerDeletedEventData.builder()
 *             .key("{key}")
 *             .version(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerDeletedEventDataBuilder implements Builder<ImportContainerDeletedEventData> {

    private String key;

    private Integer version;

    /**
     *  <p>The <code>key</code> of the deleted Import Container.</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventDataBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The <code>version</code> of the deleted Import Container.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventDataBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the deleted Import Container.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <code>version</code> of the deleted Import Container.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * builds ImportContainerDeletedEventData with checking for non-null required values
     * @return ImportContainerDeletedEventData
     */
    public ImportContainerDeletedEventData build() {
        Objects.requireNonNull(key, ImportContainerDeletedEventData.class + ": key is missing");
        Objects.requireNonNull(version, ImportContainerDeletedEventData.class + ": version is missing");
        return new ImportContainerDeletedEventDataImpl(key, version);
    }

    /**
     * builds ImportContainerDeletedEventData without checking for non-null required values
     * @return ImportContainerDeletedEventData
     */
    public ImportContainerDeletedEventData buildUnchecked() {
        return new ImportContainerDeletedEventDataImpl(key, version);
    }

    /**
     * factory method for an instance of ImportContainerDeletedEventDataBuilder
     * @return builder
     */
    public static ImportContainerDeletedEventDataBuilder of() {
        return new ImportContainerDeletedEventDataBuilder();
    }

    /**
     * create builder for ImportContainerDeletedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDeletedEventDataBuilder of(final ImportContainerDeletedEventData template) {
        ImportContainerDeletedEventDataBuilder builder = new ImportContainerDeletedEventDataBuilder();
        builder.key = template.getKey();
        builder.version = template.getVersion();
        return builder;
    }

}
