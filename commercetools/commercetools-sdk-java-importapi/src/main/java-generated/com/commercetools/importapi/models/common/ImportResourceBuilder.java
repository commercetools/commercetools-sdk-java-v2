
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
     */

    public ImportResourceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ImportResource build() {
        Objects.requireNonNull(key, ImportResource.class + ": key is missing");
        return new ImportResourceImpl(key);
    }

    /**
     * builds ImportResource without checking for non null required values
     */
    public ImportResource buildUnchecked() {
        return new ImportResourceImpl(key);
    }

    public static ImportResourceBuilder of() {
        return new ImportResourceBuilder();
    }

    public static ImportResourceBuilder of(final ImportResource template) {
        ImportResourceBuilder builder = new ImportResourceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
