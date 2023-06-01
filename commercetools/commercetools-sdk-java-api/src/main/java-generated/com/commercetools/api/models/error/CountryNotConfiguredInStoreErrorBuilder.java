package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.CountryNotConfiguredInStoreError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CountryNotConfiguredInStoreErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountryNotConfiguredInStoreError countryNotConfiguredInStoreError = CountryNotConfiguredInStoreError.builder()
 *             .message("{message}")
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CountryNotConfiguredInStoreErrorBuilder implements Builder<CountryNotConfiguredInStoreError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private java.util.List<String> storeCountries;
    
    
    
    private String country;

    
    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder storeCountries( final String ...storeCountries) {
        this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
        return this;
    }
    
    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder storeCountries( final java.util.List<String> storeCountries) {
        this.storeCountries = storeCountries;
        return this;
    }
    
    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder plusStoreCountries( final String ...storeCountries) {
        if (this.storeCountries == null) {
            this.storeCountries = new ArrayList<>();
        }
        this.storeCountries.addAll(Arrays.asList(storeCountries));
        return this;
    }
    
    
    
    
    
    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public CountryNotConfiguredInStoreErrorBuilder country( final String country) {
        this.country = country;
        return this;
    }
    
    

    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
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
     *  <p>Countries configured for the Store.</p>
     * @return storeCountries
     */
    
    
    public java.util.List<String> getStoreCountries(){
        return this.storeCountries;
    }
    
    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @return country
     */
    
    
    public String getCountry(){
        return this.country;
    }

    /**
     * builds CountryNotConfiguredInStoreError with checking for non-null required values
     * @return CountryNotConfiguredInStoreError
     */
    public CountryNotConfiguredInStoreError build() {
        Objects.requireNonNull(message, CountryNotConfiguredInStoreError.class + ": message is missing");
        Objects.requireNonNull(storeCountries, CountryNotConfiguredInStoreError.class + ": storeCountries is missing");
        Objects.requireNonNull(country, CountryNotConfiguredInStoreError.class + ": country is missing");
        return new CountryNotConfiguredInStoreErrorImpl(message, values, storeCountries, country);
    }
    
    /**
     * builds CountryNotConfiguredInStoreError without checking for non-null required values
     * @return CountryNotConfiguredInStoreError
     */
    public CountryNotConfiguredInStoreError buildUnchecked() {
        return new CountryNotConfiguredInStoreErrorImpl(message, values, storeCountries, country);
    }

    /**
     * factory method for an instance of CountryNotConfiguredInStoreErrorBuilder
     * @return builder 
     */
    public static CountryNotConfiguredInStoreErrorBuilder of() {
        return new CountryNotConfiguredInStoreErrorBuilder();
    }

    /**
     * create builder for CountryNotConfiguredInStoreError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CountryNotConfiguredInStoreErrorBuilder of(final CountryNotConfiguredInStoreError template) {
        CountryNotConfiguredInStoreErrorBuilder builder = new CountryNotConfiguredInStoreErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.storeCountries = template.getStoreCountries();
        builder.country = template.getCountry();
        return builder;
    }

}
