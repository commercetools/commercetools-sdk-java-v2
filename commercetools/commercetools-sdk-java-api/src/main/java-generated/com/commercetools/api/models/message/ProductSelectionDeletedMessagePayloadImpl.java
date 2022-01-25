
package com.commercetools.api.models.message;

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
public class ProductSelectionDeletedMessagePayloadImpl implements ProductSelectionDeletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    ProductSelectionDeletedMessagePayloadImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.type = PRODUCT_SELECTION_DELETED;
    }

    public ProductSelectionDeletedMessagePayloadImpl() {
        this.type = PRODUCT_SELECTION_DELETED;
    }

    public String getType() {
        return this.type;
    }

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

        ProductSelectionDeletedMessagePayloadImpl that = (ProductSelectionDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).toHashCode();
    }

}
