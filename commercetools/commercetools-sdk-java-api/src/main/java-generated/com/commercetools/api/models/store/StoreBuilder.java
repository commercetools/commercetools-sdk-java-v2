
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreBuilder
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
public class StoreBuilder implements Builder<Store> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<String> languages;

    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique ID of the Store.</p>
     * @param id value to be set
     * @return Builder
     */

    public StoreBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Store.</p>
     * @param version value to be set
     * @return Builder
     */

    public StoreBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Store was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StoreBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Store was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StoreBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StoreBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StoreBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StoreBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Store.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StoreBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Store.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StoreBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Store.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StoreBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Store.</p>
     * @param key value to be set
     * @return Builder
     */

    public StoreBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     * @param name value to be set
     * @return Builder
     */

    public StoreBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreBuilder plusLanguages(final String... languages) {
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

    public StoreBuilder countries(final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreBuilder countries(
            final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreBuilder plusCountries(final com.commercetools.api.models.store_country.StoreCountry... countries) {
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

    public StoreBuilder plusCountries(
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

    public StoreBuilder withCountries(
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

    public StoreBuilder addCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return plusCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreBuilder setCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return countries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreBuilder distributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreBuilder distributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreBuilder plusDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreBuilder addDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreBuilder setDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return distributionChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreBuilder supplyChannels(final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreBuilder supplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreBuilder plusSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreBuilder addSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreBuilder setSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return supplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreBuilder productSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreBuilder productSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreBuilder plusProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreBuilder addProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return plusProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreBuilder setProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return productSelections(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StoreBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique ID of the Store.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Store.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Store was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Store was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Store.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Store.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Store.</p>
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
     *  <p>Languages configured for the Store.</p>
     * @return languages
     */

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     *  <p>Countries defined for the Store.</p>
     * @return countries
     */

    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     * @return distributionChannels
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     * @return supplyChannels
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
     *  <p>Controls availability of Products for this Store via Product Selections:</p>
     *  <ul>
     *   <li>Leave empty if all Products in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> should be available in this Store.</li>
     *   <li>If only <code>inactive</code> Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a> are provided, all the Products are available in this Store.</li>
     *   <li>If all the Product Selections provided are <code>inactive</code> and there's at least a Product Selection of mode <code>Individual</code>, no Product is available in this Store.</li>
     *   <li>If at least an <code>active</code> Product Selection is provided, only <code>active</code> Product Selections are considered to compute the availlability in this Store.</li>
     *  </ul>
     * @return productSelections
     */

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getProductSelections() {
        return this.productSelections;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds Store with checking for non-null required values
     * @return Store
     */
    public Store build() {
        Objects.requireNonNull(id, Store.class + ": id is missing");
        Objects.requireNonNull(version, Store.class + ": version is missing");
        Objects.requireNonNull(createdAt, Store.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Store.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Store.class + ": key is missing");
        Objects.requireNonNull(languages, Store.class + ": languages is missing");
        Objects.requireNonNull(countries, Store.class + ": countries is missing");
        Objects.requireNonNull(distributionChannels, Store.class + ": distributionChannels is missing");
        Objects.requireNonNull(supplyChannels, Store.class + ": supplyChannels is missing");
        Objects.requireNonNull(productSelections, Store.class + ": productSelections is missing");
        return new StoreImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, languages,
            countries, distributionChannels, supplyChannels, productSelections, custom);
    }

    /**
     * builds Store without checking for non-null required values
     * @return Store
     */
    public Store buildUnchecked() {
        return new StoreImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, languages,
            countries, distributionChannels, supplyChannels, productSelections, custom);
    }

    /**
     * factory method for an instance of StoreBuilder
     * @return builder
     */
    public static StoreBuilder of() {
        return new StoreBuilder();
    }

    /**
     * create builder for Store instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreBuilder of(final Store template) {
        StoreBuilder builder = new StoreBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
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
