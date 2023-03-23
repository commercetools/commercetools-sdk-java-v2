
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetCustomTypeAction productSelectionSetCustomTypeAction = ProductSelectionSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetCustomTypeActionBuilder implements Builder<ProductSelectionSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the ProductSelection with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ProductSelection with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @param type
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ProductSelection.</p>
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ProductSelection.</p>
     * @param fields
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ProductSelectionSetCustomTypeAction build() {
        return new ProductSelectionSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ProductSelectionSetCustomTypeAction without checking for non null required values
     */
    public ProductSelectionSetCustomTypeAction buildUnchecked() {
        return new ProductSelectionSetCustomTypeActionImpl(type, fields);
    }

    public static ProductSelectionSetCustomTypeActionBuilder of() {
        return new ProductSelectionSetCustomTypeActionBuilder();
    }

    public static ProductSelectionSetCustomTypeActionBuilder of(final ProductSelectionSetCustomTypeAction template) {
        ProductSelectionSetCustomTypeActionBuilder builder = new ProductSelectionSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
