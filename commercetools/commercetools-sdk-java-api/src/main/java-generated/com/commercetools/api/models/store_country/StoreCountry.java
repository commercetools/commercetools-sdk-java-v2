
package com.commercetools.api.models.store_country;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCountryImpl.class)
public interface StoreCountry {

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static StoreCountry of() {
        return new StoreCountryImpl();
    }

    public static StoreCountry of(final StoreCountry template) {
        StoreCountryImpl instance = new StoreCountryImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public static StoreCountryBuilder builder() {
        return StoreCountryBuilder.of();
    }

    public static StoreCountryBuilder builder(final StoreCountry template) {
        return StoreCountryBuilder.of(template);
    }

    default <T> T withStoreCountry(Function<StoreCountry, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreCountry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCountry>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCountry>";
            }
        };
    }
}
