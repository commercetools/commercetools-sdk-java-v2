
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartsConfiguration cartsConfiguration = CartsConfiguration.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartsConfigurationBuilder implements Builder<CartsConfiguration> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private Boolean countryTaxRateFallbackEnabled;

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the CartDraft. This field may not be present on Projects created before January 2020.</p>
     */

    public CartsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
     */

    public CartsConfigurationBuilder countryTaxRateFallbackEnabled(
            @Nullable final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public CartsConfiguration build() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled);
    }

    /**
     * builds CartsConfiguration without checking for non null required values
     */
    public CartsConfiguration buildUnchecked() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled);
    }

    public static CartsConfigurationBuilder of() {
        return new CartsConfigurationBuilder();
    }

    public static CartsConfigurationBuilder of(final CartsConfiguration template) {
        CartsConfigurationBuilder builder = new CartsConfigurationBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
