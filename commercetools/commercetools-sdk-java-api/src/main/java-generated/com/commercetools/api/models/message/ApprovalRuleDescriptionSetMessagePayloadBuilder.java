
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleDescriptionSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleDescriptionSetMessagePayload approvalRuleDescriptionSetMessagePayload = ApprovalRuleDescriptionSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleDescriptionSetMessagePayloadBuilder
        implements Builder<ApprovalRuleDescriptionSetMessagePayload> {

    @Nullable
    private String description;

    @Nullable
    private String oldDescription;

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetDescriptionAction" rel="nofollow">Set Description</a> update action.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApprovalRuleDescriptionSetMessagePayloadBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetDescriptionAction" rel="nofollow">Set Description</a> update action.</p>
     * @param oldDescription value to be set
     * @return Builder
     */

    public ApprovalRuleDescriptionSetMessagePayloadBuilder oldDescription(@Nullable final String oldDescription) {
        this.oldDescription = oldDescription;
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetDescriptionAction" rel="nofollow">Set Description</a> update action.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetDescriptionAction" rel="nofollow">Set Description</a> update action.</p>
     * @return oldDescription
     */

    @Nullable
    public String getOldDescription() {
        return this.oldDescription;
    }

    /**
     * builds ApprovalRuleDescriptionSetMessagePayload with checking for non-null required values
     * @return ApprovalRuleDescriptionSetMessagePayload
     */
    public ApprovalRuleDescriptionSetMessagePayload build() {
        return new ApprovalRuleDescriptionSetMessagePayloadImpl(description, oldDescription);
    }

    /**
     * builds ApprovalRuleDescriptionSetMessagePayload without checking for non-null required values
     * @return ApprovalRuleDescriptionSetMessagePayload
     */
    public ApprovalRuleDescriptionSetMessagePayload buildUnchecked() {
        return new ApprovalRuleDescriptionSetMessagePayloadImpl(description, oldDescription);
    }

    /**
     * factory method for an instance of ApprovalRuleDescriptionSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessagePayloadBuilder of() {
        return new ApprovalRuleDescriptionSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleDescriptionSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessagePayloadBuilder of(
            final ApprovalRuleDescriptionSetMessagePayload template) {
        ApprovalRuleDescriptionSetMessagePayloadBuilder builder = new ApprovalRuleDescriptionSetMessagePayloadBuilder();
        builder.description = template.getDescription();
        builder.oldDescription = template.getOldDescription();
        return builder;
    }

}
