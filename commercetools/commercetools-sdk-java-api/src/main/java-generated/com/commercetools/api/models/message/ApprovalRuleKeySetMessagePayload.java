
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleKeySetMessagePayload approvalRuleKeySetMessagePayload = ApprovalRuleKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleKeySetMessagePayloadImpl.class)
public interface ApprovalRuleKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleKeySetMessagePayload
     */
    String APPROVAL_RULE_KEY_SET = "ApprovalRuleKeySet";

    /**
     *  <p><code>key</code> value of the ApprovalRule after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the ApprovalRule before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the ApprovalRule after the Set Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the ApprovalRule before the Set Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of ApprovalRuleKeySetMessagePayload
     */
    public static ApprovalRuleKeySetMessagePayload of() {
        return new ApprovalRuleKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleKeySetMessagePayload of(final ApprovalRuleKeySetMessagePayload template) {
        ApprovalRuleKeySetMessagePayloadImpl instance = new ApprovalRuleKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public ApprovalRuleKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleKeySetMessagePayload deepCopy(@Nullable final ApprovalRuleKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleKeySetMessagePayloadImpl instance = new ApprovalRuleKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleKeySetMessagePayload
     * @return builder
     */
    public static ApprovalRuleKeySetMessagePayloadBuilder builder() {
        return ApprovalRuleKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleKeySetMessagePayloadBuilder builder(final ApprovalRuleKeySetMessagePayload template) {
        return ApprovalRuleKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleKeySetMessagePayload(Function<ApprovalRuleKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleKeySetMessagePayload>";
            }
        };
    }
}
