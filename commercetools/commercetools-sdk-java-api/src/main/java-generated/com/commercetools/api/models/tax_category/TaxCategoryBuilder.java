
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategory taxCategory = TaxCategory.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .plusRates(ratesBuilder -> ratesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryBuilder implements Builder<TaxCategory> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String name;

    @Nullable
    private String description;

    private java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @param id value to be set
     * @return Builder
     */

    public TaxCategoryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the TaxCategory.</p>
     * @param version value to be set
     * @return Builder
     */

    public TaxCategoryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public TaxCategoryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public TaxCategoryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the TaxCategory.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public TaxCategoryBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the TaxCategory.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public TaxCategoryBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the TaxCategory.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public TaxCategoryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the TaxCategory.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public TaxCategoryBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the TaxCategory.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public TaxCategoryBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the TaxCategory.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public TaxCategoryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the TaxCategory.</p>
     * @param name value to be set
     * @return Builder
     */

    public TaxCategoryBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the TaxCategory.</p>
     * @param description value to be set
     * @return Builder
     */

    public TaxCategoryBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param rates value to be set
     * @return Builder
     */

    public TaxCategoryBuilder rates(final com.commercetools.api.models.tax_category.TaxRate... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param rates value to be set
     * @return Builder
     */

    public TaxCategoryBuilder rates(final java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates) {
        this.rates = rates;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param rates value to be set
     * @return Builder
     */

    public TaxCategoryBuilder plusRates(final com.commercetools.api.models.tax_category.TaxRate... rates) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.addAll(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param builder function to build the rates value
     * @return Builder
     */

    public TaxCategoryBuilder plusRates(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param builder function to build the rates value
     * @return Builder
     */

    public TaxCategoryBuilder withRates(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.rates = new ArrayList<>();
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param builder function to build the rates value
     * @return Builder
     */

    public TaxCategoryBuilder addRates(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        return plusRates(builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()));
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param builder function to build the rates value
     * @return Builder
     */

    public TaxCategoryBuilder setRates(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        return rates(builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the TaxCategory.</p>
     * @param key value to be set
     * @return Builder
     */

    public TaxCategoryBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the TaxCategory.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the TaxCategory.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the TaxCategory.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Name of the TaxCategory.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the TaxCategory.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @return rates
     */

    public java.util.List<com.commercetools.api.models.tax_category.TaxRate> getRates() {
        return this.rates;
    }

    /**
     *  <p>User-defined unique identifier of the TaxCategory.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds TaxCategory with checking for non-null required values
     * @return TaxCategory
     */
    public TaxCategory build() {
        Objects.requireNonNull(id, TaxCategory.class + ": id is missing");
        Objects.requireNonNull(version, TaxCategory.class + ": version is missing");
        Objects.requireNonNull(createdAt, TaxCategory.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, TaxCategory.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, TaxCategory.class + ": name is missing");
        Objects.requireNonNull(rates, TaxCategory.class + ": rates is missing");
        return new TaxCategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description,
            rates, key);
    }

    /**
     * builds TaxCategory without checking for non-null required values
     * @return TaxCategory
     */
    public TaxCategory buildUnchecked() {
        return new TaxCategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description,
            rates, key);
    }

    /**
     * factory method for an instance of TaxCategoryBuilder
     * @return builder
     */
    public static TaxCategoryBuilder of() {
        return new TaxCategoryBuilder();
    }

    /**
     * create builder for TaxCategory instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryBuilder of(final TaxCategory template) {
        TaxCategoryBuilder builder = new TaxCategoryBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.rates = template.getRates();
        builder.key = template.getKey();
        return builder;
    }

}
