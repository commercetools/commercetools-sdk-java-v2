
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.standalone_price.StagedStandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesRemovedMessage standalonePriceStagedChangesRemovedMessage = StandalonePriceStagedChangesRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceStagedChangesRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceStagedChangesRemovedMessageImpl.class)
public interface StandalonePriceStagedChangesRemovedMessage extends Message {

    /**
     * discriminator value for StandalonePriceStagedChangesRemovedMessage
     */
    String STANDALONE_PRICE_STAGED_CHANGES_REMOVED = "StandalonePriceStagedChangesRemoved";

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @return stagedChanges
     */
    @NotNull
    @Valid
    @JsonProperty("stagedChanges")
    public StagedStandalonePrice getStagedChanges();

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @param stagedChanges value to be set
     */

    public void setStagedChanges(final StagedStandalonePrice stagedChanges);

    /**
     * factory method
     * @return instance of StandalonePriceStagedChangesRemovedMessage
     */
    public static StandalonePriceStagedChangesRemovedMessage of() {
        return new StandalonePriceStagedChangesRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceStagedChangesRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceStagedChangesRemovedMessage of(
            final StandalonePriceStagedChangesRemovedMessage template) {
        StandalonePriceStagedChangesRemovedMessageImpl instance = new StandalonePriceStagedChangesRemovedMessageImpl();
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
        instance.setStagedChanges(template.getStagedChanges());
        return instance;
    }

    public StandalonePriceStagedChangesRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceStagedChangesRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceStagedChangesRemovedMessage deepCopy(
            @Nullable final StandalonePriceStagedChangesRemovedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceStagedChangesRemovedMessageImpl instance = new StandalonePriceStagedChangesRemovedMessageImpl();
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
        instance.setStagedChanges(
            com.commercetools.api.models.standalone_price.StagedStandalonePrice.deepCopy(template.getStagedChanges()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceStagedChangesRemovedMessage
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessageBuilder builder() {
        return StandalonePriceStagedChangesRemovedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceStagedChangesRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessageBuilder builder(
            final StandalonePriceStagedChangesRemovedMessage template) {
        return StandalonePriceStagedChangesRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceStagedChangesRemovedMessage(
            Function<StandalonePriceStagedChangesRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceStagedChangesRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceStagedChangesRemovedMessage>";
            }
        };
    }
}
