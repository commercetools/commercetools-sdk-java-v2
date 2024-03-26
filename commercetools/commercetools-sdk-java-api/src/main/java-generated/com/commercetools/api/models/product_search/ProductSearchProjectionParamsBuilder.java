
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchProjectionParamsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchProjectionParams productSearchProjectionParams = ProductSearchProjectionParams.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchProjectionParamsBuilder implements Builder<ProductSearchProjectionParams> {

    @Nullable
    private java.util.List<String> expand;

    @Nullable
    private Boolean staged;

    @Nullable
    private String priceCurrency;

    @Nullable
    private String priceCountry;

    @Nullable
    private String priceCustomerGroup;

    @Nullable
    private String priceChannel;

    @Nullable
    private java.util.List<String> localeProjection;

    @Nullable
    private String storeProjection;

    /**
     *  <p>Expands a <code>value</code> of type Reference in a ProductProjection. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder expand(@Nullable final String... expand) {
        this.expand = new ArrayList<>(Arrays.asList(expand));
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type Reference in a ProductProjection. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder expand(@Nullable final java.util.List<String> expand) {
        this.expand = expand;
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type Reference in a ProductProjection. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder plusExpand(@Nullable final String... expand) {
        if (this.expand == null) {
            this.expand = new ArrayList<>();
        }
        this.expand.addAll(Arrays.asList(expand));
        return this;
    }

    /**
     *  <p>Set to <code>true</code> to retrieve the staged Product Projection</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The currency used for Price selection.</p>
     * @param priceCurrency value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCurrency(@Nullable final String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    /**
     *  <p>The country used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @param priceCountry value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCountry(@Nullable final String priceCountry) {
        this.priceCountry = priceCountry;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing CustomerGroup used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroup value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCustomerGroup(@Nullable final String priceCustomerGroup) {
        this.priceCustomerGroup = priceCustomerGroup;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Channel used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @param priceChannel value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceChannel(@Nullable final String priceChannel) {
        this.priceChannel = priceChannel;
        return this;
    }

    /**
     *  <p>Used for locale-based projection.</p>
     * @param localeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder localeProjection(@Nullable final String... localeProjection) {
        this.localeProjection = new ArrayList<>(Arrays.asList(localeProjection));
        return this;
    }

    /**
     *  <p>Used for locale-based projection.</p>
     * @param localeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder localeProjection(
            @Nullable final java.util.List<String> localeProjection) {
        this.localeProjection = localeProjection;
        return this;
    }

    /**
     *  <p>Used for locale-based projection.</p>
     * @param localeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder plusLocaleProjection(@Nullable final String... localeProjection) {
        if (this.localeProjection == null) {
            this.localeProjection = new ArrayList<>();
        }
        this.localeProjection.addAll(Arrays.asList(localeProjection));
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Store. If the Store has defined some languages, countries, distribution or supply Channels, they are used for projections based on locale, price and inventory. If the Store has defined Product Selections, they have no effect on the results of this query.</p>
     * @param storeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder storeProjection(@Nullable final String storeProjection) {
        this.storeProjection = storeProjection;
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type Reference in a ProductProjection. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @return expand
     */

    @Nullable
    public java.util.List<String> getExpand() {
        return this.expand;
    }

    /**
     *  <p>Set to <code>true</code> to retrieve the staged Product Projection</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The currency used for Price selection.</p>
     * @return priceCurrency
     */

    @Nullable
    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    /**
     *  <p>The country used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @return priceCountry
     */

    @Nullable
    public String getPriceCountry() {
        return this.priceCountry;
    }

    /**
     *  <p><code>id</code> of an existing CustomerGroup used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @return priceCustomerGroup
     */

    @Nullable
    public String getPriceCustomerGroup() {
        return this.priceCustomerGroup;
    }

    /**
     *  <p><code>id</code> of an existing Channel used for Price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     * @return priceChannel
     */

    @Nullable
    public String getPriceChannel() {
        return this.priceChannel;
    }

    /**
     *  <p>Used for locale-based projection.</p>
     * @return localeProjection
     */

    @Nullable
    public java.util.List<String> getLocaleProjection() {
        return this.localeProjection;
    }

    /**
     *  <p><code>key</code> of an existing Store. If the Store has defined some languages, countries, distribution or supply Channels, they are used for projections based on locale, price and inventory. If the Store has defined Product Selections, they have no effect on the results of this query.</p>
     * @return storeProjection
     */

    @Nullable
    public String getStoreProjection() {
        return this.storeProjection;
    }

    /**
     * builds ProductSearchProjectionParams with checking for non-null required values
     * @return ProductSearchProjectionParams
     */
    public ProductSearchProjectionParams build() {
        return new ProductSearchProjectionParamsImpl(expand, staged, priceCurrency, priceCountry, priceCustomerGroup,
            priceChannel, localeProjection, storeProjection);
    }

    /**
     * builds ProductSearchProjectionParams without checking for non-null required values
     * @return ProductSearchProjectionParams
     */
    public ProductSearchProjectionParams buildUnchecked() {
        return new ProductSearchProjectionParamsImpl(expand, staged, priceCurrency, priceCountry, priceCustomerGroup,
            priceChannel, localeProjection, storeProjection);
    }

    /**
     * factory method for an instance of ProductSearchProjectionParamsBuilder
     * @return builder
     */
    public static ProductSearchProjectionParamsBuilder of() {
        return new ProductSearchProjectionParamsBuilder();
    }

    /**
     * create builder for ProductSearchProjectionParams instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchProjectionParamsBuilder of(final ProductSearchProjectionParams template) {
        ProductSearchProjectionParamsBuilder builder = new ProductSearchProjectionParamsBuilder();
        builder.expand = template.getExpand();
        builder.staged = template.getStaged();
        builder.priceCurrency = template.getPriceCurrency();
        builder.priceCountry = template.getPriceCountry();
        builder.priceCustomerGroup = template.getPriceCustomerGroup();
        builder.priceChannel = template.getPriceChannel();
        builder.localeProjection = template.getLocaleProjection();
        builder.storeProjection = template.getStoreProjection();
        return builder;
    }

}
