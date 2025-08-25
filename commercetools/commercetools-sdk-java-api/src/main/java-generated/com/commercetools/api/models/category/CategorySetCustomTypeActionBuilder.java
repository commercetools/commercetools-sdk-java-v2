
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetCustomTypeAction categorySetCustomTypeAction = CategorySetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetCustomTypeActionBuilder implements Builder<CategorySetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Category with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Category with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Category with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @param type value to be set
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Category.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Category.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Category.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CategorySetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Category with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Category.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CategorySetCustomTypeAction with checking for non-null required values
     * @return CategorySetCustomTypeAction
     */
    public CategorySetCustomTypeAction build() {
        return new CategorySetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CategorySetCustomTypeAction without checking for non-null required values
     * @return CategorySetCustomTypeAction
     */
    public CategorySetCustomTypeAction buildUnchecked() {
        return new CategorySetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CategorySetCustomTypeActionBuilder
     * @return builder
     */
    public static CategorySetCustomTypeActionBuilder of() {
        return new CategorySetCustomTypeActionBuilder();
    }

    /**
     * create builder for CategorySetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetCustomTypeActionBuilder of(final CategorySetCustomTypeAction template) {
        CategorySetCustomTypeActionBuilder builder = new CategorySetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
