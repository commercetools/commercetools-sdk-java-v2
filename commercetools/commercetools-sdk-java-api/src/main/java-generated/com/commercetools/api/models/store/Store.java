
package com.commercetools.api.models.store;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Store
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Store store = Store.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreImpl.class)
public interface Store extends BaseResource, StoreMixin, com.commercetools.api.models.DomainResource<Store>,
        com.commercetools.api.models.Referencable<Store>, com.commercetools.api.models.ResourceIdentifiable<Store>,
        com.commercetools.api.models.Customizable<Store>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique ID of the Store.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Store.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Store was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Store was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Store.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique and immutable identifier for the Store.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Store.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Languages configured for the Store.</p>
     * @return languages
     */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>Countries defined for the Store.</p>
     * @return countries
     */
    @NotNull
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @return distributionChannels
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @return supplyChannels
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @return productSelections
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSetting> getProductSelections();

    /**
     *  <p>Custom fields for the Store.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique ID of the Store.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Store.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Store was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Store was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Store.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique and immutable identifier for the Store.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Store.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final StoreCountry... countries);

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<StoreCountry> countries);

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param distributionChannels values to be set
     */

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param distributionChannels values to be set
     */

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param supplyChannels values to be set
     */

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param supplyChannels values to be set
     */

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSetting... productSelections);

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    public void setProductSelections(final List<ProductSelectionSetting> productSelections);

    /**
     *  <p>Custom fields for the Store.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of Store
     */
    public static Store of() {
        return new StoreImpl();
    }

    /**
     * factory method to create a shallow copy Store
     * @param template instance to be copied
     * @return copy instance
     */
    public static Store of(final Store template) {
        StoreImpl instance = new StoreImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setCountries(template.getCountries());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setProductSelections(template.getProductSelections());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public Store copyDeep();

    /**
     * factory method to create a deep copy of Store
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Store deepCopy(@Nullable final Store template) {
        if (template == null) {
            return null;
        }
        StoreImpl instance = new StoreImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        instance.setCountries(Optional.ofNullable(template.getCountries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDistributionChannels(Optional.ofNullable(template.getDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSupplyChannels(Optional.ofNullable(template.getSupplyChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setProductSelections(Optional.ofNullable(template.getProductSelections())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Store
     * @return builder
     */
    public static StoreBuilder builder() {
        return StoreBuilder.of();
    }

    /**
     * create builder for Store instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreBuilder builder(final Store template) {
        return StoreBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStore(Function<Store, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.STORE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Store> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Store>() {
            @Override
            public String toString() {
                return "TypeReference<Store>";
            }
        };
    }
}
