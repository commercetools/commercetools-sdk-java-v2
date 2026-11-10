
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateItem variantBulkUpdateItem = VariantBulkUpdateItem.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateItemBuilder implements Builder<VariantBulkUpdateItem> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    @Nullable
    private Long version;

    /**
     *  <p>Unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantBulkUpdateItemBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantBulkUpdateItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Expected version of the Variant. Required when the <code>versionControl</code> query parameter is <code>On</code> (the default). If the version does not match, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned for that item. Not required when <code>versionControl=Off</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public VariantBulkUpdateItemBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Expected version of the Variant. Required when the <code>versionControl</code> query parameter is <code>On</code> (the default). If the version does not match, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned for that item. Not required when <code>versionControl=Off</code>.</p>
     * @return version
     */

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    /**
     * builds VariantBulkUpdateItem with checking for non-null required values
     * @return VariantBulkUpdateItem
     */
    public VariantBulkUpdateItem build() {
        return new VariantBulkUpdateItemImpl(id, key, version);
    }

    /**
     * builds VariantBulkUpdateItem without checking for non-null required values
     * @return VariantBulkUpdateItem
     */
    public VariantBulkUpdateItem buildUnchecked() {
        return new VariantBulkUpdateItemImpl(id, key, version);
    }

    /**
     * factory method for an instance of VariantBulkUpdateItemBuilder
     * @return builder
     */
    public static VariantBulkUpdateItemBuilder of() {
        return new VariantBulkUpdateItemBuilder();
    }

    /**
     * create builder for VariantBulkUpdateItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateItemBuilder of(final VariantBulkUpdateItem template) {
        VariantBulkUpdateItemBuilder builder = new VariantBulkUpdateItemBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.version = template.getVersion();
        return builder;
    }

}
