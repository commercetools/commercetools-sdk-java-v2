
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeDraft productTypeDraft = ProductTypeDraft.builder()
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeDraftBuilder implements Builder<ProductTypeDraft> {

    @Nullable
    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ProductType.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the ProductType.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder description(final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeDraftBuilder addAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraft> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()));
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeDraftBuilder setAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraft> builder) {
        return attributes(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the ProductType.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the ProductType.</p>
     * @return description
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductTypeDraft with checking for non-null required values
     * @return ProductTypeDraft
     */
    public ProductTypeDraft build() {
        Objects.requireNonNull(name, ProductTypeDraft.class + ": name is missing");
        Objects.requireNonNull(description, ProductTypeDraft.class + ": description is missing");
        return new ProductTypeDraftImpl(key, name, description, attributes);
    }

    /**
     * builds ProductTypeDraft without checking for non-null required values
     * @return ProductTypeDraft
     */
    public ProductTypeDraft buildUnchecked() {
        return new ProductTypeDraftImpl(key, name, description, attributes);
    }

    /**
     * factory method for an instance of ProductTypeDraftBuilder
     * @return builder
     */
    public static ProductTypeDraftBuilder of() {
        return new ProductTypeDraftBuilder();
    }

    /**
     * create builder for ProductTypeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeDraftBuilder of(final ProductTypeDraft template) {
        ProductTypeDraftBuilder builder = new ProductTypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
