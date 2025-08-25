
package com.commercetools.api.models.project;

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
 * ShoppingListsConfiguration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListsConfigurationImpl implements ShoppingListsConfiguration, ModelBase {

    private Long deleteDaysAfterLastModification;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListsConfigurationImpl(
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    /**
     * create empty instance
     */
    public ShoppingListsConfigurationImpl() {
    }

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListDraft" rel="nofollow">ShoppingListDraft</a>. This field may not be present on Projects created before January 2020.</p>
     */

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListsConfigurationImpl that = (ShoppingListsConfigurationImpl) o;

        return new EqualsBuilder().append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(deleteDaysAfterLastModification).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .build();
    }

    @Override
    public ShoppingListsConfiguration copyDeep() {
        return ShoppingListsConfiguration.deepCopy(this);
    }
}
