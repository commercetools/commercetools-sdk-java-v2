
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.RoundingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartsConfiguration
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartsConfiguration cartsConfiguration = CartsConfiguration.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartsConfigurationImpl.class)
public interface CartsConfiguration {

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartDraft" rel="nofollow">MyCartDraft</a>. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> is sent upon deletion of a Cart.</p>
     *  <p>This field may not be present on Projects created before January 2020.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     * @return countryTaxRateFallbackEnabled
     */

    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    /**
     *  <p>Default value for the <code>priceRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @return priceRoundingMode
     */

    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>Default value for the <code>taxRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartDraft" rel="nofollow">MyCartDraft</a>. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> is sent upon deletion of a Cart.</p>
     *  <p>This field may not be present on Projects created before January 2020.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     * @param countryTaxRateFallbackEnabled value to be set
     */

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    /**
     *  <p>Default value for the <code>priceRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     *  <p>Default value for the <code>taxRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     * factory method
     * @return instance of CartsConfiguration
     */
    public static CartsConfiguration of() {
        return new CartsConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy CartsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartsConfiguration of(final CartsConfiguration template) {
        CartsConfigurationImpl instance = new CartsConfigurationImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    public CartsConfiguration copyDeep();

    /**
     * factory method to create a deep copy of CartsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartsConfiguration deepCopy(@Nullable final CartsConfiguration template) {
        if (template == null) {
            return null;
        }
        CartsConfigurationImpl instance = new CartsConfigurationImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * builder factory method for CartsConfiguration
     * @return builder
     */
    public static CartsConfigurationBuilder builder() {
        return CartsConfigurationBuilder.of();
    }

    /**
     * create builder for CartsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartsConfigurationBuilder builder(final CartsConfiguration template) {
        return CartsConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartsConfiguration(Function<CartsConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartsConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartsConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<CartsConfiguration>";
            }
        };
    }
}
