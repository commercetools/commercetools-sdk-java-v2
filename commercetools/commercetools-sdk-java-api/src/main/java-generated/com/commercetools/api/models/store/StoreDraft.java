
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDraft storeDraft = StoreDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreDraftImpl.class)
public interface StoreDraft extends com.commercetools.api.models.CustomizableDraft<StoreDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<StoreDraft> {

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
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
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>Countries defined for the Store.</p>
     * @return countries
     */
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return distributionChannels
     */
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannels
     */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections of type Individual Exclusion are provided, all the Products are availlable in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of type <code>individual</code>, no Product is availlable in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @return productSelections
     */
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSettingDraft> getProductSelections();

    /**
     *  <p>Custom fields for the Store.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Store.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
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
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannels values to be set
     */

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier... distributionChannels);

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannels values to be set
     */

    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannels values to be set
     */

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannels values to be set
     */

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections of type Individual Exclusion are provided, all the Products are availlable in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of type <code>individual</code>, no Product is availlable in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSettingDraft... productSelections);

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections of type Individual Exclusion are provided, all the Products are availlable in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of type <code>individual</code>, no Product is availlable in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    public void setProductSelections(final List<ProductSelectionSettingDraft> productSelections);

    /**
     *  <p>Custom fields for the Store.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of StoreDraft
     */
    public static StoreDraft of() {
        return new StoreDraftImpl();
    }

    /**
     * factory method to create a shallow copy StoreDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreDraft of(final StoreDraft template) {
        StoreDraftImpl instance = new StoreDraftImpl();
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

    /**
     * factory method to create a deep copy of StoreDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreDraft deepCopy(@Nullable final StoreDraft template) {
        if (template == null) {
            return null;
        }
        StoreDraftImpl instance = new StoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        instance.setCountries(Optional.ofNullable(template.getCountries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDistributionChannels(Optional.ofNullable(template.getDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSupplyChannels(Optional.ofNullable(template.getSupplyChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setProductSelections(Optional.ofNullable(template.getProductSelections())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.ProductSelectionSettingDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreDraft
     * @return builder
     */
    public static StoreDraftBuilder builder() {
        return StoreDraftBuilder.of();
    }

    /**
     * create builder for StoreDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDraftBuilder builder(final StoreDraft template) {
        return StoreDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreDraft(Function<StoreDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDraft>";
            }
        };
    }
}
