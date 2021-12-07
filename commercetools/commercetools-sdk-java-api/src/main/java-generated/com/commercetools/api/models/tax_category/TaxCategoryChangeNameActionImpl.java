
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxCategoryChangeNameActionImpl implements TaxCategoryChangeNameAction {

    private String action;

    private String name;

    @JsonCreator
    TaxCategoryChangeNameActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = CHANGE_NAME;
    }

    public TaxCategoryChangeNameActionImpl() {
        this.action = CHANGE_NAME;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>New value to set. Must not be empty.</p>
    */
    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxCategoryChangeNameActionImpl that = (TaxCategoryChangeNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}