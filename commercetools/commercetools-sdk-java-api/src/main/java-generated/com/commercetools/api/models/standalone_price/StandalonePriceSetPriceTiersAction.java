
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceTierDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets all <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTiers</a> for a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> in one action, produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceTiersSetMessage" rel="nofollow">Standalone Price Tiers Set</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetPriceTiersAction standalonePriceSetPriceTiersAction = StandalonePriceSetPriceTiersAction.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPriceTiers")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetPriceTiersActionImpl.class)
public interface StandalonePriceSetPriceTiersAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetPriceTiersAction
     */
    String SET_PRICE_TIERS = "setPriceTiers";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTierDraft> tiers);

    /**
     * factory method
     * @return instance of StandalonePriceSetPriceTiersAction
     */
    public static StandalonePriceSetPriceTiersAction of() {
        return new StandalonePriceSetPriceTiersActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetPriceTiersAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetPriceTiersAction of(final StandalonePriceSetPriceTiersAction template) {
        StandalonePriceSetPriceTiersActionImpl instance = new StandalonePriceSetPriceTiersActionImpl();
        instance.setTiers(template.getTiers());
        return instance;
    }

    public StandalonePriceSetPriceTiersAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetPriceTiersAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetPriceTiersAction deepCopy(
            @Nullable final StandalonePriceSetPriceTiersAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetPriceTiersActionImpl instance = new StandalonePriceSetPriceTiersActionImpl();
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTierDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetPriceTiersAction
     * @return builder
     */
    public static StandalonePriceSetPriceTiersActionBuilder builder() {
        return StandalonePriceSetPriceTiersActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetPriceTiersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersActionBuilder builder(final StandalonePriceSetPriceTiersAction template) {
        return StandalonePriceSetPriceTiersActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetPriceTiersAction(Function<StandalonePriceSetPriceTiersAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetPriceTiersAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetPriceTiersAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetPriceTiersAction>";
            }
        };
    }
}
