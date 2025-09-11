
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCustomTypeAction storeSetCustomTypeAction = StoreSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCustomTypeActionBuilder implements Builder<StoreSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @param type value to be set
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Store.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Store.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Store.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StoreSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Store.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StoreSetCustomTypeAction with checking for non-null required values
     * @return StoreSetCustomTypeAction
     */
    public StoreSetCustomTypeAction build() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StoreSetCustomTypeAction without checking for non-null required values
     * @return StoreSetCustomTypeAction
     */
    public StoreSetCustomTypeAction buildUnchecked() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of StoreSetCustomTypeActionBuilder
     * @return builder
     */
    public static StoreSetCustomTypeActionBuilder of() {
        return new StoreSetCustomTypeActionBuilder();
    }

    /**
     * create builder for StoreSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCustomTypeActionBuilder of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionBuilder builder = new StoreSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
