
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreCountriesChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCountriesAction storeSetCountriesAction = StoreSetCountriesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCountriesActionImpl.class)
public interface StoreSetCountriesAction extends StoreUpdateAction {

    String SET_COUNTRIES = "setCountries";

    /**
     *  <p>New value to set.</p>
     * @return countries
     */
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    @JsonIgnore
    public void setCountries(final StoreCountry... countries);

    public void setCountries(final List<StoreCountry> countries);

    public static StoreSetCountriesAction of() {
        return new StoreSetCountriesActionImpl();
    }

    public static StoreSetCountriesAction of(final StoreSetCountriesAction template) {
        StoreSetCountriesActionImpl instance = new StoreSetCountriesActionImpl();
        instance.setCountries(template.getCountries());
        return instance;
    }

    public static StoreSetCountriesActionBuilder builder() {
        return StoreSetCountriesActionBuilder.of();
    }

    public static StoreSetCountriesActionBuilder builder(final StoreSetCountriesAction template) {
        return StoreSetCountriesActionBuilder.of(template);
    }

    default <T> T withStoreSetCountriesAction(Function<StoreSetCountriesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetCountriesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetCountriesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCountriesAction>";
            }
        };
    }
}
