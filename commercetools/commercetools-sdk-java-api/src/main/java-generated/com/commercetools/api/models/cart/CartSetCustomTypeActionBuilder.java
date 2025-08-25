
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomTypeAction cartSetCustomTypeAction = CartSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomTypeActionBuilder implements Builder<CartSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Cart with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Cart with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Cart with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param type value to be set
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Cart.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Cart.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Cart.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CartSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Cart with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Cart.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CartSetCustomTypeAction with checking for non-null required values
     * @return CartSetCustomTypeAction
     */
    public CartSetCustomTypeAction build() {
        return new CartSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartSetCustomTypeAction without checking for non-null required values
     * @return CartSetCustomTypeAction
     */
    public CartSetCustomTypeAction buildUnchecked() {
        return new CartSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CartSetCustomTypeActionBuilder
     * @return builder
     */
    public static CartSetCustomTypeActionBuilder of() {
        return new CartSetCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomTypeActionBuilder of(final CartSetCustomTypeAction template) {
        CartSetCustomTypeActionBuilder builder = new CartSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
