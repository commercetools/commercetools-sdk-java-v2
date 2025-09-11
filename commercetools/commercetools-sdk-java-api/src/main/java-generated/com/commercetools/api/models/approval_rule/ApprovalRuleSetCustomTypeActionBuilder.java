
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetCustomTypeAction approvalRuleSetCustomTypeAction = ApprovalRuleSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetCustomTypeActionBuilder implements Builder<ApprovalRuleSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalRule with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalRule with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalRule with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @param type value to be set
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalRule.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalRule.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalRule.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ApprovalRuleSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalRule with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalRule.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ApprovalRuleSetCustomTypeAction with checking for non-null required values
     * @return ApprovalRuleSetCustomTypeAction
     */
    public ApprovalRuleSetCustomTypeAction build() {
        return new ApprovalRuleSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ApprovalRuleSetCustomTypeAction without checking for non-null required values
     * @return ApprovalRuleSetCustomTypeAction
     */
    public ApprovalRuleSetCustomTypeAction buildUnchecked() {
        return new ApprovalRuleSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of ApprovalRuleSetCustomTypeActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetCustomTypeActionBuilder of() {
        return new ApprovalRuleSetCustomTypeActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetCustomTypeActionBuilder of(final ApprovalRuleSetCustomTypeAction template) {
        ApprovalRuleSetCustomTypeActionBuilder builder = new ApprovalRuleSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
