
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingAttributesSearchRequestImpl.class)
public interface MissingAttributesSearchRequest {

    @JsonProperty("limit")
    public Integer getLimit();

    @JsonProperty("offset")
    public Integer getOffset();

    /**
    *  <p>If true, searches data from staged products in addition to published products.</p>
    */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>Maximum number of products to scan.</p>
    */

    @JsonProperty("productSetLimit")
    public Integer getProductSetLimit();

    /**
    *  <p>If true, searches all product variants. If false, only searches master variants.</p>
    */

    @JsonProperty("includeVariants")
    public Boolean getIncludeVariants();

    /**
    *  <p>Minimum attribute coverage of variants to display, applied to both coverage types.</p>
    */

    @JsonProperty("coverageMin")
    public Double getCoverageMin();

    /**
    *  <p>Maximum attribute coverage of variants to display, applied to both coverage types.</p>
    */

    @JsonProperty("coverageMax")
    public Double getCoverageMax();

    /**
    *  <p>Default value: <code>coverageAttributeValues</code> - Allowed values: [<code>coverageAttributeValues</code>, <code>coverageAttributeNames</code>]
    *  <code>coverageAttributeValues</code> shows the product variants with the most missing attribute values first and <code>coverageAttributeNames</code> the ones with the most missing attribute names.</p>
    */

    @JsonProperty("sortBy")
    public String getSortBy();

    /**
    *  <p>If true, the <code>missingAttributeNames</code> will be included in the results.</p>
    */

    @JsonProperty("showMissingAttributeNames")
    public Boolean getShowMissingAttributeNames();

    /**
    *  <p>Filters results by the provided Product IDs.
    *  Cannot be applied in combination with any other filter.</p>
    */

    @JsonProperty("productIds")
    public List<String> getProductIds();

    /**
    *  <p>Filters results by the provided product type IDs.
    *  Cannot be applied in combination with any other filter.</p>
    */

    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    /**
    *  <p>Filters results by the provided attribute name. If provided,  products are only checked for this attribute. Therefore, only products of product types which define the attribute name are considered. These product type IDs
    *  are then listed in <code>MissingAttributesMeta</code>. The  <code>attributeCount</code> and <code>attributeCoverage</code> fields are not part of the response when using this filter. Cannot be applied in combination with any other filter.</p>
    */

    @JsonProperty("attributeName")
    public String getAttributeName();

    public void setLimit(final Integer limit);

    public void setOffset(final Integer offset);

    public void setStaged(final Boolean staged);

    public void setProductSetLimit(final Integer productSetLimit);

    public void setIncludeVariants(final Boolean includeVariants);

    public void setCoverageMin(final Double coverageMin);

    public void setCoverageMax(final Double coverageMax);

    public void setSortBy(final String sortBy);

    public void setShowMissingAttributeNames(final Boolean showMissingAttributeNames);

    @JsonIgnore
    public void setProductIds(final String... productIds);

    public void setProductIds(final List<String> productIds);

    @JsonIgnore
    public void setProductTypeIds(final String... productTypeIds);

    public void setProductTypeIds(final List<String> productTypeIds);

    public void setAttributeName(final String attributeName);

    public static MissingAttributesSearchRequest of() {
        return new MissingAttributesSearchRequestImpl();
    }

    public static MissingAttributesSearchRequest of(final MissingAttributesSearchRequest template) {
        MissingAttributesSearchRequestImpl instance = new MissingAttributesSearchRequestImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setStaged(template.getStaged());
        instance.setProductSetLimit(template.getProductSetLimit());
        instance.setIncludeVariants(template.getIncludeVariants());
        instance.setCoverageMin(template.getCoverageMin());
        instance.setCoverageMax(template.getCoverageMax());
        instance.setSortBy(template.getSortBy());
        instance.setShowMissingAttributeNames(template.getShowMissingAttributeNames());
        instance.setProductIds(template.getProductIds());
        instance.setProductTypeIds(template.getProductTypeIds());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    public static MissingAttributesSearchRequestBuilder builder() {
        return MissingAttributesSearchRequestBuilder.of();
    }

    public static MissingAttributesSearchRequestBuilder builder(final MissingAttributesSearchRequest template) {
        return MissingAttributesSearchRequestBuilder.of(template);
    }

    default <T> T withMissingAttributesSearchRequest(Function<MissingAttributesSearchRequest, T> helper) {
        return helper.apply(this);
    }
}
