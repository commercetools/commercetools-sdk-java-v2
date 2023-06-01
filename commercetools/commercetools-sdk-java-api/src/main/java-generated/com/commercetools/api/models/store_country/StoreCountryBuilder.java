package com.commercetools.api.models.store_country;


import com.commercetools.api.models.store_country.StoreCountry;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCountryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCountry storeCountry = StoreCountry.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreCountryBuilder implements Builder<StoreCountry> {

    
    
    private String code;

    
    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param code value to be set
     * @return Builder
     */
    
    public StoreCountryBuilder code( final String code) {
        this.code = code;
        return this;
    }
    
    

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return code
     */
    
    
    public String getCode(){
        return this.code;
    }

    /**
     * builds StoreCountry with checking for non-null required values
     * @return StoreCountry
     */
    public StoreCountry build() {
        Objects.requireNonNull(code, StoreCountry.class + ": code is missing");
        return new StoreCountryImpl(code);
    }
    
    /**
     * builds StoreCountry without checking for non-null required values
     * @return StoreCountry
     */
    public StoreCountry buildUnchecked() {
        return new StoreCountryImpl(code);
    }

    /**
     * factory method for an instance of StoreCountryBuilder
     * @return builder 
     */
    public static StoreCountryBuilder of() {
        return new StoreCountryBuilder();
    }

    /**
     * create builder for StoreCountry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCountryBuilder of(final StoreCountry template) {
        StoreCountryBuilder builder = new StoreCountryBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
