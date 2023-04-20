
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCreatedMessagePayload storeCreatedMessagePayload = StoreCreatedMessagePayload.builder()
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCreatedMessagePayloadBuilder implements Builder<StoreCreatedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<String> languages;

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @param name value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusLanguages(@Nullable final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder countries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder countries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.countries = new ArrayList<>();
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder addCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return plusCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param builder function to build the countries value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder setCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return countries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder distributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder distributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder addDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder setDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return distributionChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder supplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder supplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder addSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder setSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return supplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder productSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder productSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder addProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return plusProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param builder function to build the productSelections value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder setProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return productSelections(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StoreCreatedMessagePayloadBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @return languages
     */

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     *  <p>Countries of the Store that was created.</p>
     * @return countries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @return distributionChannels
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @return supplyChannels
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @return productSelections
     */

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getProductSelections() {
        return this.productSelections;
    }

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds StoreCreatedMessagePayload with checking for non-null required values
     * @return StoreCreatedMessagePayload
     */
    public StoreCreatedMessagePayload build() {
        Objects.requireNonNull(distributionChannels,
            StoreCreatedMessagePayload.class + ": distributionChannels is missing");
        Objects.requireNonNull(supplyChannels, StoreCreatedMessagePayload.class + ": supplyChannels is missing");
        Objects.requireNonNull(productSelections, StoreCreatedMessagePayload.class + ": productSelections is missing");
        return new StoreCreatedMessagePayloadImpl(name, languages, countries, distributionChannels, supplyChannels,
            productSelections, custom);
    }

    /**
     * builds StoreCreatedMessagePayload without checking for non-null required values
     * @return StoreCreatedMessagePayload
     */
    public StoreCreatedMessagePayload buildUnchecked() {
        return new StoreCreatedMessagePayloadImpl(name, languages, countries, distributionChannels, supplyChannels,
            productSelections, custom);
    }

    /**
     * factory method for an instance of StoreCreatedMessagePayloadBuilder
     * @return builder
     */
    public static StoreCreatedMessagePayloadBuilder of() {
        return new StoreCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCreatedMessagePayloadBuilder of(final StoreCreatedMessagePayload template) {
        StoreCreatedMessagePayloadBuilder builder = new StoreCreatedMessagePayloadBuilder();
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
