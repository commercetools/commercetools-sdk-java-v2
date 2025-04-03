
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportUnresolvedEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportUnresolvedEventData importUnresolvedEventData = ImportUnresolvedEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportUnresolvedEventDataBuilder implements Builder<ImportUnresolvedEventData> {

    private String id;

    private Integer version;

    private String importContainerKey;

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportUnresolvedEventDataBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportUnresolvedEventDataBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @param importContainerKey value to be set
     * @return Builder
     */

    public ImportUnresolvedEventDataBuilder importContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>unresolved</code> state.</p>
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
     * builds ImportUnresolvedEventData with checking for non-null required values
     * @return ImportUnresolvedEventData
     */
    public ImportUnresolvedEventData build() {
        Objects.requireNonNull(id, ImportUnresolvedEventData.class + ": id is missing");
        Objects.requireNonNull(version, ImportUnresolvedEventData.class + ": version is missing");
        Objects.requireNonNull(importContainerKey, ImportUnresolvedEventData.class + ": importContainerKey is missing");
        return new ImportUnresolvedEventDataImpl(id, version, importContainerKey);
    }

    /**
     * builds ImportUnresolvedEventData without checking for non-null required values
     * @return ImportUnresolvedEventData
     */
    public ImportUnresolvedEventData buildUnchecked() {
        return new ImportUnresolvedEventDataImpl(id, version, importContainerKey);
    }

    /**
     * factory method for an instance of ImportUnresolvedEventDataBuilder
     * @return builder
     */
    public static ImportUnresolvedEventDataBuilder of() {
        return new ImportUnresolvedEventDataBuilder();
    }

    /**
     * create builder for ImportUnresolvedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportUnresolvedEventDataBuilder of(final ImportUnresolvedEventData template) {
        ImportUnresolvedEventDataBuilder builder = new ImportUnresolvedEventDataBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.importContainerKey = template.getImportContainerKey();
        return builder;
    }

}
