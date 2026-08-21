
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreTermsOfServiceUrlSetMessage storeTermsOfServiceUrlSetMessage = StoreTermsOfServiceUrlSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreTermsOfServiceUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreTermsOfServiceUrlSetMessageImpl.class)
public interface StoreTermsOfServiceUrlSetMessage extends Message {

    /**
     * discriminator value for StoreTermsOfServiceUrlSetMessage
     */
    String STORE_TERMS_OF_SERVICE_URL_SET = "StoreTermsOfServiceUrlSet";

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @return termsOfServiceUrl
     */

    @JsonProperty("termsOfServiceUrl")
    public String getTermsOfServiceUrl();

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @param termsOfServiceUrl value to be set
     */

    public void setTermsOfServiceUrl(final String termsOfServiceUrl);

    /**
     * factory method
     * @return instance of StoreTermsOfServiceUrlSetMessage
     */
    public static StoreTermsOfServiceUrlSetMessage of() {
        return new StoreTermsOfServiceUrlSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreTermsOfServiceUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreTermsOfServiceUrlSetMessage of(final StoreTermsOfServiceUrlSetMessage template) {
        StoreTermsOfServiceUrlSetMessageImpl instance = new StoreTermsOfServiceUrlSetMessageImpl();
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
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    public StoreTermsOfServiceUrlSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreTermsOfServiceUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreTermsOfServiceUrlSetMessage deepCopy(@Nullable final StoreTermsOfServiceUrlSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreTermsOfServiceUrlSetMessageImpl instance = new StoreTermsOfServiceUrlSetMessageImpl();
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
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    /**
     * builder factory method for StoreTermsOfServiceUrlSetMessage
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessageBuilder builder() {
        return StoreTermsOfServiceUrlSetMessageBuilder.of();
    }

    /**
     * create builder for StoreTermsOfServiceUrlSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessageBuilder builder(final StoreTermsOfServiceUrlSetMessage template) {
        return StoreTermsOfServiceUrlSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreTermsOfServiceUrlSetMessage(Function<StoreTermsOfServiceUrlSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreTermsOfServiceUrlSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreTermsOfServiceUrlSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreTermsOfServiceUrlSetMessage>";
            }
        };
    }
}
