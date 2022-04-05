
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
    <TValue> PriceselectingTrait<T> withPriceCurrency(final TValue priceCurrency);

    /**
     * add additional priceCurrency query parameter
     */
    <TValue> PriceselectingTrait<T> addPriceCurrency(final TValue priceCurrency);

    /**
     * set priceCountry with the specificied value
     */
    <TValue> PriceselectingTrait<T> withPriceCountry(final TValue priceCountry);

    /**
     * add additional priceCountry query parameter
     */
    <TValue> PriceselectingTrait<T> addPriceCountry(final TValue priceCountry);

    /**
     * set priceCustomerGroup with the specificied value
     */
    <TValue> PriceselectingTrait<T> withPriceCustomerGroup(final TValue priceCustomerGroup);

    /**
     * add additional priceCustomerGroup query parameter
     */
    <TValue> PriceselectingTrait<T> addPriceCustomerGroup(final TValue priceCustomerGroup);

    /**
     * set priceChannel with the specificied value
     */
    <TValue> PriceselectingTrait<T> withPriceChannel(final TValue priceChannel);

    /**
     * add additional priceChannel query parameter
     */
    <TValue> PriceselectingTrait<T> addPriceChannel(final TValue priceChannel);

    /**
     * set localeProjection with the specificied value
     */
    <TValue> PriceselectingTrait<T> withLocaleProjection(final TValue localeProjection);

    /**
     * add additional localeProjection query parameter
     */
    <TValue> PriceselectingTrait<T> addLocaleProjection(final TValue localeProjection);

    /**
     * set storeProjection with the specificied value
     */
    <TValue> PriceselectingTrait<T> withStoreProjection(final TValue storeProjection);

    /**
     * add additional storeProjection query parameter
     */
    <TValue> PriceselectingTrait<T> addStoreProjection(final TValue storeProjection);

    default PriceselectingTrait<T> asPriceselectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPriceselectingTraitToBaseType() {
        return (T) this;
    }
}
