
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

/**
 *  <p>Generated after a successful Set Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreNameSetMessagePayloadImpl implements StoreNameSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales;

    @JsonCreator
    StoreNameSetMessagePayloadImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("nameAllLocales") final java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales) {
        this.name = name;
        this.nameAllLocales = nameAllLocales;
        this.type = STORE_NAME_SET;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(nameAllLocales).toHashCode();
    }

}
