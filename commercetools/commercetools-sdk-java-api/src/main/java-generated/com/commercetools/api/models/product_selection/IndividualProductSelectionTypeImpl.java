
package com.commercetools.api.models.product_selection;

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
 * IndividualProductSelectionType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class IndividualProductSelectionTypeImpl implements IndividualProductSelectionType, ModelBase {

    private com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    IndividualProductSelectionTypeImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.type = ProductSelectionTypeEnum.findEnum("individual");
    }

    /**
     * create empty instance
     */
    public IndividualProductSelectionTypeImpl() {
        this.type = ProductSelectionTypeEnum.findEnum("individual");
    }

    /**
     *  <p>The following types of Product Selections are supported:</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        IndividualProductSelectionTypeImpl that = (IndividualProductSelectionTypeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).toHashCode();
    }

}
