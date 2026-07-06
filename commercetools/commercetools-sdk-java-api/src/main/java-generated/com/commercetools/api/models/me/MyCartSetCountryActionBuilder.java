
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCountryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCountryAction myCartSetCountryAction = MyCartSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetCountryActionBuilder implements Builder<MyCartSetCountryAction> {

    @Nullable
    private String country;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:CountryNotConfiguredInStoreError" rel="nofollow">CountryNotConfiguredInStore</a> error is returned.</p>
     * @param country value to be set
     * @return Builder
     */

    public MyCartSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:CountryNotConfiguredInStoreError" rel="nofollow">CountryNotConfiguredInStore</a> error is returned.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     * builds MyCartSetCountryAction with checking for non-null required values
     * @return MyCartSetCountryAction
     */
    public MyCartSetCountryAction build() {
        return new MyCartSetCountryActionImpl(country);
    }

    /**
     * builds MyCartSetCountryAction without checking for non-null required values
     * @return MyCartSetCountryAction
     */
    public MyCartSetCountryAction buildUnchecked() {
        return new MyCartSetCountryActionImpl(country);
    }

    /**
     * factory method for an instance of MyCartSetCountryActionBuilder
     * @return builder
     */
    public static MyCartSetCountryActionBuilder of() {
        return new MyCartSetCountryActionBuilder();
    }

    /**
     * create builder for MyCartSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCountryActionBuilder of(final MyCartSetCountryAction template) {
        MyCartSetCountryActionBuilder builder = new MyCartSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
