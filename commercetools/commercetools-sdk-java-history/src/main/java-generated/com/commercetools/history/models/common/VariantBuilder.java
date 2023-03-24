
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Variant variant = Variant.builder()
 *             .id(1)
 *             .sku("{sku}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBuilder implements Builder<Variant> {

    private Integer id;

    private String sku;

    private String key;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public VariantBuilder id(final Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param sku value to be set
     * @return Builder
     */

    public VariantBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public VariantBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSku() {
        return this.sku;
    }

    public String getKey() {
        return this.key;
    }

    /**
     * builds Variant with checking for non-null required values
     * @return Variant
     */
    public Variant build() {
        Objects.requireNonNull(id, Variant.class + ": id is missing");
        Objects.requireNonNull(sku, Variant.class + ": sku is missing");
        Objects.requireNonNull(key, Variant.class + ": key is missing");
        return new VariantImpl(id, sku, key);
    }

    /**
     * builds Variant without checking for non-null required values
     * @return Variant
     */
    public Variant buildUnchecked() {
        return new VariantImpl(id, sku, key);
    }

    public static VariantBuilder of() {
        return new VariantBuilder();
    }

    public static VariantBuilder of(final Variant template) {
        VariantBuilder builder = new VariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        return builder;
    }

}
