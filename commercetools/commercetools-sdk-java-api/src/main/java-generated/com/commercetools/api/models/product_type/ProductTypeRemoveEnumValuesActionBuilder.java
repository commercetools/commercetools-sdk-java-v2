
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeRemoveEnumValuesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeRemoveEnumValuesAction productTypeRemoveEnumValuesAction = ProductTypeRemoveEnumValuesAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeRemoveEnumValuesActionBuilder implements Builder<ProductTypeRemoveEnumValuesAction> {

    private String attributeName;

    private java.util.List<String> keys;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeRemoveEnumValuesActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @param keys value to be set
     * @return Builder
     */

    public ProductTypeRemoveEnumValuesActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @param keys value to be set
     * @return Builder
     */

    public ProductTypeRemoveEnumValuesActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @param keys value to be set
     * @return Builder
     */

    public ProductTypeRemoveEnumValuesActionBuilder plusKeys(final String... keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @return keys
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * builds ProductTypeRemoveEnumValuesAction with checking for non-null required values
     * @return ProductTypeRemoveEnumValuesAction
     */
    public ProductTypeRemoveEnumValuesAction build() {
        Objects.requireNonNull(attributeName, ProductTypeRemoveEnumValuesAction.class + ": attributeName is missing");
        Objects.requireNonNull(keys, ProductTypeRemoveEnumValuesAction.class + ": keys is missing");
        return new ProductTypeRemoveEnumValuesActionImpl(attributeName, keys);
    }

    /**
     * builds ProductTypeRemoveEnumValuesAction without checking for non-null required values
     * @return ProductTypeRemoveEnumValuesAction
     */
    public ProductTypeRemoveEnumValuesAction buildUnchecked() {
        return new ProductTypeRemoveEnumValuesActionImpl(attributeName, keys);
    }

    /**
     * factory method for an instance of ProductTypeRemoveEnumValuesActionBuilder
     * @return builder
     */
    public static ProductTypeRemoveEnumValuesActionBuilder of() {
        return new ProductTypeRemoveEnumValuesActionBuilder();
    }

    /**
     * create builder for ProductTypeRemoveEnumValuesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeRemoveEnumValuesActionBuilder of(final ProductTypeRemoveEnumValuesAction template) {
        ProductTypeRemoveEnumValuesActionBuilder builder = new ProductTypeRemoveEnumValuesActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.keys = template.getKeys();
        return builder;
    }

}
