
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportWaitForMasterVariantEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportWaitForMasterVariantEventData importWaitForMasterVariantEventData = ImportWaitForMasterVariantEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportWaitForMasterVariantEventDataBuilder implements Builder<ImportWaitForMasterVariantEventData> {

    private String id;

    private Integer version;

    private String importContainerKey;

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventDataBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventDataBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @param importContainerKey value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventDataBuilder importContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
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
     * builds ImportWaitForMasterVariantEventData with checking for non-null required values
     * @return ImportWaitForMasterVariantEventData
     */
    public ImportWaitForMasterVariantEventData build() {
        Objects.requireNonNull(id, ImportWaitForMasterVariantEventData.class + ": id is missing");
        Objects.requireNonNull(version, ImportWaitForMasterVariantEventData.class + ": version is missing");
        Objects.requireNonNull(importContainerKey,
            ImportWaitForMasterVariantEventData.class + ": importContainerKey is missing");
        return new ImportWaitForMasterVariantEventDataImpl(id, version, importContainerKey);
    }

    /**
     * builds ImportWaitForMasterVariantEventData without checking for non-null required values
     * @return ImportWaitForMasterVariantEventData
     */
    public ImportWaitForMasterVariantEventData buildUnchecked() {
        return new ImportWaitForMasterVariantEventDataImpl(id, version, importContainerKey);
    }

    /**
     * factory method for an instance of ImportWaitForMasterVariantEventDataBuilder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventDataBuilder of() {
        return new ImportWaitForMasterVariantEventDataBuilder();
    }

    /**
     * create builder for ImportWaitForMasterVariantEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventDataBuilder of(final ImportWaitForMasterVariantEventData template) {
        ImportWaitForMasterVariantEventDataBuilder builder = new ImportWaitForMasterVariantEventDataBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.importContainerKey = template.getImportContainerKey();
        return builder;
    }

}
