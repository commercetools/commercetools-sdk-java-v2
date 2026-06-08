
package com.commercetools.importapi.models.product_selections;

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
 *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantExclusionImpl implements VariantExclusion, ModelBase {

    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantExclusionImpl(@JsonProperty("skus") final java.util.List<String> skus) {
        this.skus = skus;
    }

    /**
     * create empty instance
     */
    public VariantExclusionImpl() {
    }

    /**
     *  <p>List of SKUs to be excluded.</p>
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public void setSkus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
    }

    public void setSkus(final java.util.List<String> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantExclusionImpl that = (VariantExclusionImpl) o;

        return new EqualsBuilder().append(skus, that.skus).append(skus, that.skus).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(skus).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("skus", skus).build();
    }

    @Override
    public VariantExclusion copyDeep() {
        return VariantExclusion.deepCopy(this);
    }
}
