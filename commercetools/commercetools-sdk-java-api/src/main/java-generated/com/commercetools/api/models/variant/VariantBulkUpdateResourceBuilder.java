
package com.commercetools.api.models.variant;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateResourceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateResource variantBulkUpdateResource = VariantBulkUpdateResource.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResourceBuilder implements Builder<VariantBulkUpdateResource> {

    private String id;

    private Long version;

    /**
     *  <p>Unique identifier of the updated Variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantBulkUpdateResourceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The new version of the Variant after the update.</p>
     * @param version value to be set
     * @return Builder
     */

    public VariantBulkUpdateResourceBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Unique identifier of the updated Variant.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The new version of the Variant after the update.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * builds VariantBulkUpdateResource with checking for non-null required values
     * @return VariantBulkUpdateResource
     */
    public VariantBulkUpdateResource build() {
        Objects.requireNonNull(id, VariantBulkUpdateResource.class + ": id is missing");
        Objects.requireNonNull(version, VariantBulkUpdateResource.class + ": version is missing");
        return new VariantBulkUpdateResourceImpl(id, version);
    }

    /**
     * builds VariantBulkUpdateResource without checking for non-null required values
     * @return VariantBulkUpdateResource
     */
    public VariantBulkUpdateResource buildUnchecked() {
        return new VariantBulkUpdateResourceImpl(id, version);
    }

    /**
     * factory method for an instance of VariantBulkUpdateResourceBuilder
     * @return builder
     */
    public static VariantBulkUpdateResourceBuilder of() {
        return new VariantBulkUpdateResourceBuilder();
    }

    /**
     * create builder for VariantBulkUpdateResource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateResourceBuilder of(final VariantBulkUpdateResource template) {
        VariantBulkUpdateResourceBuilder builder = new VariantBulkUpdateResourceBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        return builder;
    }

}
