
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantResourceIdentifier variantResourceIdentifier = VariantResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantResourceIdentifierBuilder implements Builder<VariantResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds VariantResourceIdentifier with checking for non-null required values
     * @return VariantResourceIdentifier
     */
    public VariantResourceIdentifier build() {
        return new VariantResourceIdentifierImpl(id, key);
    }

    /**
     * builds VariantResourceIdentifier without checking for non-null required values
     * @return VariantResourceIdentifier
     */
    public VariantResourceIdentifier buildUnchecked() {
        return new VariantResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of VariantResourceIdentifierBuilder
     * @return builder
     */
    public static VariantResourceIdentifierBuilder of() {
        return new VariantResourceIdentifierBuilder();
    }

    /**
     * create builder for VariantResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantResourceIdentifierBuilder of(final VariantResourceIdentifier template) {
        VariantResourceIdentifierBuilder builder = new VariantResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
