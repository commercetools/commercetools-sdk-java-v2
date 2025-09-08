
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetTitleAction" rel="nofollow">Set Title</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerTitleSetMessagePayloadImpl implements CustomerTitleSetMessagePayload, ModelBase {

    private String type;

    private String title;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerTitleSetMessagePayloadImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.type = CUSTOMER_TITLE_SET;
    }

    /**
     * create empty instance
     */
    public CustomerTitleSetMessagePayloadImpl() {
        this.type = CUSTOMER_TITLE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>title</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetTitleAction" rel="nofollow">Set Title</a> update action.</p>
     */

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

        return new EqualsBuilder().append(type, that.type)
                .append(title, that.title)
                .append(type, that.type)
                .append(title, that.title)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(title).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("title", title)
                .build();
    }

    @Override
    public CustomerTitleSetMessagePayload copyDeep() {
        return CustomerTitleSetMessagePayload.deepCopy(this);
    }
}
