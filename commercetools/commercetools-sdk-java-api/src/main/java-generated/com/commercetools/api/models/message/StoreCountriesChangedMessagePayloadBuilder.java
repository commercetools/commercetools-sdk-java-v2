
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCountriesChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCountriesChangedMessagePayload storeCountriesChangedMessagePayload = StoreCountriesChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCountriesChangedMessagePayloadBuilder implements Builder<StoreCountriesChangedMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries;

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries;

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder addedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        this.addedCountries = new ArrayList<>(Arrays.asList(addedCountries));
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder addedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries) {
        this.addedCountries = addedCountries;
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder plusAddedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        if (this.addedCountries == null) {
            this.addedCountries = new ArrayList<>();
        }
        this.addedCountries.addAll(Arrays.asList(addedCountries));
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder plusAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.addedCountries == null) {
            this.addedCountries = new ArrayList<>();
        }
        this.addedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder withAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.addedCountries = new ArrayList<>();
        this.addedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder removedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        this.removedCountries = new ArrayList<>(Arrays.asList(removedCountries));
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder removedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries) {
        this.removedCountries = removedCountries;
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder plusRemovedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        if (this.removedCountries == null) {
            this.removedCountries = new ArrayList<>();
        }
        this.removedCountries.addAll(Arrays.asList(removedCountries));
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder plusRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.removedCountries == null) {
            this.removedCountries = new ArrayList<>();
        }
        this.removedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessagePayloadBuilder withRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.removedCountries = new ArrayList<>();
        this.removedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getAddedCountries() {
        return this.addedCountries;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getRemovedCountries() {
        return this.removedCountries;
    }

    public StoreCountriesChangedMessagePayload build() {
        return new StoreCountriesChangedMessagePayloadImpl(addedCountries, removedCountries);
    }

    /**
     * builds StoreCountriesChangedMessagePayload without checking for non null required values
     */
    public StoreCountriesChangedMessagePayload buildUnchecked() {
        return new StoreCountriesChangedMessagePayloadImpl(addedCountries, removedCountries);
    }

    public static StoreCountriesChangedMessagePayloadBuilder of() {
        return new StoreCountriesChangedMessagePayloadBuilder();
    }

    public static StoreCountriesChangedMessagePayloadBuilder of(final StoreCountriesChangedMessagePayload template) {
        StoreCountriesChangedMessagePayloadBuilder builder = new StoreCountriesChangedMessagePayloadBuilder();
        builder.addedCountries = template.getAddedCountries();
        builder.removedCountries = template.getRemovedCountries();
        return builder;
    }

}
