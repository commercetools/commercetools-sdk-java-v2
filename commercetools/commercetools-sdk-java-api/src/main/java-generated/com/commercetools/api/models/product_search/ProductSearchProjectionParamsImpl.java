
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The query parameters used for <span>data integration with Product Projection parameters</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchProjectionParamsImpl implements ProductSearchProjectionParams, ModelBase {

    private java.util.List<String> expand;

    private Boolean staged;

    private String priceCurrency;

    private String priceCountry;

    private String priceCustomerGroup;

    private java.util.List<String> priceCustomerGroupAssignments;

    private String priceChannel;

    private java.util.List<String> localeProjection;

    private String storeProjection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchProjectionParamsImpl(@JsonProperty("expand") final java.util.List<String> expand,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("priceCurrency") final String priceCurrency,
            @JsonProperty("priceCountry") final String priceCountry,
            @JsonProperty("priceCustomerGroup") final String priceCustomerGroup,
            @JsonProperty("priceCustomerGroupAssignments") final java.util.List<String> priceCustomerGroupAssignments,
            @JsonProperty("priceChannel") final String priceChannel,
            @JsonProperty("localeProjection") final java.util.List<String> localeProjection,
            @JsonProperty("storeProjection") final String storeProjection) {
        this.expand = expand;
        this.staged = staged;
        this.priceCurrency = priceCurrency;
        this.priceCountry = priceCountry;
        this.priceCustomerGroup = priceCustomerGroup;
        this.priceCustomerGroupAssignments = priceCustomerGroupAssignments;
        this.priceChannel = priceChannel;
        this.localeProjection = localeProjection;
        this.storeProjection = storeProjection;
    }

    /**
     * create empty instance
     */
    public ProductSearchProjectionParamsImpl() {
    }

    /**
     *  <p>Expands a <code>value</code> of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjection</a>. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     */

    public java.util.List<String> getExpand() {
        return this.expand;
    }

    /**
     *  <p>Set to <code>true</code> to retrieve the <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">staged</a> Product Projection</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The currency used for <span>Product price selection</span>.</p>
     */

    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    /**
     *  <p>The country used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceCountry() {
        return this.priceCountry;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceCustomerGroup() {
        return this.priceCustomerGroup;
    }

    /**
     *  <p>IDs of existing <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroups</a> used for <span>Product price selection</span>, when using <span>multiple Customer Groups</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     */

    public java.util.List<String> getPriceCustomerGroupAssignments() {
        return this.priceCustomerGroupAssignments;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> used for <span>Product price selection</span>. It can be used only <em>in conjunction with</em> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceChannel() {
        return this.priceChannel;
    }

    /**
     *  <p>Used for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale-based projection</a>.</p>
     */

    public java.util.List<String> getLocaleProjection() {
        return this.localeProjection;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. If the Store has defined <code>languages</code>, <code>countries</code>, <code>distributionChannels</code>, or <code>supplyChannels</code>, they are used for projections based on <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionLocales" rel="nofollow">locale</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionPrices" rel="nofollow">price</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionInventoryEntries" rel="nofollow">inventory</a>. For Projects with active <span>Product Selections</span>, the API does not take the <span>availability of the Product in the specified Store</span> into account. <span>Product Tailoring</span> modifies the product information returned in API responses. However, you can only specify <span>query expressions</span> for the original product data, not for tailored data.</p>
     */

    public String getStoreProjection() {
        return this.storeProjection;
    }

    public void setExpand(final String... expand) {
        this.expand = new ArrayList<>(Arrays.asList(expand));
    }

    public void setExpand(final java.util.List<String> expand) {
        this.expand = expand;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setPriceCurrency(final String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public void setPriceCountry(final String priceCountry) {
        this.priceCountry = priceCountry;
    }

    public void setPriceCustomerGroup(final String priceCustomerGroup) {
        this.priceCustomerGroup = priceCustomerGroup;
    }

    public void setPriceCustomerGroupAssignments(final String... priceCustomerGroupAssignments) {
        this.priceCustomerGroupAssignments = new ArrayList<>(Arrays.asList(priceCustomerGroupAssignments));
    }

    public void setPriceCustomerGroupAssignments(final java.util.List<String> priceCustomerGroupAssignments) {
        this.priceCustomerGroupAssignments = priceCustomerGroupAssignments;
    }

    public void setPriceChannel(final String priceChannel) {
        this.priceChannel = priceChannel;
    }

    public void setLocaleProjection(final String... localeProjection) {
        this.localeProjection = new ArrayList<>(Arrays.asList(localeProjection));
    }

    public void setLocaleProjection(final java.util.List<String> localeProjection) {
        this.localeProjection = localeProjection;
    }

    public void setStoreProjection(final String storeProjection) {
        this.storeProjection = storeProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchProjectionParamsImpl that = (ProductSearchProjectionParamsImpl) o;

        return new EqualsBuilder().append(expand, that.expand)
                .append(staged, that.staged)
                .append(priceCurrency, that.priceCurrency)
                .append(priceCountry, that.priceCountry)
                .append(priceCustomerGroup, that.priceCustomerGroup)
                .append(priceCustomerGroupAssignments, that.priceCustomerGroupAssignments)
                .append(priceChannel, that.priceChannel)
                .append(localeProjection, that.localeProjection)
                .append(storeProjection, that.storeProjection)
                .append(expand, that.expand)
                .append(staged, that.staged)
                .append(priceCurrency, that.priceCurrency)
                .append(priceCountry, that.priceCountry)
                .append(priceCustomerGroup, that.priceCustomerGroup)
                .append(priceCustomerGroupAssignments, that.priceCustomerGroupAssignments)
                .append(priceChannel, that.priceChannel)
                .append(localeProjection, that.localeProjection)
                .append(storeProjection, that.storeProjection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(expand)
                .append(staged)
                .append(priceCurrency)
                .append(priceCountry)
                .append(priceCustomerGroup)
                .append(priceCustomerGroupAssignments)
                .append(priceChannel)
                .append(localeProjection)
                .append(storeProjection)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("expand", expand)
                .append("staged", staged)
                .append("priceCurrency", priceCurrency)
                .append("priceCountry", priceCountry)
                .append("priceCustomerGroup", priceCustomerGroup)
                .append("priceCustomerGroupAssignments", priceCustomerGroupAssignments)
                .append("priceChannel", priceChannel)
                .append("localeProjection", localeProjection)
                .append("storeProjection", storeProjection)
                .build();
    }

    @Override
    public ProductSearchProjectionParams copyDeep() {
        return ProductSearchProjectionParams.deepCopy(this);
    }
}
