
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportValidationFailedEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportValidationFailedEventData importValidationFailedEventData = ImportValidationFailedEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportValidationFailedEventDataBuilder implements Builder<ImportValidationFailedEventData> {

    private String id;

    private Integer version;

    private String importContainerKey;

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportValidationFailedEventDataBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportValidationFailedEventDataBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @param importContainerKey value to be set
     * @return Builder
     */

    public ImportValidationFailedEventDataBuilder importContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @return importContainerKey
     */

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    /**
     * builds ImportValidationFailedEventData with checking for non-null required values
     * @return ImportValidationFailedEventData
     */
    public ImportValidationFailedEventData build() {
        Objects.requireNonNull(id, ImportValidationFailedEventData.class + ": id is missing");
        Objects.requireNonNull(version, ImportValidationFailedEventData.class + ": version is missing");
        Objects.requireNonNull(importContainerKey,
            ImportValidationFailedEventData.class + ": importContainerKey is missing");
        return new ImportValidationFailedEventDataImpl(id, version, importContainerKey);
    }

    /**
     * builds ImportValidationFailedEventData without checking for non-null required values
     * @return ImportValidationFailedEventData
     */
    public ImportValidationFailedEventData buildUnchecked() {
        return new ImportValidationFailedEventDataImpl(id, version, importContainerKey);
    }

    /**
     * factory method for an instance of ImportValidationFailedEventDataBuilder
     * @return builder
     */
    public static ImportValidationFailedEventDataBuilder of() {
        return new ImportValidationFailedEventDataBuilder();
    }

    /**
     * create builder for ImportValidationFailedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportValidationFailedEventDataBuilder of(final ImportValidationFailedEventData template) {
        ImportValidationFailedEventDataBuilder builder = new ImportValidationFailedEventDataBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.importContainerKey = template.getImportContainerKey();
        return builder;
    }

}
