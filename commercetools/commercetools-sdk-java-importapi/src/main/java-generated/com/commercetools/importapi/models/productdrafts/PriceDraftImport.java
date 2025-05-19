
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The representation of a Price Draft for the import purpose.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceDraftImport priceDraftImport = PriceDraftImport.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceDraftImportImpl.class)
public interface PriceDraftImport {

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>References a customer group by key.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>References a channel by key.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>The custom fields for this category.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The tiered prices for this price.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>User-defined unique identifier for the Embedded Price.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>References a customer group by key.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>References a channel by key.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelKeyReference channel);

    /**
     * set validFrom
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     * set validUntil
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>The custom fields for this category.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>User-defined unique identifier for the Embedded Price.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PriceDraftImport
     */
    public static PriceDraftImport of() {
        return new PriceDraftImportImpl();
    }

    /**
     * factory method to create a shallow copy PriceDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceDraftImport of(final PriceDraftImport template) {
        PriceDraftImportImpl instance = new PriceDraftImportImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(template.getCustom());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setKey(template.getKey());
        return instance;
    }

    public PriceDraftImport copyDeep();

    /**
     * factory method to create a deep copy of PriceDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceDraftImport deepCopy(@Nullable final PriceDraftImport template) {
        if (template == null) {
            return null;
        }
        PriceDraftImportImpl instance = new PriceDraftImportImpl();
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.importapi.models.common.CustomerGroupKeyReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        instance.setDiscounted(
            com.commercetools.importapi.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PriceDraftImport
     * @return builder
     */
    public static PriceDraftImportBuilder builder() {
        return PriceDraftImportBuilder.of();
    }

    /**
     * create builder for PriceDraftImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceDraftImportBuilder builder(final PriceDraftImport template) {
        return PriceDraftImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceDraftImport(Function<PriceDraftImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceDraftImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceDraftImport>() {
            @Override
            public String toString() {
                return "TypeReference<PriceDraftImport>";
            }
        };
    }
}
