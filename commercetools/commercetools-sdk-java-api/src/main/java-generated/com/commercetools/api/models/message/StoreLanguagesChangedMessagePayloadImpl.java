
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreLanguagesChangedMessagePayloadImpl implements StoreLanguagesChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<String> addedLanguages;

    private java.util.List<String> removedLanguages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreLanguagesChangedMessagePayloadImpl(@JsonProperty("addedLanguages") final java.util.List<String> addedLanguages,
            @JsonProperty("removedLanguages") final java.util.List<String> removedLanguages) {
        this.addedLanguages = addedLanguages;
        this.removedLanguages = removedLanguages;
        this.type = STORE_LANGUAGES_CHANGED;
    }

    /**
     * create empty instance
     */
    public StoreLanguagesChangedMessagePayloadImpl() {
        this.type = STORE_LANGUAGES_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     */

    public java.util.List<String> getAddedLanguages() {
        return this.addedLanguages;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     */

    public java.util.List<String> getRemovedLanguages() {
        return this.removedLanguages;
    }

    public void setAddedLanguages(final String... addedLanguages) {
        this.addedLanguages = new ArrayList<>(Arrays.asList(addedLanguages));
    }

    public void setAddedLanguages(final java.util.List<String> addedLanguages) {
        this.addedLanguages = addedLanguages;
    }

    public void setRemovedLanguages(final String... removedLanguages) {
        this.removedLanguages = new ArrayList<>(Arrays.asList(removedLanguages));
    }

    public void setRemovedLanguages(final java.util.List<String> removedLanguages) {
        this.removedLanguages = removedLanguages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreLanguagesChangedMessagePayloadImpl that = (StoreLanguagesChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(addedLanguages, that.addedLanguages)
                .append(removedLanguages, that.removedLanguages)
                .append(type, that.type)
                .append(addedLanguages, that.addedLanguages)
                .append(removedLanguages, that.removedLanguages)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(addedLanguages).append(removedLanguages).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("addedLanguages", addedLanguages)
                .append("removedLanguages", removedLanguages)
                .build();
    }

    @Override
    public StoreLanguagesChangedMessagePayload copyDeep() {
        return StoreLanguagesChangedMessagePayload.deepCopy(this);
    }
}
