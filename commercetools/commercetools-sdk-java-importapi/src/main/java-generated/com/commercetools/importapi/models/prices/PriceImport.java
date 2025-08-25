
package com.commercetools.importapi.models.prices;

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
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import an <span>Embedded Price</span> . Once imported, this data is persisted as a <span>Price</span> in a Product Variant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceImport priceImport = PriceImport.builder()
 *             .key("{key}")
 *             .value(valueBuilder -> valueBuilder)
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceImportImpl.class)
public interface PriceImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier for the Embedded Price. If a <span>Price</span> with this <code>key</code> exists on the specified <code>productVariant</code>, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Maps to <code>Price.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>Maps to <code>Price.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the <span>current and staged projections</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> with the new Price data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The tiered prices for this price.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> which contains this Embedded Price. If the referenced ProductVariant does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductVariant is created.</p>
     * @return productVariant
     */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> which contains the <code>productVariant</code>. If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>User-defined unique identifier for the Embedded Price. If a <span>Price</span> with this <code>key</code> exists on the specified <code>productVariant</code>, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Maps to <code>Price.customerGroup</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>Maps to <code>Price.channel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelKeyReference channel);

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <ul>
     *   <li>Set to <code>false</code> to update both the <span>current and staged projections</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> with the new Price data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

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
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> which contains this Embedded Price. If the referenced ProductVariant does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductVariant is created.</p>
     * @param productVariant value to be set
     */

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> which contains the <code>productVariant</code>. If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     * factory method
     * @return instance of PriceImport
     */
    public static PriceImport of() {
        return new PriceImportImpl();
    }

    /**
     * factory method to create a shallow copy PriceImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceImport of(final PriceImport template) {
        PriceImportImpl instance = new PriceImportImpl();
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        instance.setProductVariant(template.getProductVariant());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public PriceImport copyDeep();

    /**
     * factory method to create a deep copy of PriceImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceImport deepCopy(@Nullable final PriceImport template) {
        if (template == null) {
            return null;
        }
        PriceImportImpl instance = new PriceImportImpl();
        instance.setKey(template.getKey());
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustomerGroup(
            com.commercetools.importapi.models.common.CustomerGroupKeyReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy(template.getChannel()));
        instance.setDiscounted(
            com.commercetools.importapi.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setStaged(template.getStaged());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        instance.setProductVariant(com.commercetools.importapi.models.common.ProductVariantKeyReference
                .deepCopy(template.getProductVariant()));
        instance.setProduct(
            com.commercetools.importapi.models.common.ProductKeyReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for PriceImport
     * @return builder
     */
    public static PriceImportBuilder builder() {
        return PriceImportBuilder.of();
    }

    /**
     * create builder for PriceImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceImportBuilder builder(final PriceImport template) {
        return PriceImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceImport(Function<PriceImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceImport>() {
            @Override
            public String toString() {
                return "TypeReference<PriceImport>";
            }
        };
    }
}
