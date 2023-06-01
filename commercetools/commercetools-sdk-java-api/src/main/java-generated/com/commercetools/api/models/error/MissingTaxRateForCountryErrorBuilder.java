package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     * @param message value to be set
     * @return Builder
     */
    
    public MissingTaxRateForCountryErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public MissingTaxRateForCountryErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
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
     * @param taxCategoryId value to be set
     * @return Builder
     */
    
    public MissingTaxRateForCountryErrorBuilder taxCategoryId( final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public MissingTaxRateForCountryErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }
    
    
    
    
    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public MissingTaxRateForCountryErrorBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }
    
    

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @return taxCategoryId
     */
    
    
    public String getTaxCategoryId(){
        return this.taxCategoryId;
    }
    
    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */
    
    @Nullable
    public String getCountry(){
        return this.country;
    }
    
    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */
    
    @Nullable
    public String getState(){
        return this.state;
    }

    /**
     * builds MissingTaxRateForCountryError with checking for non-null required values
     * @return MissingTaxRateForCountryError
     */
    public MissingTaxRateForCountryError build() {
        Objects.requireNonNull(message, MissingTaxRateForCountryError.class + ": message is missing");
        Objects.requireNonNull(taxCategoryId, MissingTaxRateForCountryError.class + ": taxCategoryId is missing");
        return new MissingTaxRateForCountryErrorImpl(message, values, taxCategoryId, country, state);
    }
    
    /**
     * builds MissingTaxRateForCountryError without checking for non-null required values
     * @return MissingTaxRateForCountryError
     */
    public MissingTaxRateForCountryError buildUnchecked() {
        return new MissingTaxRateForCountryErrorImpl(message, values, taxCategoryId, country, state);
    }

    /**
     * factory method for an instance of MissingTaxRateForCountryErrorBuilder
     * @return builder 
     */
    public static MissingTaxRateForCountryErrorBuilder of() {
        return new MissingTaxRateForCountryErrorBuilder();
    }

    /**
     * create builder for MissingTaxRateForCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
