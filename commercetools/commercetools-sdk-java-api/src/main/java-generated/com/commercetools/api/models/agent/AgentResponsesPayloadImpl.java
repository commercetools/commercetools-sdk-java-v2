
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Structured fields for the <code>payload</code> part of a <code>multipart/form-data</code> <span>/responses</span> request to the Intake Agent. <code>prompt</code> is optional when files are attached.</p>
 *  <p>For an <code>application/json</code> request, use <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesRequest" rel="nofollow">AgentResponsesRequest</a> instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesPayloadImpl implements AgentResponsesPayload, ModelBase {

    private com.commercetools.api.models.agent.AgentResponsesOutputType outputType;

    private String locale;

    private String prompt;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesPayloadImpl(
            @JsonProperty("outputType") final com.commercetools.api.models.agent.AgentResponsesOutputType outputType,
            @JsonProperty("locale") final String locale, @JsonProperty("prompt") final String prompt,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.outputType = outputType;
        this.locale = locale;
        this.prompt = prompt;
        this.businessUnit = businessUnit;
        this.store = store;
    }

    /**
     * create empty instance
     */
    public AgentResponsesPayloadImpl() {
    }

    /**
     *  <p>The entity to create.</p>
     */

    public com.commercetools.api.models.agent.AgentResponsesOutputType getOutputType() {
        return this.outputType;
    }

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Natural-language description of the desired Cart or Quote Request, such as the body of an email or a note. Required if no file is attached.</p>
     */

    public String getPrompt() {
        return this.prompt;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from the input.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from the input.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setOutputType(final com.commercetools.api.models.agent.AgentResponsesOutputType outputType) {
        this.outputType = outputType;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setPrompt(final String prompt) {
        this.prompt = prompt;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesPayloadImpl that = (AgentResponsesPayloadImpl) o;

        return new EqualsBuilder().append(outputType, that.outputType)
                .append(locale, that.locale)
                .append(prompt, that.prompt)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(outputType, that.outputType)
                .append(locale, that.locale)
                .append(prompt, that.prompt)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(outputType)
                .append(locale)
                .append(prompt)
                .append(businessUnit)
                .append(store)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("outputType", outputType)
                .append("locale", locale)
                .append("prompt", prompt)
                .append("businessUnit", businessUnit)
                .append("store", store)
                .build();
    }

    @Override
    public AgentResponsesPayload copyDeep() {
        return AgentResponsesPayload.deepCopy(this);
    }
}
