
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowSetCustomTypeAction approvalFlowSetCustomTypeAction = ApprovalFlowSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowSetCustomTypeActionBuilder implements Builder<ApprovalFlowSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @param type value to be set
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ApprovalFlowSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ApprovalFlowSetCustomTypeAction with checking for non-null required values
     * @return ApprovalFlowSetCustomTypeAction
     */
    public ApprovalFlowSetCustomTypeAction build() {
        return new ApprovalFlowSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ApprovalFlowSetCustomTypeAction without checking for non-null required values
     * @return ApprovalFlowSetCustomTypeAction
     */
    public ApprovalFlowSetCustomTypeAction buildUnchecked() {
        return new ApprovalFlowSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of ApprovalFlowSetCustomTypeActionBuilder
     * @return builder
     */
    public static ApprovalFlowSetCustomTypeActionBuilder of() {
        return new ApprovalFlowSetCustomTypeActionBuilder();
    }

    /**
     * create builder for ApprovalFlowSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowSetCustomTypeActionBuilder of(final ApprovalFlowSetCustomTypeAction template) {
        ApprovalFlowSetCustomTypeActionBuilder builder = new ApprovalFlowSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
