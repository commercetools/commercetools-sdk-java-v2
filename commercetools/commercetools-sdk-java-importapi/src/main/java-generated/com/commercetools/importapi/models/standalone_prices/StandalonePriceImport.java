
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
 *  <p>Represents the data used to import a StandalonePrice. Once imported, this data is persisted as a StandalonePrice) in the Project.</p>
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
     *  <p>User-defined unique identifier for the StandalonePrice. If a StandalonePrice) with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>StandalonePrice.sku</code>. This value is not validated to exist in Product Variants.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>StandalonePrice.value</code>.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Maps to <code>StandalonePrice.country</code>. This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *  <p>Maps to <code>StandalonePrice.validFrom</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Maps to <code>StandalonePrice.validUntil</code>.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
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
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier for the StandalonePrice. If a StandalonePrice) with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>StandalonePrice.sku</code>. This value is not validated to exist in Product Variants.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>StandalonePrice.value</code>.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Maps to <code>StandalonePrice.country</code>. This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Maps to <code>StandalonePrice.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>Maps to <code>StandalonePrice.channel</code>. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     *  <p>This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelKeyReference channel);

    /**
     *  <p>Maps to <code>StandalonePrice.validFrom</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Maps to <code>StandalonePrice.validUntil</code>.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>Maps to <code>StandalonePrice.tiers</code>.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Maps to <code>StandalonePrice.custom</code>.</p>
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

    public StandalonePriceImport copyDeep();

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
