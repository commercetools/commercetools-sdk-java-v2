
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeChangeLabelActionImpl implements ProductTypeChangeLabelAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.common.LocalizedString label;

    @JsonCreator
    ProductTypeChangeLabelActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.attributeName = attributeName;
        this.label = label;
        this.action = CHANGE_LABEL;
    }

    public ProductTypeChangeLabelActionImpl() {
        this.action = CHANGE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeLabelActionImpl that = (ProductTypeChangeLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(label).toHashCode();
    }

}
