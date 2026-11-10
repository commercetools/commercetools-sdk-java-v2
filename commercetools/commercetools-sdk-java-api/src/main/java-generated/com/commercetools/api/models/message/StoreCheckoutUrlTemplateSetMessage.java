
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCheckoutUrlTemplateSetMessage storeCheckoutUrlTemplateSetMessage = StoreCheckoutUrlTemplateSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreCheckoutUrlTemplateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCheckoutUrlTemplateSetMessageImpl.class)
public interface StoreCheckoutUrlTemplateSetMessage extends Message {

    /**
     * discriminator value for StoreCheckoutUrlTemplateSetMessage
     */
    String STORE_CHECKOUT_URL_TEMPLATE_SET = "StoreCheckoutUrlTemplateSet";

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @return checkoutUrlTemplate
     */

    @JsonProperty("checkoutUrlTemplate")
    public String getCheckoutUrlTemplate();

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @param checkoutUrlTemplate value to be set
     */

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate);

    /**
     * factory method
     * @return instance of StoreCheckoutUrlTemplateSetMessage
     */
    public static StoreCheckoutUrlTemplateSetMessage of() {
        return new StoreCheckoutUrlTemplateSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreCheckoutUrlTemplateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCheckoutUrlTemplateSetMessage of(final StoreCheckoutUrlTemplateSetMessage template) {
        StoreCheckoutUrlTemplateSetMessageImpl instance = new StoreCheckoutUrlTemplateSetMessageImpl();
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
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    public StoreCheckoutUrlTemplateSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreCheckoutUrlTemplateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCheckoutUrlTemplateSetMessage deepCopy(
            @Nullable final StoreCheckoutUrlTemplateSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreCheckoutUrlTemplateSetMessageImpl instance = new StoreCheckoutUrlTemplateSetMessageImpl();
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
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreCheckoutUrlTemplateSetMessage
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessageBuilder builder() {
        return StoreCheckoutUrlTemplateSetMessageBuilder.of();
    }

    /**
     * create builder for StoreCheckoutUrlTemplateSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessageBuilder builder(final StoreCheckoutUrlTemplateSetMessage template) {
        return StoreCheckoutUrlTemplateSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCheckoutUrlTemplateSetMessage(Function<StoreCheckoutUrlTemplateSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreCheckoutUrlTemplateSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreCheckoutUrlTemplateSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCheckoutUrlTemplateSetMessage>";
            }
        };
    }
}
