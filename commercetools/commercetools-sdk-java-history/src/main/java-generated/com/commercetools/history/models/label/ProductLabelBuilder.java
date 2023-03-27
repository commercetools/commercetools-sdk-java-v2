
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductLabel productLabel = ProductLabel.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductLabelBuilder implements Builder<ProductLabel> {

    private com.commercetools.history.models.common.LocalizedString slug;

    private com.commercetools.history.models.common.LocalizedString name;

    /**
     * set the value to the slug using the builder function
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductLabelBuilder slug(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the slug
     * @param slug value to be set
     * @return Builder
     */

    public ProductLabelBuilder slug(final com.commercetools.history.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductLabelBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public ProductLabelBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     * value of slug}
     * @return slug
     */

    public com.commercetools.history.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     * value of name}
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ProductLabel with checking for non-null required values
     * @return ProductLabel
     */
    public ProductLabel build() {
        Objects.requireNonNull(slug, ProductLabel.class + ": slug is missing");
        Objects.requireNonNull(name, ProductLabel.class + ": name is missing");
        return new ProductLabelImpl(slug, name);
    }

    /**
     * builds ProductLabel without checking for non-null required values
     * @return ProductLabel
     */
    public ProductLabel buildUnchecked() {
        return new ProductLabelImpl(slug, name);
    }

    /**
     * factory method for an instance of ProductLabelBuilder
     * @return builder
     */
    public static ProductLabelBuilder of() {
        return new ProductLabelBuilder();
    }

    /**
     * create builder for ProductLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductLabelBuilder of(final ProductLabel template) {
        ProductLabelBuilder builder = new ProductLabelBuilder();
        builder.slug = template.getSlug();
        builder.name = template.getName();
        return builder;
    }

}
