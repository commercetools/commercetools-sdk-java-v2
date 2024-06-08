
package com.commercetools.importapi.models.standalone_prices;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The data representation for a Standalone Price to be imported that is persisted as a Standalone Price in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceImport standalonePriceImport = StandalonePriceImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImportImpl.class)
public interface StandalonePriceImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier for the Standalone Price. If a StandalonePrice with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Identifies the ProductVariant to which this Standalone Price is associated. This value is not validated to exist in Product Variants.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Sets the money value of this Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *  <p>Sets the date from which the Price is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Sets the date until the Price is valid.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Sets price tiers.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier for the Standalone Price. If a StandalonePrice with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Identifies the ProductVariant to which this Standalone Price is associated. This value is not validated to exist in Product Variants.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Sets the money value of this Price.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelKeyReference channel);

    /**
     *  <p>Sets the date from which the Price is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Sets the date until the Price is valid.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Sets price tiers.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>Sets price tiers.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of StandalonePriceImport
     */
    public static StandalonePriceImport of() {
        return new StandalonePriceImportImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceImport of(final StandalonePriceImport template) {
        StandalonePriceImportImpl instance = new StandalonePriceImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceImport deepCopy(@Nullable final StandalonePriceImport template) {
        if (template == null) {
            return null;
        }
        StandalonePriceImportImpl instance = new StandalonePriceImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.importapi.models.common.CustomerGroupKeyReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscounted(
            com.commercetools.importapi.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceImport
     * @return builder
     */
    public static StandalonePriceImportBuilder builder() {
        return StandalonePriceImportBuilder.of();
    }

    /**
     * create builder for StandalonePriceImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceImportBuilder builder(final StandalonePriceImport template) {
        return StandalonePriceImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceImport(Function<StandalonePriceImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImport>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceImport>";
            }
        };
    }
}
