
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
     */

    public ProductTypeRemoveEnumValuesActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     */

    public ProductTypeRemoveEnumValuesActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     */

    public ProductTypeRemoveEnumValuesActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     */

    public ProductTypeRemoveEnumValuesActionBuilder plusKeys(final String... keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public ProductTypeRemoveEnumValuesAction build() {
        Objects.requireNonNull(attributeName, ProductTypeRemoveEnumValuesAction.class + ": attributeName is missing");
        Objects.requireNonNull(keys, ProductTypeRemoveEnumValuesAction.class + ": keys is missing");
        return new ProductTypeRemoveEnumValuesActionImpl(attributeName, keys);
    }

    /**
     * builds ProductTypeRemoveEnumValuesAction without checking for non null required values
     */
    public ProductTypeRemoveEnumValuesAction buildUnchecked() {
        return new ProductTypeRemoveEnumValuesActionImpl(attributeName, keys);
    }

    public static ProductTypeRemoveEnumValuesActionBuilder of() {
        return new ProductTypeRemoveEnumValuesActionBuilder();
    }

    public static ProductTypeRemoveEnumValuesActionBuilder of(final ProductTypeRemoveEnumValuesAction template) {
        ProductTypeRemoveEnumValuesActionBuilder builder = new ProductTypeRemoveEnumValuesActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.keys = template.getKeys();
        return builder;
    }

}
