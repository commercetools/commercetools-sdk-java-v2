
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductPriceCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductPriceCustomTypeAction productSetProductPriceCustomTypeAction = ProductSetProductPriceCustomTypeAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductPriceCustomTypeActionBuilder implements Builder<ProductSetProductPriceCustomTypeAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     * @param type value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ProductSetProductPriceCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
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
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ProductSetProductPriceCustomTypeAction with checking for non-null required values
     * @return ProductSetProductPriceCustomTypeAction
     */
    public ProductSetProductPriceCustomTypeAction build() {
        Objects.requireNonNull(priceId, ProductSetProductPriceCustomTypeAction.class + ": priceId is missing");
        return new ProductSetProductPriceCustomTypeActionImpl(priceId, staged, type, fields);
    }

    /**
     * builds ProductSetProductPriceCustomTypeAction without checking for non-null required values
     * @return ProductSetProductPriceCustomTypeAction
     */
    public ProductSetProductPriceCustomTypeAction buildUnchecked() {
        return new ProductSetProductPriceCustomTypeActionImpl(priceId, staged, type, fields);
    }

    /**
     * factory method for an instance of ProductSetProductPriceCustomTypeActionBuilder
     * @return builder
     */
    public static ProductSetProductPriceCustomTypeActionBuilder of() {
        return new ProductSetProductPriceCustomTypeActionBuilder();
    }

    /**
     * create builder for ProductSetProductPriceCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductPriceCustomTypeActionBuilder of(
            final ProductSetProductPriceCustomTypeAction template) {
        ProductSetProductPriceCustomTypeActionBuilder builder = new ProductSetProductPriceCustomTypeActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
