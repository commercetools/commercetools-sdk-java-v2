
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportResourceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportResource importResource = ImportResource.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportResourceBuilder implements Builder<ImportResource> {

    private String key;

    /**
     *  <p>User-defined unique identifier.</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportResourceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds ImportResource with checking for non-null required values
     * @return ImportResource
     */
    public ImportResource build() {
        Objects.requireNonNull(key, ImportResource.class + ": key is missing");
        return new ImportResourceImpl(key);
    }

    /**
     * builds ImportResource without checking for non-null required values
     * @return ImportResource
     */
    public ImportResource buildUnchecked() {
        return new ImportResourceImpl(key);
    }

    /**
     * factory method for an instance of ImportResourceBuilder
     * @return builder
     */
    public static ImportResourceBuilder of() {
        return new ImportResourceBuilder();
    }

    /**
     * create builder for ImportResource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportResourceBuilder of(final ImportResource template) {
        ImportResourceBuilder builder = new ImportResourceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
