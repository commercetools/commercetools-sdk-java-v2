
package com.commercetools.checkout.models.application;

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
 * ApplicationAgreement
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationAgreementImpl implements ApplicationAgreement, ModelBase {

    private String id;

    private String name;

    private com.commercetools.checkout.models.application.ApplicationAgreementType type;

    private com.commercetools.checkout.models.application.ApplicationAgreementStatus status;

    private com.commercetools.checkout.models.common.LocalizedString text;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApplicationAgreementImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("type") final com.commercetools.checkout.models.application.ApplicationAgreementType type,
            @JsonProperty("status") final com.commercetools.checkout.models.application.ApplicationAgreementStatus status,
            @JsonProperty("text") final com.commercetools.checkout.models.common.LocalizedString text) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.text = text;
    }

    /**
     * create empty instance
     */
    public ApplicationAgreementImpl() {
    }

    /**
     *  <p>Unique identifier of the ApplicationAgreement.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique name identifier for the ApplicationAgreement.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Type of agreement.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementType getType() {
        return this.type;
    }

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationAgreementStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getText() {
        return this.text;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setType(final com.commercetools.checkout.models.application.ApplicationAgreementType type) {
        this.type = type;
    }

    public void setStatus(final com.commercetools.checkout.models.application.ApplicationAgreementStatus status) {
        this.status = status;
    }

    public void setText(final com.commercetools.checkout.models.common.LocalizedString text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApplicationAgreementImpl that = (ApplicationAgreementImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(type, that.type)
                .append(status, that.status)
                .append(text, that.text)
                .append(id, that.id)
                .append(name, that.name)
                .append(type, that.type)
                .append(status, that.status)
                .append(text, that.text)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(type)
                .append(status)
                .append(text)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("name", name)
                .append("type", type)
                .append("status", status)
                .append("text", text)
                .build();
    }

    @Override
    public ApplicationAgreement copyDeep() {
        return ApplicationAgreement.deepCopy(this);
    }
}
