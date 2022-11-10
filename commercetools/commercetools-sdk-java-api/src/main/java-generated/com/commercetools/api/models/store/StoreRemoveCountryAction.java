
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store_country.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreCountriesChanged Message. It has no effect if a given country is not present in a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveCountryAction storeRemoveCountryAction = StoreRemoveCountryAction.builder()
 *             .country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveCountryActionImpl.class)
public interface StoreRemoveCountryAction extends StoreUpdateAction {

    String REMOVE_COUNTRY = "removeCountry";

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("country")
    public StoreCountry getCountry();

    public void setCountry(final StoreCountry country);

    public static StoreRemoveCountryAction of() {
        return new StoreRemoveCountryActionImpl();
    }

    public static StoreRemoveCountryAction of(final StoreRemoveCountryAction template) {
        StoreRemoveCountryActionImpl instance = new StoreRemoveCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static StoreRemoveCountryActionBuilder builder() {
        return StoreRemoveCountryActionBuilder.of();
    }

    public static StoreRemoveCountryActionBuilder builder(final StoreRemoveCountryAction template) {
        return StoreRemoveCountryActionBuilder.of(template);
    }

    default <T> T withStoreRemoveCountryAction(Function<StoreRemoveCountryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveCountryAction>";
            }
        };
    }
}
