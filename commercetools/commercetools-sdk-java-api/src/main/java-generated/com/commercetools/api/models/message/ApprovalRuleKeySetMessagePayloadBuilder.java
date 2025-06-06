
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleKeySetMessagePayload approvalRuleKeySetMessagePayload = ApprovalRuleKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleKeySetMessagePayloadBuilder implements Builder<ApprovalRuleKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the ApprovalRule after the Set Key update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public ApprovalRuleKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the ApprovalRule before the Set Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public ApprovalRuleKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the ApprovalRule after the Set Key update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the ApprovalRule before the Set Key update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds ApprovalRuleKeySetMessagePayload with checking for non-null required values
     * @return ApprovalRuleKeySetMessagePayload
     */
    public ApprovalRuleKeySetMessagePayload build() {
        return new ApprovalRuleKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds ApprovalRuleKeySetMessagePayload without checking for non-null required values
     * @return ApprovalRuleKeySetMessagePayload
     */
    public ApprovalRuleKeySetMessagePayload buildUnchecked() {
        return new ApprovalRuleKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of ApprovalRuleKeySetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleKeySetMessagePayloadBuilder of() {
        return new ApprovalRuleKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleKeySetMessagePayloadBuilder of(final ApprovalRuleKeySetMessagePayload template) {
        ApprovalRuleKeySetMessagePayloadBuilder builder = new ApprovalRuleKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
