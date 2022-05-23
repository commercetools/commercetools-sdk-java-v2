
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TaxCategory taxCategory = TaxCategory.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .name("{name}")
           .plusRates(ratesBuilder -> ratesBuilder)
           .build()
 </code></pre>
 </div>
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
     *  <p>Platform-generated unique identifier of the TaxCategory.</p>
     */

    public TaxCategoryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the TaxCategory.</p>
     */

    public TaxCategoryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
     */

    public TaxCategoryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
     */

    public TaxCategoryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public TaxCategoryBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public TaxCategoryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public TaxCategoryBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public TaxCategoryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the TaxCategory.</p>
     */

    public TaxCategoryBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the TaxCategory.</p>
     */

    public TaxCategoryBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
     */

    public TaxCategoryBuilder rates(final com.commercetools.api.models.tax_category.TaxRate... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
     */

    public TaxCategoryBuilder rates(final java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates) {
        this.rates = rates;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
     */

    public TaxCategoryBuilder plusRates(final com.commercetools.api.models.tax_category.TaxRate... rates) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.addAll(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
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
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID assigned by the platform.</p>
     */

    public TaxCategoryBuilder withRates(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.rates = new ArrayList<>();
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the TaxCategory.</p>
     */

    public TaxCategoryBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.tax_category.TaxRate> getRates() {
        return this.rates;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

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
     * builds TaxCategory without checking for non null required values
     */
    public TaxCategory buildUnchecked() {
        return new TaxCategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description,
            rates, key);
    }

    public static TaxCategoryBuilder of() {
        return new TaxCategoryBuilder();
    }

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
