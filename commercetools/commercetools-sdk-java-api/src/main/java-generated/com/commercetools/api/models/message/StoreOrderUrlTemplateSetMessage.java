
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreOrderUrlTemplateSetMessage storeOrderUrlTemplateSetMessage = StoreOrderUrlTemplateSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreOrderUrlTemplateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreOrderUrlTemplateSetMessageImpl.class)
public interface StoreOrderUrlTemplateSetMessage extends Message {

    /**
     * discriminator value for StoreOrderUrlTemplateSetMessage
     */
    String STORE_ORDER_URL_TEMPLATE_SET = "StoreOrderUrlTemplateSet";

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @return orderUrlTemplate
     */

    @JsonProperty("orderUrlTemplate")
    public String getOrderUrlTemplate();

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @param orderUrlTemplate value to be set
     */

    public void setOrderUrlTemplate(final String orderUrlTemplate);

    /**
     * factory method
     * @return instance of StoreOrderUrlTemplateSetMessage
     */
    public static StoreOrderUrlTemplateSetMessage of() {
        return new StoreOrderUrlTemplateSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreOrderUrlTemplateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreOrderUrlTemplateSetMessage of(final StoreOrderUrlTemplateSetMessage template) {
        StoreOrderUrlTemplateSetMessageImpl instance = new StoreOrderUrlTemplateSetMessageImpl();
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
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    public StoreOrderUrlTemplateSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreOrderUrlTemplateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreOrderUrlTemplateSetMessage deepCopy(@Nullable final StoreOrderUrlTemplateSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreOrderUrlTemplateSetMessageImpl instance = new StoreOrderUrlTemplateSetMessageImpl();
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
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreOrderUrlTemplateSetMessage
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessageBuilder builder() {
        return StoreOrderUrlTemplateSetMessageBuilder.of();
    }

    /**
     * create builder for StoreOrderUrlTemplateSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessageBuilder builder(final StoreOrderUrlTemplateSetMessage template) {
        return StoreOrderUrlTemplateSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreOrderUrlTemplateSetMessage(Function<StoreOrderUrlTemplateSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreOrderUrlTemplateSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreOrderUrlTemplateSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreOrderUrlTemplateSetMessage>";
            }
        };
    }
}
