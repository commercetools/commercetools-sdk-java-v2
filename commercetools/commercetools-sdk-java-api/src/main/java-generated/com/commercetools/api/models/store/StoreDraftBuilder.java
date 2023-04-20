
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDraftBuilder
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
public class StoreDraftBuilder implements Builder<StoreDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<String> languages;

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
     * @param key value to be set
     * @return Builder
     */

    public StoreDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param name value to be set
     * @return Builder
     */

    public StoreDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreDraftBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreDraftBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreDraftBuilder plusLanguages(@Nullable final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreDraftBuilder countries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreDraftBuilder countries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreDraftBuilder plusCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreDraftBuilder plusCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreDraftBuilder withCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.countries = new ArrayList<>();
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreDraftBuilder addCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return plusCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreDraftBuilder setCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return countries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder distributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder distributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder plusDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreDraftBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreDraftBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreDraftBuilder addDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return plusDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreDraftBuilder setDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return distributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder supplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder supplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreDraftBuilder plusSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreDraftBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreDraftBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreDraftBuilder addSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return plusSupplyChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreDraftBuilder setSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return supplyChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreDraftBuilder productSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreDraftBuilder productSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreDraftBuilder plusProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreDraftBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreDraftBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreDraftBuilder addProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraft> builder) {
        return plusProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()));
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreDraftBuilder setProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraft> builder) {
        return productSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()));
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StoreDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Store.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     * @return languages
     */

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @return countries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return distributionChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
     *  <p>ResourceIdentifier of a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
     *  <p>Controls availability of Products for this Store via active/inactive Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> ProductSelectionMode are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availability in this Store.</li>
     *  </ul>
     * @return productSelections
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds StoreDraft with checking for non-null required values
     * @return StoreDraft
     */
    public StoreDraft build() {
        Objects.requireNonNull(key, StoreDraft.class + ": key is missing");
        return new StoreDraftImpl(key, name, languages, countries, distributionChannels, supplyChannels,
            productSelections, custom);
    }

    /**
     * builds StoreDraft without checking for non-null required values
     * @return StoreDraft
     */
    public StoreDraft buildUnchecked() {
        return new StoreDraftImpl(key, name, languages, countries, distributionChannels, supplyChannels,
            productSelections, custom);
    }

    /**
     * factory method for an instance of StoreDraftBuilder
     * @return builder
     */
    public static StoreDraftBuilder of() {
        return new StoreDraftBuilder();
    }

    /**
     * create builder for StoreDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDraftBuilder of(final StoreDraft template) {
        StoreDraftBuilder builder = new StoreDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.countries = template.getCountries();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        builder.productSelections = template.getProductSelections();
        builder.custom = template.getCustom();
        return builder;
    }

}
