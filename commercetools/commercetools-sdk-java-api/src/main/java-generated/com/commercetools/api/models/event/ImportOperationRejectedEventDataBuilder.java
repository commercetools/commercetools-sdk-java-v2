
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportOperationRejectedEventDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationRejectedEventData importOperationRejectedEventData = ImportOperationRejectedEventData.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportOperationRejectedEventDataBuilder implements Builder<ImportOperationRejectedEventData> {

    private String id;

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>rejected</code> state.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventDataBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>rejected</code> state.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ImportOperationRejectedEventData with checking for non-null required values
     * @return ImportOperationRejectedEventData
     */
    public ImportOperationRejectedEventData build() {
        Objects.requireNonNull(id, ImportOperationRejectedEventData.class + ": id is missing");
        return new ImportOperationRejectedEventDataImpl(id);
    }

    /**
     * builds ImportOperationRejectedEventData without checking for non-null required values
     * @return ImportOperationRejectedEventData
     */
    public ImportOperationRejectedEventData buildUnchecked() {
        return new ImportOperationRejectedEventDataImpl(id);
    }

    /**
     * factory method for an instance of ImportOperationRejectedEventDataBuilder
     * @return builder
     */
    public static ImportOperationRejectedEventDataBuilder of() {
        return new ImportOperationRejectedEventDataBuilder();
    }

    /**
     * create builder for ImportOperationRejectedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationRejectedEventDataBuilder of(final ImportOperationRejectedEventData template) {
        ImportOperationRejectedEventDataBuilder builder = new ImportOperationRejectedEventDataBuilder();
        builder.id = template.getId();
        return builder;
    }

}
