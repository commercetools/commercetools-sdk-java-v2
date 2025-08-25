
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomTypeAction stagedOrderSetCustomTypeAction = StagedOrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomTypeActionBuilder implements Builder<StagedOrderSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order Edit with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order Edit.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order Edit with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order Edit.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order Edit with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order Edit.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order Edit.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order Edit.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order Edit.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order Edit with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order Edit.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order Edit.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetCustomTypeAction
     */
    public StagedOrderSetCustomTypeAction build() {
        return new StagedOrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StagedOrderSetCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetCustomTypeAction
     */
    public StagedOrderSetCustomTypeAction buildUnchecked() {
        return new StagedOrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomTypeActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomTypeActionBuilder of() {
        return new StagedOrderSetCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomTypeActionBuilder of(final StagedOrderSetCustomTypeAction template) {
        StagedOrderSetCustomTypeActionBuilder builder = new StagedOrderSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
