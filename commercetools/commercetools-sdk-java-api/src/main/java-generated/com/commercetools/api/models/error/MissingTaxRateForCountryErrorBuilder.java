
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingTaxRateForCountryErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingTaxRateForCountryError missingTaxRateForCountryError = MissingTaxRateForCountryError.builder()
 *             .message("{message}")
 *             .taxCategoryId("{taxCategoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingTaxRateForCountryErrorBuilder implements Builder<MissingTaxRateForCountryError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String taxCategoryId;

    @Nullable
    private String country;

    @Nullable
    private String state;

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     * @param message
     * @return Builder
     */

    public MissingTaxRateForCountryErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public MissingTaxRateForCountryErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public MissingTaxRateForCountryErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @param taxCategoryId
     * @return Builder
     */

    public MissingTaxRateForCountryErrorBuilder taxCategoryId(final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country
     * @return Builder
     */

    public MissingTaxRateForCountryErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state
     * @return Builder
     */

    public MissingTaxRateForCountryErrorBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getTaxCategoryId() {
        return this.taxCategoryId;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public MissingTaxRateForCountryError build() {
        Objects.requireNonNull(message, MissingTaxRateForCountryError.class + ": message is missing");
        Objects.requireNonNull(taxCategoryId, MissingTaxRateForCountryError.class + ": taxCategoryId is missing");
        return new MissingTaxRateForCountryErrorImpl(message, values, taxCategoryId, country, state);
    }

    /**
     * builds MissingTaxRateForCountryError without checking for non null required values
     */
    public MissingTaxRateForCountryError buildUnchecked() {
        return new MissingTaxRateForCountryErrorImpl(message, values, taxCategoryId, country, state);
    }

    public static MissingTaxRateForCountryErrorBuilder of() {
        return new MissingTaxRateForCountryErrorBuilder();
    }

    public static MissingTaxRateForCountryErrorBuilder of(final MissingTaxRateForCountryError template) {
        MissingTaxRateForCountryErrorBuilder builder = new MissingTaxRateForCountryErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.taxCategoryId = template.getTaxCategoryId();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
