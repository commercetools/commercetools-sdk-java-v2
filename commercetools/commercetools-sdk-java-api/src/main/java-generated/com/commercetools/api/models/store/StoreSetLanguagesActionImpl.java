
package com.commercetools.api.models.store;

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
public class StoreSetLanguagesActionImpl implements StoreSetLanguagesAction, ModelBase {

    private String action;

    private java.util.List<String> languages;

    @JsonCreator
    StoreSetLanguagesActionImpl(@JsonProperty("languages") final java.util.List<String> languages) {
        this.languages = languages;
        this.action = SET_LANGUAGES;
    }

    public StoreSetLanguagesActionImpl() {
        this.action = SET_LANGUAGES;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
    }

    public void setLanguages(final java.util.List<String> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetLanguagesActionImpl that = (StoreSetLanguagesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(languages, that.languages).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(languages).toHashCode();
    }

}
