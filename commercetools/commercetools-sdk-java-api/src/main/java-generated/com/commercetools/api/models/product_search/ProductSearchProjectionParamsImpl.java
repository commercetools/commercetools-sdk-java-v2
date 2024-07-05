
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
 * ProductSearchProjectionParams
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchProjectionParamsImpl implements ProductSearchProjectionParams, ModelBase {

    private java.util.List<String> expand;

    private Boolean staged;

    private String priceCurrency;

    private String priceCountry;

    private String priceCustomerGroup;

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
            @JsonProperty("priceChannel") final String priceChannel,
            @JsonProperty("localeProjection") final java.util.List<String> localeProjection,
            @JsonProperty("storeProjection") final String storeProjection) {
        this.expand = expand;
        this.staged = staged;
        this.priceCurrency = priceCurrency;
        this.priceCountry = priceCountry;
        this.priceCustomerGroup = priceCustomerGroup;
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
     *  <p>Expands a <code>value</code> of type Reference in a ProductProjection. In case the referenced object does not exist, the API returns the non-expanded reference.</p>
     */

    public java.util.List<String> getExpand() {
        return this.expand;
    }

    /**
     *  <p>Set to <code>true</code> to retrieve the staged Product Projection</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The currency used for Product price selection.</p>
     */

    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    /**
     *  <p>The country used for Product price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceCountry() {
        return this.priceCountry;
    }

    /**
     *  <p><code>id</code> of an existing CustomerGroup used for Product price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceCustomerGroup() {
        return this.priceCustomerGroup;
    }

    /**
     *  <p><code>id</code> of an existing Channel used for Product price selection. Can only be used <strong>in conjunction with</strong> the <code>priceCurrency</code> parameter.</p>
     */

    public String getPriceChannel() {
        return this.priceChannel;
    }

    /**
     *  <p>Used for locale-based projection.</p>
     */

    public java.util.List<String> getLocaleProjection() {
        return this.localeProjection;
    }

    /**
     *  <p><code>key</code> of an existing Store. If the Store has defined some languages, countries, distribution or supply Channels, they are used for projections based on locale, price, and inventory. If the Store has defined Product Selections or Product Tailoring, they have no effect on the results of this query.</p>
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
                .append(priceChannel, that.priceChannel)
                .append(localeProjection, that.localeProjection)
                .append(storeProjection, that.storeProjection)
                .append(expand, that.expand)
                .append(staged, that.staged)
                .append(priceCurrency, that.priceCurrency)
                .append(priceCountry, that.priceCountry)
                .append(priceCustomerGroup, that.priceCustomerGroup)
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
                .append("priceChannel", priceChannel)
                .append("localeProjection", localeProjection)
                .append("storeProjection", storeProjection)
                .build();
    }

}
