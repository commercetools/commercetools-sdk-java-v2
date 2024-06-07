
package com.commercetools.api.models.search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchMatchingVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchMatchingVariant searchMatchingVariant = SearchMatchingVariant.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchMatchingVariantBuilder implements Builder<SearchMatchingVariant> {

    private Integer id;

    @Nullable
    private String sku;

    /**
     *  <p>Unique identifier of the variant.</p>
     * @param id value to be set
     * @return Builder
     */

    public SearchMatchingVariantBuilder id(final Integer id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>SKU of the matching variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public SearchMatchingVariantBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the variant.</p>
     * @return id
     */

    public Integer getId() {
        return this.id;
    }

    /**
     *  <p>SKU of the matching variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     * builds SearchMatchingVariant with checking for non-null required values
     * @return SearchMatchingVariant
     */
    public SearchMatchingVariant build() {
        Objects.requireNonNull(id, SearchMatchingVariant.class + ": id is missing");
        return new SearchMatchingVariantImpl(id, sku);
    }

    /**
     * builds SearchMatchingVariant without checking for non-null required values
     * @return SearchMatchingVariant
     */
    public SearchMatchingVariant buildUnchecked() {
        return new SearchMatchingVariantImpl(id, sku);
    }

    /**
     * factory method for an instance of SearchMatchingVariantBuilder
     * @return builder
     */
    public static SearchMatchingVariantBuilder of() {
        return new SearchMatchingVariantBuilder();
    }

    /**
     * create builder for SearchMatchingVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchMatchingVariantBuilder of(final SearchMatchingVariant template) {
        SearchMatchingVariantBuilder builder = new SearchMatchingVariantBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        return builder;
    }

}
