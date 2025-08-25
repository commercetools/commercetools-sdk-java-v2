
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The query parameters used for <span>data integration with Product Projection parameters</span>.</p>
 *
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
@JsonDeserialize(as = ProductSearchProjectionParamsImpl.class)
public interface ProductSearchProjectionParams {

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @return expand
     */

    @JsonProperty("expand")
    public List<String> getExpand();

    /**
     *  <p>Set to <code>true</code> to retrieve the <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">staged</a> Product Projection</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The currency used for <span>Product price selection</span>.</p>
     * @return priceCurrency
     */

    @JsonProperty("priceCurrency")
    public String getPriceCurrency();

    /**
     *  <p>The country used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCountry
     */

    @JsonProperty("priceCountry")
    public String getPriceCountry();

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCustomerGroup
     */

    @JsonProperty("priceCustomerGroup")
    public String getPriceCustomerGroup();

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceCustomerGroupAssignments
     */

    @JsonProperty("priceCustomerGroupAssignments")
    public List<String> getPriceCustomerGroupAssignments();

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @return priceChannel
     */

    @JsonProperty("priceChannel")
    public String getPriceChannel();

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @return localeProjection
     */

    @JsonProperty("localeProjection")
    public List<String> getLocaleProjection();

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. If the Store has defined <code>languages</code>, <code>countries</code>, <code>distributionChannels</code>, or <code>supplyChannels</code>, they are used for projections based on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionPrices" rel="nofollow">price</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionInventoryEntries" rel="nofollow">inventory</a>. For Projects with active <span>Product Selections</span>, the API does not take the <span>availability of the Product in the specified Store</span> into account. <span>Product Tailoring</span> modifies the product information returned in API responses, but evaluating <span>query expressions</span> is restricted to the original product information.</p>
     * @return storeProjection
     */

    @JsonProperty("storeProjection")
    public String getStoreProjection();

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand values to be set
     */

    @JsonIgnore
    public void setExpand(final String... expand);

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     * @param expand values to be set
     */

    public void setExpand(final List<String> expand);

    /**
     *  <p>Set to <code>true</code> to retrieve the <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">staged</a> Product Projection</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The currency used for <span>Product price selection</span>.</p>
     * @param priceCurrency value to be set
     */

    public void setPriceCurrency(final String priceCurrency);

    /**
     *  <p>The country used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCountry value to be set
     */

    public void setPriceCountry(final String priceCountry);

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroup value to be set
     */

    public void setPriceCustomerGroup(final String priceCustomerGroup);

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setPriceCustomerGroupAssignments(final String... priceCustomerGroupAssignments);

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceCustomerGroupAssignments values to be set
     */

    public void setPriceCustomerGroupAssignments(final List<String> priceCustomerGroupAssignments);

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     * @param priceChannel value to be set
     */

    public void setPriceChannel(final String priceChannel);

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @param localeProjection values to be set
     */

    @JsonIgnore
    public void setLocaleProjection(final String... localeProjection);

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     * @param localeProjection values to be set
     */

    public void setLocaleProjection(final List<String> localeProjection);

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. If the Store has defined <code>languages</code>, <code>countries</code>, <code>distributionChannels</code>, or <code>supplyChannels</code>, they are used for projections based on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionPrices" rel="nofollow">price</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionInventoryEntries" rel="nofollow">inventory</a>. For Projects with active <span>Product Selections</span>, the API does not take the <span>availability of the Product in the specified Store</span> into account. <span>Product Tailoring</span> modifies the product information returned in API responses, but evaluating <span>query expressions</span> is restricted to the original product information.</p>
     * @param storeProjection value to be set
     */

    public void setStoreProjection(final String storeProjection);

    /**
     * factory method
     * @return instance of ProductSearchProjectionParams
     */
    public static ProductSearchProjectionParams of() {
        return new ProductSearchProjectionParamsImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchProjectionParams
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchProjectionParams of(final ProductSearchProjectionParams template) {
        ProductSearchProjectionParamsImpl instance = new ProductSearchProjectionParamsImpl();
        instance.setExpand(template.getExpand());
        instance.setStaged(template.getStaged());
        instance.setPriceCurrency(template.getPriceCurrency());
        instance.setPriceCountry(template.getPriceCountry());
        instance.setPriceCustomerGroup(template.getPriceCustomerGroup());
        instance.setPriceCustomerGroupAssignments(template.getPriceCustomerGroupAssignments());
        instance.setPriceChannel(template.getPriceChannel());
        instance.setLocaleProjection(template.getLocaleProjection());
        instance.setStoreProjection(template.getStoreProjection());
        return instance;
    }

    public ProductSearchProjectionParams copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchProjectionParams
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchProjectionParams deepCopy(@Nullable final ProductSearchProjectionParams template) {
        if (template == null) {
            return null;
        }
        ProductSearchProjectionParamsImpl instance = new ProductSearchProjectionParamsImpl();
        instance.setExpand(Optional.ofNullable(template.getExpand()).map(ArrayList::new).orElse(null));
        instance.setStaged(template.getStaged());
        instance.setPriceCurrency(template.getPriceCurrency());
        instance.setPriceCountry(template.getPriceCountry());
        instance.setPriceCustomerGroup(template.getPriceCustomerGroup());
        instance.setPriceCustomerGroupAssignments(
            Optional.ofNullable(template.getPriceCustomerGroupAssignments()).map(ArrayList::new).orElse(null));
        instance.setPriceChannel(template.getPriceChannel());
        instance.setLocaleProjection(
            Optional.ofNullable(template.getLocaleProjection()).map(ArrayList::new).orElse(null));
        instance.setStoreProjection(template.getStoreProjection());
        return instance;
    }

    /**
     * builder factory method for ProductSearchProjectionParams
     * @return builder
     */
    public static ProductSearchProjectionParamsBuilder builder() {
        return ProductSearchProjectionParamsBuilder.of();
    }

    /**
     * create builder for ProductSearchProjectionParams instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchProjectionParamsBuilder builder(final ProductSearchProjectionParams template) {
        return ProductSearchProjectionParamsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchProjectionParams(Function<ProductSearchProjectionParams, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchProjectionParams> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchProjectionParams>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchProjectionParams>";
            }
        };
    }
}
