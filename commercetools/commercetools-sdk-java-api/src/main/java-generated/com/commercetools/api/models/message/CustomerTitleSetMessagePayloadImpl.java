
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
public class CustomerTitleSetMessagePayloadImpl implements CustomerTitleSetMessagePayload, ModelBase {

    private String type;

    private String title;

    @JsonCreator
    CustomerTitleSetMessagePayloadImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.type = CUSTOMER_TITLE_SET;
    }

    public CustomerTitleSetMessagePayloadImpl() {
        this.type = CUSTOMER_TITLE_SET;
    }

    public String getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerTitleSetMessagePayloadImpl that = (CustomerTitleSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(title, that.title).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(title).toHashCode();
    }

}
