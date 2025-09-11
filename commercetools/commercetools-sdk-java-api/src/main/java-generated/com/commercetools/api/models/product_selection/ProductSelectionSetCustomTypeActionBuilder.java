
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ProductSelection with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ProductSelection with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ProductSelection with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @param type value to be set
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ProductSelection.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ProductSelection.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ProductSelection.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ProductSelectionSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ProductSelection with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ProductSelection.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ProductSelectionSetCustomTypeAction with checking for non-null required values
     * @return ProductSelectionSetCustomTypeAction
     */
    public ProductSelectionSetCustomTypeAction build() {
        return new ProductSelectionSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ProductSelectionSetCustomTypeAction without checking for non-null required values
     * @return ProductSelectionSetCustomTypeAction
     */
    public ProductSelectionSetCustomTypeAction buildUnchecked() {
        return new ProductSelectionSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of ProductSelectionSetCustomTypeActionBuilder
     * @return builder
     */
    public static ProductSelectionSetCustomTypeActionBuilder of() {
        return new ProductSelectionSetCustomTypeActionBuilder();
    }

    /**
     * create builder for ProductSelectionSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetCustomTypeActionBuilder of(final ProductSelectionSetCustomTypeAction template) {
        ProductSelectionSetCustomTypeActionBuilder builder = new ProductSelectionSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
