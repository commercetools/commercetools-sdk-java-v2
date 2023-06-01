package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.store.StoreAddCountryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreAddCountryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddCountryAction storeAddCountryAction = StoreAddCountryAction.builder()
 *             .country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreAddCountryActionBuilder implements Builder<StoreAddCountryAction> {

    
    
    private com.commercetools.api.models.store_country.StoreCountry country;

    
    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @param builder function to build the country value
     * @return Builder
     */
    
    public StoreAddCountryActionBuilder country(Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.country = builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @param builder function to build the country value
     * @return Builder
     */
    
    public StoreAddCountryActionBuilder withCountry(Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        this.country = builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public StoreAddCountryActionBuilder country( final com.commercetools.api.models.store_country.StoreCountry country) {
        this.country = country;
        return this;
    }
    
    

    /**
     *  <p>Value to append to <code>countries</code>.</p>
     * @return country
     */
    
    
    public com.commercetools.api.models.store_country.StoreCountry getCountry(){
        return this.country;
    }

    /**
     * builds StoreAddCountryAction with checking for non-null required values
     * @return StoreAddCountryAction
     */
    public StoreAddCountryAction build() {
        Objects.requireNonNull(country, StoreAddCountryAction.class + ": country is missing");
        return new StoreAddCountryActionImpl(country);
    }
    
    /**
     * builds StoreAddCountryAction without checking for non-null required values
     * @return StoreAddCountryAction
     */
    public StoreAddCountryAction buildUnchecked() {
        return new StoreAddCountryActionImpl(country);
    }

    /**
     * factory method for an instance of StoreAddCountryActionBuilder
     * @return builder 
     */
    public static StoreAddCountryActionBuilder of() {
        return new StoreAddCountryActionBuilder();
    }

    /**
     * create builder for StoreAddCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddCountryActionBuilder of(final StoreAddCountryAction template) {
        StoreAddCountryActionBuilder builder = new StoreAddCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
