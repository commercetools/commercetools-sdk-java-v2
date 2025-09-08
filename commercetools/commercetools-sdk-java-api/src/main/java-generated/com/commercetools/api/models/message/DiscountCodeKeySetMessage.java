
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeKeySetMessage discountCodeKeySetMessage = DiscountCodeKeySetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountCodeKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeKeySetMessageImpl.class)
public interface DiscountCodeKeySetMessage extends Message {

    /**
     * discriminator value for DiscountCodeKeySetMessage
     */
    String DISCOUNT_CODE_KEY_SET = "DiscountCodeKeySet";

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of DiscountCodeKeySetMessage
     */
    public static DiscountCodeKeySetMessage of() {
        return new DiscountCodeKeySetMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeKeySetMessage of(final DiscountCodeKeySetMessage template) {
        DiscountCodeKeySetMessageImpl instance = new DiscountCodeKeySetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public DiscountCodeKeySetMessage copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeKeySetMessage deepCopy(@Nullable final DiscountCodeKeySetMessage template) {
        if (template == null) {
            return null;
        }
        DiscountCodeKeySetMessageImpl instance = new DiscountCodeKeySetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeKeySetMessage
     * @return builder
     */
    public static DiscountCodeKeySetMessageBuilder builder() {
        return DiscountCodeKeySetMessageBuilder.of();
    }

    /**
     * create builder for DiscountCodeKeySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeKeySetMessageBuilder builder(final DiscountCodeKeySetMessage template) {
        return DiscountCodeKeySetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeKeySetMessage(Function<DiscountCodeKeySetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeKeySetMessage>";
            }
        };
    }
}
