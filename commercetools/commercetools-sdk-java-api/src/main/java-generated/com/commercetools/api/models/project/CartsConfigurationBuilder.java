
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartsConfigurationBuilder
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
public class CartsConfigurationBuilder implements Builder<CartsConfiguration> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private Boolean countryTaxRateFallbackEnabled;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartDraft" rel="nofollow">MyCartDraft</a>. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> is sent upon deletion of a Cart.</p>
     *  <p>This field may not be present on Projects created before January 2020.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public CartsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     * @param countryTaxRateFallbackEnabled value to be set
     * @return Builder
     */

    public CartsConfigurationBuilder countryTaxRateFallbackEnabled(
            @Nullable final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    /**
     *  <p>Default value for the <code>priceRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public CartsConfigurationBuilder priceRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>Default value for the <code>taxRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public CartsConfigurationBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartDraft" rel="nofollow">MyCartDraft</a>. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> is sent upon deletion of a Cart.</p>
     *  <p>This field may not be present on Projects created before January 2020.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     * @return countryTaxRateFallbackEnabled
     */

    @Nullable
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    /**
     *  <p>Default value for the <code>priceRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @return priceRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>Default value for the <code>taxRoundingMode</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDraft" rel="nofollow">CartDraft</a>. Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     * builds CartsConfiguration with checking for non-null required values
     * @return CartsConfiguration
     */
    public CartsConfiguration build() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled,
            priceRoundingMode, taxRoundingMode);
    }

    /**
     * builds CartsConfiguration without checking for non-null required values
     * @return CartsConfiguration
     */
    public CartsConfiguration buildUnchecked() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled,
            priceRoundingMode, taxRoundingMode);
    }

    /**
     * factory method for an instance of CartsConfigurationBuilder
     * @return builder
     */
    public static CartsConfigurationBuilder of() {
        return new CartsConfigurationBuilder();
    }

    /**
     * create builder for CartsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartsConfigurationBuilder of(final CartsConfiguration template) {
        CartsConfigurationBuilder builder = new CartsConfigurationBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
