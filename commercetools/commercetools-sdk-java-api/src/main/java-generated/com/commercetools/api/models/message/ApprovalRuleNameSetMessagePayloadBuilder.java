
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleNameSetMessagePayload approvalRuleNameSetMessagePayload = ApprovalRuleNameSetMessagePayload.builder()
 *             .name("{name}")
 *             .oldName("{oldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleNameSetMessagePayloadBuilder implements Builder<ApprovalRuleNameSetMessagePayload> {

    private String name;

    private String oldName;

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApprovalRuleNameSetMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @param oldName value to be set
     * @return Builder
     */

    public ApprovalRuleNameSetMessagePayloadBuilder oldName(final String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @return oldName
     */

    public String getOldName() {
        return this.oldName;
    }

    /**
     * builds ApprovalRuleNameSetMessagePayload with checking for non-null required values
     * @return ApprovalRuleNameSetMessagePayload
     */
    public ApprovalRuleNameSetMessagePayload build() {
        Objects.requireNonNull(name, ApprovalRuleNameSetMessagePayload.class + ": name is missing");
        Objects.requireNonNull(oldName, ApprovalRuleNameSetMessagePayload.class + ": oldName is missing");
        return new ApprovalRuleNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * builds ApprovalRuleNameSetMessagePayload without checking for non-null required values
     * @return ApprovalRuleNameSetMessagePayload
     */
    public ApprovalRuleNameSetMessagePayload buildUnchecked() {
        return new ApprovalRuleNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * factory method for an instance of ApprovalRuleNameSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleNameSetMessagePayloadBuilder of() {
        return new ApprovalRuleNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleNameSetMessagePayloadBuilder of(final ApprovalRuleNameSetMessagePayload template) {
        ApprovalRuleNameSetMessagePayloadBuilder builder = new ApprovalRuleNameSetMessagePayloadBuilder();
        builder.name = template.getName();
        builder.oldName = template.getOldName();
        return builder;
    }

}
