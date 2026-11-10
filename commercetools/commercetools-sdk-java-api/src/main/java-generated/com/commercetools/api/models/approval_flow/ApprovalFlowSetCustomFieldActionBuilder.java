
package com.commercetools.api.models.approval_flow;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowSetCustomFieldAction approvalFlowSetCustomFieldAction = ApprovalFlowSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowSetCustomFieldActionBuilder implements Builder<ApprovalFlowSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApprovalFlowSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ApprovalFlowSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ApprovalFlowSetCustomFieldAction with checking for non-null required values
     * @return ApprovalFlowSetCustomFieldAction
     */
    public ApprovalFlowSetCustomFieldAction build() {
        Objects.requireNonNull(name, ApprovalFlowSetCustomFieldAction.class + ": name is missing");
        return new ApprovalFlowSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ApprovalFlowSetCustomFieldAction without checking for non-null required values
     * @return ApprovalFlowSetCustomFieldAction
     */
    public ApprovalFlowSetCustomFieldAction buildUnchecked() {
        return new ApprovalFlowSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of ApprovalFlowSetCustomFieldActionBuilder
     * @return builder
     */
    public static ApprovalFlowSetCustomFieldActionBuilder of() {
        return new ApprovalFlowSetCustomFieldActionBuilder();
    }

    /**
     * create builder for ApprovalFlowSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowSetCustomFieldActionBuilder of(final ApprovalFlowSetCustomFieldAction template) {
        ApprovalFlowSetCustomFieldActionBuilder builder = new ApprovalFlowSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
