
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceTier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetPriceTiersAction" rel="nofollow">Set Price Tier</a> update action</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTiersSetMessagePayload standalonePriceTiersSetMessagePayload = StandalonePriceTiersSetMessagePayload.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .plusPreviousTiers(previousTiersBuilder -> previousTiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceTiersSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTiersSetMessagePayloadImpl.class)
public interface StandalonePriceTiersSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceTiersSetMessagePayload
     */
    String STANDALONE_PRICE_TIERS_SET = "StandalonePriceTiersSet";

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return previousTiers
     */
    @NotNull
    @Valid
    @JsonProperty("previousTiers")
    public List<PriceTier> getPreviousTiers();

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param previousTiers values to be set
     */

    @JsonIgnore
    public void setPreviousTiers(final PriceTier... previousTiers);

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param previousTiers values to be set
     */

    public void setPreviousTiers(final List<PriceTier> previousTiers);

    /**
     * factory method
     * @return instance of StandalonePriceTiersSetMessagePayload
     */
    public static StandalonePriceTiersSetMessagePayload of() {
        return new StandalonePriceTiersSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTiersSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTiersSetMessagePayload of(final StandalonePriceTiersSetMessagePayload template) {
        StandalonePriceTiersSetMessagePayloadImpl instance = new StandalonePriceTiersSetMessagePayloadImpl();
        instance.setTiers(template.getTiers());
        instance.setPreviousTiers(template.getPreviousTiers());
        return instance;
    }

    public StandalonePriceTiersSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceTiersSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTiersSetMessagePayload deepCopy(
            @Nullable final StandalonePriceTiersSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTiersSetMessagePayloadImpl instance = new StandalonePriceTiersSetMessagePayloadImpl();
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
     * builder factory method for StandalonePriceTiersSetMessagePayload
     * @return builder
     */
    public static StandalonePriceTiersSetMessagePayloadBuilder builder() {
        return StandalonePriceTiersSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceTiersSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTiersSetMessagePayloadBuilder builder(
            final StandalonePriceTiersSetMessagePayload template) {
        return StandalonePriceTiersSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTiersSetMessagePayload(Function<StandalonePriceTiersSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTiersSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTiersSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTiersSetMessagePayload>";
            }
        };
    }
}
