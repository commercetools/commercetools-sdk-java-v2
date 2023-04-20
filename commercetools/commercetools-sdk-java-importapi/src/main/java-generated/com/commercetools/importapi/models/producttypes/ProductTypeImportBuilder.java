
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeImport productTypeImport = ProductTypeImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeImportBuilder implements Builder<ProductTypeImport> {

    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes;

    /**
     *  <p>User-defined unique identifier.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductType.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductType.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder description(final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTypeImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeDefinition... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeImportBuilder addAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinition> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()));
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTypeImportBuilder setAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinition> builder) {
        return attributes(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductType.name</code>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductType.description</code>.</p>
     * @return description
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductTypeImport with checking for non-null required values
     * @return ProductTypeImport
     */
    public ProductTypeImport build() {
        Objects.requireNonNull(key, ProductTypeImport.class + ": key is missing");
        Objects.requireNonNull(name, ProductTypeImport.class + ": name is missing");
        Objects.requireNonNull(description, ProductTypeImport.class + ": description is missing");
        return new ProductTypeImportImpl(key, name, description, attributes);
    }

    /**
     * builds ProductTypeImport without checking for non-null required values
     * @return ProductTypeImport
     */
    public ProductTypeImport buildUnchecked() {
        return new ProductTypeImportImpl(key, name, description, attributes);
    }

    /**
     * factory method for an instance of ProductTypeImportBuilder
     * @return builder
     */
    public static ProductTypeImportBuilder of() {
        return new ProductTypeImportBuilder();
    }

    /**
     * create builder for ProductTypeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeImportBuilder of(final ProductTypeImport template) {
        ProductTypeImportBuilder builder = new ProductTypeImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
