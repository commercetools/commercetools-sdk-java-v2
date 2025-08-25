
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
    private java.util.List<String> priceCustomerGroupAssignments;

    @Nullable
    private String priceChannel;

    @Nullable
    private java.util.List<String> localeProjection;

    @Nullable
    private String storeProjection;

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder expand(@Nullable final String... expand) {
        this.expand = new ArrayList<>(Arrays.asList(expand));
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder expand(@Nullable final java.util.List<String> expand) {
        this.expand = expand;
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
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
     *  <p>Set to <code>true</code> to retrieve the <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">staged</a> Product Projection</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The currency used for <span>Product price selection</span>.</p>
     * @param priceCurrency value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCurrency(@Nullable final String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    /**
     *  <p>The country used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCountry value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCountry(@Nullable final String priceCountry) {
        this.priceCountry = priceCountry;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroup value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCustomerGroup(@Nullable final String priceCustomerGroup) {
        this.priceCustomerGroup = priceCustomerGroup;
        return this;
    }

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroupAssignments value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCustomerGroupAssignments(
            @Nullable final String... priceCustomerGroupAssignments) {
        this.priceCustomerGroupAssignments = new ArrayList<>(Arrays.asList(priceCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroupAssignments value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceCustomerGroupAssignments(
            @Nullable final java.util.List<String> priceCustomerGroupAssignments) {
        this.priceCustomerGroupAssignments = priceCustomerGroupAssignments;
        return this;
    }

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroupAssignments value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder plusPriceCustomerGroupAssignments(
            @Nullable final String... priceCustomerGroupAssignments) {
        if (this.priceCustomerGroupAssignments == null) {
            this.priceCustomerGroupAssignments = new ArrayList<>();
        }
        this.priceCustomerGroupAssignments.addAll(Arrays.asList(priceCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceChannel value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder priceChannel(@Nullable final String priceChannel) {
        this.priceChannel = priceChannel;
        return this;
    }

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @param localeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder localeProjection(@Nullable final String... localeProjection) {
        this.localeProjection = new ArrayList<>(Arrays.asList(localeProjection));
        return this;
    }

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @param localeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder localeProjection(
            @Nullable final java.util.List<String> localeProjection) {
        this.localeProjection = localeProjection;
        return this;
    }

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
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
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. If the Store has defined <code>languages</code>, <code>countries</code>, <code>distributionChannels</code>, or <code>supplyChannels</code>, they are used for projections based on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionPrices" rel="nofollow">price</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionInventoryEntries" rel="nofollow">inventory</a>. For Projects with active <span>Product Selections</span>, the API does not take the <span>availability of the Product in the specified Store</span> into account. <span>Product Tailoring</span> modifies the product information returned in API responses, but evaluating <span>query expressions</span> is restricted to the original product information.</p>
     * @param storeProjection value to be set
     * @return Builder
     */

    public ProductSearchProjectionParamsBuilder storeProjection(@Nullable final String storeProjection) {
        this.storeProjection = storeProjection;
        return this;
    }

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @return expand
     */

    @Nullable
    public java.util.List<String> getExpand() {
        return this.expand;
    }

    /**
     *  <p>Set to <code>true</code> to retrieve the <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">staged</a> Product Projection</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The currency used for <span>Product price selection</span>.</p>
     * @return priceCurrency
     */

    @Nullable
    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    /**
     *  <p>The country used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCountry
     */

    @Nullable
    public String getPriceCountry() {
        return this.priceCountry;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCustomerGroup
     */

    @Nullable
    public String getPriceCustomerGroup() {
        return this.priceCustomerGroup;
    }

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCustomerGroupAssignments
     */

    @Nullable
    public java.util.List<String> getPriceCustomerGroupAssignments() {
        return this.priceCustomerGroupAssignments;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceChannel
     */

    @Nullable
    public String getPriceChannel() {
        return this.priceChannel;
    }

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @return localeProjection
     */

    @Nullable
    public java.util.List<String> getLocaleProjection() {
        return this.localeProjection;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. If the Store has defined <code>languages</code>, <code>countries</code>, <code>distributionChannels</code>, or <code>supplyChannels</code>, they are used for projections based on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionPrices" rel="nofollow">price</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionInventoryEntries" rel="nofollow">inventory</a>. For Projects with active <span>Product Selections</span>, the API does not take the <span>availability of the Product in the specified Store</span> into account. <span>Product Tailoring</span> modifies the product information returned in API responses, but evaluating <span>query expressions</span> is restricted to the original product information.</p>
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
            priceCustomerGroupAssignments, priceChannel, localeProjection, storeProjection);
    }

    /**
     * builds ProductSearchProjectionParams without checking for non-null required values
     * @return ProductSearchProjectionParams
     */
    public ProductSearchProjectionParams buildUnchecked() {
        return new ProductSearchProjectionParamsImpl(expand, staged, priceCurrency, priceCountry, priceCustomerGroup,
            priceCustomerGroupAssignments, priceChannel, localeProjection, storeProjection);
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
        builder.priceCustomerGroupAssignments = template.getPriceCustomerGroupAssignments();
        builder.priceChannel = template.getPriceChannel();
        builder.localeProjection = template.getLocaleProjection();
        builder.storeProjection = template.getStoreProjection();
        return builder;
    }

}
