
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
 *  <p>Generated after a successful Set Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreNameSetMessagePayloadImpl implements StoreNameSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreNameSetMessagePayloadImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("nameAllLocales") final java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales) {
        this.name = name;
        this.nameAllLocales = nameAllLocales;
        this.type = STORE_NAME_SET;
    }

    /**
     * create empty instance
     */
    public StoreNameSetMessagePayloadImpl() {
        this.type = STORE_NAME_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Store set during the Set Name update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     */

    public java.util.List<com.commercetools.api.models.common.LocalizedString> getNameAllLocales() {
        return this.nameAllLocales;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setNameAllLocales(final com.commercetools.api.models.common.LocalizedString... nameAllLocales) {
        this.nameAllLocales = new ArrayList<>(Arrays.asList(nameAllLocales));
    }

    public void setNameAllLocales(
            final java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales) {
        this.nameAllLocales = nameAllLocales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreNameSetMessagePayloadImpl that = (StoreNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(nameAllLocales, that.nameAllLocales)
                .append(type, that.type)
                .append(name, that.name)
                .append(nameAllLocales, that.nameAllLocales)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(nameAllLocales).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("nameAllLocales", nameAllLocales)
                .build();
    }

    @Override
    public StoreNameSetMessagePayload copyDeep() {
        return StoreNameSetMessagePayload.deepCopy(this);
    }
}
