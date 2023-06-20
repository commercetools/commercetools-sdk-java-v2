
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
 *  <p>Generated after a successful Set Valid From and Until update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromAndUntilSetMessage standalonePriceValidFromAndUntilSetMessage = StandalonePriceValidFromAndUntilSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidFromAndUntilSetMessageImpl.class)
public interface StandalonePriceValidFromAndUntilSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceValidFromAndUntilSetMessage
     */
    String STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET = "StandalonePriceValidFromAndUntilSet";

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From and Until update action.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From and Until update action.</p>
     * @return previousValidFrom
     */

    @JsonProperty("previousValidFrom")
    public ZonedDateTime getPreviousValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> after the Set Valid From and Until update action.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> before the Set Valid From and Until update action.</p>
     * @return previousValidUntil
     */

    @JsonProperty("previousValidUntil")
    public ZonedDateTime getPreviousValidUntil();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From and Until update action.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From and Until update action.</p>
     * @param previousValidFrom value to be set
     */

    public void setPreviousValidFrom(final ZonedDateTime previousValidFrom);

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> after the Set Valid From and Until update action.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> before the Set Valid From and Until update action.</p>
     * @param previousValidUntil value to be set
     */

    public void setPreviousValidUntil(final ZonedDateTime previousValidUntil);

    /**
     * factory method
     * @return instance of StandalonePriceValidFromAndUntilSetMessage
     */
    public static StandalonePriceValidFromAndUntilSetMessage of() {
        return new StandalonePriceValidFromAndUntilSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidFromAndUntilSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidFromAndUntilSetMessage of(
            final StandalonePriceValidFromAndUntilSetMessage template) {
        StandalonePriceValidFromAndUntilSetMessageImpl instance = new StandalonePriceValidFromAndUntilSetMessageImpl();
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
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceValidFromAndUntilSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidFromAndUntilSetMessage deepCopy(
            @Nullable final StandalonePriceValidFromAndUntilSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidFromAndUntilSetMessageImpl instance = new StandalonePriceValidFromAndUntilSetMessageImpl();
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
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidFromAndUntilSetMessage
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessageBuilder builder() {
        return StandalonePriceValidFromAndUntilSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidFromAndUntilSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessageBuilder builder(
            final StandalonePriceValidFromAndUntilSetMessage template) {
        return StandalonePriceValidFromAndUntilSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidFromAndUntilSetMessage(
            Function<StandalonePriceValidFromAndUntilSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromAndUntilSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromAndUntilSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidFromAndUntilSetMessage>";
            }
        };
    }
}
