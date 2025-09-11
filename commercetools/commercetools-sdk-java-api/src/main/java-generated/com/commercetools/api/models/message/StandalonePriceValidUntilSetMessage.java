
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidUntilSetMessage standalonePriceValidUntilSetMessage = StandalonePriceValidUntilSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceValidUntilSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidUntilSetMessageImpl.class)
public interface StandalonePriceValidUntilSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceValidUntilSetMessage
     */
    String STANDALONE_PRICE_VALID_UNTIL_SET = "StandalonePriceValidUntilSet";

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return previousValidUntil
     */

    @JsonProperty("previousValidUntil")
    public ZonedDateTime getPreviousValidUntil();

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param previousValidUntil value to be set
     */

    public void setPreviousValidUntil(final ZonedDateTime previousValidUntil);

    /**
     * factory method
     * @return instance of StandalonePriceValidUntilSetMessage
     */
    public static StandalonePriceValidUntilSetMessage of() {
        return new StandalonePriceValidUntilSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidUntilSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidUntilSetMessage of(final StandalonePriceValidUntilSetMessage template) {
        StandalonePriceValidUntilSetMessageImpl instance = new StandalonePriceValidUntilSetMessageImpl();
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
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    public StandalonePriceValidUntilSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceValidUntilSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidUntilSetMessage deepCopy(
            @Nullable final StandalonePriceValidUntilSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidUntilSetMessageImpl instance = new StandalonePriceValidUntilSetMessageImpl();
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
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidUntilSetMessage
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessageBuilder builder() {
        return StandalonePriceValidUntilSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidUntilSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessageBuilder builder(
            final StandalonePriceValidUntilSetMessage template) {
        return StandalonePriceValidUntilSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidUntilSetMessage(Function<StandalonePriceValidUntilSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidUntilSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidUntilSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidUntilSetMessage>";
            }
        };
    }
}
