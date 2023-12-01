
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Description update action.</p>
 *
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
@JsonDeserialize(as = ApprovalRuleDescriptionSetMessagePayloadImpl.class)
public interface ApprovalRuleDescriptionSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleDescriptionSetMessagePayload
     */
    String APPROVAL_RULE_DESCRIPTION_SET = "ApprovalRuleDescriptionSet";

    /**
     *  <p>Description of the ApprovalRule after the Set Description update action.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Description of the ApprovalRule before the Set Description update action.</p>
     * @return oldDescription
     */

    @JsonProperty("oldDescription")
    public String getOldDescription();

    /**
     *  <p>Description of the ApprovalRule after the Set Description update action.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Description of the ApprovalRule before the Set Description update action.</p>
     * @param oldDescription value to be set
     */

    public void setOldDescription(final String oldDescription);

    /**
     * factory method
     * @return instance of ApprovalRuleDescriptionSetMessagePayload
     */
    public static ApprovalRuleDescriptionSetMessagePayload of() {
        return new ApprovalRuleDescriptionSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleDescriptionSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleDescriptionSetMessagePayload of(final ApprovalRuleDescriptionSetMessagePayload template) {
        ApprovalRuleDescriptionSetMessagePayloadImpl instance = new ApprovalRuleDescriptionSetMessagePayloadImpl();
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleDescriptionSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleDescriptionSetMessagePayload deepCopy(
            @Nullable final ApprovalRuleDescriptionSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleDescriptionSetMessagePayloadImpl instance = new ApprovalRuleDescriptionSetMessagePayloadImpl();
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleDescriptionSetMessagePayload
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessagePayloadBuilder builder() {
        return ApprovalRuleDescriptionSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleDescriptionSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessagePayloadBuilder builder(
            final ApprovalRuleDescriptionSetMessagePayload template) {
        return ApprovalRuleDescriptionSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleDescriptionSetMessagePayload(
            Function<ApprovalRuleDescriptionSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDescriptionSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDescriptionSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleDescriptionSetMessagePayload>";
            }
        };
    }
}
