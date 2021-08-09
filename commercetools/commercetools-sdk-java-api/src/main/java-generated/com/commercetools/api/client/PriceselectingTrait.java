
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PriceselectingTrait<T extends PriceselectingTrait<T>> {
    List<String> getPriceCurrency();

    List<String> getPriceCountry();

    List<String> getPriceCustomerGroup();

    List<String> getPriceChannel();

    List<String> getLocaleProjection();

    List<String> getStoreProjection();

    /**
     * set priceCurrency with the specificied value
     */
    PriceselectingTrait<T> withPriceCurrency(final String priceCurrency);

    /**
     * add additional priceCurrency query parameter
     */
    PriceselectingTrait<T> addPriceCurrency(final String priceCurrency);

    /**
     * set priceCountry with the specificied value
     */
    PriceselectingTrait<T> withPriceCountry(final String priceCountry);

    /**
     * add additional priceCountry query parameter
     */
    PriceselectingTrait<T> addPriceCountry(final String priceCountry);

    /**
     * set priceCustomerGroup with the specificied value
     */
    PriceselectingTrait<T> withPriceCustomerGroup(final String priceCustomerGroup);

    /**
     * add additional priceCustomerGroup query parameter
     */
    PriceselectingTrait<T> addPriceCustomerGroup(final String priceCustomerGroup);

    /**
     * set priceChannel with the specificied value
     */
    PriceselectingTrait<T> withPriceChannel(final String priceChannel);

    /**
     * add additional priceChannel query parameter
     */
    PriceselectingTrait<T> addPriceChannel(final String priceChannel);

    /**
     * set localeProjection with the specificied value
     */
    PriceselectingTrait<T> withLocaleProjection(final String localeProjection);

    /**
     * add additional localeProjection query parameter
     */
    PriceselectingTrait<T> addLocaleProjection(final String localeProjection);

    /**
     * set storeProjection with the specificied value
     */
    PriceselectingTrait<T> withStoreProjection(final String storeProjection);

    /**
     * add additional storeProjection query parameter
     */
    PriceselectingTrait<T> addStoreProjection(final String storeProjection);

    default PriceselectingTrait<T> asPriceselectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPriceselectingTraitToBaseType() {
        return (T) this;
    }
}
