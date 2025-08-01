
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StandalonePrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePrice standalonePrice = StandalonePrice.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImpl.class)
public interface StandalonePrice
        extends BaseResource, StandalonePriceMixin, com.commercetools.api.models.DomainResource<StandalonePrice>,
        com.commercetools.api.models.Referencable<StandalonePrice>,
        com.commercetools.api.models.ResourceIdentifiable<StandalonePrice>,
        com.commercetools.api.models.Customizable<StandalonePrice>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the StandalonePrice.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the StandalonePrice.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the StandalonePrice.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Money value of this Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Country for which this Price is valid.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date from which the Price is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date until the Price is valid. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the Line Item price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
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
    public CustomFields getCustom();

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @return staged
     */
    @Valid
    @JsonProperty("staged")
    public StagedStandalonePrice getStaged();

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during Product price selection. If set to <code>false</code>, the StandalonePrice is not considered during Product price selection and any associated Line Items in a Cart cannot be ordered.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @return recurrencePolicy
     */
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyReference getRecurrencePolicy();

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the StandalonePrice.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the StandalonePrice.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the StandalonePrice.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Money value of this Price.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Country for which this Price is valid.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     *  <p>Date from which the Price is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date until the Price is valid. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>Price tiers if any are defined.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the Line Item price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Staged changes of the StandalonePrice. Only present if the StandalonePrice has some changes staged.</p>
     * @param staged value to be set
     */

    public void setStaged(final StagedStandalonePrice staged);

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during Product price selection. If set to <code>false</code>, the StandalonePrice is not considered during Product price selection and any associated Line Items in a Cart cannot be ordered.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyReference recurrencePolicy);

    /**
     * factory method
     * @return instance of StandalonePrice
     */
    public static StandalonePrice of() {
        return new StandalonePriceImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePrice of(final StandalonePrice template) {
        StandalonePriceImpl instance = new StandalonePriceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
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
        instance.setStaged(template.getStaged());
        instance.setActive(template.getActive());
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public StandalonePrice copyDeep();

    /**
     * factory method to create a deep copy of StandalonePrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePrice deepCopy(@Nullable final StandalonePrice template) {
        if (template == null) {
            return null;
        }
        StandalonePriceImpl instance = new StandalonePriceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setStaged(
            com.commercetools.api.models.standalone_price.StagedStandalonePrice.deepCopy(template.getStaged()));
        instance.setActive(template.getActive());
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for StandalonePrice
     * @return builder
     */
    public static StandalonePriceBuilder builder() {
        return StandalonePriceBuilder.of();
    }

    /**
     * create builder for StandalonePrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceBuilder builder(final StandalonePrice template) {
        return StandalonePriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePrice(Function<StandalonePrice, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.STANDALONE_PRICE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePrice>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePrice>";
            }
        };
    }
}
