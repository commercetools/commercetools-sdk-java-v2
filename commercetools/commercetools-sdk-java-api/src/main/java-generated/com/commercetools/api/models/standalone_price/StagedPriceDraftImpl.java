
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * StagedPriceDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedPriceDraftImpl implements StagedPriceDraft, ModelBase {

    private com.commercetools.api.models.common.TypedMoneyDraft value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedPriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoneyDraft value) {
        this.value = value;
    }

    /**
     * create empty instance
     */
    public StagedPriceDraftImpl() {
    }

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     */

    public com.commercetools.api.models.common.TypedMoneyDraft getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoneyDraft value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedPriceDraftImpl that = (StagedPriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).toHashCode();
    }

}
