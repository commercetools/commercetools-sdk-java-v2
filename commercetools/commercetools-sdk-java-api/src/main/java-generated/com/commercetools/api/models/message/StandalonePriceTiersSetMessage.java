
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceTier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Price Tier update action</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTiersSetMessage standalonePriceTiersSetMessage = StandalonePriceTiersSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .plusPreviousTiers(previousTiersBuilder -> previousTiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTiersSetMessageImpl.class)
public interface StandalonePriceTiersSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceTiersSetMessage
     */
    String STANDALONE_PRICE_TIERS_SET = "StandalonePriceTiersSet";

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return previousTiers
     */
    @NotNull
    @Valid
    @JsonProperty("previousTiers")
    public List<PriceTier> getPreviousTiers();

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers values to be set
     */

    @JsonIgnore
    public void setPreviousTiers(final PriceTier... previousTiers);

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers values to be set
     */

    public void setPreviousTiers(final List<PriceTier> previousTiers);

    /**
     * factory method
     * @return instance of StandalonePriceTiersSetMessage
     */
    public static StandalonePriceTiersSetMessage of() {
        return new StandalonePriceTiersSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTiersSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTiersSetMessage of(final StandalonePriceTiersSetMessage template) {
        StandalonePriceTiersSetMessageImpl instance = new StandalonePriceTiersSetMessageImpl();
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
        instance.setTiers(template.getTiers());
        instance.setPreviousTiers(template.getPreviousTiers());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceTiersSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTiersSetMessage deepCopy(@Nullable final StandalonePriceTiersSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTiersSetMessageImpl instance = new StandalonePriceTiersSetMessageImpl();
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
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousTiers(Optional.ofNullable(template.getPreviousTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceTiersSetMessage
     * @return builder
     */
    public static StandalonePriceTiersSetMessageBuilder builder() {
        return StandalonePriceTiersSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceTiersSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTiersSetMessageBuilder builder(final StandalonePriceTiersSetMessage template) {
        return StandalonePriceTiersSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTiersSetMessage(Function<StandalonePriceTiersSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTiersSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTiersSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTiersSetMessage>";
            }
        };
    }
}
