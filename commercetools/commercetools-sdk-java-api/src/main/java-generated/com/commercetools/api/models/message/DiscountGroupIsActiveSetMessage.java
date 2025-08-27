
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupIsActiveSetMessage discountGroupIsActiveSetMessage = DiscountGroupIsActiveSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupIsActiveSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupIsActiveSetMessageImpl.class)
public interface DiscountGroupIsActiveSetMessage extends Message {

    /**
     * discriminator value for DiscountGroupIsActiveSetMessage
     */
    String DISCOUNT_GROUP_IS_ACTIVE_SET = "DiscountGroupIsActiveSet";

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return isActive
     */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return oldIsActive
     */

    @JsonProperty("oldIsActive")
    public Boolean getOldIsActive();

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param oldIsActive value to be set
     */

    public void setOldIsActive(final Boolean oldIsActive);

    /**
     * factory method
     * @return instance of DiscountGroupIsActiveSetMessage
     */
    public static DiscountGroupIsActiveSetMessage of() {
        return new DiscountGroupIsActiveSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupIsActiveSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupIsActiveSetMessage of(final DiscountGroupIsActiveSetMessage template) {
        DiscountGroupIsActiveSetMessageImpl instance = new DiscountGroupIsActiveSetMessageImpl();
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
        instance.setIsActive(template.getIsActive());
        instance.setOldIsActive(template.getOldIsActive());
        return instance;
    }

    public DiscountGroupIsActiveSetMessage copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupIsActiveSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupIsActiveSetMessage deepCopy(@Nullable final DiscountGroupIsActiveSetMessage template) {
        if (template == null) {
            return null;
        }
        DiscountGroupIsActiveSetMessageImpl instance = new DiscountGroupIsActiveSetMessageImpl();
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
        instance.setIsActive(template.getIsActive());
        instance.setOldIsActive(template.getOldIsActive());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupIsActiveSetMessage
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessageBuilder builder() {
        return DiscountGroupIsActiveSetMessageBuilder.of();
    }

    /**
     * create builder for DiscountGroupIsActiveSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessageBuilder builder(final DiscountGroupIsActiveSetMessage template) {
        return DiscountGroupIsActiveSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupIsActiveSetMessage(Function<DiscountGroupIsActiveSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupIsActiveSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupIsActiveSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupIsActiveSetMessage>";
            }
        };
    }
}
