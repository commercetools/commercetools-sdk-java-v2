
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductPriceCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductPriceCustomFieldAction productSetProductPriceCustomFieldAction = ProductSetProductPriceCustomFieldAction.builder()
 *             .priceId("{priceId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductPriceCustomFieldActionBuilder
        implements Builder<ProductSetProductPriceCustomFieldAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomFieldActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price Custom Field is updated. If <code>false</code>, both the current and staged Embedded Price Custom Field are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price Custom Field is updated. If <code>false</code>, both the current and staged Embedded Price Custom Field are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ProductSetProductPriceCustomFieldAction with checking for non-null required values
     * @return ProductSetProductPriceCustomFieldAction
     */
    public ProductSetProductPriceCustomFieldAction build() {
        Objects.requireNonNull(priceId, ProductSetProductPriceCustomFieldAction.class + ": priceId is missing");
        Objects.requireNonNull(name, ProductSetProductPriceCustomFieldAction.class + ": name is missing");
        return new ProductSetProductPriceCustomFieldActionImpl(priceId, staged, name, value);
    }

    /**
     * builds ProductSetProductPriceCustomFieldAction without checking for non-null required values
     * @return ProductSetProductPriceCustomFieldAction
     */
    public ProductSetProductPriceCustomFieldAction buildUnchecked() {
        return new ProductSetProductPriceCustomFieldActionImpl(priceId, staged, name, value);
    }

    /**
     * factory method for an instance of ProductSetProductPriceCustomFieldActionBuilder
     * @return builder
     */
    public static ProductSetProductPriceCustomFieldActionBuilder of() {
        return new ProductSetProductPriceCustomFieldActionBuilder();
    }

    /**
     * create builder for ProductSetProductPriceCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductPriceCustomFieldActionBuilder of(
            final ProductSetProductPriceCustomFieldAction template) {
        ProductSetProductPriceCustomFieldActionBuilder builder = new ProductSetProductPriceCustomFieldActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
