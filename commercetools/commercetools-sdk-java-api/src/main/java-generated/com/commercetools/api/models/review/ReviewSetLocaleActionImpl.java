
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetLocaleActionImpl implements ReviewSetLocaleAction {

    private String action;

    private String locale;

    @JsonCreator
    ReviewSetLocaleActionImpl(@JsonProperty("locale") final String locale) {
        this.locale = locale;
        this.action = SET_LOCALE;
    }

    public ReviewSetLocaleActionImpl() {
        this.action = SET_LOCALE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If <code>locale</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public String getLocale() {
        return this.locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetLocaleActionImpl that = (ReviewSetLocaleActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(locale, that.locale).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(locale).toHashCode();
    }

}
