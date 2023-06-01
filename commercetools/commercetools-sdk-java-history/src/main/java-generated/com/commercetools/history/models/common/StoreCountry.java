package com.commercetools.history.models.common;


import com.commercetools.history.models.common.StoreCountryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * StoreCountry
 *
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
@JsonDeserialize(as = StoreCountryImpl.class)
public interface StoreCountry  {


    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param code value to be set
     */
    
    public void setCode(final String code);
    

    /**
     * factory method
     * @return instance of StoreCountry
     */
    public static StoreCountry of(){
        return new StoreCountryImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreCountry
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCountry of(final StoreCountry template) {
        StoreCountryImpl instance = new StoreCountryImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreCountry
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCountry deepCopy(@Nullable final StoreCountry template) {
        if (template == null) {
            return null;
        }
        StoreCountryImpl instance = new StoreCountryImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * builder factory method for StoreCountry
     * @return builder
     */
    public static StoreCountryBuilder builder() {
        return StoreCountryBuilder.of();
    }
    
    /**
     * create builder for StoreCountry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCountryBuilder builder(final StoreCountry template) {
        return StoreCountryBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCountry(Function<StoreCountry, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountry>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountry>";
            }
        };
    }
}
