
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
 * ProjectChangeCurrenciesAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCurrenciesActionImpl implements ProjectChangeCurrenciesAction, ModelBase {

    private String action;

    private java.util.List<String> currencies;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeCurrenciesActionImpl(@JsonProperty("currencies") final java.util.List<String> currencies) {
        this.currencies = currencies;
        this.action = CHANGE_CURRENCIES;
    }

    /**
     * create empty instance
     */
    public ProjectChangeCurrenciesActionImpl() {
        this.action = CHANGE_CURRENCIES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public java.util.List<String> getCurrencies() {
        return this.currencies;
    }

    public void setCurrencies(final String... currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
    }

    public void setCurrencies(final java.util.List<String> currencies) {
        this.currencies = currencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeCurrenciesActionImpl that = (ProjectChangeCurrenciesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(currencies, that.currencies)
                .append(action, that.action)
                .append(currencies, that.currencies)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(currencies).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("currencies", currencies)
                .build();
    }

    @Override
    public ProjectChangeCurrenciesAction copyDeep() {
        return ProjectChangeCurrenciesAction.deepCopy(this);
    }
}
